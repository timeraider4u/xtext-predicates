package org.eclipse.modisco.cdt.discoverer.tests.emftests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

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

import at.jku.weiner.c.common.common.Model;
import at.jku.weiner.c.common.common.TranslationUnit;
import at.jku.weiner.c.preprocess.preprocess.Preprocess;
import at.jku.weiner.c.common.common.TranslationUnit;
import at.jku.weiner.c.preprocess.preprocess.Preprocess;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective;
import at.jku.weiner.c.preprocess.preprocess.Preprocess;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.NewLineLine;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.Code;
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
import at.jku.weiner.c.parser.parser.DeclaratorSuffix;
import at.jku.weiner.c.parser.parser.DirectDeclaratorLastSuffix;
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
import at.jku.weiner.c.parser.parser.FunctionDefinition;
import at.jku.weiner.c.parser.parser.BodyStatement;
import at.jku.weiner.c.parser.parser.BlockList;
import at.jku.weiner.c.parser.parser.Statement;
import at.jku.weiner.c.parser.parser.JumpStatement;
import at.jku.weiner.c.parser.parser.Expression;
import at.jku.weiner.c.parser.parser.AssignmentExpression;
import at.jku.weiner.c.parser.parser.ConditionalExpression;
import at.jku.weiner.c.parser.parser.LogicalOrExpression;
import at.jku.weiner.c.parser.parser.LogicalAndExpression;
import at.jku.weiner.c.parser.parser.InclusiveOrExpression;
import at.jku.weiner.c.parser.parser.ExclusiveOrExpression;
import at.jku.weiner.c.parser.parser.AndExpression;
import at.jku.weiner.c.parser.parser.EqualityExpression;
import at.jku.weiner.c.parser.parser.RelationalExpression;
import at.jku.weiner.c.parser.parser.ShiftExpression;
import at.jku.weiner.c.parser.parser.AdditiveExpression;
import at.jku.weiner.c.parser.parser.MultiplicativeExpression;
import at.jku.weiner.c.parser.parser.CastExpression;
import at.jku.weiner.c.parser.parser.UnaryExpression;
import at.jku.weiner.c.parser.parser.PostfixExpression;
import at.jku.weiner.c.parser.parser.PrimaryExpression;
import at.jku.weiner.c.parser.parser.PostfixExpressionSuffixArgument;
import at.jku.weiner.c.common.common.TranslationUnit;
import at.jku.weiner.c.preprocess.preprocess.Preprocess;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.DefineObjectMacro;
import at.jku.weiner.c.preprocess.preprocess.Code;

@SuppressWarnings("unused")
public class Test0009_SimpleIncludeWithAdditionalInclude {
	
	private final String pureJavaClassFileName = "Test0009_SimpleIncludeWithAdditionalInclude";
	private final String sourceFile = "res/Test0009_SimpleIncludeWithAdditionalInclude";
	private Map<String,Object> options;
	
