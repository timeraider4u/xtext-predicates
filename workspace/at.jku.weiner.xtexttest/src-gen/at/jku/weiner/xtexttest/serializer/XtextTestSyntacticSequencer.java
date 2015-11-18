/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.xtexttest.serializer;

import at.jku.weiner.xtexttest.services.XtextTestGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XtextTestSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XtextTestGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Generator_PATTERNSTerminalRuleCall_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XtextTestGrammarAccess) access;
		match_Generator_PATTERNSTerminalRuleCall_3_0_q = new TokenAlias(false, true, grammarAccess.getGeneratorAccess().getPATTERNSTerminalRuleCall_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAFTER_KWRule())
			return getAFTER_KWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNASDATALISTRule())
			return getASSIGNASDATALISTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNASLISTRule())
			return getASSIGNASLISTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNASSINGLERule())
			return getASSIGNASSINGLEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNASSTRINGRule())
			return getASSIGNASSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBEFORE_KWRule())
			return getBEFORE_KWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCLASS_KWRule())
			return getCLASS_KWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXCEPTIONSRule())
			return getEXCEPTIONSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXPECTEDRule())
			return getEXPECTEDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFILERule())
			return getFILEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getISSAMEASINPUTFILERule())
			return getISSAMEASINPUTFILEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLANGUAGERule())
			return getLANGUAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFTPARENRule())
			return getLEFTPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEXERRule())
			return getLEXERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMETHOD_KWRule())
			return getMETHOD_KWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOUTPUTRule())
			return getOUTPUTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPACKAGERule())
			return getPACKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPATTERNSRule())
			return getPATTERNSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHTPARENRule())
			return getRIGHTPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSOURCERule())
			return getSOURCEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSRCTEXTRule())
			return getSRCTEXTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AFTER_KW: 'after';
	 */
	protected String getAFTER_KWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "after";
	}
	
	/**
	 * terminal ASSIGNASDATALIST: '+*';
	 */
	protected String getASSIGNASDATALISTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+*";
	}
	
	/**
	 * terminal ASSIGNASLIST: '+=';
	 */
	protected String getASSIGNASLISTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+=";
	}
	
	/**
	 * terminal ASSIGNASSINGLE: '=';
	 */
	protected String getASSIGNASSINGLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal ASSIGNASSTRING: '++';
	 */
	protected String getASSIGNASSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "++";
	}
	
	/**
	 * terminal BEFORE_KW: 'before';
	 */
	protected String getBEFORE_KWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "before";
	}
	
	/**
	 * terminal CLASS_KW: 'class';
	 */
	protected String getCLASS_KWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "class";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal EXCEPTIONS: 'exceptions';
	 */
	protected String getEXCEPTIONSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "exceptions";
	}
	
	/**
	 * terminal EXPECTED: 'expected';
	 */
	protected String getEXPECTEDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "expected";
	}
	
	/**
	 * terminal FILE: 'file';
	 */
	protected String getFILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "file";
	}
	
	/**
	 * terminal ISSAMEASINPUTFILE: 'isSameAsInputFile';
	 */
	protected String getISSAMEASINPUTFILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "isSameAsInputFile";
	}
	
	/**
	 * terminal LANGUAGE: 'language';
	 */
	protected String getLANGUAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "language";
	}
	
	/**
	 * terminal LEFTPAREN: '(';
	 */
	protected String getLEFTPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal LEXER: 'lexer-tokens';
	 */
	protected String getLEXERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "lexer-tokens";
	}
	
	/**
	 * terminal METHOD_KW: 'method';
	 */
	protected String getMETHOD_KWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "method";
	}
	
	/**
	 * terminal OUTPUT: 'output';
	 */
	protected String getOUTPUTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "output";
	}
	
	/**
	 * terminal PACKAGE: 'package';
	 */
	protected String getPACKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "package";
	}
	
	/**
	 * terminal PATTERNS: 'replacePatterns';
	 */
	protected String getPATTERNSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "replacePatterns";
	}
	
	/**
	 * terminal RIGHTPAREN: ')';
	 */
	protected String getRIGHTPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SOURCE: 'source';
	 */
	protected String getSOURCEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "source";
	}
	
	/**
	 * terminal SRCTEXT: 'text';
	 */
	protected String getSRCTEXTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "text";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Generator_PATTERNSTerminalRuleCall_3_0_q.equals(syntax))
				emit_Generator_PATTERNSTerminalRuleCall_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     PATTERNS?
	 *
	 * This ambiguous syntax occurs at:
	 *     expected=STRING (ambiguity) (rule end)
	 *     expected=STRING (ambiguity) EXPECTED EXCEPTIONS exception=PackageID
	 *     isSameAsInputFile?=ISSAMEASINPUTFILE (ambiguity) (rule end)
	 *     isSameAsInputFile?=ISSAMEASINPUTFILE (ambiguity) EXPECTED EXCEPTIONS exception=PackageID
	 */
	protected void emit_Generator_PATTERNSTerminalRuleCall_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
