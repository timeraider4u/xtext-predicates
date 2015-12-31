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
import at.jku.weiner.c.preprocess.preprocess.PreprocessFactory
import at.jku.weiner.c.common.common.CommonFactory
import at.jku.weiner.c.preprocess.preprocess.IfAbstractConditional
import java.io.InputStream
import java.net.URL
import org.eclipse.emf.ecore.resource.impl.FileURIHandlerImpl
import org.eclipse.emf.ecore.resource.URIHandler
import java.util.HashMap
import java.io.File
import org.osgi.framework.Bundle
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.FileLocator
import java.io.FileInputStream
import at.jku.weiner.c.preprocess.utils.macros.PredefinedMacros

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
	// @Accessors boolean addToModel = false;
	@Accessors Injector commonInjector;
	
	@Inject
	IResourceValidator validator;
	
	ResourceSet rs;
	URI uri;
	List<String> path = new ArrayList<String>();
	boolean standAlone = false;
	
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		if (commonInjector == null) {
			standAlone = true;
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
			val URI predefinedURI = PredefinedMacros.getPredefinedURI(standAlone);
			val Resource predefinedRes = rs.getResource(predefinedURI, true);
			val Preprocess preprocess = getPreprocessFor(predefinedRes, false);
			val String output = outputFor(preprocess);
			output.trim();			
		}
		val Preprocess preprocess = getPreprocessFor(input, false);
		val String output = outputFor(preprocess);
		// System.out.println("generating output file='" + fileName + "'");
		fsa.generateFile(fileName, output);
	}
	
	def Preprocess getPreprocessFor(Resource input, boolean forceLoading) {
		var Preprocess preprocess = null;
		validatePreprocess(input);
		val String fileName = getFileName(input);
		if (this.unit == null) {
			preprocess = input.allContents.filter(typeof(Preprocess)).head;
			//System.out.println("unit-null: preprocess='" + preprocess + "'" + fileName + "'");
		}
		else if (forceLoading) {
			preprocess = loadExistingPreprocess(fileName);
			//System.out.println("force-loading: preprocess='" + preprocess + "'" + fileName + "'");
			
			if (preprocess == null) {
				preprocess = input.allContents.filter(typeof(Preprocess)).head;
				//System.out.println("filtering: preprocess='" + preprocess + "'" + fileName + "'");
				
			}
		}
		else {
			// System.out.println("else: preprocess='" + preprocess + "'" + fileName + "'");
			
			preprocess = unit.preprocess as Preprocess;
		}
		
		if (preprocess == null) {
			System.out.println("preprocess is null!");
		}
		
		//val TranslationUnit unit = model.getUnits().head;
		// unit.setPath(fileName);
		path.add("/" + fileName + "/");
		return preprocess;
	}
	
	def String getFileName(Resource input) {
		val String fileName = input.URI.toFileString;
		val String path = fileName.replaceAll("^///", "/");
		return path;
	}
	
	def Preprocess loadExistingPreprocess(String filePath) {
		val Model model = unit.eContainer as Model;
		val EList<TranslationUnit> units = model.units;
		for (var int i = 0; i < units.size; i++) {
			val TranslationUnit myUnit = units.get(i);
			if (filePath.equals(myUnit.path)) {
				return myUnit.preprocess as Preprocess;
			}
		}
		return null;
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
		val IncludeUtils includeUtils = new IncludeUtils(rs, this.uri, inc);
		val Resource res = includeUtils.getResource();
		//val TranslationUnit unit = this.getUnitFor(res);
		//val String output = outputFor(unit);
		
		

		val Preprocess preprocess = this.getPreprocessFor(res, true);
		if (this.unit != null && preprocess.eContainer == null) {
			val Model model = this.unit.eContainer as Model;
			val CommonFactory factory = CommonFactory.eINSTANCE;
			val TranslationUnit unit2 = factory.createTranslationUnit();
			val String path = getFileName(res);
			
			unit2.path = path;
			model.units.add(unit2);
			unit2.preprocess = preprocess;
		}
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
		val StringBuffer result = new StringBuffer(""); 
		obj.branchTaken = null;
		
		if (obj.conditional instanceof IfConditional) {
			result.append(outputFor(obj, obj.conditional as IfConditional));
		}
		if (obj.conditional instanceof IfDefConditional) {
			result.append(outputFor(obj, obj.conditional as IfDefConditional)); 
		}
		if (obj.conditional instanceof IfNotDefConditional) {
			result.append(outputFor(obj, obj.conditional as IfNotDefConditional)); 
		}
		result.append(outputFor(obj, obj.getElifs()));
		result.append(outputFor(obj, obj.getElse()));
		return result.toString();
	}
	
	def String outputFor(ConditionalDirective condDirective, IfDefConditional obj) {
		if (DefinitionTable.isDefined(obj.id)) {
			condDirective.branchTaken = obj;
			obj.branchTaken = true;
			
			path.add("ifdef " + obj.id + "/");
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(ConditionalDirective condDirective, IfNotDefConditional obj) {
		if (!(DefinitionTable.isDefined(obj.id))) {
			condDirective.branchTaken = obj;
			obj.branchTaken = true;
			
			path.add("ifnotdef " + obj.id + "/");
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(ConditionalDirective condDirective, IfConditional obj) {
		val ConstantExpression expr = obj.expression as ConstantExpression;
		if (ExpressionEvaluation.evaluateFor(expr, commonInjector)) {
			val String string = ExpressionEvaluation.evaluateFor(expr);
			path.add("if " + string + "/");
			condDirective.branchTaken = obj;
			obj.branchTaken = true;
			return outputFor(obj.group).trim();
		}
		return "";
	}
	
	def String outputFor(ConditionalDirective condDirective, EList<ElIfConditional> obj) {
		if (obj == null) {
 			return "";
 		}
 		val IfAbstractConditional condition = condDirective.branchTaken;
 		if (condition != null) {
 			return "";
 		}
 		val StringBuffer result = new StringBuffer(""); 
 		for (ElIfConditional cond : obj) {
 			result.append(outputFor(condDirective, cond));
 		}
 		return result.toString();
 	}
 	
 	def String outputFor(ConditionalDirective condDirective, ElIfConditional obj) {
 		val IfAbstractConditional condition = condDirective.branchTaken;
 		if (condition != null) {
 			return "";
 		}
 		val ConstantExpression expr = obj.expression as ConstantExpression;
 		if (ExpressionEvaluation.evaluateFor(expr, commonInjector)) {
 			val String string = ExpressionEvaluation.evaluateFor(expr);
			path.add("elif" + string + "/");
			condDirective.branchTaken = obj;
			obj.branchTaken = true;
			return outputFor(obj.group).trim();
		}
 		return "";
 	}
	
	def String outputFor(ConditionalDirective condDirective, ElseConditional obj) {
		val IfAbstractConditional condition = condDirective.branchTaken;
 		if (condition != null) {
 			return "";
 		}
		if (obj== null) {
			return "";
		}
		condDirective.branchTaken = obj;
		obj.branchTaken = true;
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
