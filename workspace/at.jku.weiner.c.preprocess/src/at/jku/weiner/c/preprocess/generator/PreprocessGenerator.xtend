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
import at.jku.weiner.c.preprocess.preprocess.ConstantExpression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PreprocessGenerator implements IGenerator {

	@Accessors String fileName = 'greetings.txt';
	@Accessors boolean legacyMode = true;
	
	ResourceSet rs;
	URI uri;
	
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		rs = input.resourceSet;
		uri = input.URI;
		DefinitionTable.reset();
		val TranslationUnit unit = getUnitFor(input);
		val String output = outputFor(unit);
		fsa.generateFile(fileName, output);
	}
	
	def TranslationUnit getUnitFor(Resource input) {
		val Model model = input.allContents.filter(typeof(Model)).head;
		val TranslationUnit unit = model.units.head;
		return unit;
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
		val TranslationUnit unit = this.getUnitFor(res);
		val String output = outputFor(unit);
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
		if (obj.conditional instanceof IfConditional) {
			return outputFor(obj.conditional as IfConditional);
		}
		if (obj.conditional instanceof IfDefConditional) {
			return outputFor(obj.conditional as IfDefConditional); 
		}
		if (obj.conditional instanceof IfNotDefConditional) {
			return outputFor(obj.conditional as IfNotDefConditional); 
		}
		return "";
	}
	
	def String outputFor(IfConditional obj) {
		if (ExpressionEvaluation.evaluateFor(obj.expression as ConstantExpression)) {
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(IfDefConditional obj) {
		if (DefinitionTable.isDefined(obj.id)) {
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(IfNotDefConditional obj) {
		if (!(DefinitionTable.isDefined(obj.id))) {
			return outputFor(obj.group).trim();
		}
		return "";
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
