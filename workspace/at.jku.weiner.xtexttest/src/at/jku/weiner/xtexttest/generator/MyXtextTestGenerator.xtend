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
import org.eclipse.xtend.lib.annotations.Accessors
import at.jku.weiner.xtexttest.xtextTest.Model

class MyXtextTestGenerator {
	private static final String PKG_PREFIX = "xtexttests";
	private static final int TIMEOUT = 1000;
	private int elementCount;
	private XtextTest test;
	private URI uri;
	private String myDsl;
	
	@Accessors String fileName;

	def void doGenerate(Resource resource, IFileSystemAccess fsa, Model model) {
		this.test = model.xtextTest;
		uri = resource.URI;
		myDsl = firstCharToUpperCase(test.lang);
		
		if (shouldGenerateTextSourceDataFile()) {
			val outputForDataFile = outputDataFile();
			val fileNameForDataFile = getSourceFile();
			fsa.generateFile(fileNameForDataFile, outputForDataFile);
		}
		
		elementCount = 0;
		val outputForJava = outputJava();
		setFileName(test.package.replace(".", "/") + "/" + PKG_PREFIX
			+ "/" + getJavaClassFileName() + ".java");
		// System.out.println("generate file='" + getFileName() + "'");
		fsa.generateFile(getFileName(), outputForJava);
	}
	
	def String firstCharToUpperCase(String text) {
		val String first = text.substring(0, 1).toUpperCase();
		val String tail = text.substring(1);
		return first + tail;
	}
	
	def shouldGenerateTextSourceDataFile() {
		return test.input.text != null;
	}
	
	def String getSourceFile() {
		if (shouldGenerateTextSourceDataFile()) {
			return test.package.replace(".", "/") + "/"
					+ PKG_PREFIX + "/"
					+ uri.lastSegment().replace(".xtexttest", "") + ".dat";
		}
		return test.input.file;
	}
	
	def String getFileExtension() {
		val String fileNameForDataFile = getSourceFile();
		val int index = fileNameForDataFile.indexOf(".");
		val String result = fileNameForDataFile.substring(index + 1);
		return result;
	}
	
	def outputDataFile() '''«test.input.text»'''
	
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
		
		import java.lang.reflect.InvocationTargetException;
		import java.lang.reflect.Method;
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
		import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
		import org.eclipse.xtext.resource.IResourceFactory;
		import org.eclipse.xtext.util.CancelIndicator;
		import org.eclipse.xtext.validation.CheckMode;
		import org.eclipse.xtext.validation.IResourceValidator;
		import org.eclipse.xtext.validation.Issue;
		
		import org.junit.Assert;
		import org.junit.After;
		import org.junit.Before;
		import org.junit.Test;
		import org.junit.runner.RunWith;
		import «test.package».tests.«myDsl»InjectorProvider;
		import «test.package».parser.antlr.«myDsl»Parser;
		«IF "true".equals(test.boolean)»
		import «test.package».parser.antlr.lexer.Internal«myDsl»Lexer;
		«ELSE»
		import «test.package».parser.antlr.internal.Internal«myDsl»Lexer;
		«ENDIF»
		import «test.package».«PKG_PREFIX».LexerAndParserTest;
		
		«iterateImports(test.root)»
	'''

	def String iterateImports(Element element) '''
		«IF element != null»
		«IF element.importing != null»
			import «test.imports».«element.name»;
		«ELSE»
			import «test.package».«test.lang».«element.name»;
		«ENDIF»
		«FOR inner : element.inner»
			«iterateImports(inner.assign)»
			«FOR elem : inner.assignList»
				«iterateImports(elem)»
			«ENDFOR»
		«ENDFOR»
		«ENDIF»
	'''
	
	def String outputClass() '''
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
			@Inject
			private IResourceFactory resourceFactory;
			
			@Before
			public void initialize(){
				this.testHelper = new LexerAndParserTest(lexer, 
					parser, tokenDefProvider);
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("«getFileExtension()»",
								this.resourceFactory);
				«IF this.test.before != null»
					«this.test.before.myclass».«this.test.before.method»();
				«ENDIF»
			}
			
			@After
			public void cleanUp() {
				«IF this.test.after != null»
					«this.test.after.myclass».«this.test.after.method»();
				«ENDIF»
			}
			
			private String getTextFromFile(final String fileName)
			throws Exception{
				final Path path = Paths.get(fileName);
				final String content = new String(Files.readAllBytes(path));
				return content;
			}
			
			«tokensJUnitTest»
			
			«parserJUnitTest»
			
