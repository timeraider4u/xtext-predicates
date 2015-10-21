package at.jku.weiner.c.xtexttests;

import com.google.inject.Inject;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.antlr.runtime.Token;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import at.jku.weiner.c.tests.CInjectorProvider;
import at.jku.weiner.c.parser.antlr.CParser;
import at.jku.weiner.c.parser.antlr.internal.InternalCLexer;
import at.jku.weiner.c.xtexttests.LexerAndParserTest;

import at.jku.weiner.c.c.Model;
import at.jku.weiner.c.c.TranslationUnit;
import at.jku.weiner.c.c.ExternalDeclaration;
import at.jku.weiner.c.c.Declaration;
import at.jku.weiner.c.c.DeclarationSpecifiers;
import at.jku.weiner.c.c.TypeSpecifier;
import at.jku.weiner.c.c.InitDeclaratorList;
import at.jku.weiner.c.c.InitDeclarator;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.DeclaratorSuffix;
import at.jku.weiner.c.c.DirectDeclaratorLastSuffix;
import at.jku.weiner.c.c.ParameterTypeList;
import at.jku.weiner.c.c.ParameterList;
import at.jku.weiner.c.c.ParameterDeclaration;
import at.jku.weiner.c.c.DeclarationSpecifiers;
import at.jku.weiner.c.c.TypeSpecifier;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.Pointer;
import at.jku.weiner.c.c.ParameterDeclaration;
import at.jku.weiner.c.c.DeclarationSpecifiers;
import at.jku.weiner.c.c.TypeSpecifier;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.Pointer;

@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(CInjectorProvider.class)
public class Test0017_PointerInFunctionDecl {

	@Inject
	private ParseHelper<Model> parseHelper;
	@Inject
	private ValidationTestHelper valHelper;
	@Inject
	private InternalCLexer lexer;
	@Inject
	private CParser parser;
	@Inject
	private ITokenDefProvider tokenDefProvider;
	
	private LexerAndParserTest testHelper;
	
	@Before
	public void initialize(){
		this.testHelper = new LexerAndParserTest(lexer, parser, tokenDefProvider);
	}
	
	private String getSourceText()
	throws Exception{
		final Path path = Paths.get("res/Test0017_PointerInFunctionDecl.c");
		final String content = new String(Files.readAllBytes(path));
		return content;
	}
	
	@Test
	public void checkLexerTokens()
	throws Exception{
		final String text = this.getSourceText();
		//System.out.println(text);
		final String[] expected = new String[] {
			"RULE_KW_VOID",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_LEFTPAREN",
			"RULE_KW_INT",
			"RULE_WHITESPACE",
			"RULE_STAR",
			"RULE_ID",
			"RULE_COMMA",
			"RULE_WHITESPACE",
			"RULE_KW_CHAR",
			"RULE_WHITESPACE",
			"RULE_STAR",
			"RULE_STAR",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_RIGHTPAREN",
			"RULE_SEMI",
			"RULE_NEWLINE",
		};
		//final List<Token> actual = testHelper.getTokens(text);
		//testHelper.outputTokens(text);
		testHelper.checkTokenisation(text, expected);
	}
	