	@Before
	public void initialize(){
		options = org.eclipse.modisco.cdt.discoverer.tests.EMFTest.getOptions(
			this.pureJavaClassFileName, this.sourceFile);
		org.eclipse.modisco.cdt.discoverer.tests.EMFTest.addInclude();
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
	
				
	@Test (timeout=25000)
	public void checkParserResult() throws Exception {
		final EObject obj = org.eclipse.modisco.cdt.discoverer.tests.EMFTest.emfTest(
			this.pureJavaClassFileName, this.sourceFile
		);
		Assert.assertNotNull(obj);
		Assert.assertTrue(obj instanceof Model);
		final Model Model_0_Var
		  =  (Model)obj;
		Assert.assertNotNull(Model_0_Var
		);
		final EList<? extends EObject> Units_0_list = Model_0_Var
		.getUnits();
		Assert.assertNotNull(Units_0_list);
		Assert.assertEquals(3, Units_0_list.size());
		//0
		final TranslationUnit TranslationUnit_1_Var
		 = (TranslationUnit)Units_0_list.get(0);
		Assert.assertNotNull(TranslationUnit_1_Var
		);
		Assert.assertEquals("platform:/plugin/at.jku.weiner.c.preprocess/res/predefined/gcc_4.8.4_default.h", TranslationUnit_1_Var
		.getPath());
		//1
		final Preprocess Preprocess_2_Var
		 = (Preprocess)TranslationUnit_1_Var
		.getPreprocess();
		Assert.assertNotNull(Preprocess_2_Var
		);
		//2
		final TranslationUnit TranslationUnit_3_Var
		 = (TranslationUnit)Units_0_list.get(1);
		Assert.assertNotNull(TranslationUnit_3_Var
		);
		Assert.assertEquals("" + options.get("path") + "/" + options.get("plugin_id") + "/" + options.get("sourceFile") + "/SimpleInclude.c", TranslationUnit_3_Var
		.getPath());
		//3
		final Preprocess Preprocess_4_Var
		 = (Preprocess)TranslationUnit_3_Var
		.getAdditionalPreprocessingDirectives();
		Assert.assertNotNull(Preprocess_4_Var
		);
		//4
		final GroupOpt GroupOpt_5_Var
		 = (GroupOpt)Preprocess_4_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_5_Var
		);
		final EList<? extends EObject> Lines_5_list = GroupOpt_5_Var
		.getLines();
		Assert.assertNotNull(Lines_5_list);
		Assert.assertEquals(1, Lines_5_list.size());
		//5
		final PreprocessorDirectives PreprocessorDirectives_6_Var
		 = (PreprocessorDirectives)Lines_5_list.get(0);
		Assert.assertNotNull(PreprocessorDirectives_6_Var
		);
		//6
		final IncludeDirective IncludeDirective_7_Var
		 = (IncludeDirective)PreprocessorDirectives_6_Var
		.getDirective();
		Assert.assertNotNull(IncludeDirective_7_Var
		);
		Assert.assertEquals("\"../include/SimpleInclude.h\"", IncludeDirective_7_Var
		.getString());
		//7
		final Preprocess Preprocess_8_Var
		 = (Preprocess)TranslationUnit_3_Var
		.getPreprocess();
		Assert.assertNotNull(Preprocess_8_Var
		);
		//8
		final GroupOpt GroupOpt_9_Var
		 = (GroupOpt)Preprocess_8_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_9_Var
		);
		final EList<? extends EObject> Lines_9_list = GroupOpt_9_Var
		.getLines();
		Assert.assertNotNull(Lines_9_list);
		Assert.assertEquals(4, Lines_9_list.size());
		//9
		final NewLineLine NewLineLine_10_Var
		 = (NewLineLine)Lines_9_list.get(0);
		Assert.assertNotNull(NewLineLine_10_Var
		);
		//10
		final Code Code_11_Var
		 = (Code)Lines_9_list.get(1);
		Assert.assertNotNull(Code_11_Var
		);
		Assert.assertEquals("NUMBER main(void) {", Code_11_Var
		.getCode());
		//11
		final Code Code_12_Var
		 = (Code)Lines_9_list.get(2);
		Assert.assertNotNull(Code_12_Var
		);
		Assert.assertEquals("	return getValue();", Code_12_Var
		.getCode());
		//12
		final Code Code_13_Var
		 = (Code)Lines_9_list.get(3);
		Assert.assertNotNull(Code_13_Var
		);
		Assert.assertEquals("}", Code_13_Var
		.getCode());
		//13
		final Parser Parser_14_Var
		 = (Parser)TranslationUnit_3_Var
		.getParser();
		Assert.assertNotNull(Parser_14_Var
		);
		final EList<? extends EObject> External_14_list = Parser_14_Var
		.getExternal();
		Assert.assertNotNull(External_14_list);
		Assert.assertEquals(2, External_14_list.size());
		//14
		final ExternalDeclaration ExternalDeclaration_15_Var
		 = (ExternalDeclaration)External_14_list.get(0);
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
		Assert.assertEquals("int", TypeSpecifier_19_Var
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
		Assert.assertEquals("getValue", DirectDeclarator_23_Var
		.getId());
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
		Assert.assertEquals(";", Declaration_16_Var
		.getSemi());
		//25
		final ExternalDeclaration ExternalDeclaration_26_Var
		 = (ExternalDeclaration)External_14_list.get(1);
		Assert.assertNotNull(ExternalDeclaration_26_Var
		);
		//26
		final FunctionDefHead FunctionDefHead_27_Var
		 = (FunctionDefHead)ExternalDeclaration_26_Var
		.getFunctiondefHead();
		Assert.assertNotNull(FunctionDefHead_27_Var
		);
		//27
		final FunctionDeclarationSpecifiers FunctionDeclarationSpecifiers_28_Var
		 = (FunctionDeclarationSpecifiers)FunctionDefHead_27_Var
		.getFunDeclSpecifiers();
		Assert.assertNotNull(FunctionDeclarationSpecifiers_28_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_28_list = FunctionDeclarationSpecifiers_28_Var
		.getDeclarationSpecifier();
		Assert.assertNotNull(DeclarationSpecifier_28_list);
		Assert.assertEquals(1, DeclarationSpecifier_28_list.size());
		//28
		final TypeSpecifier TypeSpecifier_29_Var
		 = (TypeSpecifier)DeclarationSpecifier_28_list.get(0);
		Assert.assertNotNull(TypeSpecifier_29_Var
		);
		Assert.assertEquals("int", TypeSpecifier_29_Var
		.getName());
		//29
		final Declarator Declarator_30_Var
		 = (Declarator)FunctionDefHead_27_Var
		.getFunDeclarator();
		Assert.assertNotNull(Declarator_30_Var
		);
		//30
		final DirectDeclarator DirectDeclarator_31_Var
		 = (DirectDeclarator)Declarator_30_Var
		.getDeclarator();
		Assert.assertNotNull(DirectDeclarator_31_Var
		);
		Assert.assertEquals("main", DirectDeclarator_31_Var
		.getId());
		final EList<? extends EObject> DeclaratorSuffix_31_list = DirectDeclarator_31_Var
		.getDeclaratorSuffix();
		Assert.assertNotNull(DeclaratorSuffix_31_list);
		Assert.assertEquals(1, DeclaratorSuffix_31_list.size());
		//31
		final DeclaratorSuffix DeclaratorSuffix_32_Var
		 = (DeclaratorSuffix)DeclaratorSuffix_31_list.get(0);
		Assert.assertNotNull(DeclaratorSuffix_32_Var
		);
		//32
		final DirectDeclaratorLastSuffix DirectDeclaratorLastSuffix_33_Var
		 = (DirectDeclaratorLastSuffix)DeclaratorSuffix_32_Var
		.getLastSuffix();
		Assert.assertNotNull(DirectDeclaratorLastSuffix_33_Var
		);
		final EList<? extends EObject> ParameterTypeList_33_list = DirectDeclaratorLastSuffix_33_Var
		.getParameterTypeList();
		Assert.assertNotNull(ParameterTypeList_33_list);
		Assert.assertEquals(1, ParameterTypeList_33_list.size());
		//33
		final ParameterTypeList ParameterTypeList_34_Var
		 = (ParameterTypeList)ParameterTypeList_33_list.get(0);
		Assert.assertNotNull(ParameterTypeList_34_Var
		);
		//34
		final ParameterList ParameterList_35_Var
		 = (ParameterList)ParameterTypeList_34_Var
		.getList();
		Assert.assertNotNull(ParameterList_35_Var
		);
		final EList<? extends EObject> ParameterDeclaration_35_list = ParameterList_35_Var
		.getParameterDeclaration();
		Assert.assertNotNull(ParameterDeclaration_35_list);
		Assert.assertEquals(1, ParameterDeclaration_35_list.size());
		//35
		final ParameterDeclaration ParameterDeclaration_36_Var
		 = (ParameterDeclaration)ParameterDeclaration_35_list.get(0);
		Assert.assertNotNull(ParameterDeclaration_36_Var
		);
		//36
		final DeclarationSpecifiers DeclarationSpecifiers_37_Var
		 = (DeclarationSpecifiers)ParameterDeclaration_36_Var
		.getDeclSpecifiers();
		Assert.assertNotNull(DeclarationSpecifiers_37_Var
		);
		final EList<? extends EObject> DeclarationSpecifier_37_list = DeclarationSpecifiers_37_Var
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
		Assert.assertNull(ParameterDeclaration_36_Var
		.getDeclarator());
		//38
		final FunctionDefinition FunctionDefinition_39_Var
		 = (FunctionDefinition)ExternalDeclaration_26_Var
		.getFunctionDefinition();
		Assert.assertNotNull(FunctionDefinition_39_Var
		);
		//39
		final BodyStatement BodyStatement_40_Var
		 = (BodyStatement)FunctionDefinition_39_Var
		.getBody();
		Assert.assertNotNull(BodyStatement_40_Var
		);
		final EList<? extends EObject> BlockList_40_list = BodyStatement_40_Var
		.getBlockList();
		Assert.assertNotNull(BlockList_40_list);
		Assert.assertEquals(1, BlockList_40_list.size());
		//40
		final BlockList BlockList_41_Var
		 = (BlockList)BlockList_40_list.get(0);
		Assert.assertNotNull(BlockList_41_Var
		);
		final EList<? extends EObject> Statement_41_list = BlockList_41_Var
		.getStatement();
		Assert.assertNotNull(Statement_41_list);
		Assert.assertEquals(1, Statement_41_list.size());
		//41
		final Statement Statement_42_Var
		 = (Statement)Statement_41_list.get(0);
		Assert.assertNotNull(Statement_42_Var
		);
		//42
		final JumpStatement JumpStatement_43_Var
		 = (JumpStatement)Statement_42_Var
		.getStmt();
		Assert.assertNotNull(JumpStatement_43_Var
		);
		//43
		final Expression Expression_44_Var
		 = (Expression)JumpStatement_43_Var
		.getExpr();
		Assert.assertNotNull(Expression_44_Var
		);
		final EList<? extends EObject> ExprExpr_44_list = Expression_44_Var
		.getExprExpr();
		Assert.assertNotNull(ExprExpr_44_list);
		Assert.assertEquals(1, ExprExpr_44_list.size());
		//44
		final AssignmentExpression AssignmentExpression_45_Var
		 = (AssignmentExpression)ExprExpr_44_list.get(0);
		Assert.assertNotNull(AssignmentExpression_45_Var
		);
		//45
		final ConditionalExpression ConditionalExpression_46_Var
		 = (ConditionalExpression)AssignmentExpression_45_Var
		.getExpr();
		Assert.assertNotNull(ConditionalExpression_46_Var
		);
		//46
		final LogicalOrExpression LogicalOrExpression_47_Var
		 = (LogicalOrExpression)ConditionalExpression_46_Var
		.getExpr();
		Assert.assertNotNull(LogicalOrExpression_47_Var
		);
		final EList<? extends EObject> Expr_47_list = LogicalOrExpression_47_Var
		.getExpr();
		Assert.assertNotNull(Expr_47_list);
		Assert.assertEquals(1, Expr_47_list.size());
		//47
		final LogicalAndExpression LogicalAndExpression_48_Var
		 = (LogicalAndExpression)Expr_47_list.get(0);
		Assert.assertNotNull(LogicalAndExpression_48_Var
		);
		final EList<? extends EObject> Expr_48_list = LogicalAndExpression_48_Var
		.getExpr();
		Assert.assertNotNull(Expr_48_list);
		Assert.assertEquals(1, Expr_48_list.size());
		//48
		final InclusiveOrExpression InclusiveOrExpression_49_Var
		 = (InclusiveOrExpression)Expr_48_list.get(0);
		Assert.assertNotNull(InclusiveOrExpression_49_Var
		);
		final EList<? extends EObject> Expr_49_list = InclusiveOrExpression_49_Var
		.getExpr();
		Assert.assertNotNull(Expr_49_list);
		Assert.assertEquals(1, Expr_49_list.size());
		//49
		final ExclusiveOrExpression ExclusiveOrExpression_50_Var
		 = (ExclusiveOrExpression)Expr_49_list.get(0);
		Assert.assertNotNull(ExclusiveOrExpression_50_Var
		);
		final EList<? extends EObject> Expr_50_list = ExclusiveOrExpression_50_Var
		.getExpr();
		Assert.assertNotNull(Expr_50_list);
		Assert.assertEquals(1, Expr_50_list.size());
		//50
		final AndExpression AndExpression_51_Var
		 = (AndExpression)Expr_50_list.get(0);
		Assert.assertNotNull(AndExpression_51_Var
		);
		final EList<? extends EObject> Expr_51_list = AndExpression_51_Var
		.getExpr();
		Assert.assertNotNull(Expr_51_list);
		Assert.assertEquals(1, Expr_51_list.size());
		//51
		final EqualityExpression EqualityExpression_52_Var
		 = (EqualityExpression)Expr_51_list.get(0);
		Assert.assertNotNull(EqualityExpression_52_Var
		);
		final EList<? extends EObject> Expr_52_list = EqualityExpression_52_Var
		.getExpr();
		Assert.assertNotNull(Expr_52_list);
		Assert.assertEquals(1, Expr_52_list.size());
		//52
		final RelationalExpression RelationalExpression_53_Var
		 = (RelationalExpression)Expr_52_list.get(0);
		Assert.assertNotNull(RelationalExpression_53_Var
		);
		final EList<? extends EObject> Expr_53_list = RelationalExpression_53_Var
		.getExpr();
		Assert.assertNotNull(Expr_53_list);
		Assert.assertEquals(1, Expr_53_list.size());
		//53
		final ShiftExpression ShiftExpression_54_Var
		 = (ShiftExpression)Expr_53_list.get(0);
		Assert.assertNotNull(ShiftExpression_54_Var
		);
		final EList<? extends EObject> Expr_54_list = ShiftExpression_54_Var
		.getExpr();
		Assert.assertNotNull(Expr_54_list);
		Assert.assertEquals(1, Expr_54_list.size());
		//54
		final AdditiveExpression AdditiveExpression_55_Var
		 = (AdditiveExpression)Expr_54_list.get(0);
		Assert.assertNotNull(AdditiveExpression_55_Var
		);
		final EList<? extends EObject> Expr_55_list = AdditiveExpression_55_Var
		.getExpr();
		Assert.assertNotNull(Expr_55_list);
		Assert.assertEquals(1, Expr_55_list.size());
		//55
		final MultiplicativeExpression MultiplicativeExpression_56_Var
		 = (MultiplicativeExpression)Expr_55_list.get(0);
		Assert.assertNotNull(MultiplicativeExpression_56_Var
		);
		final EList<? extends EObject> Expr_56_list = MultiplicativeExpression_56_Var
		.getExpr();
		Assert.assertNotNull(Expr_56_list);
		Assert.assertEquals(1, Expr_56_list.size());
		//56
		final CastExpression CastExpression_57_Var
		 = (CastExpression)Expr_56_list.get(0);
		Assert.assertNotNull(CastExpression_57_Var
		);
		//57
		final UnaryExpression UnaryExpression_58_Var
		 = (UnaryExpression)CastExpression_57_Var
		.getExpr();
		Assert.assertNotNull(UnaryExpression_58_Var
		);
		//58
		final PostfixExpression PostfixExpression_59_Var
		 = (PostfixExpression)UnaryExpression_58_Var
		.getExpr();
		Assert.assertNotNull(PostfixExpression_59_Var
		);
		final EList<? extends EObject> Expr_59_list = PostfixExpression_59_Var
		.getExpr();
		Assert.assertNotNull(Expr_59_list);
		Assert.assertEquals(1, Expr_59_list.size());
		//59
		final PrimaryExpression PrimaryExpression_60_Var
		 = (PrimaryExpression)Expr_59_list.get(0);
		Assert.assertNotNull(PrimaryExpression_60_Var
		);
		Assert.assertEquals("getValue", PrimaryExpression_60_Var
		.getId());
		final EList<? extends EObject> Suffix_60_list = PostfixExpression_59_Var
		.getSuffix();
		Assert.assertNotNull(Suffix_60_list);
		Assert.assertEquals(1, Suffix_60_list.size());
		//60
		final PostfixExpressionSuffixArgument PostfixExpressionSuffixArgument_61_Var
		 = (PostfixExpressionSuffixArgument)Suffix_60_list.get(0);
		Assert.assertNotNull(PostfixExpressionSuffixArgument_61_Var
		);
		Assert.assertNull(PostfixExpressionSuffixArgument_61_Var
		.getArgumentExpressionList());
		Assert.assertEquals("return", JumpStatement_43_Var
		.getReturn());
		Assert.assertEquals(";", JumpStatement_43_Var
		.getSemi());
		//61
		final TranslationUnit TranslationUnit_62_Var
		 = (TranslationUnit)Units_0_list.get(2);
		Assert.assertNotNull(TranslationUnit_62_Var
		);
		Assert.assertEquals("" + options.get("path") + "/" + options.get("plugin_id") + "/res/include/SimpleInclude.h", TranslationUnit_62_Var
		.getPath());
		//62
		final Preprocess Preprocess_63_Var
		 = (Preprocess)TranslationUnit_62_Var
		.getPreprocess();
		Assert.assertNotNull(Preprocess_63_Var
		);
		//63
		final GroupOpt GroupOpt_64_Var
		 = (GroupOpt)Preprocess_63_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_64_Var
		);
		final EList<? extends EObject> Lines_64_list = GroupOpt_64_Var
		.getLines();
		Assert.assertNotNull(Lines_64_list);
		Assert.assertEquals(2, Lines_64_list.size());
		//64
		final PreprocessorDirectives PreprocessorDirectives_65_Var
		 = (PreprocessorDirectives)Lines_64_list.get(0);
		Assert.assertNotNull(PreprocessorDirectives_65_Var
		);
		//65
		final DefineObjectMacro DefineObjectMacro_66_Var
		 = (DefineObjectMacro)PreprocessorDirectives_65_Var
		.getDirective();
		Assert.assertNotNull(DefineObjectMacro_66_Var
		);
		Assert.assertEquals("NUMBER", DefineObjectMacro_66_Var
		.getId());
		Assert.assertEquals("int", DefineObjectMacro_66_Var
		.getString());
		//66
		final Code Code_67_Var
		 = (Code)Lines_64_list.get(1);
		Assert.assertNotNull(Code_67_Var
		);
		Assert.assertEquals("extern NUMBER getValue();", Code_67_Var
		.getCode());
		Assert.assertNull(TranslationUnit_62_Var
		.getParser());
	}
	
	
}

