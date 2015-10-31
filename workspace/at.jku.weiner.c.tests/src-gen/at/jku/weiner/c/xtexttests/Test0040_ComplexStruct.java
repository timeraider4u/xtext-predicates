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
import at.jku.weiner.c.c.StructOrUnionSpecifier;
import at.jku.weiner.c.c.StructOrUnion;
import at.jku.weiner.c.c.StructDeclarationList;
import at.jku.weiner.c.c.StructDeclaration;
import at.jku.weiner.c.c.SpecifierQualifierList;
import at.jku.weiner.c.c.TypeSpecifier;
import at.jku.weiner.c.c.StructDeclaratorList;
import at.jku.weiner.c.c.StructDeclarator;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.ExternalDeclaration;
import at.jku.weiner.c.c.Declaration;
import at.jku.weiner.c.c.DeclarationSpecifiers;
import at.jku.weiner.c.c.StructOrUnionSpecifier;
import at.jku.weiner.c.c.StructOrUnion;
import at.jku.weiner.c.c.StructDeclarationList;
import at.jku.weiner.c.c.StructDeclaration;
import at.jku.weiner.c.c.SpecifierQualifierList;
import at.jku.weiner.c.c.StructOrUnionSpecifier;
import at.jku.weiner.c.c.StructOrUnion;
import at.jku.weiner.c.c.StructDeclaratorList;
import at.jku.weiner.c.c.StructDeclarator;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.Pointer;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.StructDeclaration;
import at.jku.weiner.c.c.SpecifierQualifierList;
import at.jku.weiner.c.c.StructOrUnionSpecifier;
import at.jku.weiner.c.c.StructOrUnion;
import at.jku.weiner.c.c.StructDeclaratorList;
import at.jku.weiner.c.c.StructDeclarator;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.StructDeclaration;
import at.jku.weiner.c.c.SpecifierQualifierList;
import at.jku.weiner.c.c.StructOrUnionSpecifier;
import at.jku.weiner.c.c.StructOrUnion;
import at.jku.weiner.c.c.StructDeclarationList;
import at.jku.weiner.c.c.StructDeclaration;
import at.jku.weiner.c.c.SpecifierQualifierList;
import at.jku.weiner.c.c.StructOrUnionSpecifier;
import at.jku.weiner.c.c.StructOrUnion;
import at.jku.weiner.c.c.StructDeclaratorList;
import at.jku.weiner.c.c.StructDeclarator;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.StructDeclaratorList;
import at.jku.weiner.c.c.StructDeclarator;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DirectDeclarator;

