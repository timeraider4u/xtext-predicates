/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.preprocess.serializer;

import at.jku.weiner.c.preprocess.services.PreprocessGrammarAccess;
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
public class PreprocessSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PreprocessGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConditionalDirective_WHITESPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_ConditionalDirective_WHITESPACETerminalRuleCall_6_a;
	protected AbstractElementAlias match_ConditionalDirective_WHITESPACETerminalRuleCall_8_a;
	protected AbstractElementAlias match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_5_a;
	protected AbstractElementAlias match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_8_0_p;
	protected AbstractElementAlias match_DefineObjectMacro_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_DefineObjectMacro_WHITESPACETerminalRuleCall_4_0_p;
	protected AbstractElementAlias match_ElIfConditional_WHITESPACETerminalRuleCall_1_0_a;
	protected AbstractElementAlias match_ElIfConditional_WHITESPACETerminalRuleCall_1_2_a;
	protected AbstractElementAlias match_ElIfConditional_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_ElIfConditional_WHITESPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_ElseConditional_WHITESPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_ElseConditional_WHITESPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_ElseConditional_WHITESPACETerminalRuleCall_5_a;
	protected AbstractElementAlias match_ErrorDirective_WHITESPACETerminalRuleCall_2_a;
	protected AbstractElementAlias match_IdentifierList_WHITESPACETerminalRuleCall_2_1_a;
	protected AbstractElementAlias match_IdentifierList_WHITESPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_IdentifierList_WHITESPACETerminalRuleCall_4_1_a;
	protected AbstractElementAlias match_IfConditional_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_IfConditional_WHITESPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_IfDefConditional_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_IfDefConditional_WHITESPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_IfNotDefConditional_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_IfNotDefConditional_WHITESPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_IncludeDirective_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_PreprocessorDirectives_WHITESPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_PreprocessorDirectives_WHITESPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_UnDefineDirective_WHITESPACETerminalRuleCall_2_p;
	protected AbstractElementAlias match_UnDefineDirective_WHITESPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_WarningDirective_WHITESPACETerminalRuleCall_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PreprocessGrammarAccess) access;
		match_ConditionalDirective_WHITESPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getConditionalDirectiveAccess().getWHITESPACETerminalRuleCall_4());
		match_ConditionalDirective_WHITESPACETerminalRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getConditionalDirectiveAccess().getWHITESPACETerminalRuleCall_6());
		match_ConditionalDirective_WHITESPACETerminalRuleCall_8_a = new TokenAlias(true, true, grammarAccess.getConditionalDirectiveAccess().getWHITESPACETerminalRuleCall_8());
		match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getDefineFunctionLikeMacroAccess().getWHITESPACETerminalRuleCall_2());
		match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getDefineFunctionLikeMacroAccess().getWHITESPACETerminalRuleCall_5());
		match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_8_0_p = new TokenAlias(true, false, grammarAccess.getDefineFunctionLikeMacroAccess().getWHITESPACETerminalRuleCall_8_0());
		match_DefineObjectMacro_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getDefineObjectMacroAccess().getWHITESPACETerminalRuleCall_2());
		match_DefineObjectMacro_WHITESPACETerminalRuleCall_4_0_p = new TokenAlias(true, false, grammarAccess.getDefineObjectMacroAccess().getWHITESPACETerminalRuleCall_4_0());
		match_ElIfConditional_WHITESPACETerminalRuleCall_1_0_a = new TokenAlias(true, true, grammarAccess.getElIfConditionalAccess().getWHITESPACETerminalRuleCall_1_0());
		match_ElIfConditional_WHITESPACETerminalRuleCall_1_2_a = new TokenAlias(true, true, grammarAccess.getElIfConditionalAccess().getWHITESPACETerminalRuleCall_1_2());
		match_ElIfConditional_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getElIfConditionalAccess().getWHITESPACETerminalRuleCall_2());
		match_ElIfConditional_WHITESPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getElIfConditionalAccess().getWHITESPACETerminalRuleCall_4());
		match_ElseConditional_WHITESPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getElseConditionalAccess().getWHITESPACETerminalRuleCall_1());
		match_ElseConditional_WHITESPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getElseConditionalAccess().getWHITESPACETerminalRuleCall_3());
		match_ElseConditional_WHITESPACETerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getElseConditionalAccess().getWHITESPACETerminalRuleCall_5());
		match_ErrorDirective_WHITESPACETerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getErrorDirectiveAccess().getWHITESPACETerminalRuleCall_2());
		match_IdentifierList_WHITESPACETerminalRuleCall_2_1_a = new TokenAlias(true, true, grammarAccess.getIdentifierListAccess().getWHITESPACETerminalRuleCall_2_1());
		match_IdentifierList_WHITESPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getIdentifierListAccess().getWHITESPACETerminalRuleCall_3());
		match_IdentifierList_WHITESPACETerminalRuleCall_4_1_a = new TokenAlias(true, true, grammarAccess.getIdentifierListAccess().getWHITESPACETerminalRuleCall_4_1());
		match_IfConditional_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getIfConditionalAccess().getWHITESPACETerminalRuleCall_2());
		match_IfConditional_WHITESPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getIfConditionalAccess().getWHITESPACETerminalRuleCall_4());
		match_IfDefConditional_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getIfDefConditionalAccess().getWHITESPACETerminalRuleCall_2());
		match_IfDefConditional_WHITESPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getIfDefConditionalAccess().getWHITESPACETerminalRuleCall_4());
		match_IfNotDefConditional_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getIfNotDefConditionalAccess().getWHITESPACETerminalRuleCall_2());
		match_IfNotDefConditional_WHITESPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getIfNotDefConditionalAccess().getWHITESPACETerminalRuleCall_4());
		match_IncludeDirective_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getIncludeDirectiveAccess().getWHITESPACETerminalRuleCall_2());
		match_PreprocessorDirectives_WHITESPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getPreprocessorDirectivesAccess().getWHITESPACETerminalRuleCall_1());
		match_PreprocessorDirectives_WHITESPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getPreprocessorDirectivesAccess().getWHITESPACETerminalRuleCall_3());
		match_UnDefineDirective_WHITESPACETerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getUnDefineDirectiveAccess().getWHITESPACETerminalRuleCall_2());
		match_UnDefineDirective_WHITESPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getUnDefineDirectiveAccess().getWHITESPACETerminalRuleCall_4());
		match_WarningDirective_WHITESPACETerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getWarningDirectiveAccess().getWHITESPACETerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDEFINERule())
			return getDEFINEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDEFINEDRule())
			return getDEFINEDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getELIFRule())
			return getELIFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getENDIFRule())
			return getENDIFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getERRORRule())
			return getERRORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getHASHRule())
			return getHASHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIFDEFRule())
			return getIFDEFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIFNOTDEFRule())
			return getIFNOTDEFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINCLUDERule())
			return getINCLUDEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPRAGMARule())
			return getPRAGMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_ANDRule())
			return getSKW_ANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_ANDANDRule())
			return getSKW_ANDANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_CARETRule())
			return getSKW_CARETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_COLONRule())
			return getSKW_COLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_COMMARule())
			return getSKW_COMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_ELLIPSISRule())
			return getSKW_ELLIPSISToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_LEFTPARENRule())
			return getSKW_LEFTPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_ORRule())
			return getSKW_ORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_ORORRule())
			return getSKW_ORORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_QUESTIONRule())
			return getSKW_QUESTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_RIGHTPARENRule())
			return getSKW_RIGHTPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getUNDEFRule())
			return getUNDEFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWARNINGRule())
			return getWARNINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWHITESPACERule())
			return getWHITESPACEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DEFINE: 'define';
	 */
	protected String getDEFINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "define";
	}
	
	/**
	 * terminal DEFINED: 'defined';
	 */
	protected String getDEFINEDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "defined";
	}
	
	/**
	 * terminal ELIF: 'elif';
	 */
	protected String getELIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "elif";
	}
	
	/**
	 * terminal ELSE: 'else';
	 */
	protected String getELSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "else";
	}
	
	/**
	 * terminal ENDIF: 'endif';
	 */
	protected String getENDIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "endif";
	}
	
	/**
	 * terminal ERROR: 'error';
	 */
	protected String getERRORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "error";
	}
	
	/**
	 * terminal HASH: '#';
	 */
	protected String getHASHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#";
	}
	
	/**
	 * terminal IF: 'if';
	 */
	protected String getIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * terminal IFDEF: 'ifdef';
	 */
	protected String getIFDEFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ifdef";
	}
	
	/**
	 * terminal IFNOTDEF: 'ifndef';
	 */
	protected String getIFNOTDEFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ifndef";
	}
	
	/**
	 * terminal INCLUDE: 'include';
	 */
	protected String getINCLUDEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "include";
	}
	
	/**
	 * terminal NEWLINE: Common::NEWLINE;
	 */
	protected String getNEWLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	/**
	 * terminal PRAGMA: 'pragma';
	 */
	protected String getPRAGMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "pragma";
	}
	
	/**
	 * terminal SKW_AND: '&';
	 */
	protected String getSKW_ANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * terminal SKW_ANDAND: SKW_AND SKW_AND;
	 */
	protected String getSKW_ANDANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * terminal SKW_CARET: '^';
	 */
	protected String getSKW_CARETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	
	/**
	 * terminal SKW_COLON: ':';
	 */
	protected String getSKW_COLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal SKW_COMMA: ',';
	 */
	protected String getSKW_COMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal SKW_ELLIPSIS: SKW_DOT SKW_DOT SKW_DOT;
	 */
	protected String getSKW_ELLIPSISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal SKW_LEFTPAREN: '(';
	 */
	protected String getSKW_LEFTPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal SKW_OR: '|';
	 */
	protected String getSKW_ORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal SKW_OROR: SKW_OR SKW_OR;
	 */
	protected String getSKW_ORORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal SKW_QUESTION: '?';
	 */
	protected String getSKW_QUESTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "?";
	}
	
	/**
	 * terminal SKW_RIGHTPAREN: ')';
	 */
	protected String getSKW_RIGHTPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal UNDEF: 'undef';
	 */
	protected String getUNDEFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "undef";
	}
	
	/**
	 * terminal WARNING: 'warning';
	 */
	protected String getWARNINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "warning";
	}
	
	/**
	 * terminal WHITESPACE: (SPACE | TAB);
	 */
	protected String getWHITESPACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ConditionalDirective_WHITESPACETerminalRuleCall_4_a.equals(syntax))
				emit_ConditionalDirective_WHITESPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConditionalDirective_WHITESPACETerminalRuleCall_6_a.equals(syntax))
				emit_ConditionalDirective_WHITESPACETerminalRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConditionalDirective_WHITESPACETerminalRuleCall_8_a.equals(syntax))
				emit_ConditionalDirective_WHITESPACETerminalRuleCall_8_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_5_a.equals(syntax))
				emit_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_8_0_p.equals(syntax))
				emit_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_8_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefineObjectMacro_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_DefineObjectMacro_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefineObjectMacro_WHITESPACETerminalRuleCall_4_0_p.equals(syntax))
				emit_DefineObjectMacro_WHITESPACETerminalRuleCall_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElIfConditional_WHITESPACETerminalRuleCall_1_0_a.equals(syntax))
				emit_ElIfConditional_WHITESPACETerminalRuleCall_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElIfConditional_WHITESPACETerminalRuleCall_1_2_a.equals(syntax))
				emit_ElIfConditional_WHITESPACETerminalRuleCall_1_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElIfConditional_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_ElIfConditional_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElIfConditional_WHITESPACETerminalRuleCall_4_a.equals(syntax))
				emit_ElIfConditional_WHITESPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElseConditional_WHITESPACETerminalRuleCall_1_a.equals(syntax))
				emit_ElseConditional_WHITESPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElseConditional_WHITESPACETerminalRuleCall_3_a.equals(syntax))
				emit_ElseConditional_WHITESPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElseConditional_WHITESPACETerminalRuleCall_5_a.equals(syntax))
				emit_ElseConditional_WHITESPACETerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ErrorDirective_WHITESPACETerminalRuleCall_2_a.equals(syntax))
				emit_ErrorDirective_WHITESPACETerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IdentifierList_WHITESPACETerminalRuleCall_2_1_a.equals(syntax))
				emit_IdentifierList_WHITESPACETerminalRuleCall_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IdentifierList_WHITESPACETerminalRuleCall_3_a.equals(syntax))
				emit_IdentifierList_WHITESPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IdentifierList_WHITESPACETerminalRuleCall_4_1_a.equals(syntax))
				emit_IdentifierList_WHITESPACETerminalRuleCall_4_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfConditional_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_IfConditional_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfConditional_WHITESPACETerminalRuleCall_4_a.equals(syntax))
				emit_IfConditional_WHITESPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfDefConditional_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_IfDefConditional_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfDefConditional_WHITESPACETerminalRuleCall_4_a.equals(syntax))
				emit_IfDefConditional_WHITESPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfNotDefConditional_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_IfNotDefConditional_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfNotDefConditional_WHITESPACETerminalRuleCall_4_a.equals(syntax))
				emit_IfNotDefConditional_WHITESPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IncludeDirective_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_IncludeDirective_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PreprocessorDirectives_WHITESPACETerminalRuleCall_1_a.equals(syntax))
				emit_PreprocessorDirectives_WHITESPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PreprocessorDirectives_WHITESPACETerminalRuleCall_3_a.equals(syntax))
				emit_PreprocessorDirectives_WHITESPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnDefineDirective_WHITESPACETerminalRuleCall_2_p.equals(syntax))
				emit_UnDefineDirective_WHITESPACETerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnDefineDirective_WHITESPACETerminalRuleCall_4_a.equals(syntax))
				emit_UnDefineDirective_WHITESPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WarningDirective_WHITESPACETerminalRuleCall_2_a.equals(syntax))
				emit_WarningDirective_WHITESPACETerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     conditional=IfConditional (ambiguity) HASH WHITESPACE* ENDIF WHITESPACE* (rule end)
	 *     conditional=IfDefConditional (ambiguity) HASH WHITESPACE* ENDIF WHITESPACE* (rule end)
	 *     conditional=IfNotDefConditional (ambiguity) HASH WHITESPACE* ENDIF WHITESPACE* (rule end)
	 *     elifs+=ElIfConditional (ambiguity) HASH WHITESPACE* ENDIF WHITESPACE* (rule end)
	 *     else=ElseConditional (ambiguity) HASH WHITESPACE* ENDIF WHITESPACE* (rule end)
	 */
	protected void emit_ConditionalDirective_WHITESPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     conditional=IfConditional WHITESPACE* HASH (ambiguity) ENDIF WHITESPACE* (rule end)
	 *     conditional=IfDefConditional WHITESPACE* HASH (ambiguity) ENDIF WHITESPACE* (rule end)
	 *     conditional=IfNotDefConditional WHITESPACE* HASH (ambiguity) ENDIF WHITESPACE* (rule end)
	 *     elifs+=ElIfConditional WHITESPACE* HASH (ambiguity) ENDIF WHITESPACE* (rule end)
	 *     else=ElseConditional WHITESPACE* HASH (ambiguity) ENDIF WHITESPACE* (rule end)
	 */
	protected void emit_ConditionalDirective_WHITESPACETerminalRuleCall_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     conditional=IfConditional WHITESPACE* HASH WHITESPACE* ENDIF (ambiguity) (rule end)
	 *     conditional=IfDefConditional WHITESPACE* HASH WHITESPACE* ENDIF (ambiguity) (rule end)
	 *     conditional=IfNotDefConditional WHITESPACE* HASH WHITESPACE* ENDIF (ambiguity) (rule end)
	 *     elifs+=ElIfConditional WHITESPACE* HASH WHITESPACE* ENDIF (ambiguity) (rule end)
	 *     else=ElseConditional WHITESPACE* HASH WHITESPACE* ENDIF (ambiguity) (rule end)
	 */
	protected void emit_ConditionalDirective_WHITESPACETerminalRuleCall_8_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) DEFINE (ambiguity) id=ID
	 */
	protected void emit_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     id=ID SKW_LEFTPAREN (ambiguity) SKW_RIGHTPAREN (rule end)
	 *     id=ID SKW_LEFTPAREN (ambiguity) SKW_RIGHTPAREN WHITESPACE+ string=MyDefineLine
	 *     id=ID SKW_LEFTPAREN (ambiguity) list=IdentifierList
	 */
	protected void emit_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     id=ID SKW_LEFTPAREN WHITESPACE* SKW_RIGHTPAREN (ambiguity) string=MyDefineLine
	 *     list=IdentifierList SKW_RIGHTPAREN (ambiguity) string=MyDefineLine
	 */
	protected void emit_DefineFunctionLikeMacro_WHITESPACETerminalRuleCall_8_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) DEFINE (ambiguity) id=ID
	 */
	protected void emit_DefineObjectMacro_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     id=ID (ambiguity) string=MyDefineLine
	 */
	protected void emit_DefineObjectMacro_WHITESPACETerminalRuleCall_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) HASH WHITESPACE* ELIF WHITESPACE+ expression=ConstantExpression
	 */
	protected void emit_ElIfConditional_WHITESPACETerminalRuleCall_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) WHITESPACE* HASH (ambiguity) ELIF WHITESPACE+ expression=ConstantExpression
	 */
	protected void emit_ElIfConditional_WHITESPACETerminalRuleCall_1_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) WHITESPACE* HASH WHITESPACE* ELIF (ambiguity) expression=ConstantExpression
	 */
	protected void emit_ElIfConditional_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=ConstantExpression (ambiguity) NEWLINE group=GroupOpt
	 */
	protected void emit_ElIfConditional_WHITESPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) HASH WHITESPACE* ELSE WHITESPACE* NEWLINE group=GroupOpt
	 */
	protected void emit_ElseConditional_WHITESPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) WHITESPACE* HASH (ambiguity) ELSE WHITESPACE* NEWLINE group=GroupOpt
	 */
	protected void emit_ElseConditional_WHITESPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) WHITESPACE* HASH WHITESPACE* ELSE (ambiguity) NEWLINE group=GroupOpt
	 */
	protected void emit_ElseConditional_WHITESPACETerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ERROR (ambiguity) (rule start)
	 *     (rule start) ERROR (ambiguity) msg=MyCodeLine
	 */
	protected void emit_ErrorDirective_WHITESPACETerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     id+=ID SKW_COMMA (ambiguity) id+=ID
	 */
	protected void emit_IdentifierList_WHITESPACETerminalRuleCall_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     id+=ID (ambiguity) (rule end)
	 *     id+=ID (ambiguity) SKW_COMMA WHITESPACE* variadic?=SKW_ELLIPSIS
	 */
	protected void emit_IdentifierList_WHITESPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     id+=ID WHITESPACE* SKW_COMMA (ambiguity) variadic?=SKW_ELLIPSIS
	 */
	protected void emit_IdentifierList_WHITESPACETerminalRuleCall_4_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) IF (ambiguity) expression=ConstantExpression
	 */
	protected void emit_IfConditional_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=ConstantExpression (ambiguity) NEWLINE group=GroupOpt
	 */
	protected void emit_IfConditional_WHITESPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) IFDEF (ambiguity) id=ID
	 */
	protected void emit_IfDefConditional_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     id=ID (ambiguity) NEWLINE group=GroupOpt
	 */
	protected void emit_IfDefConditional_WHITESPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) IFNOTDEF (ambiguity) id=ID
	 */
	protected void emit_IfNotDefConditional_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     id=ID (ambiguity) NEWLINE group=GroupOpt
	 */
	protected void emit_IfNotDefConditional_WHITESPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) INCLUDE (ambiguity) string=MyCodeLine
	 */
	protected void emit_IncludeDirective_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=ConditionalDirective
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=DefineDirective
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=ErrorDirective
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=IncludeDirective
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=NullDirective
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=PragmaDirective
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=UnDefineDirective
	 *     (rule start) (ambiguity) HASH WHITESPACE* directive=WarningDirective
	 */
	protected void emit_PreprocessorDirectives_WHITESPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=ConditionalDirective
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=DefineDirective
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=ErrorDirective
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=IncludeDirective
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=NullDirective
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=PragmaDirective
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=UnDefineDirective
	 *     (rule start) WHITESPACE* HASH (ambiguity) directive=WarningDirective
	 */
	protected void emit_PreprocessorDirectives_WHITESPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) UNDEF (ambiguity) id=ID
	 */
	protected void emit_UnDefineDirective_WHITESPACETerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     id=ID (ambiguity) (rule end)
	 */
	protected void emit_UnDefineDirective_WHITESPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) WARNING (ambiguity) (rule start)
	 *     (rule start) WARNING (ambiguity) msg=MyCodeLine
	 */
	protected void emit_WarningDirective_WHITESPACETerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
