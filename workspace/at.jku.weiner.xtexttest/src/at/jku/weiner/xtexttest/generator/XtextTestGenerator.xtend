/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.xtexttest.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.jku.weiner.xtexttest.xtextTest.XtextTest
import org.eclipse.emf.common.util.URI
import at.jku.weiner.xtexttest.xtextTest.Element
import at.jku.weiner.xtexttest.xtextTest.Inner
import org.eclipse.emf.common.util.EList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class XtextTestGenerator implements IGenerator {
	private static final String PKG_PREFIX = "xtexttests";
	private int elementCount;
	private XtextTest test;
	private URI uri;
	private String myDsl;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		uri = resource.URI;
		test = resource.allContents.filter(typeof(XtextTest)).head;
		myDsl = firstCharToUpperCase(test.lang);
		
		if (shouldGenerateTextSourceDataFile()) {
			val outputForDataFile = outputDataFile();
			val fileNameForDataFile = getSourceFile();
			fsa.generateFile(fileNameForDataFile, outputForDataFile);
		}
		
		elementCount = 0;
		val outputForJava = outputJava();
		val fileNameForJava = getFileNameForJava();
		fsa.generateFile(fileNameForJava, outputForJava);
	}
	
	def String firstCharToUpperCase(String text) {
		val String first = text.substring(0, 1).toUpperCase();
		val String tail = text.substring(1);
		return first + tail;
	}
	
	def shouldGenerateTextSourceDataFile() {
		return test.input.text != null;
	}
	
	def getSourceFile() {
		if (shouldGenerateTextSourceDataFile()) {
			return test.package.replace(".", "/") + "/"
					+ PKG_PREFIX + "/"
					+ uri.lastSegment().replace(".xtexttest", "") + ".dat";
		}
		return test.input.file;
	}
	
	def outputDataFile() '''«test.input.text»'''
	
	def getFileNameForJava() {
		return test.package.replace(".", "/") + "/" + PKG_PREFIX
				+ "/" + getJavaClassFileName() + ".java";
	}
	
	def getJavaClassFileName() {
		return uri.lastSegment().replace(".xtexttest", "");
	}
	
	
	def outputJava() '''
		«outputHeader»
		«outputClass»
		
	'''
	
	def outputHeader() '''
		package «test.package».«PKG_PREFIX»;
		
		import com.google.inject.Inject;
		import com.google.inject.Provider;
		
		import java.nio.file.Files;
		import java.nio.file.Path;
		import java.nio.file.Paths;
		import java.util.List;
		
		import org.antlr.runtime.Token;
		
		import org.eclipse.emf.common.util.EList;
		import org.eclipse.emf.common.util.URI;
		import org.eclipse.emf.ecore.resource.Resource;
		import org.eclipse.emf.ecore.resource.ResourceSet;
		import org.eclipse.emf.ecore.util.EDataTypeEList;
		import org.eclipse.emf.ecore.EObject;
		
		import org.eclipse.xtext.generator.IFileSystemAccess;
		import org.eclipse.xtext.generator.IGenerator;
		import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
		import org.eclipse.xtext.junit4.InjectWith;
		import org.eclipse.xtext.junit4.util.ParseHelper;
		import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
		import org.eclipse.xtext.junit4.XtextRunner;
		import org.eclipse.xtext.util.CancelIndicator;
		import org.eclipse.xtext.validation.CheckMode;
		import org.eclipse.xtext.validation.IResourceValidator;
		import org.eclipse.xtext.validation.Issue;
		import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
		
		import org.junit.Assert;
		import org.junit.After;
		import org.junit.Before;
		import org.junit.Test;
		import org.junit.runner.RunWith;
		import «test.package».tests.«myDsl»InjectorProvider;
		import «test.package».parser.antlr.«myDsl»Parser;
		import «test.package».parser.antlr.internal.Internal«myDsl»Lexer;
		import «test.package».«PKG_PREFIX».LexerAndParserTest;
		
		«iterateImports(test.root)»
	'''

	def String iterateImports(Element element) '''
		«IF element != null»
		import «test.package».«test.lang».«element.name»;
		«FOR inner : element.inner»
			«iterateImports(inner.assign)»
			«FOR elem : inner.assignList»
				«iterateImports(elem)»
			«ENDFOR»
		«ENDFOR»
		«ENDIF»
	'''
	
	def outputClass() '''
		@SuppressWarnings("unused")
		@RunWith(XtextRunner.class)
		@InjectWith(«myDsl»InjectorProvider.class)
		public class «getJavaClassFileName» {
			@Inject
			private ParseHelper<«test.root.name»> parseHelper;
			@Inject
			private ValidationTestHelper valHelper;
			@Inject
			private Internal«myDsl»Lexer lexer;
			@Inject
			private «myDsl»Parser parser;
			@Inject
			private ITokenDefProvider tokenDefProvider;
			//@Inject
			private LexerAndParserTest testHelper;
			@Inject
			private IGenerator generator;
			@Inject
			private Provider<ResourceSet> resourceSetProvider;
			@Inject
			private IResourceValidator validator;
			@Inject
			private JavaIoFileSystemAccess fileAccessSystem;
			
			@Before
			public void initialize(){
				this.testHelper = new LexerAndParserTest(lexer, 
					parser, tokenDefProvider);
			}
			
			private String getTextFromFile(final String fileName)
			throws Exception{
				final Path path = Paths.get(fileName);
				final String content = new String(Files.readAllBytes(path));
				return content;
			}
			
			private String preprocess(final String string) {
				final String lines = string.replaceAll("\n", " ").trim();
				final String multi = lines.replaceAll("\\s{2,}", " ").trim();
				final String sign = multi.replaceAll("\\s+([^a-zA-Z0-9_])", "$1")
						.trim();
				final String sign2 = sign.replaceAll("([^a-zA-Z0-9_])\\s+", "$1")
						.trim();
			
				// System.out.println(sign2);
				return sign2;
			}
			
			«tokensJUnitTest»
			
			«parserJUnitTest»
			
			«generatorJUnitTest»
			
		}
		
	'''
	
	def tokensJUnitTest() '''
		«IF test.tokens != null»
		@Test
		public void checkLexerTokens() throws Exception{
			final String text = this.getTextFromFile(
				"«IF shouldGenerateTextSourceDataFile»src-gen/«ENDIF»«getSourceFile»");
				//System.out.println(text);
				final String[] expected = new String[] {
					«FOR token: test.tokens.tokens»
						"RULE_«token»", 
					«ENDFOR»
					};
				//final List<Token> actual = testHelper.getTokens(text);
				//testHelper.outputTokens(text);
				testHelper.checkTokenisation(text, expected);
		}
		«ENDIF»
	'''
	
	def parserJUnitTest() '''
		@Test
		public void checkParserResult() throws Exception {
			final String text = this.getTextFromFile(
				"«IF shouldGenerateTextSourceDataFile»src-gen/«ENDIF»«getSourceFile»");
			final «test.root.name» «varName(test.root)»  = 
				this.parseHelper.parse(text);
			this.valHelper.assertNoErrors(«varName(test.root)»);
			
			«generateForElement(test.root)»
		}
	'''
	
	def String varName(Element element) '''
		«element.name»_«elementCount»_Var
	'''
	
	def paramName(Inner inner) {
		return firstCharToUpperCase(inner.parameter);
	}
	
	def String generateForElement(Element element) '''
		«val varName = varName(element)»
		Assert.assertNotNull(«varName»);
		«FOR inner : element.inner»
			«val paramName = firstCharToUpperCase(inner.parameter)»
			«IF inner.assign != null»
				«generateForInnerAssign(varName, paramName, inner.assign)»
			«ELSE»
			«IF ((inner.getAssignList() != null)
					&& (!inner.getAssignList().isEmpty()))»
				«generateForListAssign(varName, paramName, inner.assignList)»
			«ELSE»
			«IF ((inner.getAssignAsData() != null)
					&& (!inner.getAssignAsData().isEmpty()))»
				«generateForDataListAssign(varName, paramName,
										inner.assignAsData)»
			«ELSE»
				«generateForValueAssign(varName, paramName, inner.value)»
			«ENDIF»
			«ENDIF»	
			«ENDIF»	
		«ENDFOR»
	'''
	
	def generateForInnerAssign(String varName, String paramName, Element innerElem) '''
		//«elementCount++»
		«val String type = firstCharToUpperCase(innerElem.name)»
		final «type» «varName(innerElem)» = («type»)«varName».get«paramName»();
		«generateForElement(innerElem)»
	'''
	
	def generateForListAssign(String varName, String paramName,
			EList<Element> assignList) '''
		«val String listName = this.getListName(paramName)»
		final EList<? extends EObject> «listName» = «varName».get«paramName»();
		Assert.assertNotNull(«listName»);
		Assert.assertEquals(«assignList.size()», «listName».size());
		«FOR i : (0 ..< assignList.size)»
			«val Element elem = assignList.get(i)»
			//«elementCount++»
			«val String type = elem.name»
			final «type» «varName(elem)» = («type»)«listName».get(«i»);
			«generateForElement(elem)»
		«ENDFOR»
	'''
	
	def String getListName(String paramName) {
		return paramName + "_" + this.elementCount + "_list";
	}
	
	def generateForDataListAssign(String varName, String paramName,
			String assignAsData) '''
		Assert.assertEquals("«assignAsData»", «varName».get«paramName»().toString());
	'''
	
	def generateForValueAssign(String varName, String paramName,
			String value) '''
		Assert.assertEquals("«value»", «varName».get«paramName»());
	'''
	
	def generatorJUnitTest() '''
		«IF test.output != null»
		@Test
		public void testGenerator() throws Exception {
			// load the resource
			ResourceSet set = this.resourceSetProvider.get();
			URI uri = URI.createURI(
				"«IF shouldGenerateTextSourceDataFile»src-gen/«ENDIF»«getSourceFile»");
			Resource resource = set.getResource(uri, true);
			// validate the resource
			List<Issue> list = this.validator.validate(resource, 
				CheckMode.ALL,CancelIndicator.NullImpl);
			Assert.assertTrue(list.isEmpty());
			
			// configure and start the generator
			this.fileAccessSystem.setOutputPath("«getOutputPath()»");
			this.generator.doGenerate(resource, this.fileAccessSystem);
			final String actual = this.getTextFromFile("«test.output.getOutput()»");
			final String expected = this.getTextFromFile(
				«IF test.output.isIsSameAsInputFile()»
					"«getSourceFile()»"
				«ELSE»
					"«test.output.expected»"
				«ENDIF»
				);
			Assert.assertEquals(preprocess(expected), preprocess(actual));
			// System.out.println("Code generation finished.");
		}
		«ENDIF»
	'''
	
	def getOutputPath() {
		val output = test.output.getOutput();
		val int lastIndex = output.lastIndexOf("/");
		if (lastIndex >= 0) {
			return output.substring(0, lastIndex);
		}
		return "";
	}
}
