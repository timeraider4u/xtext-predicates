package at.jku.weiner.c.preprocess.xtexttests;

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
import at.jku.weiner.c.preprocess.tests.PreprocessInjectorProvider;
import at.jku.weiner.c.preprocess.parser.antlr.PreprocessParser;
import at.jku.weiner.c.preprocess.parser.antlr.internal.InternalPreprocessLexer;
import at.jku.weiner.c.preprocess.xtexttests.LexerAndParserTest;

import at.jku.weiner.c.preprocess.preprocess.Model;
import at.jku.weiner.c.preprocess.preprocess.TranslationUnit;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.ConditionalDirective;
import at.jku.weiner.c.preprocess.preprocess.IfConditional;
import at.jku.weiner.c.common.common.ConstantExpression;
import at.jku.weiner.c.common.common.ConditionalExpression;
import at.jku.weiner.c.common.common.LogicalOrExpression;
import at.jku.weiner.c.common.common.LogicalAndExpression;
import at.jku.weiner.c.common.common.InclusiveOrExpression;
import at.jku.weiner.c.common.common.ExclusiveOrExpression;
import at.jku.weiner.c.common.common.AndExpression;
import at.jku.weiner.c.common.common.EqualityExpression;
import at.jku.weiner.c.common.common.RelationalExpression;
import at.jku.weiner.c.common.common.ShiftExpression;
import at.jku.weiner.c.common.common.AdditiveExpression;
import at.jku.weiner.c.common.common.MultiplicativeExpression;
import at.jku.weiner.c.common.common.CastExpression;
import at.jku.weiner.c.common.common.UnaryExpression;
import at.jku.weiner.c.common.common.UnaryOperator;
import at.jku.weiner.c.common.common.CastExpression;
import at.jku.weiner.c.common.common.UnaryExpression;
import at.jku.weiner.c.common.common.PostfixExpression;
import at.jku.weiner.c.preprocess.preprocess.PrimaryExpression;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.Code;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(PreprocessInjectorProvider.class)
public class Test0056_IfNotDefined {
	@Inject
	private ParseHelper<Model> parseHelper;
	@Inject
	private ValidationTestHelper valHelper;
	@Inject
	private InternalPreprocessLexer lexer;
	@Inject
	private PreprocessParser parser;
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
	
	@Test
	public void checkLexerTokens() throws Exception{
		final String text = this.getTextFromFile(
			"res/Test0056_IfNotDefined.c");
			//System.out.println(text);
			final String[] expected = new String[] {
				"RULE_HASH", 
				"RULE_IF", 
				"RULE_WHITESPACE", 
				"RULE_SKW_NOT", 
				"RULE_DEFINED", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_NEWLINE", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_WHITESPACE", 
				"RULE_ID", 
				"RULE_SKW_LEFTPAREN", 
				"RULE_SKW_RIGHTPAREN", 
				"RULE_SKW_SEMI", 
				"RULE_NEWLINE", 
				"RULE_HASH", 
				"RULE_ENDIF", 
				"RULE_NEWLINE", 
				};
			//final List<Token> actual = testHelper.getTokens(text);
			//testHelper.outputTokens(text);
			testHelper.checkTokenisation(text, expected);
	}
	
