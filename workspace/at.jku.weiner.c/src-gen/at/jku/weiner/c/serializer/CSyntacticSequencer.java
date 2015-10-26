/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.serializer;

import at.jku.weiner.c.services.CGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AsmStatement_COLONTerminalRuleCall_4_0_q;
	protected AbstractElementAlias match_AsmStatement_KW_ASM1TerminalRuleCall_1_0_or_KW_ASM2TerminalRuleCall_1_1;
	protected AbstractElementAlias match_Initializer_COMMATerminalRuleCall_1_1_2_q;
	protected AbstractElementAlias match_ParameterTypeList___COMMATerminalRuleCall_2_0_ELLIPSISTerminalRuleCall_2_1__q;
	protected AbstractElementAlias match_PostfixExpression___LEFTPARENTerminalRuleCall_1_1_1_0_RIGHTPARENTerminalRuleCall_1_1_1_2__a;
	protected AbstractElementAlias match_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__a;
	protected AbstractElementAlias match_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CGrammarAccess) access;
		match_AsmStatement_COLONTerminalRuleCall_4_0_q = new TokenAlias(false, true, grammarAccess.getAsmStatementAccess().getCOLONTerminalRuleCall_4_0());
		match_AsmStatement_KW_ASM1TerminalRuleCall_1_0_or_KW_ASM2TerminalRuleCall_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAsmStatementAccess().getKW_ASM1TerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getAsmStatementAccess().getKW_ASM2TerminalRuleCall_1_1()));
		match_Initializer_COMMATerminalRuleCall_1_1_2_q = new TokenAlias(false, true, grammarAccess.getInitializerAccess().getCOMMATerminalRuleCall_1_1_2());
		match_ParameterTypeList___COMMATerminalRuleCall_2_0_ELLIPSISTerminalRuleCall_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getParameterTypeListAccess().getCOMMATerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getParameterTypeListAccess().getELLIPSISTerminalRuleCall_2_1()));
		match_PostfixExpression___LEFTPARENTerminalRuleCall_1_1_1_0_RIGHTPARENTerminalRuleCall_1_1_1_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getLEFTPARENTerminalRuleCall_1_1_1_0()), new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getRIGHTPARENTerminalRuleCall_1_1_1_2()));
		match_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getRIGHTPARENTerminalRuleCall_1_1_1_2()), new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getLEFTPARENTerminalRuleCall_1_1_1_0()));
		match_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getRIGHTPARENTerminalRuleCall_1_1_1_2()), new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getLEFTPARENTerminalRuleCall_1_1_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANDRule())
			return getANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getANDANDRule())
			return getANDANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNRule())
			return getASSIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCARETRule())
			return getCARETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getELLIPSISRule())
			return getELLIPSISToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_ASM1Rule())
			return getKW_ASM1Token(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_ASM2Rule())
			return getKW_ASM2Token(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_ENUMRule())
			return getKW_ENUMToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_WHILERule())
			return getKW_WHILEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFTBRACERule())
			return getLEFTBRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFTBRACKETRule())
			return getLEFTBRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFTPARENRule())
			return getLEFTPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getORRule())
			return getORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getORORRule())
			return getORORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQUESTIONRule())
			return getQUESTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHTBRACERule())
			return getRIGHTBRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHTBRACKETRule())
			return getRIGHTBRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRIGHTPARENRule())
			return getRIGHTPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMIRule())
			return getSEMIToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AND: '&';
	 */
	protected String getANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * terminal ANDAND: AND AND;
	 */
	protected String getANDANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * terminal ASSIGN: '=';
	 */
	protected String getASSIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal CARET: '^';
	 */
	protected String getCARETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	
	/**
	 * terminal COLON: ':';
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
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
	 * terminal ELLIPSIS: DOT DOT DOT;
	 */
	protected String getELLIPSISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal KW_ASM1: KW_UNDERSCORE KW_UNDERSCORE 'asm';
	 */
	protected String getKW_ASM1Token(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "_asm";
	}
	
	/**
	 * terminal KW_ASM2: KW_ASM1 KW_UNDERSCORE KW_UNDERSCORE;
	 */
	protected String getKW_ASM2Token(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "_asm";
	}
	
	/**
	 * terminal KW_ENUM : 'enum';
	 */
	protected String getKW_ENUMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "enum";
	}
	
	/**
	 * terminal KW_WHILE : 'while';
	 */
	protected String getKW_WHILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "while";
	}
	
	/**
	 * terminal LEFTBRACE: '{';
	 */
	protected String getLEFTBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LEFTBRACKET: '[';
	 */
	protected String getLEFTBRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
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
	 * terminal OR: '|';
	 */
	protected String getORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal OROR: OR OR;
	 */
	protected String getORORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal QUESTION: '?';
	 */
	protected String getQUESTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "?";
	}
	
	/**
	 * terminal RIGHTBRACE: '}';
	 */
	protected String getRIGHTBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal RIGHTBRACKET: ']';
	 */
	protected String getRIGHTBRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
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
	 * terminal SEMI: ';';
	 */
	protected String getSEMIToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AsmStatement_COLONTerminalRuleCall_4_0_q.equals(syntax))
				emit_AsmStatement_COLONTerminalRuleCall_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AsmStatement_KW_ASM1TerminalRuleCall_1_0_or_KW_ASM2TerminalRuleCall_1_1.equals(syntax))
				emit_AsmStatement_KW_ASM1TerminalRuleCall_1_0_or_KW_ASM2TerminalRuleCall_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Initializer_COMMATerminalRuleCall_1_1_2_q.equals(syntax))
				emit_Initializer_COMMATerminalRuleCall_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterTypeList___COMMATerminalRuleCall_2_0_ELLIPSISTerminalRuleCall_2_1__q.equals(syntax))
				emit_ParameterTypeList___COMMATerminalRuleCall_2_0_ELLIPSISTerminalRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PostfixExpression___LEFTPARENTerminalRuleCall_1_1_1_0_RIGHTPARENTerminalRuleCall_1_1_1_2__a.equals(syntax))
				emit_PostfixExpression___LEFTPARENTerminalRuleCall_1_1_1_0_RIGHTPARENTerminalRuleCall_1_1_1_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__a.equals(syntax))
				emit_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__p.equals(syntax))
				emit_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     COLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (KW_ASM1 | KW_ASM2) LEFTPAREN (ambiguity) expr+=LogicalOrExpression
	 *     expr+=LogicalOrExpression (ambiguity) expr+=LogicalOrExpression
	 *     volatile=KW_VOLATILE LEFTPAREN (ambiguity) expr+=LogicalOrExpression
	 *     volatile=KW_VOLATILE2 LEFTPAREN (ambiguity) expr+=LogicalOrExpression
	 */
	protected void emit_AsmStatement_COLONTerminalRuleCall_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     KW_ASM1 | KW_ASM2
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) LEFTPAREN COLON? expr+=LogicalOrExpression
	 *     (rule start) (ambiguity) volatile=KW_VOLATILE
	 *     (rule start) (ambiguity) volatile=KW_VOLATILE2
	 */
	protected void emit_AsmStatement_KW_ASM1TerminalRuleCall_1_0_or_KW_ASM2TerminalRuleCall_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     COMMA?
	 *
	 * This ambiguous syntax occurs at:
	 *     list=InitializerList (ambiguity) RIGHTBRACE (rule end)
	 */
	protected void emit_Initializer_COMMATerminalRuleCall_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (COMMA ELLIPSIS)?
	 *
	 * This ambiguous syntax occurs at:
	 *     list=ParameterList (ambiguity) (rule end)
	 */
	protected void emit_ParameterTypeList___COMMATerminalRuleCall_2_0_ELLIPSISTerminalRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (LEFTPAREN RIGHTPAREN)*
	 *
	 * This ambiguous syntax occurs at:
	 *     argumentExpressionList+=ArgumentExpressionList RIGHTPAREN (ambiguity) (rule end)
	 *     argumentExpressionList+=ArgumentExpressionList RIGHTPAREN (ambiguity) LEFTBRACKET arrayExpr+=Expression
	 *     argumentExpressionList+=ArgumentExpressionList RIGHTPAREN (ambiguity) dot+=DOT
	 *     argumentExpressionList+=ArgumentExpressionList RIGHTPAREN (ambiguity) minusminus+=MINUSMINUS
	 *     argumentExpressionList+=ArgumentExpressionList RIGHTPAREN (ambiguity) plusplus+=PLUSPLUS
	 *     arrayExpr+=Expression RIGHTBRACKET (ambiguity) (rule end)
	 *     arrayExpr+=Expression RIGHTBRACKET (ambiguity) LEFTBRACKET arrayExpr+=Expression
	 *     arrayExpr+=Expression RIGHTBRACKET (ambiguity) dot+=DOT
	 *     arrayExpr+=Expression RIGHTBRACKET (ambiguity) minusminus+=MINUSMINUS
	 *     arrayExpr+=Expression RIGHTBRACKET (ambiguity) plusplus+=PLUSPLUS
	 *     expr+=PrimaryExpression (ambiguity) (rule end)
	 *     expr+=PrimaryExpression (ambiguity) LEFTBRACKET arrayExpr+=Expression
	 *     expr+=PrimaryExpression (ambiguity) dot+=DOT
	 *     expr+=PrimaryExpression (ambiguity) minusminus+=MINUSMINUS
	 *     expr+=PrimaryExpression (ambiguity) plusplus+=PLUSPLUS
	 *     id+=ID (ambiguity) (rule end)
	 *     id+=ID (ambiguity) LEFTBRACKET arrayExpr+=Expression
	 *     id+=ID (ambiguity) dot+=DOT
	 *     id+=ID (ambiguity) minusminus+=MINUSMINUS
	 *     id+=ID (ambiguity) plusplus+=PLUSPLUS
	 *     minusminus+=MINUSMINUS (ambiguity) (rule end)
	 *     minusminus+=MINUSMINUS (ambiguity) LEFTBRACKET arrayExpr+=Expression
	 *     minusminus+=MINUSMINUS (ambiguity) dot+=DOT
	 *     minusminus+=MINUSMINUS (ambiguity) minusminus+=MINUSMINUS
	 *     minusminus+=MINUSMINUS (ambiguity) plusplus+=PLUSPLUS
	 *     plusplus+=PLUSPLUS (ambiguity) (rule end)
	 *     plusplus+=PLUSPLUS (ambiguity) LEFTBRACKET arrayExpr+=Expression
	 *     plusplus+=PLUSPLUS (ambiguity) dot+=DOT
	 *     plusplus+=PLUSPLUS (ambiguity) minusminus+=MINUSMINUS
	 *     plusplus+=PLUSPLUS (ambiguity) plusplus+=PLUSPLUS
	 */
	protected void emit_PostfixExpression___LEFTPARENTerminalRuleCall_1_1_1_0_RIGHTPARENTerminalRuleCall_1_1_1_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (RIGHTPAREN LEFTPAREN)*
	 *
	 * This ambiguous syntax occurs at:
	 *     arrayExpr+=Expression RIGHTBRACKET LEFTPAREN (ambiguity) argumentExpressionList+=ArgumentExpressionList
	 *     expr+=PrimaryExpression LEFTPAREN (ambiguity) argumentExpressionList+=ArgumentExpressionList
	 *     id+=ID LEFTPAREN (ambiguity) argumentExpressionList+=ArgumentExpressionList
	 *     minusminus+=MINUSMINUS LEFTPAREN (ambiguity) argumentExpressionList+=ArgumentExpressionList
	 *     plusplus+=PLUSPLUS LEFTPAREN (ambiguity) argumentExpressionList+=ArgumentExpressionList
	 */
	protected void emit_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (RIGHTPAREN LEFTPAREN)+
	 *
	 * This ambiguous syntax occurs at:
	 *     argumentExpressionList+=ArgumentExpressionList (ambiguity) argumentExpressionList+=ArgumentExpressionList
	 */
	protected void emit_PostfixExpression___RIGHTPARENTerminalRuleCall_1_1_1_2_LEFTPARENTerminalRuleCall_1_1_1_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
