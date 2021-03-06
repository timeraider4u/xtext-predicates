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
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.StructOrUnionSpecifier;
import at.jku.weiner.c.parser.parser.StructOrUnion;
import at.jku.weiner.c.parser.parser.StructDeclarationList;
import at.jku.weiner.c.parser.parser.StructDeclaration;
import at.jku.weiner.c.parser.parser.SpecifierQualifierList;
import at.jku.weiner.c.parser.parser.TypeSpecifier;
import at.jku.weiner.c.parser.parser.StructDeclaratorList;
import at.jku.weiner.c.parser.parser.StructDeclarator;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.ExternalDeclaration;
import at.jku.weiner.c.parser.parser.Declaration;
import at.jku.weiner.c.parser.parser.DeclarationSpecifiers;
import at.jku.weiner.c.parser.parser.StorageClassSpecifier;
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
import at.jku.weiner.c.parser.parser.StructOrUnionSpecifier;
import at.jku.weiner.c.parser.parser.StructOrUnion;
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
import at.jku.weiner.c.parser.parser.StructOrUnionSpecifier;
import at.jku.weiner.c.parser.parser.StructOrUnion;
import at.jku.weiner.c.parser.parser.Declarator;
import at.jku.weiner.c.parser.parser.DirectDeclarator;
import at.jku.weiner.c.parser.parser.FunctionDefinition;
import at.jku.weiner.c.parser.parser.BodyStatement;
import at.jku.weiner.c.parser.parser.BlockList;
import at.jku.weiner.c.parser.parser.Statement;
import at.jku.weiner.c.parser.parser.ExpressionStatement;
import at.jku.weiner.c.parser.parser.PostfixExpression;
import at.jku.weiner.c.parser.parser.PrimaryExpression;
import at.jku.weiner.c.parser.parser.PostfixExpressionSuffixArgument;
import at.jku.weiner.c.parser.parser.ArgumentExpressionList;
import at.jku.weiner.c.parser.parser.PrimaryExpression;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(ParserInjectorProvider.class)
public class Test0055_StructInFunctionCall {
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
		at.jku.weiner.c.parser.xtexttests.TestSuite_Structs.testSize();
	}
	
	@After
	public void cleanUp() {
		at.jku.weiner.c.parser.xtexttests.TestSuite_Structs.testSize();
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
			"res/Test0055_StructInFunctionCall.c");
			final String[] expected = new String[] {
				"RULE_KW_STRUCT",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_SKW_LEFTBRACE",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_KW_INT",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_SKW_RIGHTBRACE",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_NEWLINE",
				"RULE_KW_EXTERN",
				"RULE_WHITESPACE",
				"RULE_KW_VOID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_KW_STRUCT",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_NEWLINE",
				"RULE_KW_VOID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_KW_STRUCT",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_WHITESPACE",
				"RULE_SKW_LEFTBRACE",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_SEMI",
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
			"res/Test0055_StructInFunctionCall.c");
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
		Assert.assertEquals(1, DeclarationSpecifier_3_list.size());
		//3
		final TypeSpecifier TypeSpecifier_4_Var
		 = (TypeSpecifier)DeclarationSpecifier_3_list.get(0);
		Assert.assertNotNull(TypeSpecifier_4_Var
		);
		//4
		final StructOrUnionSpecifier StructOrUnionSpecifier_5_Var
		 = (StructOrUnionSpecifier)TypeSpecifier_4_Var
		.getSpecifier();
		Assert.assertNotNull(StructOrUnionSpecifier_5_Var
		);
		//5
		final StructOrUnion StructOrUnion_6_Var
		 = (StructOrUnion)StructOrUnionSpecifier_5_Var
		.getType();
		Assert.assertNotNull(StructOrUnion_6_Var
		);
		Assert.assertEquals("struct", StructOrUnion_6_Var
		.getName());
		Assert.assertEquals("foo", StructOrUnionSpecifier_5_Var
		.getIdent());
		//6
		final StructDeclarationList StructDeclarationList_7_Var
		 = (StructDeclarationList)StructOrUnionSpecifier_5_Var
		.getStructDeclList();
		Assert.assertNotNull(StructDeclarationList_7_Var
		);
		final EList<? extends EObject> StructDeclaration_7_list = StructDeclarationList_7_Var
		.getStructDeclaration();
		Assert.assertNotNull(StructDeclaration_7_list);
		Assert.assertEquals(1, StructDeclaration_7_list.size());
		//7
		final StructDeclaration StructDeclaration_8_Var
		 = (StructDeclaration)StructDeclaration_7_list.get(0);
		Assert.assertNotNull(StructDeclaration_8_Var
		);
		//8
		final SpecifierQualifierList SpecifierQualifierList_9_Var
		 = (SpecifierQualifierList)StructDeclaration_8_Var
		.getList();
		Assert.assertNotNull(SpecifierQualifierList_9_Var
		);
		final EList<? extends EObject> TypeSpecifier_9_list = SpecifierQualifierList_9_Var
		.getTypeSpecifier();
		Assert.assertNotNull(TypeSpecifier_9_list);
		Assert.assertEquals(1, TypeSpecifier_9_list.size());
		//9
		final TypeSpecifier TypeSpecifier_10_Var
		 = (TypeSpecifier)TypeSpecifier_9_list.get(0);
		Assert.assertNotNull(TypeSpecifier_10_Var
		);
		Assert.assertEquals("int", TypeSpecifier_10_Var
		.getName());
		//10
		final StructDeclaratorList StructDeclaratorList_11_Var
		 = (StructDeclaratorList)StructDeclaration_8_Var
		.getStructDeclarationList();
		Assert.assertNotNull(StructDeclaratorList_11_Var
		);
		final EList<? extends EObject> StructDeclarator_11_list = StructDeclaratorList_11_Var
		.getStructDeclarator();
		Assert.assertNotNull(StructDeclarator_11_list);
		Assert.assertEquals(1, StructDeclarator_11_list.size());
		//11
		final StructDeclarator StructDeclarator_12_Var
		 = (StructDeclarator)StructDeclarator_11_list.get(0);
		Assert.assertNotNull(StructDeclarator_12_Var
		);
		//12
		final Declarator Declarator_13_Var
		 = (Declarator)StructDeclarator_12_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_13_Var
		);
		//13
		final DirectDeclarator DirectDeclarator_14_Var
		 = (DirectDeclarator)Declarator_13_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_14_Var
		);
		Assert.assertEquals("i", DirectDeclarator_14_Var
		.getIdent());
		//14
		final ExternalDeclaration ExternalDeclaration_15_Var
		 = (ExternalDeclaration)External_0_list.get(1);
		Assert.assertNotNull(ExternalDeclaration_15_Var
		);
		//15
		final Declaration Declaration_16_Var
		 = (Declaration)ExternalDeclaration_15_Var
		.getDeclaration();
		Assert.assertNotNull(Declaration_16_Var
		);
		//16
		final DeclarationSpecifiers DeclarationSpecifiers_17_Var
		 = (DeclarationSpecifiers)Declaration_16_Var
		.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_17_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_17_list = DeclarationSpecifiers_17_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_17_list);
		Assert.assertEquals(2, DeclarationSpecifier_17_list.size());
		//17
		final StorageClassSpecifier StorageClassSpecifier_18_Var
		 = (StorageClassSpecifier)DeclarationSpecifier_17_list.get(0);
		Assert.assertNotNull(StorageClassSpecifier_18_Var
		);
		Assert.assertEquals("extern", StorageClassSpecifier_18_Var
		.getName());
		//18
		final TypeSpecifier TypeSpecifier_19_Var
		 = (TypeSpecifier)DeclarationSpecifier_17_list.get(1);
		Assert.assertNotNull(TypeSpecifier_19_Var
		);
		Assert.assertEquals("void", TypeSpecifier_19_Var
		.getName());
		final EList<? extends EObject> InitDeclaratorList_19_list = Declaration_16_Var
		.getInitDeclaratorList();
		Assert.assertNotNull(InitDeclaratorList_19_list);
		Assert.assertEquals(1, InitDeclaratorList_19_list.size());
		//19
		final InitDeclaratorList InitDeclaratorList_20_Var
		 = (InitDeclaratorList)InitDeclaratorList_19_list.get(0);
		Assert.assertNotNull(InitDeclaratorList_20_Var
		);
		final EList<? extends EObject> InitDeclarator_20_list = InitDeclaratorList_20_Var
		.getInitDeclarator();
		Assert.assertNotNull(InitDeclarator_20_list);
		Assert.assertEquals(1, InitDeclarator_20_list.size());
		//20
		final InitDeclarator InitDeclarator_21_Var
		 = (InitDeclarator)InitDeclarator_20_list.get(0);
		Assert.assertNotNull(InitDeclarator_21_Var
		);
		//21
		final Declarator Declarator_22_Var
		 = (Declarator)InitDeclarator_21_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_22_Var
		);
		//22
		final DirectDeclarator DirectDeclarator_23_Var
		 = (DirectDeclarator)Declarator_22_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_23_Var
		);
		Assert.assertEquals("myprintf", DirectDeclarator_23_Var
		.getIdent());
		final EList<? extends EObject> DeclaratorSuffix_23_list = DirectDeclarator_23_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_23_list);
		Assert.assertEquals(1, DeclaratorSuffix_23_list.size());
		//23
		final DeclaratorSuffix DeclaratorSuffix_24_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_23_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_24_Var
		);
		//24
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_25_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_24_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_25_Var
		);
		final EList<? extends EObject> ParameterTypeList_25_list = DirectDeclaratorLastSuffix_25_Var
		.getParameterTypeList();
		Assert.assertNotNull(ParameterTypeList_25_list);
		Assert.assertEquals(1, ParameterTypeList_25_list.size());
		//25
		final ParameterTypeList ParameterTypeList_26_Var
		 = (ParameterTypeList)ParameterTypeList_25_list.get(0);
		Assert.assertNotNull(ParameterTypeList_26_Var
		);
		//26
		final ParameterList ParameterList_27_Var
		 = (ParameterList)ParameterTypeList_26_Var
		.getList();
		Assert.assertNotNull(ParameterList_27_Var
		);
		final EList<? extends EObject> ParameterDeclaration_27_list = ParameterList_27_Var
		.getParameterDeclaration();
		Assert.assertNotNull(ParameterDeclaration_27_list);
		Assert.assertEquals(1, ParameterDeclaration_27_list.size());
		//27
		final ParameterDeclaration ParameterDeclaration_28_Var
		 = (ParameterDeclaration)ParameterDeclaration_27_list.get(0);
		Assert.assertNotNull(ParameterDeclaration_28_Var
		);
		//28
		final DeclarationSpecifiers DeclarationSpecifiers_29_Var
		 = (DeclarationSpecifiers)ParameterDeclaration_28_Var
		.getDeclSpecifiers();
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
		//30
		final StructOrUnionSpecifier StructOrUnionSpecifier_31_Var
		 = (StructOrUnionSpecifier)TypeSpecifier_30_Var
		.getSpecifier();
		Assert.assertNotNull(StructOrUnionSpecifier_31_Var
		);
		//31
		final StructOrUnion StructOrUnion_32_Var
		 = (StructOrUnion)StructOrUnionSpecifier_31_Var
		.getType();
		Assert.assertNotNull(StructOrUnion_32_Var
		);
		Assert.assertEquals("struct", StructOrUnion_32_Var
		.getName());
		Assert.assertEquals("foo", StructOrUnionSpecifier_31_Var
		.getIdent());
		//32
		final Declarator Declarator_33_Var
		 = (Declarator)ParameterDeclaration_28_Var
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
		.getIdent());
		//34
		final ExternalDeclaration ExternalDeclaration_35_Var
		 = (ExternalDeclaration)External_0_list.get(2);
		Assert.assertNotNull(ExternalDeclaration_35_Var
		);
		//35
		final FunctionDefHead FunctionDefHead_36_Var
		 = (FunctionDefHead)ExternalDeclaration_35_Var
		.getFunctiondefHead();
		Assert.assertNotNull(FunctionDefHead_36_Var
		);
		//36
		final FunctionDeclarationSpecifiers FunctionDeclarationSpecifiers_37_Var
		 = (FunctionDeclarationSpecifiers)FunctionDefHead_36_Var
		.getFunDeclSpecifiers();
		Assert.assertNotNull(FunctionDeclarationSpecifiers_37_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_37_list = FunctionDeclarationSpecifiers_37_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_37_list);
		Assert.assertEquals(1, DeclarationSpecifier_37_list.size());
		//37
		final TypeSpecifier TypeSpecifier_38_Var
		 = (TypeSpecifier)DeclarationSpecifier_37_list.get(0);
		Assert.assertNotNull(TypeSpecifier_38_Var
		);
		Assert.assertEquals("void", TypeSpecifier_38_Var
		.getName());
		//38
		final Declarator Declarator_39_Var
		 = (Declarator)FunctionDefHead_36_Var
		.getFunDeclarator();
		Assert.assertNotNull(Declarator_39_Var
		);
		//39
		final DirectDeclarator DirectDeclarator_40_Var
		 = (DirectDeclarator)Declarator_39_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_40_Var
		);
		Assert.assertEquals("bar", DirectDeclarator_40_Var
		.getIdent());
		final EList<? extends EObject> DeclaratorSuffix_40_list = DirectDeclarator_40_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_40_list);
		Assert.assertEquals(1, DeclaratorSuffix_40_list.size());
		//40
		final DeclaratorSuffix DeclaratorSuffix_41_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_40_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_41_Var
		);
		//41
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_42_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_41_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_42_Var
		);
		final EList<? extends EObject> ParameterTypeList_42_list = DirectDeclaratorLastSuffix_42_Var
		.getParameterTypeList();
		Assert.assertNotNull(ParameterTypeList_42_list);
		Assert.assertEquals(1, ParameterTypeList_42_list.size());
		//42
		final ParameterTypeList ParameterTypeList_43_Var
		 = (ParameterTypeList)ParameterTypeList_42_list.get(0);
		Assert.assertNotNull(ParameterTypeList_43_Var
		);
		//43
		final ParameterList ParameterList_44_Var
		 = (ParameterList)ParameterTypeList_43_Var
		.getList();
		Assert.assertNotNull(ParameterList_44_Var
		);
		final EList<? extends EObject> ParameterDeclaration_44_list = ParameterList_44_Var
		.getParameterDeclaration();
		Assert.assertNotNull(ParameterDeclaration_44_list);
		Assert.assertEquals(1, ParameterDeclaration_44_list.size());
		//44
		final ParameterDeclaration ParameterDeclaration_45_Var
		 = (ParameterDeclaration)ParameterDeclaration_44_list.get(0);
		Assert.assertNotNull(ParameterDeclaration_45_Var
		);
		//45
		final DeclarationSpecifiers DeclarationSpecifiers_46_Var
		 = (DeclarationSpecifiers)ParameterDeclaration_45_Var
		.getDeclSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_46_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_46_list = DeclarationSpecifiers_46_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_46_list);
		Assert.assertEquals(1, DeclarationSpecifier_46_list.size());
		//46
		final TypeSpecifier TypeSpecifier_47_Var
		 = (TypeSpecifier)DeclarationSpecifier_46_list.get(0);
		Assert.assertNotNull(TypeSpecifier_47_Var
		);
		//47
		final StructOrUnionSpecifier StructOrUnionSpecifier_48_Var
		 = (StructOrUnionSpecifier)TypeSpecifier_47_Var
		.getSpecifier();
		Assert.assertNotNull(StructOrUnionSpecifier_48_Var
		);
		//48
		final StructOrUnion StructOrUnion_49_Var
		 = (StructOrUnion)StructOrUnionSpecifier_48_Var
		.getType();
		Assert.assertNotNull(StructOrUnion_49_Var
		);
		Assert.assertEquals("struct", StructOrUnion_49_Var
		.getName());
		Assert.assertEquals("foo", StructOrUnionSpecifier_48_Var
		.getIdent());
		//49
		final Declarator Declarator_50_Var
		 = (Declarator)ParameterDeclaration_45_Var
		.getDeclarator();
		Assert.assertNotNull(Declarator_50_Var
		);
		//50
		final DirectDeclarator DirectDeclarator_51_Var
		 = (DirectDeclarator)Declarator_50_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_51_Var
		);
		Assert.assertEquals("foobar", DirectDeclarator_51_Var
		.getIdent());
		//51
		final FunctionDefinition FunctionDefinition_52_Var
		 = (FunctionDefinition)ExternalDeclaration_35_Var
		.getFunctionDefinition();
		Assert.assertNotNull(FunctionDefinition_52_Var
		);
		//52
		final BodyStatement BodyStatement_53_Var
		 = (BodyStatement)FunctionDefinition_52_Var
		.getBody();
		Assert.assertNotNull(BodyStatement_53_Var
		);
		final EList<? extends EObject> BlockList_53_list = BodyStatement_53_Var
		.getBlockList();
		Assert.assertNotNull(BlockList_53_list);
		Assert.assertEquals(1, BlockList_53_list.size());
		//53
		final BlockList BlockList_54_Var
		 = (BlockList)BlockList_53_list.get(0);
		Assert.assertNotNull(BlockList_54_Var
		);
		final EList<? extends EObject> Statement_54_list = BlockList_54_Var
		.getStatement();
		Assert.assertNotNull(Statement_54_list);
		Assert.assertEquals(1, Statement_54_list.size());
		//54
		final Statement Statement_55_Var
		 = (Statement)Statement_54_list.get(0);
		Assert.assertNotNull(Statement_55_Var
		);
		//55
		final ExpressionStatement ExpressionStatement_56_Var
		 = (ExpressionStatement)Statement_55_Var
		.getStmt();
		Assert.assertNotNull(ExpressionStatement_56_Var
		);
		//56
		final PostfixExpression PostfixExpression_57_Var
		 = (PostfixExpression)ExpressionStatement_56_Var
		.getExpression();
		Assert.assertNotNull(PostfixExpression_57_Var
		);
		//57
		final PrimaryExpression PrimaryExpression_58_Var
		 = (PrimaryExpression)PostfixExpression_57_Var
		.getExpr();
		Assert.assertNotNull(PrimaryExpression_58_Var
		);
		Assert.assertEquals("myprintf", PrimaryExpression_58_Var
		.getIdent());
		//58
		final PostfixExpressionSuffixArgument PostfixExpressionSuffixArgument_59_Var
		 = (PostfixExpressionSuffixArgument)PostfixExpression_57_Var
		.getSuffix();
		Assert.assertNotNull(PostfixExpressionSuffixArgument_59_Var
		);
		//59
		final ArgumentExpressionList ArgumentExpressionList_60_Var
		 = (ArgumentExpressionList)PostfixExpressionSuffixArgument_59_Var
		.getArgumentExpressionList();
		Assert.assertNotNull(ArgumentExpressionList_60_Var
		);
		final EList<? extends EObject> Expr_60_list = ArgumentExpressionList_60_Var
		.getExpr();
		Assert.assertNotNull(Expr_60_list);
		Assert.assertEquals(1, Expr_60_list.size());
		//60
		final PrimaryExpression PrimaryExpression_61_Var
		 = (PrimaryExpression)Expr_60_list.get(0);
		Assert.assertNotNull(PrimaryExpression_61_Var
		);
		Assert.assertEquals("foobar", PrimaryExpression_61_Var
		.getIdent());
	}
	
	@Test
	(timeout=1000
	)
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0055_StructInFunctionCall.c");
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
				method.invoke(this.generator, "Test0037_Struct.c");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0037_Struct.c");
		final String expected = this.getTextFromFile(
			"res/Test0055_StructInFunctionCall.c"
			);
		Assert.assertEquals(preprocess(expected), preprocess(actual));
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


