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
import at.jku.weiner.cpreprocess.cPreprocess.IncludeDirective;
import at.jku.weiner.cpreprocess.cPreprocess.NewLineLine;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
import at.jku.weiner.cpreprocess.cPreprocess.NewLineLine;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
import at.jku.weiner.cpreprocess.cPreprocess.Code;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(CPreprocessInjectorProvider.class)
public class Test0009_DefineAndInclude {
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
			"res/Test0009_DefineAndInclude.c");
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
				"RULE_INCLUDE", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
				"RULE_NEWLINE", 
				"RULE_MYCODE", 
				"RULE_NEWLINE", 
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
			"res/Test0009_DefineAndInclude.c");
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
		Assert.assertEquals(9, Lines_1_list.size());
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
		Assert.assertEquals("INT", DefineDirective_3_Var
		.getId());
		Assert.assertEquals("int", DefineDirective_3_Var
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
		Assert.assertEquals("MAIN", DefineDirective_5_Var
		.getId());
		Assert.assertEquals("main", DefineDirective_5_Var
		.getString());
		//5
		final PreprocessorDirectives PreprocessorDirectives_6_Var
		 = (PreprocessorDirectives)Lines_1_list.get(2);
		Assert.assertNotNull(PreprocessorDirectives_6_Var
		);
		//6
		final IncludeDirective IncludeDirective_7_Var
		 = (IncludeDirective)PreprocessorDirectives_6_Var
		.getDirective();
		Assert.assertNotNull(IncludeDirective_7_Var
		);
		Assert.assertEquals("\"Test0009_DefineAndInclude.h\"", IncludeDirective_7_Var
		.getString());
		//7
		final NewLineLine NewLineLine_8_Var
		 = (NewLineLine)Lines_1_list.get(3);
		Assert.assertNotNull(NewLineLine_8_Var
		);
		//8
		final Code Code_9_Var
		 = (Code)Lines_1_list.get(4);
		Assert.assertNotNull(Code_9_Var
		);
		Assert.assertEquals("DECLARATION;", Code_9_Var
		.getCode());
		//9
		final NewLineLine NewLineLine_10_Var
		 = (NewLineLine)Lines_1_list.get(5);
		Assert.assertNotNull(NewLineLine_10_Var
		);
		//10
		final Code Code_11_Var
		 = (Code)Lines_1_list.get(6);
		Assert.assertNotNull(Code_11_Var
		);
		Assert.assertEquals("INT MAIN(void) {", Code_11_Var
		.getCode());
		//11
		final Code Code_12_Var
		 = (Code)Lines_1_list.get(7);
		Assert.assertNotNull(Code_12_Var
		);
		Assert.assertEquals("	return x - 2 * Y;", Code_12_Var
		.getCode());
		//12
		final Code Code_13_Var
		 = (Code)Lines_1_list.get(8);
		Assert.assertNotNull(Code_13_Var
		);
		Assert.assertEquals("}", Code_13_Var
		.getCode());
	}
	
	@Test
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0009_DefineAndInclude.c");
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
				method.invoke(this.generator, "Test0009_DefineAndInclude.c.i");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
			// System.out.println("do nothing!");
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0009_DefineAndInclude.c.i");
		final String expected = this.getTextFromFile(
			"expected/Test0009_DefineAndInclude.c"
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

