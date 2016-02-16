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

import at.jku.weiner.c.preprocess.preprocess.Preprocess;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.DefineObjectMacro;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.DefineObjectMacro;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.ConditionalDirective;
import at.jku.weiner.c.preprocess.preprocess.IfConditional;
import at.jku.weiner.c.preprocess.preprocess.PrimaryExpression;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.ConditionalDirective;
import at.jku.weiner.c.preprocess.preprocess.IfConditional;
import at.jku.weiner.c.preprocess.preprocess.PrimaryExpression;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.ElseConditional;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.ConditionalDirective;
import at.jku.weiner.c.preprocess.preprocess.IfConditional;
import at.jku.weiner.c.common.common.RelationalExpression;
import at.jku.weiner.c.preprocess.preprocess.PrimaryExpression;
import at.jku.weiner.c.preprocess.preprocess.PrimaryExpression;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.ElseConditional;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.ElseConditional;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.Code;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(PreprocessInjectorProvider.class)
public class Test0065_IfElseNested {
	@Inject
	private ParseHelper<Preprocess> parseHelper;
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
	
	@Test (timeout=1000)
	public void checkLexerTokens() throws Exception{
		final String text = this.getTextFromFile(
			"res/Test0065_IfElseNested.c");
			final String[] expected = new String[] {
				"RULE_HASH",
				"RULE_DEFINE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_DECIMAL_LITERAL",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_DEFINE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_DECIMAL_LITERAL",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_IF",
				"RULE_WHITESPACE",
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
				"RULE_WHITESPACE",
				"RULE_HASH",
				"RULE_IF",
				"RULE_WHITESPACE",
				"RULE_DEFINED",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_HASH",
				"RULE_ELSE",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_HASH",
				"RULE_IF",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_SKW_GREATEREQUAL",
				"RULE_WHITESPACE",
				"RULE_DECIMAL_LITERAL",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_HASH",
				"RULE_ELSE",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_SEMI",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_WHITESPACE",
				"RULE_HASH",
				"RULE_ENDIF",
				"RULE_WHITESPACE",
				"RULE_BLOCK_COMMENT",
				"RULE_NEWLINE",
				"RULE_WHITESPACE",
				"RULE_HASH",
				"RULE_ENDIF",
				"RULE_WHITESPACE",
				"RULE_BLOCK_COMMENT",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_ELSE",
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
	
	@Test (timeout=1000)
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0065_IfElseNested.c");
		final Preprocess Preprocess_0_Var
		  = 
			this.parseHelper.parse(text);
		this.valHelper.assertNoErrors(Preprocess_0_Var
		);
		
		Assert.assertNotNull(Preprocess_0_Var
		);
		//0
		final GroupOpt GroupOpt_1_Var
		 = (GroupOpt)Preprocess_0_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_1_Var
		);
		final EList<? extends EObject> Lines_1_list = GroupOpt_1_Var
		.getLines();
		Assert.assertNotNull(Lines_1_list);
		Assert.assertEquals(3, Lines_1_list.size());
		//1
		final PreprocessorDirectives PreprocessorDirectives_2_Var
		 = (PreprocessorDirectives)Lines_1_list.get(0);
		Assert.assertNotNull(PreprocessorDirectives_2_Var
		);
		//2
		final DefineObjectMacro DefineObjectMacro_3_Var
		 = (DefineObjectMacro)PreprocessorDirectives_2_Var
		.getDirective();
		Assert.assertNotNull(DefineObjectMacro_3_Var
		);
		Assert.assertEquals("FOO", DefineObjectMacro_3_Var
		.getId());
		Assert.assertEquals("64", DefineObjectMacro_3_Var
		.getString());
		//3
		final PreprocessorDirectives PreprocessorDirectives_4_Var
		 = (PreprocessorDirectives)Lines_1_list.get(1);
		Assert.assertNotNull(PreprocessorDirectives_4_Var
		);
		//4
		final DefineObjectMacro DefineObjectMacro_5_Var
		 = (DefineObjectMacro)PreprocessorDirectives_4_Var
		.getDirective();
		Assert.assertNotNull(DefineObjectMacro_5_Var
		);
		Assert.assertEquals("BAR", DefineObjectMacro_5_Var
		.getId());
		Assert.assertEquals("0", DefineObjectMacro_5_Var
		.getString());
		//5
		final PreprocessorDirectives PreprocessorDirectives_6_Var
		 = (PreprocessorDirectives)Lines_1_list.get(2);
		Assert.assertNotNull(PreprocessorDirectives_6_Var
		);
		//6
		final ConditionalDirective ConditionalDirective_7_Var
		 = (ConditionalDirective)PreprocessorDirectives_6_Var
		.getDirective();
		Assert.assertNotNull(ConditionalDirective_7_Var
		);
		//7
		final IfConditional IfConditional_8_Var
		 = (IfConditional)ConditionalDirective_7_Var
		.getConditional();
		Assert.assertNotNull(IfConditional_8_Var
		);
		//8
		final PrimaryExpression PrimaryExpression_9_Var
		 = (PrimaryExpression)IfConditional_8_Var
		.getExpression();
		Assert.assertNotNull(PrimaryExpression_9_Var
		);
		Assert.assertTrue(PrimaryExpression_9_Var
		.isDefined());
		Assert.assertEquals("FOO", PrimaryExpression_9_Var
		.getId());
		//9
		final GroupOpt GroupOpt_10_Var
		 = (GroupOpt)IfConditional_8_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_10_Var
		);
		final EList<? extends EObject> Lines_10_list = GroupOpt_10_Var
		.getLines();
		Assert.assertNotNull(Lines_10_list);
		Assert.assertEquals(2, Lines_10_list.size());
		//10
		final Code Code_11_Var
		 = (Code)Lines_10_list.get(0);
		Assert.assertNotNull(Code_11_Var
		);
		Assert.assertEquals("	void foo();", Code_11_Var
		.getCode());
		//11
		final PreprocessorDirectives PreprocessorDirectives_12_Var
		 = (PreprocessorDirectives)Lines_10_list.get(1);
		Assert.assertNotNull(PreprocessorDirectives_12_Var
		);
		//12
		final ConditionalDirective ConditionalDirective_13_Var
		 = (ConditionalDirective)PreprocessorDirectives_12_Var
		.getDirective();
		Assert.assertNotNull(ConditionalDirective_13_Var
		);
		//13
		final IfConditional IfConditional_14_Var
		 = (IfConditional)ConditionalDirective_13_Var
		.getConditional();
		Assert.assertNotNull(IfConditional_14_Var
		);
		//14
		final PrimaryExpression PrimaryExpression_15_Var
		 = (PrimaryExpression)IfConditional_14_Var
		.getExpression();
		Assert.assertNotNull(PrimaryExpression_15_Var
		);
		Assert.assertTrue(PrimaryExpression_15_Var
		.isDefined());
		Assert.assertEquals("BAR", PrimaryExpression_15_Var
		.getId());
		//15
		final GroupOpt GroupOpt_16_Var
		 = (GroupOpt)IfConditional_14_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_16_Var
		);
		final EList<? extends EObject> Lines_16_list = GroupOpt_16_Var
		.getLines();
		Assert.assertNotNull(Lines_16_list);
		Assert.assertEquals(1, Lines_16_list.size());
		//16
		final Code Code_17_Var
		 = (Code)Lines_16_list.get(0);
		Assert.assertNotNull(Code_17_Var
		);
		Assert.assertEquals("		void bar();", Code_17_Var
		.getCode());
		//17
		final ElseConditional ElseConditional_18_Var
		 = (ElseConditional)ConditionalDirective_13_Var
		.getElse();
		Assert.assertNotNull(ElseConditional_18_Var
		);
		//18
		final GroupOpt GroupOpt_19_Var
		 = (GroupOpt)ElseConditional_18_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_19_Var
		);
		final EList<? extends EObject> Lines_19_list = GroupOpt_19_Var
		.getLines();
		Assert.assertNotNull(Lines_19_list);
		Assert.assertEquals(2, Lines_19_list.size());
		//19
		final Code Code_20_Var
		 = (Code)Lines_19_list.get(0);
		Assert.assertNotNull(Code_20_Var
		);
		Assert.assertEquals("		void no_bar();", Code_20_Var
		.getCode());
		//20
		final PreprocessorDirectives PreprocessorDirectives_21_Var
		 = (PreprocessorDirectives)Lines_19_list.get(1);
		Assert.assertNotNull(PreprocessorDirectives_21_Var
		);
		//21
		final ConditionalDirective ConditionalDirective_22_Var
		 = (ConditionalDirective)PreprocessorDirectives_21_Var
		.getDirective();
		Assert.assertNotNull(ConditionalDirective_22_Var
		);
		//22
		final IfConditional IfConditional_23_Var
		 = (IfConditional)ConditionalDirective_22_Var
		.getConditional();
		Assert.assertNotNull(IfConditional_23_Var
		);
		//23
		final RelationalExpression RelationalExpression_24_Var
		 = (RelationalExpression)IfConditional_23_Var
		.getExpression();
		Assert.assertNotNull(RelationalExpression_24_Var
		);
		Assert.assertEquals(">=", RelationalExpression_24_Var
		.getOp());
		//24
		final PrimaryExpression PrimaryExpression_25_Var
		 = (PrimaryExpression)RelationalExpression_24_Var
		.getLeft();
		Assert.assertNotNull(PrimaryExpression_25_Var
		);
		Assert.assertEquals("FOO", PrimaryExpression_25_Var
		.getId());
		//25
		final PrimaryExpression PrimaryExpression_26_Var
		 = (PrimaryExpression)RelationalExpression_24_Var
		.getRight();
		Assert.assertNotNull(PrimaryExpression_26_Var
		);
		Assert.assertEquals("64", PrimaryExpression_26_Var
		.getConst());
		//26
		final GroupOpt GroupOpt_27_Var
		 = (GroupOpt)IfConditional_23_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_27_Var
		);
		final EList<? extends EObject> Lines_27_list = GroupOpt_27_Var
		.getLines();
		Assert.assertNotNull(Lines_27_list);
		Assert.assertEquals(1, Lines_27_list.size());
		//27
		final Code Code_28_Var
		 = (Code)Lines_27_list.get(0);
		Assert.assertNotNull(Code_28_Var
		);
		Assert.assertEquals("			void foo_64();", Code_28_Var
		.getCode());
		//28
		final ElseConditional ElseConditional_29_Var
		 = (ElseConditional)ConditionalDirective_22_Var
		.getElse();
		Assert.assertNotNull(ElseConditional_29_Var
		);
		//29
		final GroupOpt GroupOpt_30_Var
		 = (GroupOpt)ElseConditional_29_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_30_Var
		);
		final EList<? extends EObject> Lines_30_list = GroupOpt_30_Var
		.getLines();
		Assert.assertNotNull(Lines_30_list);
		Assert.assertEquals(1, Lines_30_list.size());
		//30
		final Code Code_31_Var
		 = (Code)Lines_30_list.get(0);
		Assert.assertNotNull(Code_31_Var
		);
		Assert.assertEquals("			void foo_and_no_bar();", Code_31_Var
		.getCode());
		//31
		final ElseConditional ElseConditional_32_Var
		 = (ElseConditional)ConditionalDirective_7_Var
		.getElse();
		Assert.assertNotNull(ElseConditional_32_Var
		);
		//32
		final GroupOpt GroupOpt_33_Var
		 = (GroupOpt)ElseConditional_32_Var
		.getGroup();
		Assert.assertNotNull(GroupOpt_33_Var
		);
		final EList<? extends EObject> Lines_33_list = GroupOpt_33_Var
		.getLines();
		Assert.assertNotNull(Lines_33_list);
		Assert.assertEquals(1, Lines_33_list.size());
		//33
		final Code Code_34_Var
		 = (Code)Lines_33_list.get(0);
		Assert.assertNotNull(Code_34_Var
		);
		Assert.assertEquals("	void no_foo_and_no_bar();", Code_34_Var
		.getCode());
	}
	
	@Test
	(timeout=1000
	)
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0065_IfElseNested.c");
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
				method.invoke(this.generator, "Test0065_IfElseNested.c.i");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0065_IfElseNested.c.i");
		final String expected = this.getTextFromFile(
			"expected/Test0065_IfElseNested.c"
			);
		Assert.assertEquals(preprocess(expected), preprocess(actual));
	}
	
	private String preprocess(String string) throws Exception {
		string = preprocessForPatterns(string);
		return string;
	}
	
	
	private String preprocessForPatterns(String string) {
		return string;
	}
	
}