	@Test
	public void checkParserResult()
	throws Exception{

		final String text = this.getSourceText();
		final Model Model_0_Var = this.parseHelper.parse(text);
	
		this.valHelper.assertNoErrors(Model_0_Var);
		Assert.assertNotNull(Model_0_Var);
		final EList<? extends EObject> Unit_0_list = Model_0_Var.getUnit();
		Assert.assertNotNull(Unit_0_list);
		Assert.assertEquals(1, Unit_0_list.size());
		final TranslationUnit TranslationUnit_1_Var = (TranslationUnit)Unit_0_list.get(0);
		Assert.assertNotNull(TranslationUnit_1_Var);
		final EList<? extends EObject> External_1_list = TranslationUnit_1_Var.getExternal();
		Assert.assertNotNull(External_1_list);
		Assert.assertEquals(1, External_1_list.size());
		final ExternalDeclaration ExternalDeclaration_2_Var = (ExternalDeclaration)External_1_list.get(0);
		Assert.assertNotNull(ExternalDeclaration_2_Var);
		final Declaration Declaration_3_Var = (Declaration)ExternalDeclaration_2_Var.getDeclaration();
		Assert.assertNotNull(Declaration_3_Var);
		final DeclarationSpecifiers DeclarationSpecifiers_4_Var = (DeclarationSpecifiers)Declaration_3_Var.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_4_Var);
		final EList<? extends EObject> DeclarationSpecifier_4_list = DeclarationSpecifiers_4_Var.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_4_list);
		Assert.assertEquals(1, DeclarationSpecifier_4_list.size());
		final TypeSpecifier TypeSpecifier_5_Var = (TypeSpecifier)DeclarationSpecifier_4_list.get(0);
		Assert.assertNotNull(TypeSpecifier_5_Var);
		Assert.assertEquals("void", TypeSpecifier_5_Var.getName());
		final EList<? extends EObject> InitDeclaratorList_5_list = Declaration_3_Var.getInitDeclaratorList();
		Assert.assertNotNull(InitDeclaratorList_5_list);
		Assert.assertEquals(1, InitDeclaratorList_5_list.size());
		final InitDeclaratorList InitDeclaratorList_6_Var = (InitDeclaratorList)InitDeclaratorList_5_list.get(0);
		Assert.assertNotNull(InitDeclaratorList_6_Var);
		final EList<? extends EObject> InitDeclarator_6_list = InitDeclaratorList_6_Var.getInitDeclarator();
		Assert.assertNotNull(InitDeclarator_6_list);
		Assert.assertEquals(1, InitDeclarator_6_list.size());
		final InitDeclarator InitDeclarator_7_Var = (InitDeclarator)InitDeclarator_6_list.get(0);
		Assert.assertNotNull(InitDeclarator_7_Var);
		final Declarator Declarator_8_Var = (Declarator)InitDeclarator_7_Var.getDeclarator();
		Assert.assertNotNull(Declarator_8_Var);
		final DirectDeclarator DirectDeclarator_9_Var = (DirectDeclarator)Declarator_8_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_9_Var);
		Assert.assertEquals("do1", DirectDeclarator_9_Var.getId());
		final EList<? extends EObject> DeclaratorSuffix_9_list = DirectDeclarator_9_Var.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_9_list);
		Assert.assertEquals(1, DeclaratorSuffix_9_list.size());
		final DeclaratorSuffix DeclaratorSuffix_10_Var = (DeclaratorSuffix)DeclaratorSuffix_9_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_10_Var);
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_11_Var = (DirectDeclaratorLastSuffix)DeclaratorSuffix_10_Var.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_11_Var);
		final EList<? extends EObject> ParameterTypeList_11_list = DirectDeclaratorLastSuffix_11_Var.getParameterTypeList();
		Assert.assertNotNull(ParameterTypeList_11_list);
		Assert.assertEquals(1, ParameterTypeList_11_list.size());
		final ParameterTypeList ParameterTypeList_12_Var = (ParameterTypeList)ParameterTypeList_11_list.get(0);
		Assert.assertNotNull(ParameterTypeList_12_Var);
		final ParameterList ParameterList_13_Var = (ParameterList)ParameterTypeList_12_Var.getList();
		Assert.assertNotNull(ParameterList_13_Var);
		final EList<? extends EObject> ParameterDeclaration_13_list = ParameterList_13_Var.getParameterDeclaration();
		Assert.assertNotNull(ParameterDeclaration_13_list);
		Assert.assertEquals(2, ParameterDeclaration_13_list.size());
		final ParameterDeclaration ParameterDeclaration_14_Var = (ParameterDeclaration)ParameterDeclaration_13_list.get(0);
		Assert.assertNotNull(ParameterDeclaration_14_Var);
		final DeclarationSpecifiers DeclarationSpecifiers_15_Var = (DeclarationSpecifiers)ParameterDeclaration_14_Var.getDeclSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_15_Var);
		final EList<? extends EObject> DeclarationSpecifier_15_list = DeclarationSpecifiers_15_Var.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_15_list);
		Assert.assertEquals(1, DeclarationSpecifier_15_list.size());
		final TypeSpecifier TypeSpecifier_16_Var = (TypeSpecifier)DeclarationSpecifier_15_list.get(0);
		Assert.assertNotNull(TypeSpecifier_16_Var);
		Assert.assertEquals("int", TypeSpecifier_16_Var.getName());
		final Declarator Declarator_17_Var = (Declarator)ParameterDeclaration_14_Var.getDeclarator();
		Assert.assertNotNull(Declarator_17_Var);
		final DirectDeclarator DirectDeclarator_18_Var = (DirectDeclarator)Declarator_17_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_18_Var);
		Assert.assertEquals("argc", DirectDeclarator_18_Var.getId());
		final Pointer Pointer_19_Var = (Pointer)Declarator_17_Var.getPointer();
		Assert.assertNotNull(Pointer_19_Var);
		Assert.assertEquals("[*]", Pointer_19_Var.getStar().toString());
		final ParameterDeclaration ParameterDeclaration_20_Var = (ParameterDeclaration)ParameterDeclaration_13_list.get(1);
		Assert.assertNotNull(ParameterDeclaration_20_Var);
		final DeclarationSpecifiers DeclarationSpecifiers_21_Var = (DeclarationSpecifiers)ParameterDeclaration_20_Var.getDeclSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_21_Var);
		final EList<? extends EObject> DeclarationSpecifier_21_list = DeclarationSpecifiers_21_Var.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_21_list);
		Assert.assertEquals(1, DeclarationSpecifier_21_list.size());
		final TypeSpecifier TypeSpecifier_22_Var = (TypeSpecifier)DeclarationSpecifier_21_list.get(0);
		Assert.assertNotNull(TypeSpecifier_22_Var);
		Assert.assertEquals("char", TypeSpecifier_22_Var.getName());
		final Declarator Declarator_23_Var = (Declarator)ParameterDeclaration_20_Var.getDeclarator();
		Assert.assertNotNull(Declarator_23_Var);
		final DirectDeclarator DirectDeclarator_24_Var = (DirectDeclarator)Declarator_23_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_24_Var);
		Assert.assertEquals("argv", DirectDeclarator_24_Var.getId());
		final Pointer Pointer_25_Var = (Pointer)Declarator_23_Var.getPointer();
		Assert.assertNotNull(Pointer_25_Var);
		Assert.assertEquals("[*, *]", Pointer_25_Var.getStar().toString());
		Assert.assertEquals(";", Declaration_3_Var.getSemi());
	}


}