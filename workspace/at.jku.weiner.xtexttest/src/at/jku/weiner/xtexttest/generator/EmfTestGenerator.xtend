package at.jku.weiner.xtexttest.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import at.jku.weiner.xtexttest.xtextTest.Model
import at.jku.weiner.xtexttest.xtextTest.EmfTest
import org.eclipse.emf.common.util.URI
import at.jku.weiner.xtexttest.xtextTest.Element
import java.util.Map
import java.util.HashMap
import at.jku.weiner.xtexttest.xtextTest.Import
import org.eclipse.emf.common.util.EList

class EmfTestGenerator {
	private static final String PKG_PREFIX = "emftests";
	private static final int TIMEOUT = 25000;
	
	private URI uri;
	private EmfTest test;
	private int elementCount;
	private Map<String,String> map;
	
	def void doGenerate(Resource resource, IFileSystemAccess fsa, Model model) {
		this.test = model.emfTest;
		uri = resource.URI;
		map = new HashMap<String,String>();
		initializeAliases();
		
		elementCount = 0;
		val String outputForJava = outputJava();
		val String fileName = test.package.replace(".", "/") + "/" + PKG_PREFIX
			+ "/" + uri.lastSegment().replace(".xtexttest", "") + ".java";
		fsa.generateFile(fileName, outputForJava);
	}
	
	def void initializeAliases() {
		if (test.myimport == null) {
			return;
		}
		for (var int i = 0; i < test.myimport.size(); i++) {
			val Import myImport = test.myimport.get(i);
			map.put(myImport.alias, myImport.id);
		}
	}
	
	def String outputJava() '''
		«outputHeader»
		«outputClass»
		
	'''
	
	def outputHeader() '''
		package «test.package».«PKG_PREFIX»;
		
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
		
		import org.junit.Assert;
		import org.junit.After;
		import org.junit.Before;
		import org.junit.Test;
		import org.junit.runner.RunWith;
		
		«iterateImports(test.root)»
	'''

	def String iterateImports(Element element) '''
		«IF element != null»
		«IF element.importing != null»
			import «map.get(element.importing)».«element.name»;
		«ELSE»
			import «test.mydefault».«element.name»;
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
		public class «getJavaClassFileName» {
			
			private final String pureJavaClassFileName = "«getJavaClassFileName()»";
			
			@Before
			public void initialize(){
				
				
			}
			
			@After
			public void cleanUp() {
				
			}
			
			private String getTextFromFile(final String fileName)
			throws Exception{
				final Path path = Paths.get(fileName);
				final String content = new String(Files.readAllBytes(path));
				return content;
			}
			
						
			«mainJUnitTest»
			
		}
		
	'''
	
	def String mainJUnitTest() '''
		@Test (timeout=«TIMEOUT»)
		public void checkParserResult() throws Exception {
			final EObject obj = «test.codeCall.myclass».«test.codeCall.method»(
			«outputFor(test.codeCall.params)»
			);
			Assert.assertNotNull(obj);
			Assert.assertTrue(obj instanceof «test.root.name»);
			final «test.root.name» «varName(test.root)»  =  («test.root.name»)obj;
			«generateForElement(test.root)»
		}
		
	'''
	
	def String outputFor(EList<String> list) {
		val StringBuffer result = new StringBuffer("");
		var boolean isFirst = true;
		for (var int i = 0; i < list.size(); i++) {
			if (!isFirst) {
				result.append(",");
			}
			val String entry = list.get(i);
			result.append(entry);
		}
		return result.toString();
	}
	
	def getJavaClassFileName() {
		return uri.lastSegment().replace(".xtexttest", "");
	}
	
	def String getFileExtension() {
		val String fileNameForDataFile = test.file
		val int index = fileNameForDataFile.indexOf(".");
		val String result = fileNameForDataFile.substring(index + 1);
		return result;
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
	
	def String varName(Element element) '''
		«element.name»_«elementCount»_Var
	'''
	
	def String firstCharToUpperCase(String text) {
		val String first = text.substring(0, 1).toUpperCase();
		val String tail = text.substring(1);
		return first + tail;
	}
	
}
