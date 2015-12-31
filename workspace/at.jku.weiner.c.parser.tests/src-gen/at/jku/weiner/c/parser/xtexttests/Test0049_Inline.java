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

import at.jku.weiner.c.parser.parser.Parser;
import at.jku.weiner.c.parser.parser.ExternalDeclaration;
import at.jku.weiner.c.parser.parser.Declaration;
import at.jku.weiner.c.parser.parser.DeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.FunctionSpecifier;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.InitDeclaratorList;
import at.jku.weiner.c.parser.parser.InitDeclarator;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.DeclaratorSuffix;
import at.jku.weiner.c.parser.parser.DirectDeclaratorLastSuffix;
import at.jku.weiner.c.parser.parser.ExternalDeclaration;
import at.jku.weiner.c.parser.parser.Declaration;
import at.jku.weiner.c.parser.parser.DeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.FunctionSpecifier;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.InitDeclaratorList;
import at.jku.weiner.c.parser.parser.InitDeclarator;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.DeclaratorSuffix;
import at.jku.weiner.c.parser.parser.DirectDeclaratorLastSuffix;
import at.jku.weiner.c.parser.parser.ExternalDeclaration;
import at.jku.weiner.c.parser.parser.FunctionDefHead;
import at.jku.weiner.c.parser.parser.FunctionDeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.StorageClassSpecifier;
import at.jku.weiner.c.parser.parser.FunctionSpecifier;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.FunctionDefinition;
import at.jku.weiner.c.parser.parser.BodyStatement;
import at.jku.weiner.c.parser.parser.ExternalDeclaration;
import at.jku.weiner.c.parser.parser.FunctionDefHead;
import at.jku.weiner.c.parser.parser.FunctionDeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.StorageClassSpecifier;
import at.jku.weiner.c.parser.parser.FunctionSpecifier;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.FunctionDefinition;
import at.jku.weiner.c.parser.parser.BodyStatement;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(ParserInjectorProvider.class)
public class Test0049_Inline {
	@Inject
	private ParseHelper<Parser> parseHelper;
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
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("c",
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
	
	@Test (timeout=1000)
	public void checkLexerTokens() throws Exception{
		final String text = this.getTextFromFile(
			"res/Test0049_Inline.c");
			//System.out.println(text);
			final String[] expected = new String[] {
				"RULE_KW_INLINE1", 
				"RULE_WHITESPACE", 
				"RULE_KW_VOID", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_SKW_LEFTPAREN", 
				"RULE_SKW_RIGHTPAREN", 
				"RULE_SKW_SEMI", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_KW_INLINE2", 
				"RULE_WHITESPACE", 
				"RULE_KW_VOID", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_SKW_LEFTPAREN", 
				"RULE_SKW_RIGHTPAREN", 
				"RULE_SKW_SEMI", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_KW_STATIC", 
				"RULE_WHITESPACE", 
				"RULE_KW_INLINE1", 
				"RULE_WHITESPACE", 
				"RULE_KW_VOID", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_SKW_LEFTPAREN", 
				"RULE_SKW_RIGHTPAREN", 
				"RULE_WHITESPACE", 
				"RULE_SKW_LEFTBRACE", 
				"RULE_NEWLINE", 
				"RULE_SKW_RIGHTBRACE", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_KW_STATIC", 
				"RULE_WHITESPACE", 
				"RULE_KW_INLINE2", 
				"RULE_WHITESPACE", 
				"RULE_KW_VOID", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_SKW_LEFTPAREN", 
				"RULE_SKW_RIGHTPAREN", 
				"RULE_WHITESPACE", 
				"RULE_SKW_LEFTBRACE", 
				"RULE_NEWLINE", 
				"RULE_SKW_RIGHTBRACE", 
				"RULE_NEWLINE", 
				};
			//final List<Token> actual = testHelper.getTokens(text);
			//testHelper.outputTokens(text);
			testHelper.checkTokenisation(text, expected);
	}
	
	@Test (timeout=1000)
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0049_Inline.c");
		final Parser Parser_0_Var
		  = 
			this.parseHelper.parse(text);
		this.valHelper.assertNoErrors(Parser_0_Var
		);
		
		Assert.assertNotNull(Parser_0_Var
		);
		final EList<? extends EObject> External_0_list = Parser_0_Var
		.getExternal();
		Assert.assertNotNull(External_0_list);
		Assert.assertEquals(4, External_0_list.size());
		//0
		final ExternalDeclaration ExternalDeclaration_1_Var
		 = (ExternalDeclaration)External_0_list.get(0);
		Assert.assertNotNull(ExternalDeclaration_1_Var
		);
		//1
		final Declaration Declaration_2_Var
		 = (Declaration)ExternalDeclaration_1_Var
		.getDeclaration();
		Assert.assertNotNull(Declaration_2_Var
		);
		//2
		final DeclarationSpecifiers DeclarationSpecifiers_3_Var
		 = (DeclarationSpecifiers)Declaration_2_Var
		.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_3_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_3_list = DeclarationSpecifiers_3_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_3_list);
		Assert.assertEquals(2, DeclarationSpecifier_3_list.size());
		//3
		final FunctionSpecifier FunctionSpecifier_4_Var
		 = (FunctionSpecifier)DeclarationSpecifier_3_list.get(0);
		Assert.assertNotNull(FunctionSpecifier_4_Var
		);
		Assert.assertEquals("inline", FunctionSpecifier_4_Var
		.getName());
		//4
		final TypeSpecifier TypeSpecifier_5_Var
		 = (TypeSpecifier)DeclarationSpecifier_3_list.get(1);
		Assert.assertNotNull(TypeSpecifier_5_Var
		);
		Assert.assertEquals("void", TypeSpecifier_5_Var
		.getName());
		final EList<? extends EObject> InitDeclaratorList_5_list = Declaration_2_Var
		.getInitDeclaratorList();
		Assert.assertNotNull(InitDeclaratorList_5_list);
		Assert.assertEquals(1, InitDeclaratorList_5_list.size());
		//5
		final InitDeclaratorList InitDeclaratorList_6_Var
		 = (InitDeclaratorList)InitDeclaratorList_5_list.get(0);
		Assert.assertNotNull(InitDeclaratorList_6_Var
		);
		final EList<? extends EObject> InitDeclarator_6_list = InitDeclaratorList_6_Var
		.getInitDeclarator();
		Assert.assertNotNull(InitDeclarator_6_list);
		Assert.assertEquals(1, InitDeclarator_6_list.size());
		//6
		final InitDeclarator InitDeclarator_7_Var
		 = (InitDeclarator)InitDeclarator_6_list.get(0);
		Assert.assertNotNull(InitDeclarator_7_Var
		);
		//7
		final Declarator Declarator_8_Var
		 = (Declarator)InitDeclarator_7_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_8_Var
		);
		//8
		final DirectDeclarator DirectDeclarator_9_Var
		 = (DirectDeclarator)Declarator_8_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_9_Var
		);
		Assert.assertEquals("doSomething1", DirectDeclarator_9_Var
		.getId());
		final EList<? extends EObject> DeclaratorSuffix_9_list = DirectDeclarator_9_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_9_list);
		Assert.assertEquals(1, DeclaratorSuffix_9_list.size());
		//9
		final DeclaratorSuffix DeclaratorSuffix_10_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_9_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_10_Var
		);
		//10
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_11_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_10_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_11_Var
		);
		Assert.assertEquals(";", Declaration_2_Var
		.getSemi());
		//11
		final ExternalDeclaration ExternalDeclaration_12_Var
		 = (ExternalDeclaration)External_0_list.get(1);
		Assert.assertNotNull(ExternalDeclaration_12_Var
		);
		//12
		final Declaration Declaration_13_Var
		 = (Declaration)ExternalDeclaration_12_Var
		.getDeclaration();
		Assert.assertNotNull(Declaration_13_Var
		);
		//13
		final DeclarationSpecifiers DeclarationSpecifiers_14_Var
		 = (DeclarationSpecifiers)Declaration_13_Var
		.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_14_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_14_list = DeclarationSpecifiers_14_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_14_list);
		Assert.assertEquals(2, DeclarationSpecifier_14_list.size());
		//14
		final FunctionSpecifier FunctionSpecifier_15_Var
		 = (FunctionSpecifier)DeclarationSpecifier_14_list.get(0);
		Assert.assertNotNull(FunctionSpecifier_15_Var
		);
		Assert.assertEquals("__inline", FunctionSpecifier_15_Var
		.getName());
		//15
		final TypeSpecifier TypeSpecifier_16_Var
		 = (TypeSpecifier)DeclarationSpecifier_14_list.get(1);
		Assert.assertNotNull(TypeSpecifier_16_Var
		);
		Assert.assertEquals("void", TypeSpecifier_16_Var
		.getName());
		final EList<? extends EObject> InitDeclaratorList_16_list = Declaration_13_Var
		.getInitDeclaratorList();
		Assert.assertNotNull(InitDeclaratorList_16_list);
		Assert.assertEquals(1, InitDeclaratorList_16_list.size());
		//16
		final InitDeclaratorList InitDeclaratorList_17_Var
		 = (InitDeclaratorList)InitDeclaratorList_16_list.get(0);
		Assert.assertNotNull(InitDeclaratorList_17_Var
		);
		final EList<? extends EObject> InitDeclarator_17_list = InitDeclaratorList_17_Var
		.getInitDeclarator();
		Assert.assertNotNull(InitDeclarator_17_list);
		Assert.assertEquals(1, InitDeclarator_17_list.size());
		//17
		final InitDeclarator InitDeclarator_18_Var
		 = (InitDeclarator)InitDeclarator_17_list.get(0);
		Assert.assertNotNull(InitDeclarator_18_Var
		);
		//18
		final Declarator Declarator_19_Var
		 = (Declarator)InitDeclarator_18_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_19_Var
		);
		//19
		final DirectDeclarator DirectDeclarator_20_Var
		 = (DirectDeclarator)Declarator_19_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_20_Var
		);
		Assert.assertEquals("doSomething2", DirectDeclarator_20_Var
		.getId());
		final EList<? extends EObject> DeclaratorSuffix_20_list = DirectDeclarator_20_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_20_list);
		Assert.assertEquals(1, DeclaratorSuffix_20_list.size());
		//20
		final DeclaratorSuffix DeclaratorSuffix_21_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_20_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_21_Var
		);
		//21
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_22_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_21_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_22_Var
		);
		Assert.assertEquals(";", Declaration_13_Var
		.getSemi());
		//22
		final ExternalDeclaration ExternalDeclaration_23_Var
		 = (ExternalDeclaration)External_0_list.get(2);
		Assert.assertNotNull(ExternalDeclaration_23_Var
		);
		//23
		final FunctionDefHead FunctionDefHead_24_Var
		 = (FunctionDefHead)ExternalDeclaration_23_Var
		.getFunctiondefHead();
		Assert.assertNotNull(FunctionDefHead_24_Var
		);
		//24
		final FunctionDeclarationSpecifiers FunctionDeclarationSpecifiers_25_Var
		 = (FunctionDeclarationSpecifiers)FunctionDefHead_24_Var
		.getFunDeclSpecifiers();
		Assert.assertNotNull(FunctionDeclarationSpecifiers_25_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_25_list = FunctionDeclarationSpecifiers_25_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_25_list);
		Assert.assertEquals(3, DeclarationSpecifier_25_list.size());
		//25
		final StorageClassSpecifier StorageClassSpecifier_26_Var
		 = (StorageClassSpecifier)DeclarationSpecifier_25_list.get(0);
		Assert.assertNotNull(StorageClassSpecifier_26_Var
		);
		Assert.assertEquals("static", StorageClassSpecifier_26_Var
		.getName());
		//26
		final FunctionSpecifier FunctionSpecifier_27_Var
		 = (FunctionSpecifier)DeclarationSpecifier_25_list.get(1);
		Assert.assertNotNull(FunctionSpecifier_27_Var
		);
		Assert.assertEquals("inline", FunctionSpecifier_27_Var
		.getName());
		//27
		final TypeSpecifier TypeSpecifier_28_Var
		 = (TypeSpecifier)DeclarationSpecifier_25_list.get(2);
		Assert.assertNotNull(TypeSpecifier_28_Var
		);
		Assert.assertEquals("void", TypeSpecifier_28_Var
		.getName());
		//28
		final Declarator Declarator_29_Var
		 = (Declarator)FunctionDefHead_24_Var
		.getFunDeclarator();
		Assert.assertNotNull(Declarator_29_Var
		);
		//29
		final DirectDeclarator DirectDeclarator_30_Var
		 = (DirectDeclarator)Declarator_29_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_30_Var
		);
		Assert.assertEquals("doSomething3", DirectDeclarator_30_Var
		.getId());
		//30
		final FunctionDefinition FunctionDefinition_31_Var
		 = (FunctionDefinition)ExternalDeclaration_23_Var
		.getFunctionDefinition();
		Assert.assertNotNull(FunctionDefinition_31_Var
		);
		//31
		final BodyStatement BodyStatement_32_Var
		 = (BodyStatement)FunctionDefinition_31_Var
		.getBody();
		Assert.assertNotNull(BodyStatement_32_Var
		);
		//32
		final ExternalDeclaration ExternalDeclaration_33_Var
		 = (ExternalDeclaration)External_0_list.get(3);
		Assert.assertNotNull(ExternalDeclaration_33_Var
		);
		//33
		final FunctionDefHead FunctionDefHead_34_Var
		 = (FunctionDefHead)ExternalDeclaration_33_Var
		.getFunctiondefHead();
		Assert.assertNotNull(FunctionDefHead_34_Var
		);
		//34
		final FunctionDeclarationSpecifiers FunctionDeclarationSpecifiers_35_Var
		 = (FunctionDeclarationSpecifiers)FunctionDefHead_34_Var
		.getFunDeclSpecifiers();
		Assert.assertNotNull(FunctionDeclarationSpecifiers_35_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_35_list = FunctionDeclarationSpecifiers_35_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_35_list);
		Assert.assertEquals(3, DeclarationSpecifier_35_list.size());
		//35
		final StorageClassSpecifier StorageClassSpecifier_36_Var
		 = (StorageClassSpecifier)DeclarationSpecifier_35_list.get(0);
		Assert.assertNotNull(StorageClassSpecifier_36_Var
		);
		Assert.assertEquals("static", StorageClassSpecifier_36_Var
		.getName());
		//36
		final FunctionSpecifier FunctionSpecifier_37_Var
		 = (FunctionSpecifier)DeclarationSpecifier_35_list.get(1);
		Assert.assertNotNull(FunctionSpecifier_37_Var
		);
		Assert.assertEquals("__inline", FunctionSpecifier_37_Var
		.getName());
		//37
		final TypeSpecifier TypeSpecifier_38_Var
		 = (TypeSpecifier)DeclarationSpecifier_35_list.get(2);
		Assert.assertNotNull(TypeSpecifier_38_Var
		);
		Assert.assertEquals("void", TypeSpecifier_38_Var
		.getName());
		//38
		final Declarator Declarator_39_Var
		 = (Declarator)FunctionDefHead_34_Var
		.getFunDeclarator();
		Assert.assertNotNull(Declarator_39_Var
		);
		//39
		final DirectDeclarator DirectDeclarator_40_Var
		 = (DirectDeclarator)Declarator_39_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_40_Var
		);
		Assert.assertEquals("doSomething4", DirectDeclarator_40_Var
		.getId());
		//40
		final FunctionDefinition FunctionDefinition_41_Var
		 = (FunctionDefinition)ExternalDeclaration_33_Var
		.getFunctionDefinition();
		Assert.assertNotNull(FunctionDefinition_41_Var
		);
		//41
		final BodyStatement BodyStatement_42_Var
		 = (BodyStatement)FunctionDefinition_41_Var
		.getBody();
		Assert.assertNotNull(BodyStatement_42_Var
		);
	}
	
	@Test
	(timeout=1000
	)
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0049_Inline.c");
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
				method.invoke(this.generator, "Test0005_FunctionDecls.c");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
			// System.out.println("do nothing!");
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0005_FunctionDecls.c");
		final String expected = this.getTextFromFile(
			"res/Test0049_Inline.c"
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