@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(CInjectorProvider.class)
public class Test0040_ComplexStruct {

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
		final Path path = Paths.get("res/Test0040_ComplexStruct.c");
		final String content = new String(Files.readAllBytes(path));
		return content;
	}
	
	@Test
	public void checkLexerTokens()
	throws Exception{
		final String text = this.getSourceText();
		//System.out.println(text);
		final String[] expected = new String[] {
			"RULE_KW_STRUCT",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_WHITESPACE",
			"RULE_LEFTBRACE",
			"RULE_NEWLINE",
			"RULE_WHITESPACE",
			"RULE_KW_INT",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_SEMI",
			"RULE_NEWLINE",
			"RULE_RIGHTBRACE",
			"RULE_SEMI",
			"RULE_NEWLINE",
			"RULE_NEWLINE",
			"RULE_KW_STRUCT",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_WHITESPACE",
			"RULE_LEFTBRACE",
			"RULE_NEWLINE",
			"RULE_WHITESPACE",
			"RULE_LINE_COMMENT",
			"RULE_NEWLINE",
			"RULE_WHITESPACE",
			"RULE_KW_STRUCT",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_WHITESPACE",
			"RULE_STAR",
			"RULE_ID",
			"RULE_SEMI",
			"RULE_NEWLINE",
			"RULE_WHITESPACE",
			"RULE_KW_STRUCT",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_SEMI",
			"RULE_NEWLINE",
			"RULE_WHITESPACE",
			"RULE_KW_UNION",
			"RULE_WHITESPACE",
			"RULE_LEFTBRACE",
			"RULE_NEWLINE",
			"RULE_WHITESPACE",
			"RULE_KW_STRUCT",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_SEMI",
			"RULE_NEWLINE",
			"RULE_WHITESPACE",
			"RULE_RIGHTBRACE",
			"RULE_WHITESPACE",
			"RULE_ID",
			"RULE_SEMI",
			"RULE_NEWLINE",
			"RULE_RIGHTBRACE",
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
		Assert.assertEquals(2, External_1_list.size());
		final ExternalDeclaration ExternalDeclaration_2_Var = (ExternalDeclaration)External_1_list.get(0);
		Assert.assertNotNull(ExternalDeclaration_2_Var);
		final Declaration Declaration_3_Var = (Declaration)ExternalDeclaration_2_Var.getDeclaration();
		Assert.assertNotNull(Declaration_3_Var);
		final DeclarationSpecifiers DeclarationSpecifiers_4_Var = (DeclarationSpecifiers)Declaration_3_Var.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_4_Var);
		final EList<? extends EObject> DeclarationSpecifier_4_list = DeclarationSpecifiers_4_Var.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_4_list);
		Assert.assertEquals(1, DeclarationSpecifier_4_list.size());
		final StructOrUnionSpecifier StructOrUnionSpecifier_5_Var = (StructOrUnionSpecifier)DeclarationSpecifier_4_list.get(0);
		Assert.assertNotNull(StructOrUnionSpecifier_5_Var);
		final StructOrUnion StructOrUnion_6_Var = (StructOrUnion)StructOrUnionSpecifier_5_Var.getType();
		Assert.assertNotNull(StructOrUnion_6_Var);
		Assert.assertEquals("struct", StructOrUnion_6_Var.getName());
		Assert.assertEquals("temp", StructOrUnionSpecifier_5_Var.getId());
		final StructDeclarationList StructDeclarationList_7_Var = (StructDeclarationList)StructOrUnionSpecifier_5_Var.getStructDeclList();
		Assert.assertNotNull(StructDeclarationList_7_Var);
		final EList<? extends EObject> StructDeclaration_7_list = StructDeclarationList_7_Var.getStructDeclaration();
		Assert.assertNotNull(StructDeclaration_7_list);
		Assert.assertEquals(1, StructDeclaration_7_list.size());
		final StructDeclaration StructDeclaration_8_Var = (StructDeclaration)StructDeclaration_7_list.get(0);
		Assert.assertNotNull(StructDeclaration_8_Var);
		final SpecifierQualifierList SpecifierQualifierList_9_Var = (SpecifierQualifierList)StructDeclaration_8_Var.getList();
		Assert.assertNotNull(SpecifierQualifierList_9_Var);
		final EList<? extends EObject> TypeSpecifier_9_list = SpecifierQualifierList_9_Var.getTypeSpecifier();
		Assert.assertNotNull(TypeSpecifier_9_list);
		Assert.assertEquals(1, TypeSpecifier_9_list.size());
		final TypeSpecifier TypeSpecifier_10_Var = (TypeSpecifier)TypeSpecifier_9_list.get(0);
		Assert.assertNotNull(TypeSpecifier_10_Var);
		Assert.assertEquals("int", TypeSpecifier_10_Var.getName());
		final StructDeclaratorList StructDeclaratorList_11_Var = (StructDeclaratorList)StructDeclaration_8_Var.getStructDeclarationList();
		Assert.assertNotNull(StructDeclaratorList_11_Var);
		final EList<? extends EObject> StructDeclarator_11_list = StructDeclaratorList_11_Var.getStructDeclarator();
		Assert.assertNotNull(StructDeclarator_11_list);
		Assert.assertEquals(1, StructDeclarator_11_list.size());
		final StructDeclarator StructDeclarator_12_Var = (StructDeclarator)StructDeclarator_11_list.get(0);
		Assert.assertNotNull(StructDeclarator_12_Var);
		final Declarator Declarator_13_Var = (Declarator)StructDeclarator_12_Var.getDeclarator();
		Assert.assertNotNull(Declarator_13_Var);
		final DirectDeclarator DirectDeclarator_14_Var = (DirectDeclarator)Declarator_13_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_14_Var);
		Assert.assertEquals("i", DirectDeclarator_14_Var.getId());
		final ExternalDeclaration ExternalDeclaration_15_Var = (ExternalDeclaration)External_1_list.get(1);
		Assert.assertNotNull(ExternalDeclaration_15_Var);
		final Declaration Declaration_16_Var = (Declaration)ExternalDeclaration_15_Var.getDeclaration();
		Assert.assertNotNull(Declaration_16_Var);
		final DeclarationSpecifiers DeclarationSpecifiers_17_Var = (DeclarationSpecifiers)Declaration_16_Var.getSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_17_Var);
		final EList<? extends EObject> DeclarationSpecifier_17_list = DeclarationSpecifiers_17_Var.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_17_list);
		Assert.assertEquals(1, DeclarationSpecifier_17_list.size());
		final StructOrUnionSpecifier StructOrUnionSpecifier_18_Var = (StructOrUnionSpecifier)DeclarationSpecifier_17_list.get(0);
		Assert.assertNotNull(StructOrUnionSpecifier_18_Var);
		final StructOrUnion StructOrUnion_19_Var = (StructOrUnion)StructOrUnionSpecifier_18_Var.getType();
		Assert.assertNotNull(StructOrUnion_19_Var);
		Assert.assertEquals("struct", StructOrUnion_19_Var.getName());
		Assert.assertEquals("outer", StructOrUnionSpecifier_18_Var.getId());
		final StructDeclarationList StructDeclarationList_20_Var = (StructDeclarationList)StructOrUnionSpecifier_18_Var.getStructDeclList();
		Assert.assertNotNull(StructDeclarationList_20_Var);
		final EList<? extends EObject> StructDeclaration_20_list = StructDeclarationList_20_Var.getStructDeclaration();
		Assert.assertNotNull(StructDeclaration_20_list);
		Assert.assertEquals(3, StructDeclaration_20_list.size());
		final StructDeclaration StructDeclaration_21_Var = (StructDeclaration)StructDeclaration_20_list.get(0);
		Assert.assertNotNull(StructDeclaration_21_Var);
		final SpecifierQualifierList SpecifierQualifierList_22_Var = (SpecifierQualifierList)StructDeclaration_21_Var.getList();
		Assert.assertNotNull(SpecifierQualifierList_22_Var);
		final EList<? extends EObject> StructOrUnionSpecifier_22_list = SpecifierQualifierList_22_Var.getStructOrUnionSpecifier();
		Assert.assertNotNull(StructOrUnionSpecifier_22_list);
		Assert.assertEquals(1, StructOrUnionSpecifier_22_list.size());
		final StructOrUnionSpecifier StructOrUnionSpecifier_23_Var = (StructOrUnionSpecifier)StructOrUnionSpecifier_22_list.get(0);
		Assert.assertNotNull(StructOrUnionSpecifier_23_Var);
		final StructOrUnion StructOrUnion_24_Var = (StructOrUnion)StructOrUnionSpecifier_23_Var.getType();
		Assert.assertNotNull(StructOrUnion_24_Var);
		Assert.assertEquals("struct", StructOrUnion_24_Var.getName());
		Assert.assertEquals("temp", StructOrUnionSpecifier_23_Var.getId());
		final StructDeclaratorList StructDeclaratorList_25_Var = (StructDeclaratorList)StructDeclaration_21_Var.getStructDeclarationList();
		Assert.assertNotNull(StructDeclaratorList_25_Var);
		final EList<? extends EObject> StructDeclarator_25_list = StructDeclaratorList_25_Var.getStructDeclarator();
		Assert.assertNotNull(StructDeclarator_25_list);
		Assert.assertEquals(1, StructDeclarator_25_list.size());
		final StructDeclarator StructDeclarator_26_Var = (StructDeclarator)StructDeclarator_25_list.get(0);
		Assert.assertNotNull(StructDeclarator_26_Var);
		final Declarator Declarator_27_Var = (Declarator)StructDeclarator_26_Var.getDeclarator();
		Assert.assertNotNull(Declarator_27_Var);
		final Pointer Pointer_28_Var = (Pointer)Declarator_27_Var.getPointer();
		Assert.assertNotNull(Pointer_28_Var);
		Assert.assertEquals("[*]", Pointer_28_Var.getStar().toString());
		final DirectDeclarator DirectDeclarator_29_Var = (DirectDeclarator)Declarator_27_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_29_Var);
		Assert.assertEquals("in1", DirectDeclarator_29_Var.getId());
		final StructDeclaration StructDeclaration_30_Var = (StructDeclaration)StructDeclaration_20_list.get(1);
		Assert.assertNotNull(StructDeclaration_30_Var);
		final SpecifierQualifierList SpecifierQualifierList_31_Var = (SpecifierQualifierList)StructDeclaration_30_Var.getList();
		Assert.assertNotNull(SpecifierQualifierList_31_Var);
		final EList<? extends EObject> StructOrUnionSpecifier_31_list = SpecifierQualifierList_31_Var.getStructOrUnionSpecifier();
		Assert.assertNotNull(StructOrUnionSpecifier_31_list);
		Assert.assertEquals(1, StructOrUnionSpecifier_31_list.size());
		final StructOrUnionSpecifier StructOrUnionSpecifier_32_Var = (StructOrUnionSpecifier)StructOrUnionSpecifier_31_list.get(0);
		Assert.assertNotNull(StructOrUnionSpecifier_32_Var);
		final StructOrUnion StructOrUnion_33_Var = (StructOrUnion)StructOrUnionSpecifier_32_Var.getType();
		Assert.assertNotNull(StructOrUnion_33_Var);
		Assert.assertEquals("struct", StructOrUnion_33_Var.getName());
		Assert.assertEquals("temp", StructOrUnionSpecifier_32_Var.getId());
		final StructDeclaratorList StructDeclaratorList_34_Var = (StructDeclaratorList)StructDeclaration_30_Var.getStructDeclarationList();
		Assert.assertNotNull(StructDeclaratorList_34_Var);
		final EList<? extends EObject> StructDeclarator_34_list = StructDeclaratorList_34_Var.getStructDeclarator();
		Assert.assertNotNull(StructDeclarator_34_list);
		Assert.assertEquals(1, StructDeclarator_34_list.size());
		final StructDeclarator StructDeclarator_35_Var = (StructDeclarator)StructDeclarator_34_list.get(0);
		Assert.assertNotNull(StructDeclarator_35_Var);
		final Declarator Declarator_36_Var = (Declarator)StructDeclarator_35_Var.getDeclarator();
		Assert.assertNotNull(Declarator_36_Var);
		final DirectDeclarator DirectDeclarator_37_Var = (DirectDeclarator)Declarator_36_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_37_Var);
		Assert.assertEquals("in2", DirectDeclarator_37_Var.getId());
		final StructDeclaration StructDeclaration_38_Var = (StructDeclaration)StructDeclaration_20_list.get(2);
		Assert.assertNotNull(StructDeclaration_38_Var);
		final SpecifierQualifierList SpecifierQualifierList_39_Var = (SpecifierQualifierList)StructDeclaration_38_Var.getList();
		Assert.assertNotNull(SpecifierQualifierList_39_Var);
		final EList<? extends EObject> StructOrUnionSpecifier_39_list = SpecifierQualifierList_39_Var.getStructOrUnionSpecifier();
		Assert.assertNotNull(StructOrUnionSpecifier_39_list);
		Assert.assertEquals(1, StructOrUnionSpecifier_39_list.size());
		final StructOrUnionSpecifier StructOrUnionSpecifier_40_Var = (StructOrUnionSpecifier)StructOrUnionSpecifier_39_list.get(0);
		Assert.assertNotNull(StructOrUnionSpecifier_40_Var);
		final StructOrUnion StructOrUnion_41_Var = (StructOrUnion)StructOrUnionSpecifier_40_Var.getType();
		Assert.assertNotNull(StructOrUnion_41_Var);
		Assert.assertEquals("union", StructOrUnion_41_Var.getName());
		final StructDeclarationList StructDeclarationList_42_Var = (StructDeclarationList)StructOrUnionSpecifier_40_Var.getStructDeclList();
		Assert.assertNotNull(StructDeclarationList_42_Var);
		final EList<? extends EObject> StructDeclaration_42_list = StructDeclarationList_42_Var.getStructDeclaration();
		Assert.assertNotNull(StructDeclaration_42_list);
		Assert.assertEquals(1, StructDeclaration_42_list.size());
		final StructDeclaration StructDeclaration_43_Var = (StructDeclaration)StructDeclaration_42_list.get(0);
		Assert.assertNotNull(StructDeclaration_43_Var);
		final SpecifierQualifierList SpecifierQualifierList_44_Var = (SpecifierQualifierList)StructDeclaration_43_Var.getList();
		Assert.assertNotNull(SpecifierQualifierList_44_Var);
		final EList<? extends EObject> StructOrUnionSpecifier_44_list = SpecifierQualifierList_44_Var.getStructOrUnionSpecifier();
		Assert.assertNotNull(StructOrUnionSpecifier_44_list);
		Assert.assertEquals(1, StructOrUnionSpecifier_44_list.size());
		final StructOrUnionSpecifier StructOrUnionSpecifier_45_Var = (StructOrUnionSpecifier)StructOrUnionSpecifier_44_list.get(0);
		Assert.assertNotNull(StructOrUnionSpecifier_45_Var);
		final StructOrUnion StructOrUnion_46_Var = (StructOrUnion)StructOrUnionSpecifier_45_Var.getType();
		Assert.assertNotNull(StructOrUnion_46_Var);
		Assert.assertEquals("struct", StructOrUnion_46_Var.getName());
		Assert.assertEquals("temp", StructOrUnionSpecifier_45_Var.getId());
		final StructDeclaratorList StructDeclaratorList_47_Var = (StructDeclaratorList)StructDeclaration_43_Var.getStructDeclarationList();
		Assert.assertNotNull(StructDeclaratorList_47_Var);
		final EList<? extends EObject> StructDeclarator_47_list = StructDeclaratorList_47_Var.getStructDeclarator();
		Assert.assertNotNull(StructDeclarator_47_list);
		Assert.assertEquals(1, StructDeclarator_47_list.size());
		final StructDeclarator StructDeclarator_48_Var = (StructDeclarator)StructDeclarator_47_list.get(0);
		Assert.assertNotNull(StructDeclarator_48_Var);
		final Declarator Declarator_49_Var = (Declarator)StructDeclarator_48_Var.getDeclarator();
		Assert.assertNotNull(Declarator_49_Var);
		final DirectDeclarator DirectDeclarator_50_Var = (DirectDeclarator)Declarator_49_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_50_Var);
		Assert.assertEquals("in3", DirectDeclarator_50_Var.getId());
		final StructDeclaratorList StructDeclaratorList_51_Var = (StructDeclaratorList)StructDeclaration_38_Var.getStructDeclarationList();
		Assert.assertNotNull(StructDeclaratorList_51_Var);
		final EList<? extends EObject> StructDeclarator_51_list = StructDeclaratorList_51_Var.getStructDeclarator();
		Assert.assertNotNull(StructDeclarator_51_list);
		Assert.assertEquals(1, StructDeclarator_51_list.size());
		final StructDeclarator StructDeclarator_52_Var = (StructDeclarator)StructDeclarator_51_list.get(0);
		Assert.assertNotNull(StructDeclarator_52_Var);
		final Declarator Declarator_53_Var = (Declarator)StructDeclarator_52_Var.getDeclarator();
		Assert.assertNotNull(Declarator_53_Var);
		final DirectDeclarator DirectDeclarator_54_Var = (DirectDeclarator)Declarator_53_Var.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_54_Var);
		Assert.assertEquals("inner4", DirectDeclarator_54_Var.getId());
	}


}