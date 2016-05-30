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
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.DefineObjectMacro;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective;
import at.jku.weiner.c.preprocess.preprocess.NewLineLine;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(PreprocessInjectorProvider.class)
public class Test0089_Include {
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
		at.jku.weiner.c.preprocess.xtexttests.TestUtils.setUpTest0089();
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
			"res/Test0089_Include.c");
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
				"RULE_SKW_LESS",
				"RULE_INCLUDE",
				"RULE_SKW_DIV",
				"RULE_ID",
				"RULE_SKW_MINUS",
				"RULE_ID",
				"RULE_SKW_DOT",
				"RULE_ID",
				"RULE_SKW_GREATER",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_INCLUDE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_DEFINE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_WHITESPACE",
				"RULE_STRING_LITERAL",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_INCLUDE",
				"RULE_WHITESPACE",
				"RULE_ID",
				"RULE_NEWLINE",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_INCLUDE",
				"RULE_WHITESPACE",
				"RULE_SKW_LESS",
				"RULE_INCLUDE",
				"RULE_SKW_DIV",
				"RULE_ID",
				"RULE_SKW_DIV",
				"RULE_ID",
				"RULE_SKW_DOT",
				"RULE_ID",
				"RULE_SKW_GREATER",
				"RULE_NEWLINE",
				"RULE_HASH",
				"RULE_INCLUDE",
				"RULE_WHITESPACE",
				"RULE_STRING_LITERAL",
				"RULE_NEWLINE",
				};
			//final List<Token> actual = testHelper.getTokens(text);
			//testHelper.outputTokens(text);
			testHelper.checkTokenisation(text, expected);
	}
	
	@Test (timeout=1000)
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0089_Include.c");
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
		Assert.assertEquals(8, Lines_1_list.size());
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
		Assert.assertEquals("foo", DefineObjectMacro_3_Var
		.getIdent());
		Assert.assertEquals("1", DefineObjectMacro_3_Var
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
		Assert.assertEquals("LIN", DefineObjectMacro_5_Var
		.getIdent());
		Assert.assertEquals("<include/file-foo.h>", DefineObjectMacro_5_Var
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
		Assert.assertEquals("LIN", IncludeDirective_7_Var
		.getString());
		//7
		final PreprocessorDirectives PreprocessorDirectives_8_Var
		 = (PreprocessorDirectives)Lines_1_list.get(3);
		Assert.assertNotNull(PreprocessorDirectives_8_Var
		);
		//8
		final DefineObjectMacro DefineObjectMacro_9_Var
		 = (DefineObjectMacro)PreprocessorDirectives_8_Var
		.getDirective();
		Assert.assertNotNull(DefineObjectMacro_9_Var
		);
		Assert.assertEquals("LIN2", DefineObjectMacro_9_Var
		.getIdent());
		Assert.assertEquals("\"../myinclude/include/foo.h\"", DefineObjectMacro_9_Var
		.getString());
		//9
		final PreprocessorDirectives PreprocessorDirectives_10_Var
		 = (PreprocessorDirectives)Lines_1_list.get(4);
		Assert.assertNotNull(PreprocessorDirectives_10_Var
		);
		//10
		final IncludeDirective IncludeDirective_11_Var
		 = (IncludeDirective)PreprocessorDirectives_10_Var
		.getDirective();
		Assert.assertNotNull(IncludeDirective_11_Var
		);
		Assert.assertEquals("LIN2", IncludeDirective_11_Var
		.getString());
		//11
		final NewLineLine NewLineLine_12_Var
		 = (NewLineLine)Lines_1_list.get(5);
		Assert.assertNotNull(NewLineLine_12_Var
		);
		//12
		final PreprocessorDirectives PreprocessorDirectives_13_Var
		 = (PreprocessorDirectives)Lines_1_list.get(6);
		Assert.assertNotNull(PreprocessorDirectives_13_Var
		);
		//13
		final IncludeDirective IncludeDirective_14_Var
		 = (IncludeDirective)PreprocessorDirectives_13_Var
		.getDirective();
		Assert.assertNotNull(IncludeDirective_14_Var
		);
		Assert.assertEquals("<include/foo/foo.h>", IncludeDirective_14_Var
		.getString());
		//14
		final PreprocessorDirectives PreprocessorDirectives_15_Var
		 = (PreprocessorDirectives)Lines_1_list.get(7);
		Assert.assertNotNull(PreprocessorDirectives_15_Var
		);
		//15
		final IncludeDirective IncludeDirective_16_Var
		 = (IncludeDirective)PreprocessorDirectives_15_Var
		.getDirective();
		Assert.assertNotNull(IncludeDirective_16_Var
		);
		Assert.assertEquals("\"../myinclude/include/foo/foo.h\"", IncludeDirective_16_Var
		.getString());
	}
	
	@Test
	(timeout=1000
	)
	public void testGenerator() throws Exception {
		// load the resource
		ResourceSet set = this.resourceSetProvider.get();
		URI uri = URI.createURI(
			"res/Test0089_Include.c");
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
				method.invoke(this.generator, "Test0089_Include.c.i");
			}
		} catch (NoSuchMethodException | SecurityException
			| IllegalAccessException | IllegalArgumentException
			| InvocationTargetException e) {
			// do nothing
		}
		this.generator.doGenerate(resource, this.fileAccessSystem);
		final String actual = this.getTextFromFile("bin/Test0089_Include.c.i");
		final String expected = this.getTextFromFile(
			"expected/Test0089_Include.c"
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