	@Test
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0056_IfNotDefined.c");
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
		final GroupOpt GroupOpt_2_Var
		 = (GroupOpt)TranslationUnit_1_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_2_Var
		);
		final EList<? extends EObject> Lines_2_list = GroupOpt_2_Var
		.getLines();
		Assert.assertNotNull(Lines_2_list);
		Assert.assertEquals(1, Lines_2_list.size());
		//2
		final PreprocessorDirectives PreprocessorDirectives_3_Var
		 = (PreprocessorDirectives)Lines_2_list.get(0);
		Assert.assertNotNull(PreprocessorDirectives_3_Var
		);
		//3
		final ConditionalDirective ConditionalDirective_4_Var
		 = (ConditionalDirective)PreprocessorDirectives_3_Var
		.getDirective();
		Assert.assertNotNull(ConditionalDirective_4_Var
		);
		//4
		final IfConditional IfConditional_5_Var
		 = (IfConditional)ConditionalDirective_4_Var
		.getConditional();
		Assert.assertNotNull(IfConditional_5_Var
		);
		//5
		final ConstantExpression ConstantExpression_6_Var
		 = (ConstantExpression)IfConditional_5_Var
		.getExpression();
		Assert.assertNotNull(ConstantExpression_6_Var
		);
		//6
		final ConditionalExpression ConditionalExpression_7_Var
		 = (ConditionalExpression)ConstantExpression_6_Var
		.getExpr();
		Assert.assertNotNull(ConditionalExpression_7_Var
		);
		//7
		final LogicalOrExpression LogicalOrExpression_8_Var
		 = (LogicalOrExpression)ConditionalExpression_7_Var
		.getExpr();
		Assert.assertNotNull(LogicalOrExpression_8_Var
		);
		final EList<? extends EObject> Expr_8_list = LogicalOrExpression_8_Var
		.getExpr();
		Assert.assertNotNull(Expr_8_list);
		Assert.assertEquals(1, Expr_8_list.size());
		//8
		final LogicalAndExpression LogicalAndExpression_9_Var
		 = (LogicalAndExpression)Expr_8_list.get(0);
		Assert.assertNotNull(LogicalAndExpression_9_Var
		);
		final EList<? extends EObject> Expr_9_list = LogicalAndExpression_9_Var
		.getExpr();
		Assert.assertNotNull(Expr_9_list);
		Assert.assertEquals(1, Expr_9_list.size());
		//9
		final InclusiveOrExpression InclusiveOrExpression_10_Var
		 = (InclusiveOrExpression)Expr_9_list.get(0);
		Assert.assertNotNull(InclusiveOrExpression_10_Var
		);
		final EList<? extends EObject> Expr_10_list = InclusiveOrExpression_10_Var
		.getExpr();
		Assert.assertNotNull(Expr_10_list);
		Assert.assertEquals(1, Expr_10_list.size());
		//10
		final ExclusiveOrExpression ExclusiveOrExpression_11_Var
		 = (ExclusiveOrExpression)Expr_10_list.get(0);
		Assert.assertNotNull(ExclusiveOrExpression_11_Var
		);
		final EList<? extends EObject> Expr_11_list = ExclusiveOrExpression_11_Var
		.getExpr();
		Assert.assertNotNull(Expr_11_list);
		Assert.assertEquals(1, Expr_11_list.size());
		//11
		final AndExpression AndExpression_12_Var
		 = (AndExpression)Expr_11_list.get(0);
		Assert.assertNotNull(AndExpression_12_Var
		);
		final EList<? extends EObject> Expr_12_list = AndExpression_12_Var
		.getExpr();
		Assert.assertNotNull(Expr_12_list);
		Assert.assertEquals(1, Expr_12_list.size());
		//12
		final EqualityExpression EqualityExpression_13_Var
		 = (EqualityExpression)Expr_12_list.get(0);
		Assert.assertNotNull(EqualityExpression_13_Var
		);
		final EList<? extends EObject> Expr_13_list = EqualityExpression_13_Var
		.getExpr();
		Assert.assertNotNull(Expr_13_list);
		Assert.assertEquals(1, Expr_13_list.size());
		//13
		final RelationalExpression RelationalExpression_14_Var
		 = (RelationalExpression)Expr_13_list.get(0);
		Assert.assertNotNull(RelationalExpression_14_Var
		);
		final EList<? extends EObject> Expr_14_list = RelationalExpression_14_Var
		.getExpr();
		Assert.assertNotNull(Expr_14_list);
		Assert.assertEquals(1, Expr_14_list.size());
		//14
		final ShiftExpression ShiftExpression_15_Var
		 = (ShiftExpression)Expr_14_list.get(0);
		Assert.assertNotNull(ShiftExpression_15_Var
		);
		final EList<? extends EObject> Expr_15_list = ShiftExpression_15_Var
		.getExpr();
		Assert.assertNotNull(Expr_15_list);
		Assert.assertEquals(1, Expr_15_list.size());
		//15
		final AdditiveExpression AdditiveExpression_16_Var
		 = (AdditiveExpression)Expr_15_list.get(0);
		Assert.assertNotNull(AdditiveExpression_16_Var
		);
		final EList<? extends EObject> Expr_16_list = AdditiveExpression_16_Var
		.getExpr();
		Assert.assertNotNull(Expr_16_list);
		Assert.assertEquals(1, Expr_16_list.size());
		//16
		final MultiplicativeExpression MultiplicativeExpression_17_Var
		 = (MultiplicativeExpression)Expr_16_list.get(0);
		Assert.assertNotNull(MultiplicativeExpression_17_Var
		);
		final EList<? extends EObject> Expr_17_list = MultiplicativeExpression_17_Var
		.getExpr();
		Assert.assertNotNull(Expr_17_list);
		Assert.assertEquals(1, Expr_17_list.size());
		//17
		final CastExpression CastExpression_18_Var
		 = (CastExpression)Expr_17_list.get(0);
		Assert.assertNotNull(CastExpression_18_Var
		);
		//18
		final UnaryExpression UnaryExpression_19_Var
		 = (UnaryExpression)CastExpression_18_Var
		.getExpr();
		Assert.assertNotNull(UnaryExpression_19_Var
		);
		//19
		final UnaryOperator UnaryOperator_20_Var
		 = (UnaryOperator)UnaryExpression_19_Var
		.getOp();
		Assert.assertNotNull(UnaryOperator_20_Var
		);
		Assert.assertEquals("!", UnaryOperator_20_Var
		.getOp());
		//20
		final CastExpression CastExpression_21_Var
		 = (CastExpression)UnaryExpression_19_Var
		.getExpr();
		Assert.assertNotNull(CastExpression_21_Var
		);
		//21
		final UnaryExpression UnaryExpression_22_Var
		 = (UnaryExpression)CastExpression_21_Var
		.getExpr();
		Assert.assertNotNull(UnaryExpression_22_Var
		);
		Assert.assertNull(UnaryExpression_22_Var
		.getOp());
		//22
		final PostfixExpression PostfixExpression_23_Var
		 = (PostfixExpression)UnaryExpression_22_Var
		.getExpr();
		Assert.assertNotNull(PostfixExpression_23_Var
		);
		//23
		final PrimaryExpression PrimaryExpression_24_Var
		 = (PrimaryExpression)PostfixExpression_23_Var
		.getExpr();
		Assert.assertNotNull(PrimaryExpression_24_Var
		);
		Assert.assertTrue(PrimaryExpression_24_Var
		.isDefined());
		Assert.assertEquals("FOO", PrimaryExpression_24_Var
		.getId());
		//24
		final GroupOpt GroupOpt_25_Var
		 = (GroupOpt)IfConditional_5_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_25_Var
		);
		final EList<? extends EObject> Lines_25_list = GroupOpt_25_Var
		.getLines();
		Assert.assertNotNull(Lines_25_list);
		Assert.assertEquals(1, Lines_25_list.size());
		//25
		final Code Code_26_Var
		 = (Code)Lines_25_list.get(0);
		Assert.assertNotNull(Code_26_Var
		);
		Assert.assertEquals("	void bar();", Code_26_Var
		.getCode());
	}
	
	@Test
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0056_IfNotDefined.c");
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
				method.invoke(this.generator, "Test0056_IfNotDefined.c.i");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
			// System.out.println("do nothing!");
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0056_IfNotDefined.c.i");
		final String expected = this.getTextFromFile(
			"expected/Test0056_IfNotDefined.c"
			);
		Assert.assertEquals(preprocess(expected), preprocess(actual));
		// System.out.println("Code generation finished.");
	}
	
	private String preprocess(String string) throws Exception {
		string = preprocessForPatterns(string);
		return string;
	}
	
	
	private String preprocessForPatterns(String string) {
		return string;
	}
	
}


