/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.common.serializer;

import at.jku.weiner.c.common.services.CommonGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CommonSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CommonGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CommonGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSKW_ANDRule())
			return getSKW_ANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_ANDANDRule())
			return getSKW_ANDANDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_CARETRule())
			return getSKW_CARETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_COLONRule())
			return getSKW_COLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSKW_COMMARule())
			return getSKW_COMMAToken(semanticObject, ruleCall, node);
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
		return "";
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}