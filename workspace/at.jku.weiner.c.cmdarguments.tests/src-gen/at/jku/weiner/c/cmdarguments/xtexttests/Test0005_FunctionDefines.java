package at.jku.weiner.c.cmdarguments.xtexttests;

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
import at.jku.weiner.c.cmdarguments.tests.CmdArgsInjectorProvider;
import at.jku.weiner.c.cmdarguments.parser.antlr.CmdArgsParser;
import at.jku.weiner.c.cmdarguments.parser.antlr.lexer.InternalCmdArgsLexer;
import at.jku.weiner.c.cmdarguments.xtexttests.LexerAndParserTest;

import at.jku.weiner.c.cmdarguments.cmdArgs.Model;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.ObjectMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.SimpleMacro;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine;
import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.ObjectMacro;
@SuppressWarnings("unused")
@RunWith(XtextRunner.class)
@InjectWith(CmdArgsInjectorProvider.class)
public class Test0005_FunctionDefines {
	@Inject
	private ParseHelper<Model> parseHelper;
	@Inject
	private ValidationTestHelper valHelper;
	@Inject
	private InternalCmdArgsLexer lexer;
	@Inject
	private CmdArgsParser parser;
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
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("cmd",
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
			"res/Test0005_FunctionDefines.cmd");
			final String[] expected = new String[] {
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_ASSIGN",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_NEWLINE",
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_ASSIGN",
				"RULE_ID",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_ID",
				"RULE_SKW_ASSIGN",
				"RULE_ID",
				"RULE_NEWLINE",
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_ASSIGN",
				"RULE_ID",
				"RULE_NEWLINE",
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_ASSIGN",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_NEWLINE",
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_ASSIGN",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_RIGHTPAREN",
				"RULE_NEWLINE",
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_COMMA",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_ASSIGN",
				"RULE_ID",
				"RULE_SKW_LEFTPAREN",
				"RULE_ID",
				"RULE_SKW_RIGHTPAREN",
				"RULE_SKW_COMMA",
				"RULE_ID",
				"RULE_NEWLINE",
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_KW_NOSTDINC",
				"RULE_NEWLINE",
				"RULE_ID",
				"RULE_WS",
				"RULE_SKW_COLON",
				"RULE_SKW_ASSIGN",
				"RULE_WS",
				"RULE_KW_DEFINE",
				"RULE_KW_INCSYS",
				"RULE_SKW_ASSIGN",
				"RULE_KW_INCLUDE",
				};
			//final List<Token> actual = testHelper.getTokens(text);
			//testHelper.outputTokens(text);
			testHelper.checkTokenisation(text, expected);
	}
	
	@Test (timeout=1000)
	public void checkParserResult() throws Exception {
		final String text = this.getTextFromFile(
			"res/Test0005_FunctionDefines.cmd");
		final Model Model_0_Var
		  = 
			this.parseHelper.parse(text);
		this.valHelper.assertNoErrors(Model_0_Var
		);
		
		Assert.assertNotNull(Model_0_Var
		);
		final EList<? extends EObject> Lines_0_list = Model_0_Var
		.getLines();
		Assert.assertNotNull(Lines_0_list);
		Assert.assertEquals(8, Lines_0_list.size());
		//0
		final CmdLine CmdLine_1_Var
		 = (CmdLine)Lines_0_list.get(0);
		Assert.assertNotNull(CmdLine_1_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_1_Var
		.getStart());
		final EList<? extends EObject> Arguments_1_list = CmdLine_1_Var
		.getArguments();
		Assert.assertNotNull(Arguments_1_list);
		Assert.assertEquals(1, Arguments_1_list.size());
		//1
		final Argument Argument_2_Var
		 = (Argument)Arguments_1_list.get(0);
		Assert.assertNotNull(Argument_2_Var
		);
		//2
		final FunctionMacro FunctionMacro_3_Var
		 = (FunctionMacro)Argument_2_Var
		.getMacro();
		Assert.assertNotNull(FunctionMacro_3_Var
		);
		Assert.assertEquals("FOO", FunctionMacro_3_Var
		.getName());
		Assert.assertEquals("[X]", FunctionMacro_3_Var
		.getParams().toString());
		Assert.assertEquals("BAR(X)", FunctionMacro_3_Var
		.getValue());
		//3
		final CmdLine CmdLine_4_Var
		 = (CmdLine)Lines_0_list.get(1);
		Assert.assertNotNull(CmdLine_4_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_4_Var
		.getStart());
		final EList<? extends EObject> Arguments_4_list = CmdLine_4_Var
		.getArguments();
		Assert.assertNotNull(Arguments_4_list);
		Assert.assertEquals(2, Arguments_4_list.size());
		//4
		final Argument Argument_5_Var
		 = (Argument)Arguments_4_list.get(0);
		Assert.assertNotNull(Argument_5_Var
		);
		//5
		final FunctionMacro FunctionMacro_6_Var
		 = (FunctionMacro)Argument_5_Var
		.getMacro();
		Assert.assertNotNull(FunctionMacro_6_Var
		);
		Assert.assertEquals("BAR", FunctionMacro_6_Var
		.getName());
		Assert.assertEquals("[x]", FunctionMacro_6_Var
		.getParams().toString());
		Assert.assertEquals("x", FunctionMacro_6_Var
		.getValue());
		//6
		final Argument Argument_7_Var
		 = (Argument)Arguments_4_list.get(1);
		Assert.assertNotNull(Argument_7_Var
		);
		//7
		final ObjectMacro ObjectMacro_8_Var
		 = (ObjectMacro)Argument_7_Var
		.getMacro();
		Assert.assertNotNull(ObjectMacro_8_Var
		);
		Assert.assertEquals("_BAR2", ObjectMacro_8_Var
		.getName());
		Assert.assertEquals("5", ObjectMacro_8_Var
		.getValue());
		//8
		final CmdLine CmdLine_9_Var
		 = (CmdLine)Lines_0_list.get(2);
		Assert.assertNotNull(CmdLine_9_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_9_Var
		.getStart());
		final EList<? extends EObject> Arguments_9_list = CmdLine_9_Var
		.getArguments();
		Assert.assertNotNull(Arguments_9_list);
		Assert.assertEquals(1, Arguments_9_list.size());
		//9
		final Argument Argument_10_Var
		 = (Argument)Arguments_9_list.get(0);
		Assert.assertNotNull(Argument_10_Var
		);
		//10
		final FunctionMacro FunctionMacro_11_Var
		 = (FunctionMacro)Argument_10_Var
		.getMacro();
		Assert.assertNotNull(FunctionMacro_11_Var
		);
		Assert.assertEquals("STR", FunctionMacro_11_Var
		.getName());
		Assert.assertEquals("[s]", FunctionMacro_11_Var
		.getParams().toString());
		Assert.assertEquals("s", FunctionMacro_11_Var
		.getValue());
		//11
		final CmdLine CmdLine_12_Var
		 = (CmdLine)Lines_0_list.get(3);
		Assert.assertNotNull(CmdLine_12_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_12_Var
		.getStart());
		final EList<? extends EObject> Arguments_12_list = CmdLine_12_Var
		.getArguments();
		Assert.assertNotNull(Arguments_12_list);
		Assert.assertEquals(1, Arguments_12_list.size());
		//12
		final Argument Argument_13_Var
		 = (Argument)Arguments_12_list.get(0);
		Assert.assertNotNull(Argument_13_Var
		);
		//13
		final FunctionMacro FunctionMacro_14_Var
		 = (FunctionMacro)Argument_13_Var
		.getMacro();
		Assert.assertNotNull(FunctionMacro_14_Var
		);
		Assert.assertEquals("FOOBAR", FunctionMacro_14_Var
		.getName());
		Assert.assertEquals("[X]", FunctionMacro_14_Var
		.getParams().toString());
		Assert.assertEquals("FOO(X)(Y)", FunctionMacro_14_Var
		.getValue());
		//14
		final CmdLine CmdLine_15_Var
		 = (CmdLine)Lines_0_list.get(4);
		Assert.assertNotNull(CmdLine_15_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_15_Var
		.getStart());
		final EList<? extends EObject> Arguments_15_list = CmdLine_15_Var
		.getArguments();
		Assert.assertNotNull(Arguments_15_list);
		Assert.assertEquals(1, Arguments_15_list.size());
		//15
		final Argument Argument_16_Var
		 = (Argument)Arguments_15_list.get(0);
		Assert.assertNotNull(Argument_16_Var
		);
		//16
		final FunctionMacro FunctionMacro_17_Var
		 = (FunctionMacro)Argument_16_Var
		.getMacro();
		Assert.assertNotNull(FunctionMacro_17_Var
		);
		Assert.assertEquals("STR", FunctionMacro_17_Var
		.getName());
		Assert.assertEquals("[s]", FunctionMacro_17_Var
		.getParams().toString());
		Assert.assertEquals("FOO(BAR(s))", FunctionMacro_17_Var
		.getValue());
		//17
		final CmdLine CmdLine_18_Var
		 = (CmdLine)Lines_0_list.get(5);
		Assert.assertNotNull(CmdLine_18_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_18_Var
		.getStart());
		final EList<? extends EObject> Arguments_18_list = CmdLine_18_Var
		.getArguments();
		Assert.assertNotNull(Arguments_18_list);
		Assert.assertEquals(1, Arguments_18_list.size());
		//18
		final Argument Argument_19_Var
		 = (Argument)Arguments_18_list.get(0);
		Assert.assertNotNull(Argument_19_Var
		);
		//19
		final FunctionMacro FunctionMacro_20_Var
		 = (FunctionMacro)Argument_19_Var
		.getMacro();
		Assert.assertNotNull(FunctionMacro_20_Var
		);
		Assert.assertEquals("FOOBAR", FunctionMacro_20_Var
		.getName());
		Assert.assertEquals("[X, Y]", FunctionMacro_20_Var
		.getParams().toString());
		Assert.assertEquals("FOO(X),Y", FunctionMacro_20_Var
		.getValue());
		//20
		final CmdLine CmdLine_21_Var
		 = (CmdLine)Lines_0_list.get(6);
		Assert.assertNotNull(CmdLine_21_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_21_Var
		.getStart());
		final EList<? extends EObject> Arguments_21_list = CmdLine_21_Var
		.getArguments();
		Assert.assertNotNull(Arguments_21_list);
		Assert.assertEquals(1, Arguments_21_list.size());
		//21
		final Argument Argument_22_Var
		 = (Argument)Arguments_21_list.get(0);
		Assert.assertNotNull(Argument_22_Var
		);
		//22
		final SimpleMacro SimpleMacro_23_Var
		 = (SimpleMacro)Argument_22_Var
		.getMacro();
		Assert.assertNotNull(SimpleMacro_23_Var
		);
		Assert.assertEquals("nostdinc", SimpleMacro_23_Var
		.getName());
		//23
		final CmdLine CmdLine_24_Var
		 = (CmdLine)Lines_0_list.get(7);
		Assert.assertNotNull(CmdLine_24_Var
		);
		Assert.assertEquals("foobar.o", CmdLine_24_Var
		.getStart());
		final EList<? extends EObject> Arguments_24_list = CmdLine_24_Var
		.getArguments();
		Assert.assertNotNull(Arguments_24_list);
		Assert.assertEquals(1, Arguments_24_list.size());
		//24
		final Argument Argument_25_Var
		 = (Argument)Arguments_24_list.get(0);
		Assert.assertNotNull(Argument_25_Var
		);
		//25
		final ObjectMacro ObjectMacro_26_Var
		 = (ObjectMacro)Argument_25_Var
		.getMacro();
		Assert.assertNotNull(ObjectMacro_26_Var
		);
		Assert.assertEquals("isystem", ObjectMacro_26_Var
		.getName());
		Assert.assertEquals("include", ObjectMacro_26_Var
		.getValue());
	}
	
	
}


