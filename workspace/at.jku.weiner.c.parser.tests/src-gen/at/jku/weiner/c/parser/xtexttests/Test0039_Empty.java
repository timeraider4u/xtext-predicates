package at.jku.weiner.c.parser.xtexttests;

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
import at.jku.weiner.c.parser.tests.ParserInjectorProvider;
import at.jku.weiner.c.parser.parser.antlr.ParserParser;
import at.jku.weiner.c.parser.parser.antlr.internal.InternalParserLexer;
import at.jku.weiner.c.parser.xtexttests.LexerAndParserTest;

import at.jku.weiner.c.common.common.Model;
import at.jku.weiner.c.common.common.TranslationUnit;
import at.jku.weiner.c.parser.parser.Parser;
import at.jku.weiner.c.parser.parser.ExternalDeclaration;
import at.jku.weiner.c.parser.parser.Declaration;
import at.jku.weiner.c.parser.parser.DeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.InitDeclaratorList;
import at.jku.weiner.c.parser.parser.InitDeclarator;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.DeclaratorSuffix;
import at.jku.weiner.c.parser.parser.DirectDeclaratorLastSuffix;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(ParserInjectorProvider.class)
public class Test0039_Empty {
	@Inject
	private ParseHelper<Model> parseHelper;
	@Inject
	private ValidationTestHelper valHelper;
	@Inject
	private InternalParserLexer lexer;
	@Inject
	private ParserParser parser;
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
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("h",
						this.resourceFactory);
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
	
	@Test
	public void checkLexerTokens() throws Exception{
		final String text = this.getTextFromFile(
			"res/Test0039_Empty.h");
			//System.out.println(text);
			final String[] expected = new String[] {
				"RULE_KW_VOID", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_SKW_LEFTPAREN", 
				"RULE_SKW_RIGHTPAREN", 
				"RULE_SKW_SEMI", 
				"RULE_NEWLINE", 
				};
			//final List<Token> actual = testHelper.getTokens(text);
			//testHelper.outputTokens(text);
			testHelper.checkTokenisation(text, expected);
	}
	
	@Test
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0039_Empty.h");
		final Model Model_0_Var
		  = 
			this.parseHelper.parse(text);
		this.valHelper.assertNoErrors(Model_0_Var
		);
		
		Assert.assertNotNull(Model_0_Var
		);
		final EList<? extends EObject> Units_0_list = Model_0_Var
		.getUnits();
		Assert.assertNotNull(Units_0_list);
		Assert.assertEquals(1, Units_0_list.size());
		//0
		final TranslationUnit TranslationUnit_1_Var
		 = (TranslationUnit)Units_0_list.get(0);
		Assert.assertNotNull(TranslationUnit_1_Var
		);
		//1
		final Parser Parser_2_Var
		 = (Parser)TranslationUnit_1_Var
		.getParser();
		Assert.assertNotNull(Parser_2_Var
		);
		final EList<? extends EObject> External_2_list = Parser_2_Var
		.getExternal();
		Assert.assertNotNull(External_2_list);
		Assert.assertEquals(1, External_2_list.size());
		//2
		final ExternalDeclaration ExternalDeclaration_3_Var
		 = (ExternalDeclaration)External_2_list.get(0);
		Assert.assertNotNull(ExternalDeclaration_3_Var
		);
		//3
		final Declaration Declaration_4_Var
		 = (Declaration)ExternalDeclaration_3_Var
		.getDeclaration();
		Assert.assertNotNull(Declaration_4_Var
		);
		//4
		final DeclarationSpecifiers DeclarationSpecifiers_5_Var
		 = (DeclarationSpecifiers)Declaration_4_Var
		.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_5_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_5_list = DeclarationSpecifiers_5_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_5_list);
		Assert.assertEquals(1, DeclarationSpecifier_5_list.size());
		//5
		final TypeSpecifier TypeSpecifier_6_Var
		 = (TypeSpecifier)DeclarationSpecifier_5_list.get(0);
		Assert.assertNotNull(TypeSpecifier_6_Var
		);
		Assert.assertEquals("void", TypeSpecifier_6_Var
		.getName());
		final EList<? extends EObject> InitDeclaratorList_6_list = Declaration_4_Var
		.getInitDeclaratorList();
		Assert.assertNotNull(InitDeclaratorList_6_list);
		Assert.assertEquals(1, InitDeclaratorList_6_list.size());
		//6
		final InitDeclaratorList InitDeclaratorList_7_Var
		 = (InitDeclaratorList)InitDeclaratorList_6_list.get(0);
		Assert.assertNotNull(InitDeclaratorList_7_Var
		);
		final EList<? extends EObject> InitDeclarator_7_list = InitDeclaratorList_7_Var
		.getInitDeclarator();
		Assert.assertNotNull(InitDeclarator_7_list);
		Assert.assertEquals(1, InitDeclarator_7_list.size());
		//7
		final InitDeclarator InitDeclarator_8_Var
		 = (InitDeclarator)InitDeclarator_7_list.get(0);
		Assert.assertNotNull(InitDeclarator_8_Var
		);
		//8
		final Declarator Declarator_9_Var
		 = (Declarator)InitDeclarator_8_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_9_Var
		);
		//9
		final DirectDeclarator DirectDeclarator_10_Var
		 = (DirectDeclarator)Declarator_9_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_10_Var
		);
		Assert.assertEquals("doSomething", DirectDeclarator_10_Var
		.getId());
		final EList<? extends EObject> DeclaratorSuffix_10_list = DirectDeclarator_10_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_10_list);
		Assert.assertEquals(1, DeclaratorSuffix_10_list.size());
		//10
		final DeclaratorSuffix DeclaratorSuffix_11_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_10_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_11_Var
		);
		//11
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_12_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_11_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_12_Var
		);
		Assert.assertEquals(";", Declaration_4_Var
		.getSemi());
	}
	
	@Test
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0039_Empty.h");
		Resource resource = set.getResource(uri, true);
		// validate the resource
		List<Issue> list = this.validator.validate(resource, 
			CheckMode.ALL,CancelIndicator.NullImpl);
		Assert.assertTrue(list.isEmpty());
		
		// configure and start the generator
		this.fileAccessSystem.setOutputPath("bin");
		final Class<?> clazz = this.generator.getClass();
		try {
			final Method method = clazz.getMethod("setFileName",
					String.class);
			if (method != null) {
				method.invoke(this.generator, "Test0039_Empty.c");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
			// System.out.println("do nothing!");
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0039_Empty.c");
		final String expected = this.getTextFromFile(
			"res/Test0039_Empty.h"
			);
		Assert.assertEquals(preprocess(expected), preprocess(actual));
		// System.out.println("Code generation finished.");
	}
	
	private String preprocess(String string) throws Exception {
		string = preprocessForFile(string);
		string = preprocessForPatterns(string);
		return string;
	}
	
	private String preprocessForFile(String string) throws Exception {
		final String content = this.getTextFromFile("res/Patterns.txt");
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
	
	private String preprocessForPatterns(String string) {
		return string;
	}
	
}


