package at.jku.weiner.cpreprocess.xtexttests;

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
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import at.jku.weiner.cpreprocess.tests.CPreprocessInjectorProvider;
import at.jku.weiner.cpreprocess.parser.antlr.CPreprocessParser;
import at.jku.weiner.cpreprocess.parser.antlr.internal.InternalCPreprocessLexer;
import at.jku.weiner.cpreprocess.xtexttests.LexerAndParserTest;

import at.jku.weiner.cpreprocess.cPreprocess.Model;
import at.jku.weiner.cpreprocess.cPreprocess.TranslationUnit;
import at.jku.weiner.cpreprocess.cPreprocess.PreprocessorDirectives;
import at.jku.weiner.cpreprocess.cPreprocess.DefineDirective;
import at.jku.weiner.cpreprocess.cPreprocess.PreprocessorDirectives;
import at.jku.weiner.cpreprocess.cPreprocess.DefineDirective;
import at.jku.weiner.cpreprocess.cPreprocess.PreprocessorDirectives;
import at.jku.weiner.cpreprocess.cPreprocess.DefineDirective;
import at.jku.weiner.cpreprocess.cPreprocess.NewLineLine;
import at.jku.weiner.cpreprocess.cPreprocess.PreprocessorDirectives;
import at.jku.weiner.cpreprocess.cPreprocess.DefineDirective;
import at.jku.weiner.cpreprocess.cPreprocess.NewLineLine;
import at.jku.weiner.cpreprocess.cPreprocess.PreprocessorDirectives;
import at.jku.weiner.cpreprocess.cPreprocess.DefineDirective;
import at.jku.weiner.cpreprocess.cPreprocess.NewLineLine;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
import at.jku.weiner.cpreprocess.cPreprocess.PreprocessorDirectives;
import at.jku.weiner.cpreprocess.cPreprocess.DefineDirective;
import at.jku.weiner.cpreprocess.cPreprocess.NewLineLine;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(CPreprocessInjectorProvider.class)
public class Test0004_SimpleDef {
	@Inject
	private ParseHelper<Model> parseHelper;
	@Inject
	private ValidationTestHelper valHelper;
	@Inject
	private InternalCPreprocessLexer lexer;
	@Inject
	private CPreprocessParser parser;
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
	