			«generatorJUnitTest»
			
		}
		
	'''
	
	def tokensJUnitTest() '''
		«IF test.tokens != null»
		@Test (timeout=«TIMEOUT»)
		public void checkLexerTokens() throws Exception{
			final String text = this.getTextFromFile(
				"«IF shouldGenerateTextSourceDataFile»src-gen/«ENDIF»«getSourceFile»");
				//System.out.println(text);
				final String[] expected = new String[] {
					«FOR token: test.tokens.tokens»
						"RULE_«token.token»", 
						«IF token.count > 1»
						«FOR i : 2 .. token.count»
						"RULE_«token.token»", 
						«ENDFOR»
						«ENDIF»
					«ENDFOR»
					};
				//final List<Token> actual = testHelper.getTokens(text);
				//testHelper.outputTokens(text);
				testHelper.checkTokenisation(text, expected);
		}
		«ENDIF»
	'''
	
	def parserJUnitTest() '''
		@Test (timeout=«TIMEOUT»)
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
			«ENDIF»
			«IF ((inner.getAssignList() != null)
					&& (!inner.getAssignList().isEmpty()))»
				«generateForListAssign(varName, paramName, inner.assignList)»
			«ENDIF»
			«IF ((inner.getAssignAsData() != null)
					&& (!inner.getAssignAsData().isEmpty()))»
				«generateForDataListAssign(varName, paramName,
										inner.assignAsData)»
			«ENDIF»
			«IF ((inner.getValue() != null))»
				«generateForValueAssign(varName, paramName, inner.value)»
			«ENDIF»
			«IF (inner.getAssignAsBool() != null)»
				«generateForBoolAssign(varName, paramName, inner.assignAsBool)»
			«ENDIF»
			«IF (inner.isNull)»
				Assert.assertNull(«varName».get«paramName»());
			«ENDIF»
			«IF (inner.isNotNull)»
				Assert.assertNotNull(«varName».get«paramName»());
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
	
	def generateForBoolAssign(String varName, String paramName, String string3) '''
		«IF "true".equals(string3)»
			Assert.assertTrue(«varName».is«paramName»());
		«ELSE»
			Assert.assertFalse(«varName».is«paramName»());
		«ENDIF»
	'''
	
	def generatorJUnitTest() '''
		«IF test.output != null»
		@Test
		(timeout=«TIMEOUT»
		«IF test.output.exception != null»
		, expected = «test.output.exception».class
		«ENDIF»
		)
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
			«setFileNameForGeneratorOutputFile()»
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
		
		«outputForPreprocess»
		«ENDIF»
	'''
	
	def setFileNameForGeneratorOutputFile() '''
		final Class<?> clazz = this.generator.getClass();
		try {
			final Method method = clazz.getMethod("setFileName",
					String.class);
			if (method != null) {
				method.invoke(this.generator, "«getOutputFileName()»");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
			// System.out.println("do nothing!");
		}
	'''
	
	def getOutputPath() {
		val output = test.output.getOutput();
		val int lastIndex = output.lastIndexOf("/");
		if (lastIndex >= 0) {
			return output.substring(0, lastIndex);
		}
		return "";
	}
	
	def getOutputFileName() {
		val output = test.output.getOutput();
		val int lastIndex = output.lastIndexOf("/");
		if (lastIndex >= 0) {
			return output.substring(lastIndex + 1);
		}
		return "";
	}
	
	def String outputForPreprocess() '''
		private String preprocess(String string) throws Exception {
			«IF test.output.patternFile != null»
				string = preprocessForFile(string);
			«ENDIF»
			«IF test.output.replacePatterns != null»
				string = preprocessForPatterns(string);
			«ENDIF»
			return string;
		}
		
		«IF test.output.patternFile != null»
		private String preprocessForFile(String string) throws Exception {
			final String content = this.getTextFromFile("«test.output.patternFile»");
			final String[] lines = content.split("\n");
			if (lines == null) {
				return string;
			}
			for (String line : lines) {
				final String[] myLine = line.split("=");
				if (myLine == null || myLine.length != 2) {
					continue;
				}
				final String regex = myLine[0].replace("\"", "").replace("\\\\", "\\");
				final String replace = myLine[1].replace("\"", "").replace("\\\\", "\\");
				string = string.replaceAll(regex, replace);
			}
			return string;
		}
		«ENDIF»
		
		«IF test.output.replacePatterns != null»
		private String preprocessForPatterns(String string) {
			«FOR r: test.output.replacePatterns»
				string = string.replaceAll(
					"«replacement(r.regex)»",
					"«replacement(r.replace)»"
				);
			«ENDFOR»
			return string;
		}
		«ENDIF»
	'''
	
	def String replacement(String string) {
		val string2 = string.replace('\n', "\\n");
		val string3 = string2.replace('\t', "\\t");
		val string4 = string3.replace('\r', "\\r");
		val string5 = string4.replace('\'', "\\'");
		val string6 = string5.replace('\\', "\\\\");
		val string7 = string6.replace('\"', "\\\"");
		return string7;
	}
}
