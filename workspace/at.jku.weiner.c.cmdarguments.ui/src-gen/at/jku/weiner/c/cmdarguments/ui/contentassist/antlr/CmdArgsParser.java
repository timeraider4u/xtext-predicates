/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.cmdarguments.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.jku.weiner.c.cmdarguments.services.CmdArgsGrammarAccess;

public class CmdArgsParser extends AbstractContentAssistParser {
	
	@Inject
	private CmdArgsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.jku.weiner.c.cmdarguments.ui.contentassist.antlr.internal.InternalCmdArgsParser createParser() {
		at.jku.weiner.c.cmdarguments.ui.contentassist.antlr.internal.InternalCmdArgsParser result = new at.jku.weiner.c.cmdarguments.ui.contentassist.antlr.internal.InternalCmdArgsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getArgumentAccess().getAlternatives_1(), "rule__Argument__Alternatives_1");
					put(grammarAccess.getMacroAccess().getAlternatives(), "rule__Macro__Alternatives");
					put(grammarAccess.getPathLegalPartAccess().getAlternatives(), "rule__PathLegalPart__Alternatives");
					put(grammarAccess.getMacroLegalPartAccess().getAlternatives(), "rule__MacroLegalPart__Alternatives");
					put(grammarAccess.getMyCodeAccess().getAlternatives(), "rule__MyCode__Alternatives");
					put(grammarAccess.getOptionLegalStartAccess().getAlternatives(), "rule__OptionLegalStart__Alternatives");
					put(grammarAccess.getOptionLegalContinuationAccess().getAlternatives(), "rule__OptionLegalContinuation__Alternatives");
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getModelAccess().getGroup_1_1(), "rule__Model__Group_1_1__0");
					put(grammarAccess.getCmdLineAccess().getGroup(), "rule__CmdLine__Group__0");
					put(grammarAccess.getCmdLineAccess().getGroup_6(), "rule__CmdLine__Group_6__0");
					put(grammarAccess.getCmdLineAccess().getGroup_6_1(), "rule__CmdLine__Group_6_1__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_0(), "rule__Argument__Group_1_0__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_1(), "rule__Argument__Group_1_1__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_2(), "rule__Argument__Group_1_2__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_4(), "rule__Argument__Group_1_4__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_5(), "rule__Argument__Group_1_5__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_6(), "rule__Argument__Group_1_6__0");
					put(grammarAccess.getArgumentAccess().getGroup_1_7(), "rule__Argument__Group_1_7__0");
					put(grammarAccess.getIncSysAccess().getGroup(), "rule__IncSys__Group__0");
					put(grammarAccess.getNoStdIncAccess().getGroup(), "rule__NoStdInc__Group__0");
					put(grammarAccess.getSimpleMacroAccess().getGroup(), "rule__SimpleMacro__Group__0");
					put(grammarAccess.getObjectMacroAccess().getGroup(), "rule__ObjectMacro__Group__0");
					put(grammarAccess.getFunctionMacroAccess().getGroup(), "rule__FunctionMacro__Group__0");
					put(grammarAccess.getFunctionMacroAccess().getGroup_3(), "rule__FunctionMacro__Group_3__0");
					put(grammarAccess.getFunctionMacroAccess().getGroup_3_1(), "rule__FunctionMacro__Group_3_1__0");
					put(grammarAccess.getStringMacroAccess().getGroup(), "rule__StringMacro__Group__0");
					put(grammarAccess.getPathCmdAccess().getGroup(), "rule__PathCmd__Group__0");
					put(grammarAccess.getOptionAccess().getGroup(), "rule__Option__Group__0");
					put(grammarAccess.getOptionAccess().getGroup_1(), "rule__Option__Group_1__0");
					put(grammarAccess.getOptionPartAccess().getGroup(), "rule__OptionPart__Group__0");
					put(grammarAccess.getIdentifierAccess().getGroup_0(), "rule__Identifier__Group_0__0");
					put(grammarAccess.getIdentifierAccess().getGroup_0_1(), "rule__Identifier__Group_0_1__0");
					put(grammarAccess.getModelAccess().getLinesAssignment_1_0(), "rule__Model__LinesAssignment_1_0");
					put(grammarAccess.getModelAccess().getLinesAssignment_1_1_1(), "rule__Model__LinesAssignment_1_1_1");
					put(grammarAccess.getCmdLineAccess().getStartAssignment_1(), "rule__CmdLine__StartAssignment_1");
					put(grammarAccess.getCmdLineAccess().getArgumentsAssignment_6_0(), "rule__CmdLine__ArgumentsAssignment_6_0");
					put(grammarAccess.getCmdLineAccess().getArgumentsAssignment_6_1_1(), "rule__CmdLine__ArgumentsAssignment_6_1_1");
					put(grammarAccess.getArgumentAccess().getMacroAssignment_1_0_1(), "rule__Argument__MacroAssignment_1_0_1");
					put(grammarAccess.getArgumentAccess().getIncDirAssignment_1_1_0(), "rule__Argument__IncDirAssignment_1_1_0");
					put(grammarAccess.getArgumentAccess().getUseIncDirAssignment_1_1_1(), "rule__Argument__UseIncDirAssignment_1_1_1");
					put(grammarAccess.getArgumentAccess().getIncSysAssignment_1_2_0(), "rule__Argument__IncSysAssignment_1_2_0");
					put(grammarAccess.getArgumentAccess().getUseIncDirAssignment_1_2_2(), "rule__Argument__UseIncDirAssignment_1_2_2");
					put(grammarAccess.getArgumentAccess().getNostdincAssignment_1_3(), "rule__Argument__NostdincAssignment_1_3");
					put(grammarAccess.getArgumentAccess().getIncludeAssignment_1_4_3(), "rule__Argument__IncludeAssignment_1_4_3");
					put(grammarAccess.getArgumentAccess().getOutAssignment_1_5_2(), "rule__Argument__OutAssignment_1_5_2");
					put(grammarAccess.getArgumentAccess().getLangAssignment_1_6_2(), "rule__Argument__LangAssignment_1_6_2");
					put(grammarAccess.getArgumentAccess().getOptionAssignment_1_7_2(), "rule__Argument__OptionAssignment_1_7_2");
					put(grammarAccess.getArgumentAccess().getInAssignment_1_8(), "rule__Argument__InAssignment_1_8");
					put(grammarAccess.getSimpleMacroAccess().getNameAssignment_1(), "rule__SimpleMacro__NameAssignment_1");
					put(grammarAccess.getObjectMacroAccess().getNameAssignment_1(), "rule__ObjectMacro__NameAssignment_1");
					put(grammarAccess.getObjectMacroAccess().getValueAssignment_3(), "rule__ObjectMacro__ValueAssignment_3");
					put(grammarAccess.getFunctionMacroAccess().getNameAssignment_1(), "rule__FunctionMacro__NameAssignment_1");
					put(grammarAccess.getFunctionMacroAccess().getParamsAssignment_3_0(), "rule__FunctionMacro__ParamsAssignment_3_0");
					put(grammarAccess.getFunctionMacroAccess().getParamsAssignment_3_1_1(), "rule__FunctionMacro__ParamsAssignment_3_1_1");
					put(grammarAccess.getFunctionMacroAccess().getValueAssignment_6(), "rule__FunctionMacro__ValueAssignment_6");
					put(grammarAccess.getStringMacroAccess().getStringAssignment_1(), "rule__StringMacro__StringAssignment_1");
					put(grammarAccess.getPathCmdAccess().getPathAssignment_1(), "rule__PathCmd__PathAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.jku.weiner.c.cmdarguments.ui.contentassist.antlr.internal.InternalCmdArgsParser typedParser = (at.jku.weiner.c.cmdarguments.ui.contentassist.antlr.internal.InternalCmdArgsParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_LINE_COMMENT", "RULE_LINE_BREAK" };
	}
	
	public CmdArgsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CmdArgsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
