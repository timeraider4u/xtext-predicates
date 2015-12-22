/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.preprocess.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtend.lib.annotations.Accessors
import at.jku.weiner.c.preprocess.preprocess.TranslationUnit
import at.jku.weiner.c.preprocess.preprocess.Model
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives
import at.jku.weiner.c.preprocess.preprocess.NewLineLine
import at.jku.weiner.c.preprocess.preprocess.Code
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective
import at.jku.weiner.c.preprocess.preprocess.DefineDirective
import at.jku.weiner.c.preprocess.preprocess.UnDefineDirective
import at.jku.weiner.c.preprocess.preprocess.ErrorDirective
import at.jku.weiner.c.preprocess.preprocess.PragmaDirective
import at.jku.weiner.c.preprocess.utils.macros.DefinitionTable
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import at.jku.weiner.c.preprocess.preprocess.GroupOpt
import at.jku.weiner.c.preprocess.utils.IncludeUtils
import at.jku.weiner.c.preprocess.preprocess.DefineObjectMacro
import at.jku.weiner.c.preprocess.preprocess.DefineFunctionLikeMacro
import at.jku.weiner.c.preprocess.preprocess.ConditionalDirective
import at.jku.weiner.c.preprocess.preprocess.IfDefConditional
import at.jku.weiner.c.preprocess.preprocess.IfNotDefConditional
import at.jku.weiner.c.preprocess.preprocess.IfConditional
import at.jku.weiner.c.preprocess.utils.expressions.ExpressionEvaluation
import at.jku.weiner.c.common.common.ConstantExpression
import at.jku.weiner.c.preprocess.preprocess.ElseConditional
import org.eclipse.emf.common.util.EList
import at.jku.weiner.c.preprocess.preprocess.ElIfConditional
import java.util.Map
import java.util.TreeMap
import at.jku.weiner.c.preprocess.utils.IncludeDirs
import com.google.inject.Inject
import org.eclipse.xtext.validation.IResourceValidator
import java.util.List
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.util.CancelIndicator
import com.google.inject.Injector
import at.jku.weiner.c.common.CommonStandaloneSetup
import java.util.Stack

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PreprocessGenerator implements IGenerator {

	@Accessors String fileName = 'greetings.txt';
	@Accessors boolean legacyMode = true;
	@Accessors boolean advanced = false;
	@Accessors Injector commonInjector;
	
	@Inject
	IResourceValidator validator;
	
	Integer currKey = 0;
	ResourceSet rs;
	URI uri;
	Map<Integer, Boolean> conditionals = new TreeMap<Integer, Boolean>();
	Stack<Resource> stack = new Stack<Resource>();
	
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		if (commonInjector == null) {
			// only do when we are executing tests,
			// but not when in Eclipse environment
			val CommonStandaloneSetup setup = new CommonStandaloneSetup();
			val Injector injector = setup.createInjectorAndDoEMFRegistration();
			commonInjector = injector;
		}
		rs = input.resourceSet;
		uri = input.URI;
		IncludeDirs.setUp();
		stack.clear();
		DefinitionTable.reset();
		if (advanced) {
			DefinitionTable.insertPredefinedMacros();
		}
		stack.push(input);
		val TranslationUnit unit = getUnitFor(input);
		val String output = outputFor(unit);
		// System.out.println("generating output file='" + fileName + "'");
		fsa.generateFile(fileName, output);
	}
	
	def TranslationUnit getUnitFor(Resource input) {
		validateUnit(input);
		val Model model = input.allContents.filter(typeof(Model)).head;
		val TranslationUnit unit = model.units.head;
		return unit;
	}
	
	def void validateUnit(Resource resource) {
		if (!advanced) {
			return;
		}
		val List<Issue> list = validator.validate(resource, CheckMode.ALL, 
			CancelIndicator.NullImpl
		);
		if (!(list.isEmpty())) {
			throw new RuntimeException("error during validation of unit='" 
				+ list.toString() + "'"
			);
		}
	}

	def String outputFor(TranslationUnit unit) {
		return outputFor(unit.group);
	}
	
	def String outputFor(GroupOpt group) {
		val StringBuffer result = new StringBuffer("");
		for (obj : group.lines) {
			if (obj instanceof PreprocessorDirectives) {
				result.append(outputFor(obj as PreprocessorDirectives));
			}
			if (obj instanceof NewLineLine) {
				result.append(outputFor(obj as NewLineLine));
			}
			if (obj instanceof Code) {
				result.append(outputFor(obj as Code));
				//result.append(File.separator);
				result.append("\n");
			}
		}
		return result.toString();
	}

	def String outputFor(PreprocessorDirectives obj) '''
		«IF obj.directive instanceof IncludeDirective»
			«outputFor(obj.directive as IncludeDirective)»
		«ENDIF»
		«IF obj.directive instanceof DefineDirective»
			«outputFor(obj.directive as DefineDirective)»
		«ENDIF»
		«IF obj.directive instanceof UnDefineDirective»
			«outputFor(obj.directive as UnDefineDirective)»
		«ENDIF»
		«IF obj.directive instanceof ConditionalDirective»
			«outputFor(obj.directive as ConditionalDirective)»
		«ENDIF»
		«IF obj.directive instanceof ErrorDirective»
			«outputFor(obj.directive as ErrorDirective)»
		«ENDIF»
		«IF obj.directive instanceof PragmaDirective»
			«outputFor(obj.directive as PragmaDirective)»
		«ENDIF»
	'''
	
	def String outputFor(IncludeDirective obj) {
		if (legacyMode) {
			return outputForLegacyMode(obj);
		}
		return "";
	}
	
	def String outputForLegacyMode(IncludeDirective obj) {
		val String inc = DefinitionTable.resolve(obj.string);
		val IncludeUtils includeUtils = new IncludeUtils(rs, uri, inc);
		val Resource res = includeUtils.getResource();
		stack.push(res);
		val TranslationUnit unit = this.getUnitFor(res);
		val String output = outputFor(unit);
		stack.pop();
		val Resource current = stack.peek();
		System.out.println("back in file='" + current.URI.toFileString + "'");
		return output;
	}
	
	def String outputFor(DefineDirective obj) {
		if (obj instanceof DefineObjectMacro) {
			DefinitionTable.add(obj.id, obj.string);
		}
		else if (obj instanceof DefineFunctionLikeMacro) {
			DefinitionTable.addFunctionMacro(obj.id, obj.string, obj.list);
		}
		return "";
	}
	
	def String outputFor(UnDefineDirective obj) {
		DefinitionTable.remove(obj.id);
		return "";
	}
	
	def String outputFor(ConditionalDirective obj) {
		val Integer newKey = this.currKey++;
		val StringBuffer result = new StringBuffer(""); 
		
		this.conditionals.put(newKey, false);
		if (obj.conditional instanceof IfConditional) {
			result.append(outputFor(newKey, obj.conditional as IfConditional));
		}
		if (obj.conditional instanceof IfDefConditional) {
			result.append(outputFor(newKey, obj.conditional as IfDefConditional)); 
		}
		if (obj.conditional instanceof IfNotDefConditional) {
			result.append(outputFor(newKey, obj.conditional as IfNotDefConditional)); 
		}
		result.append(outputFor(newKey, obj.getElifs()));
		result.append(outputFor(newKey, obj.getElse()));
		this.conditionals.remove(newKey);
		return result.toString();
	}
	
	def String outputFor(Integer conditionalDirective, IfDefConditional obj) {
		if (DefinitionTable.isDefined(obj.id)) {
			conditionals.put(conditionalDirective, true);
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(Integer conditionalDirective, IfNotDefConditional obj) {
		if (!(DefinitionTable.isDefined(obj.id))) {
			conditionals.put(conditionalDirective, true);
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(Integer conditionalDirective, IfConditional obj) {
		if (ExpressionEvaluation.evaluateFor(obj.expression as ConstantExpression, commonInjector, advanced)) {
			conditionals.put(conditionalDirective, true);
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(Integer conditionalDirective, EList<ElIfConditional> obj) {
		if (obj == null) {
 			return "";
 		}
 		val boolean condition =  conditionals.get(conditionalDirective);
 		if (condition) {
 			return "";
 		}
 		val StringBuffer result = new StringBuffer(""); 
 		for (ElIfConditional cond : obj) {
 			result.append(outputFor(conditionalDirective, cond));
 		}
 		return result.toString();
 	}
 	
 	def String outputFor(Integer conditionalDirective, ElIfConditional obj) {
 		val boolean condition =  conditionals.get(conditionalDirective);
 		if (condition) {
 			return "";
 		}
 		if (ExpressionEvaluation.evaluateFor(obj.expression as ConstantExpression, commonInjector, advanced)) {
			conditionals.put(conditionalDirective, true);
			return outputFor(obj.group).trim();
		}
 		return "";
 	}
	
	def String outputFor(Integer conditionalDirective, ElseConditional obj) {
		val boolean condition =  conditionals.get(conditionalDirective);
 		if (condition) {
 			return "";
 		}
		if (obj== null) {
			return "";
		}
		return outputFor(obj.group).trim();
	}
	
	def String outputFor(ErrorDirective obj) '''
	'''
	
	def String outputFor(PragmaDirective obj) '''
	'''
	
	def String outputFor(NewLineLine obj) '''

	'''
	
	def String outputFor(Code obj) {
		val String code = obj.code.toString();
		val String result = resolve(code);
		return result;
	}
	
	def String resolve(String code) {
		var String result = code;
		while (DefinitionTable.containsAKey(result)) {
			result = DefinitionTable.resolve(result);
		}
		return result;
	}
	
}
