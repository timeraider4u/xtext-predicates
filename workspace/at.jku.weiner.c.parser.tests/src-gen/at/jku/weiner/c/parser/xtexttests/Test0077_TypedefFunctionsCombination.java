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
import at.jku.weiner.c.parser.parser.StorageClassSpecifier;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.InitDeclaratorList;
import at.jku.weiner.c.parser.parser.InitDeclarator;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.ExternalDeclaration;
import at.jku.weiner.c.parser.parser.FunctionDefHead;
import at.jku.weiner.c.parser.parser.FunctionDeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.DeclaratorSuffix;
import at.jku.weiner.c.parser.parser.DirectDeclaratorLastSuffix;
import at.jku.weiner.c.parser.parser.ParameterTypeList;
import at.jku.weiner.c.parser.parser.ParameterList;
import at.jku.weiner.c.parser.parser.ParameterDeclaration;
import at.jku.weiner.c.parser.parser.DeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.FunctionDefinition;
import at.jku.weiner.c.parser.parser.BodyStatement;
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
import at.jku.weiner.c.parser.parser.ParameterTypeList;
import at.jku.weiner.c.parser.parser.ParameterList;
import at.jku.weiner.c.parser.parser.ParameterDeclaration;
import at.jku.weiner.c.parser.parser.DeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(ParserInjectorProvider.class)
public class Test0077_TypedefFunctionsCombination {
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
			"res/Test0077_TypedefFunctionsCombination.c");
			//System.out.println(text);
			final String[] expected = new String[] {
				"RULE_KW_TYPEDEF",
				"RULE_WHITESPACE",
				"RULE_KW_INT",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_NEWLINE",
				"RULE_KW_VOID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_KW_INT",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_WHITESPACE",
				"RULE_SKW_LEFTBRACE",
				"RULE_WHITESPACE",
				"RULE_SKW_RIGHTBRACE",
				"RULE_NEWLINE",
				"RULE_NEWLINE",
				"RULE_KW_VOID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_KW_INT",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				};
			//final List<Token> actual = testHelper.getTokens(text);
			//testHelper.outputTokens(text);
			testHelper.checkTokenisation(text, expected);
	}
	
	@Test (timeout=1000)
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0077_TypedefFunctionsCombination.c");
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
		Assert.assertEquals(3, External_0_list.size());
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
		final StorageClassSpecifier StorageClassSpecifier_4_Var
		 = (StorageClassSpecifier)DeclarationSpecifier_3_list.get(0);
		Assert.assertNotNull(StorageClassSpecifier_4_Var
		);
		Assert.assertEquals("typedef", StorageClassSpecifier_4_Var
		.getName());
		//4
		final TypeSpecifier TypeSpecifier_5_Var
		 = (TypeSpecifier)DeclarationSpecifier_3_list.get(1);
		Assert.assertNotNull(TypeSpecifier_5_Var
		);
		Assert.assertEquals("int", TypeSpecifier_5_Var
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
		Assert.assertEquals("abc", DirectDeclarator_9_Var
		.getId());
		Assert.assertEquals(";", Declaration_2_Var
		.getSemi());
		//9
		final ExternalDeclaration ExternalDeclaration_10_Var
		 = (ExternalDeclaration)External_0_list.get(1);
		Assert.assertNotNull(ExternalDeclaration_10_Var
		);
		//10
		final FunctionDefHead FunctionDefHead_11_Var
		 = (FunctionDefHead)ExternalDeclaration_10_Var
		.getFunctiondefHead();
		Assert.assertNotNull(FunctionDefHead_11_Var
		);
		//11
		final FunctionDeclarationSpecifiers FunctionDeclarationSpecifiers_12_Var
		 = (FunctionDeclarationSpecifiers)FunctionDefHead_11_Var
		.getFunDeclSpecifiers();
		Assert.assertNotNull(FunctionDeclarationSpecifiers_12_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_12_list = FunctionDeclarationSpecifiers_12_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_12_list);
		Assert.assertEquals(1, DeclarationSpecifier_12_list.size());
		//12
		final TypeSpecifier TypeSpecifier_13_Var
		 = (TypeSpecifier)DeclarationSpecifier_12_list.get(0);
		Assert.assertNotNull(TypeSpecifier_13_Var
		);
		Assert.assertEquals("void", TypeSpecifier_13_Var
		.getName());
		//13
		final Declarator Declarator_14_Var
		 = (Declarator)FunctionDefHead_11_Var
		.getFunDeclarator();
		Assert.assertNotNull(Declarator_14_Var
		);
		//14
		final DirectDeclarator DirectDeclarator_15_Var
		 = (DirectDeclarator)Declarator_14_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_15_Var
		);
		Assert.assertEquals("foobar", DirectDeclarator_15_Var
		.getId());
		final EList<? extends EObject> DeclaratorSuffix_15_list = DirectDeclarator_15_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_15_list);
		Assert.assertEquals(1, DeclaratorSuffix_15_list.size());
		//15
		final DeclaratorSuffix DeclaratorSuffix_16_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_15_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_16_Var
		);
		//16
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_17_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_16_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_17_Var
		);
		final EList<? extends EObject> ParameterTypeList_17_list = DirectDeclaratorLastSuffix_17_Var
		.getParameterTypeList();
		Assert.assertNotNull(ParameterTypeList_17_list);
		Assert.assertEquals(1, ParameterTypeList_17_list.size());
		//17
		final ParameterTypeList ParameterTypeList_18_Var
		 = (ParameterTypeList)ParameterTypeList_17_list.get(0);
		Assert.assertNotNull(ParameterTypeList_18_Var
		);
		//18
		final ParameterList ParameterList_19_Var
		 = (ParameterList)ParameterTypeList_18_Var
		.getList();
		Assert.assertNotNull(ParameterList_19_Var
		);
		final EList<? extends EObject> ParameterDeclaration_19_list = ParameterList_19_Var
		.getParameterDeclaration();
		Assert.assertNotNull(ParameterDeclaration_19_list);
		Assert.assertEquals(1, ParameterDeclaration_19_list.size());
		//19
		final ParameterDeclaration ParameterDeclaration_20_Var
		 = (ParameterDeclaration)ParameterDeclaration_19_list.get(0);
		Assert.assertNotNull(ParameterDeclaration_20_Var
		);
		//20
		final DeclarationSpecifiers DeclarationSpecifiers_21_Var
		 = (DeclarationSpecifiers)ParameterDeclaration_20_Var
		.getDeclSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_21_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_21_list = DeclarationSpecifiers_21_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_21_list);
		Assert.assertEquals(1, DeclarationSpecifier_21_list.size());
		//21
		final TypeSpecifier TypeSpecifier_22_Var
		 = (TypeSpecifier)DeclarationSpecifier_21_list.get(0);
		Assert.assertNotNull(TypeSpecifier_22_Var
		);
		Assert.assertEquals("int", TypeSpecifier_22_Var
		.getName());
		//22
		final Declarator Declarator_23_Var
		 = (Declarator)ParameterDeclaration_20_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_23_Var
		);
		//23
		final DirectDeclarator DirectDeclarator_24_Var
		 = (DirectDeclarator)Declarator_23_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_24_Var
		);
		Assert.assertEquals("def", DirectDeclarator_24_Var
		.getId());
		//24
		final FunctionDefinition FunctionDefinition_25_Var
		 = (FunctionDefinition)ExternalDeclaration_10_Var
		.getFunctionDefinition();
		Assert.assertNotNull(FunctionDefinition_25_Var
		);
		//25
		final BodyStatement BodyStatement_26_Var
		 = (BodyStatement)FunctionDefinition_25_Var
		.getBody();
		Assert.assertNotNull(BodyStatement_26_Var
		);
		//26
		final ExternalDeclaration ExternalDeclaration_27_Var
		 = (ExternalDeclaration)External_0_list.get(2);
		Assert.assertNotNull(ExternalDeclaration_27_Var
		);
		//27
		final Declaration Declaration_28_Var
		 = (Declaration)ExternalDeclaration_27_Var
		.getDeclaration();
		Assert.assertNotNull(Declaration_28_Var
		);
		//28
		final DeclarationSpecifiers DeclarationSpecifiers_29_Var
		 = (DeclarationSpecifiers)Declaration_28_Var
		.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_29_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_29_list = DeclarationSpecifiers_29_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_29_list);
		Assert.assertEquals(1, DeclarationSpecifier_29_list.size());
		//29
		final TypeSpecifier TypeSpecifier_30_Var
		 = (TypeSpecifier)DeclarationSpecifier_29_list.get(0);
		Assert.assertNotNull(TypeSpecifier_30_Var
		);
		Assert.assertEquals("void", TypeSpecifier_30_Var
		.getName());
		final EList<? extends EObject> InitDeclaratorList_30_list = Declaration_28_Var
		.getInitDeclaratorList();
		Assert.assertNotNull(InitDeclaratorList_30_list);
		Assert.assertEquals(1, InitDeclaratorList_30_list.size());
		//30
		final InitDeclaratorList InitDeclaratorList_31_Var
		 = (InitDeclaratorList)InitDeclaratorList_30_list.get(0);
		Assert.assertNotNull(InitDeclaratorList_31_Var
		);
		final EList<? extends EObject> InitDeclarator_31_list = InitDeclaratorList_31_Var
		.getInitDeclarator();
		Assert.assertNotNull(InitDeclarator_31_list);
		Assert.assertEquals(1, InitDeclarator_31_list.size());
		//31
		final InitDeclarator InitDeclarator_32_Var
		 = (InitDeclarator)InitDeclarator_31_list.get(0);
		Assert.assertNotNull(InitDeclarator_32_Var
		);
		//32
		final Declarator Declarator_33_Var
		 = (Declarator)InitDeclarator_32_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_33_Var
		);
		//33
		final DirectDeclarator DirectDeclarator_34_Var
		 = (DirectDeclarator)Declarator_33_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_34_Var
		);
		Assert.assertEquals("foobar", DirectDeclarator_34_Var
		.getId());
		final EList<? extends EObject> DeclaratorSuffix_34_list = DirectDeclarator_34_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_34_list);
		Assert.assertEquals(1, DeclaratorSuffix_34_list.size());
		//34
		final DeclaratorSuffix DeclaratorSuffix_35_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_34_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_35_Var
		);
		//35
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_36_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_35_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_36_Var
		);
		final EList<? extends EObject> ParameterTypeList_36_list = DirectDeclaratorLastSuffix_36_Var
		.getParameterTypeList();
		Assert.assertNotNull(ParameterTypeList_36_list);
		Assert.assertEquals(1, ParameterTypeList_36_list.size());
		//36
		final ParameterTypeList ParameterTypeList_37_Var
		 = (ParameterTypeList)ParameterTypeList_36_list.get(0);
		Assert.assertNotNull(ParameterTypeList_37_Var
		);
		//37
		final ParameterList ParameterList_38_Var
		 = (ParameterList)ParameterTypeList_37_Var
		.getList();
		Assert.assertNotNull(ParameterList_38_Var
		);
		final EList<? extends EObject> ParameterDeclaration_38_list = ParameterList_38_Var
		.getParameterDeclaration();
		Assert.assertNotNull(ParameterDeclaration_38_list);
		Assert.assertEquals(1, ParameterDeclaration_38_list.size());
		//38
		final ParameterDeclaration ParameterDeclaration_39_Var
		 = (ParameterDeclaration)ParameterDeclaration_38_list.get(0);
		Assert.assertNotNull(ParameterDeclaration_39_Var
		);
		//39
		final DeclarationSpecifiers DeclarationSpecifiers_40_Var
		 = (DeclarationSpecifiers)ParameterDeclaration_39_Var
		.getDeclSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_40_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_40_list = DeclarationSpecifiers_40_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_40_list);
		Assert.assertEquals(1, DeclarationSpecifier_40_list.size());
		//40
		final TypeSpecifier TypeSpecifier_41_Var
		 = (TypeSpecifier)DeclarationSpecifier_40_list.get(0);
		Assert.assertNotNull(TypeSpecifier_41_Var
		);
		Assert.assertEquals("int", TypeSpecifier_41_Var
		.getName());
		//41
		final Declarator Declarator_42_Var
		 = (Declarator)ParameterDeclaration_39_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_42_Var
		);
		//42
		final DirectDeclarator DirectDeclarator_43_Var
		 = (DirectDeclarator)Declarator_42_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_43_Var
		);
		Assert.assertEquals("def", DirectDeclarator_43_Var
		.getId());
		Assert.assertEquals(";", Declaration_28_Var
		.getSemi());
	}
	
	@Test
	(timeout=1000
	)
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0077_TypedefFunctionsCombination.c");
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
				method.invoke(this.generator, "Test0077_TypedefFunctionsCombination.c");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
			// System.out.println("do nothing!");
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0077_TypedefFunctionsCombination.c");
		final String expected = this.getTextFromFile(
			"res/Test0077_TypedefFunctionsCombination.c"
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

