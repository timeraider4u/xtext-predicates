/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.preprocess.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtend.lib.annotations.Accessors
import at.jku.weiner.c.common.common.TranslationUnit
import at.jku.weiner.c.common.common.Model
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
import at.jku.weiner.c.preprocess.utils.macros.MacroParentheseNotClosedYetException
import at.jku.weiner.c.preprocess.preprocess.SourceCodeLine
import java.util.ArrayList
import at.jku.weiner.c.preprocess.preprocess.Preprocess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PreprocessGenerator implements IGenerator {

	@Accessors String fileName = 'hello_world.cdt.i';
	@Accessors TranslationUnit unit = null;
	@Accessors boolean legacyMode = true;
	@Accessors boolean insertPredefinedMacros = false;
	@Accessors boolean validateUnit = true;
	@Accessors Injector commonInjector;
	
	@Inject
	IResourceValidator validator;
	
	Integer currKey = 0;
	ResourceSet rs;
	URI uri;
	Map<Integer, Boolean> conditionals = new TreeMap<Integer, Boolean>();
	List<String> path = new ArrayList<String>();
	
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
		path.clear();
		DefinitionTable.reset();
		if (insertPredefinedMacros) {
			DefinitionTable.insertPredefinedMacros();
		}
		val Preprocess preprocess = getPreprocessFor(input);
		val String output = outputFor(preprocess);
		// System.out.println("generating output file='" + fileName + "'");
		fsa.generateFile(fileName, output);
	}
	
	def Preprocess getPreprocessFor(Resource input) {
		var Preprocess preprocess = null;
		validatePreprocess(input);
		if (this.unit == null) {
			preprocess = input.allContents.filter(typeof(Preprocess)).head;
		}
		else {
			preprocess = unit.preprocess as Preprocess;
		}
		//val TranslationUnit unit = model.getUnits().head;
		val String fileName = input.URI.toFileString;
		// unit.setPath(fileName);
		path.add("/" + fileName + "/");
		return preprocess;
	}
	
	def void validatePreprocess(Resource resource) {
		if (!validateUnit) {
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
		val Preprocess preprocess = unit.preprocess as Preprocess;
		return outputFor(preprocess);
	}
	
	def String outputFor(Preprocess preprocess) {
		return outputFor(preprocess.group);
	}
	
	def String outputFor(GroupOpt group) {
		val StringBuffer result = new StringBuffer("");
		for (var int i = 0; i < group.lines.size; i++) {
			var SourceCodeLine obj = group.lines.get(i);
			if (obj instanceof PreprocessorDirectives) {
				result.append(outputFor(obj as PreprocessorDirectives));
			}
			if (obj instanceof NewLineLine) {
				result.append(outputFor(obj as NewLineLine));
			}
			if (obj instanceof Code) {
				var boolean fullResolved = false;
				var String codeResult = "";
				val List<Code> codeList = new ArrayList<Code>();
				do {
					try {
						val Code code = obj as Code;
						codeList.add(code);
						codeResult = outputFor(codeList);
						fullResolved = true;
					} catch (MacroParentheseNotClosedYetException ex) {
						// System.out.println("not fully resolved at='" + i + "'");
						i++; 
						obj = group.lines.get(i);
						//fullResolved = true;
					}
				} while (!fullResolved);
				result.append(codeResult);
				result.append(getNewLine());
			}
		}
		path.remove(path.length() - 1);
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
		//val TranslationUnit unit = this.getUnitFor(res);
		//val String output = outputFor(unit);

		val Preprocess preprocess = this.getPreprocessFor(res);
		val String output = outputFor(preprocess);		
		//path.remove(path.length() -1);
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
			path.add("ifdef " + obj.id + "/");
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(Integer conditionalDirective, IfNotDefConditional obj) {
		if (!(DefinitionTable.isDefined(obj.id))) {
			conditionals.put(conditionalDirective, true);
			path.add("ifnotdef " + obj.id + "/");
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(Integer conditionalDirective, IfConditional obj) {
		val ConstantExpression expr = obj.expression as ConstantExpression;
		if (ExpressionEvaluation.evaluateFor(expr, commonInjector)) {
			val String string = ExpressionEvaluation.evaluateFor(expr);
			path.add("if " + string + "/");
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
 		val ConstantExpression expr = obj.expression as ConstantExpression;
 		if (ExpressionEvaluation.evaluateFor(expr, commonInjector)) {
 			val String string = ExpressionEvaluation.evaluateFor(expr);
			path.add("elif" + string + "/");
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
		path.add("else/");
		return outputFor(obj.group).trim();
	}
	
	def String outputFor(ErrorDirective obj) '''
	'''
	
	def String outputFor(PragmaDirective obj) '''
	'''
	
	def String outputFor(NewLineLine obj) {
		return getNewLine();
	}
	
	def String getNewLine() '''

	'''
	
	def String outputFor(List<Code> obj) {
		val StringBuffer text = new StringBuffer("");
		for (Code code : obj) {
			text.append(code.code);
		}
		val String result = resolve(text.toString());
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