	@Before
	public void initialize(){
		this.testHelper = new LexerAndParserTest(lexer, 
			parser, tokenDefProvider);
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
			"res/Test0004_SimpleDef.c");
			//System.out.println(text);
			final String[] expected = new String[] {
				"RULE_DEFINE", 
				"RULE_ID", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_DEFINE", 
				"RULE_ID", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_DEFINE", 
				"RULE_ID", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_DEFINE", 
				"RULE_ID", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_DEFINE", 
				"RULE_ID", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_DEFINE", 
				"RULE_ID", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				};
			//final List<Token> actual = testHelper.getTokens(text);
			//testHelper.outputTokens(text);
			testHelper.checkTokenisation(text, expected);
	}
	
	@Test
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0004_SimpleDef.c");
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
		final EList<? extends EObject> Lines_1_list = TranslationUnit_1_Var
		.getLines();
		Assert.assertNotNull(Lines_1_list);
		Assert.assertEquals(15, Lines_1_list.size());
		//1
		final PreprocessorDirectives PreprocessorDirectives_2_Var
		 = (PreprocessorDirectives)Lines_1_list.get(0);
		Assert.assertNotNull(PreprocessorDirectives_2_Var
		);
		//2
		final DefineDirective DefineDirective_3_Var
		 = (DefineDirective)PreprocessorDirectives_2_Var
		.getDirective();
		Assert.assertNotNull(DefineDirective_3_Var
		);
		Assert.assertEquals("PI", DefineDirective_3_Var
		.getId());
		Assert.assertEquals("3.1415926535897932", DefineDirective_3_Var
		.getString());
		//3
		final PreprocessorDirectives PreprocessorDirectives_4_Var
		 = (PreprocessorDirectives)Lines_1_list.get(1);
		Assert.assertNotNull(PreprocessorDirectives_4_Var
		);
		//4
		final DefineDirective DefineDirective_5_Var
		 = (DefineDirective)PreprocessorDirectives_4_Var
		.getDirective();
		Assert.assertNotNull(DefineDirective_5_Var
		);
		Assert.assertEquals("NAME", DefineDirective_5_Var
		.getId());
		Assert.assertEquals("\"Nobody\"", DefineDirective_5_Var
		.getString());
		//5
		final PreprocessorDirectives PreprocessorDirectives_6_Var
		 = (PreprocessorDirectives)Lines_1_list.get(2);
		Assert.assertNotNull(PreprocessorDirectives_6_Var
		);
		//6
		final DefineDirective DefineDirective_7_Var
		 = (DefineDirective)PreprocessorDirectives_6_Var
		.getDirective();
		Assert.assertNotNull(DefineDirective_7_Var
		);
		Assert.assertEquals("NUMBER", DefineDirective_7_Var
		.getId());
		Assert.assertEquals("2", DefineDirective_7_Var
		.getString());
		//7
		final NewLineLine NewLineLine_8_Var
		 = (NewLineLine)Lines_1_list.get(3);
		Assert.assertNotNull(NewLineLine_8_Var
		);
		//8
		final PreprocessorDirectives PreprocessorDirectives_9_Var
		 = (PreprocessorDirectives)Lines_1_list.get(4);
		Assert.assertNotNull(PreprocessorDirectives_9_Var
		);
		//9
		final DefineDirective DefineDirective_10_Var
		 = (DefineDirective)PreprocessorDirectives_9_Var
		.getDirective();
		Assert.assertNotNull(DefineDirective_10_Var
		);
		Assert.assertEquals("X", DefineDirective_10_Var
		.getId());
		Assert.assertEquals("NUMBER", DefineDirective_10_Var
		.getString());
		//10
		final NewLineLine NewLineLine_11_Var
		 = (NewLineLine)Lines_1_list.get(5);
		Assert.assertNotNull(NewLineLine_11_Var
		);
		//11
		final PreprocessorDirectives PreprocessorDirectives_12_Var
		 = (PreprocessorDirectives)Lines_1_list.get(6);
		Assert.assertNotNull(PreprocessorDirectives_12_Var
		);
		//12
		final DefineDirective DefineDirective_13_Var
		 = (DefineDirective)PreprocessorDirectives_12_Var
		.getDirective();
		Assert.assertNotNull(DefineDirective_13_Var
		);
		Assert.assertEquals("MAIN", DefineDirective_13_Var
		.getId());
		Assert.assertEquals("int main(void)", DefineDirective_13_Var
		.getString());
		//13
		final NewLineLine NewLineLine_14_Var
		 = (NewLineLine)Lines_1_list.get(7);
		Assert.assertNotNull(NewLineLine_14_Var
		);
		//14
		final Code Code_15_Var
		 = (Code)Lines_1_list.get(8);
		Assert.assertNotNull(Code_15_Var
		);
		Assert.assertEquals("// nasty, but valid", Code_15_Var
		.getCode());
		//15
		final PreprocessorDirectives PreprocessorDirectives_16_Var
		 = (PreprocessorDirectives)Lines_1_list.get(9);
		Assert.assertNotNull(PreprocessorDirectives_16_Var
		);
		//16
		final DefineDirective DefineDirective_17_Var
		 = (DefineDirective)PreprocessorDirectives_16_Var
		.getDirective();
		Assert.assertNotNull(DefineDirective_17_Var
		);
		Assert.assertEquals("long", DefineDirective_17_Var
		.getId());
		Assert.assertEquals("int", DefineDirective_17_Var
		.getString());
		//17
		final NewLineLine NewLineLine_18_Var
		 = (NewLineLine)Lines_1_list.get(10);
		Assert.assertNotNull(NewLineLine_18_Var
		);
		//18
		final Code Code_19_Var
		 = (Code)Lines_1_list.get(11);
		Assert.assertNotNull(Code_19_Var
		);
		Assert.assertEquals("MAIN {", Code_19_Var
		.getCode());
		//19
		final Code Code_20_Var
		 = (Code)Lines_1_list.get(12);
		Assert.assertNotNull(Code_20_Var
		);
		Assert.assertEquals("	long d = X - NUMBER;", Code_20_Var
		.getCode());
		//20
		final Code Code_21_Var
		 = (Code)Lines_1_list.get(13);
		Assert.assertNotNull(Code_21_Var
		);
		Assert.assertEquals("	return d;", Code_21_Var
		.getCode());
		//21
		final Code Code_22_Var
		 = (Code)Lines_1_list.get(14);
		Assert.assertNotNull(Code_22_Var
		);
		Assert.assertEquals("}", Code_22_Var
		.getCode());
	}
	
	@Test
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0004_SimpleDef.c");
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
				method.invoke(this.generator, "Test0004_SimpleDef.c.i");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
			// System.out.println("do nothing!");
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0004_SimpleDef.c.i");
		final String expected = this.getTextFromFile(
			"expected/Test0004_SimpleDef.c"
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

