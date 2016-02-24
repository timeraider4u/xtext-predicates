/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.common.serializer;

import at.jku.weiner.c.common.common.AdditiveExpression;
import at.jku.weiner.c.common.common.AndExpression;
import at.jku.weiner.c.common.common.ArgumentExpressionList;
import at.jku.weiner.c.common.common.CommonPackage;
import at.jku.weiner.c.common.common.ConditionalExpression;
import at.jku.weiner.c.common.common.Constant2;
import at.jku.weiner.c.common.common.EqualityExpression;
import at.jku.weiner.c.common.common.ExclusiveOrExpression;
import at.jku.weiner.c.common.common.InclusiveOrExpression;
import at.jku.weiner.c.common.common.LogicalAndExpression;
import at.jku.weiner.c.common.common.LogicalOrExpression;
import at.jku.weiner.c.common.common.MultiplicativeExpression;
import at.jku.weiner.c.common.common.PostfixExpression;
import at.jku.weiner.c.common.common.PostfixExpressionSuffixArgument;
import at.jku.weiner.c.common.common.PrimaryExpression;
import at.jku.weiner.c.common.common.RelationalExpression;
import at.jku.weiner.c.common.common.ShiftExpression;
import at.jku.weiner.c.common.common.UnaryExpression;
import at.jku.weiner.c.common.services.CommonGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CommonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CommonGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CommonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CommonPackage.ADDITIVE_EXPRESSION:
				sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
				return; 
			case CommonPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case CommonPackage.ARGUMENT_EXPRESSION_LIST:
				sequence_ArgumentExpressionList(context, (ArgumentExpressionList) semanticObject); 
				return; 
			case CommonPackage.CONDITIONAL_EXPRESSION:
				sequence_ConditionalExpression(context, (ConditionalExpression) semanticObject); 
				return; 
			case CommonPackage.CONSTANT2:
				sequence_Constant2(context, (Constant2) semanticObject); 
				return; 
			case CommonPackage.EQUALITY_EXPRESSION:
				sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
				return; 
			case CommonPackage.EXCLUSIVE_OR_EXPRESSION:
				sequence_ExclusiveOrExpression(context, (ExclusiveOrExpression) semanticObject); 
				return; 
			case CommonPackage.INCLUSIVE_OR_EXPRESSION:
				sequence_InclusiveOrExpression(context, (InclusiveOrExpression) semanticObject); 
				return; 
			case CommonPackage.LOGICAL_AND_EXPRESSION:
				sequence_LogicalAndExpression(context, (LogicalAndExpression) semanticObject); 
				return; 
			case CommonPackage.LOGICAL_OR_EXPRESSION:
				sequence_LogicalOrExpression(context, (LogicalOrExpression) semanticObject); 
				return; 
			case CommonPackage.MULTIPLICATIVE_EXPRESSION:
				sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
				return; 
			case CommonPackage.POSTFIX_EXPRESSION:
				sequence_PostfixExpression(context, (PostfixExpression) semanticObject); 
				return; 
			case CommonPackage.POSTFIX_EXPRESSION_SUFFIX_ARGUMENT:
				sequence_PostfixExpressionSuffixArgument(context, (PostfixExpressionSuffixArgument) semanticObject); 
				return; 
			case CommonPackage.PRIMARY_EXPRESSION:
				sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
				return; 
			case CommonPackage.RELATIONAL_EXPRESSION:
				sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
				return; 
			case CommonPackage.SHIFT_EXPRESSION:
				sequence_ShiftExpression(context, (ShiftExpression) semanticObject); 
				return; 
			case CommonPackage.UNARY_EXPRESSION:
				sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AdditiveExpression_AdditiveExpression_1_0 (op=SKW_PLUS | op=SKW_MINUS) right=MultiplicativeExpression)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndExpression_AndExpression_1_0 right=EqualityExpression)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.AND_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.AND_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.AND_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.AND_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=ConditionalExpression expr+=ConditionalExpression*)
	 */
	protected void sequence_ArgumentExpressionList(EObject context, ArgumentExpressionList semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ConditionalExpression_ConditionalExpression_1_0 qExpr=Expression cExpr=ConditionalExpression)
	 */
	protected void sequence_ConditionalExpression(EObject context, ConditionalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.CONDITIONAL_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.CONDITIONAL_EXPRESSION__EXPR));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.CONDITIONAL_EXPRESSION__QEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.CONDITIONAL_EXPRESSION__QEXPR));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.CONDITIONAL_EXPRESSION__CEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.CONDITIONAL_EXPRESSION__CEXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getConditionalExpressionExprAction_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getQExprExpressionParserRuleCall_1_2_0(), semanticObject.getQExpr());
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getCExprConditionalExpressionParserRuleCall_1_4_0(), semanticObject.getCExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         hex=HexLiteral | 
	 *         oct=OctalLiteral | 
	 *         dec=DecimalLiteral | 
	 *         ch=CharLiteral | 
	 *         float=FloatLiteral | 
	 *         bin=BinLiteral
	 *     )
	 */
	protected void sequence_Constant2(EObject context, Constant2 semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=EqualityExpression_EqualityExpression_1_0 (op=SKW_EQUAL | op=SKW_NOTEQUAL) right=RelationalExpression)
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExclusiveOrExpression_ExclusiveOrExpression_1_0 right=AndExpression)
	 */
	protected void sequence_ExclusiveOrExpression(EObject context, ExclusiveOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.EXCLUSIVE_OR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.EXCLUSIVE_OR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.EXCLUSIVE_OR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.EXCLUSIVE_OR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getExclusiveOrExpressionAccess().getExclusiveOrExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExclusiveOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=InclusiveOrExpression_InclusiveOrExpression_1_0 right=ExclusiveOrExpression)
	 */
	protected void sequence_InclusiveOrExpression(EObject context, InclusiveOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.INCLUSIVE_OR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.INCLUSIVE_OR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.INCLUSIVE_OR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.INCLUSIVE_OR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getInclusiveOrExpressionAccess().getInclusiveOrExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getInclusiveOrExpressionAccess().getRightExclusiveOrExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=LogicalAndExpression_LogicalAndExpression_1_0 right=InclusiveOrExpression)
	 */
	protected void sequence_LogicalAndExpression(EObject context, LogicalAndExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.LOGICAL_AND_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.LOGICAL_AND_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.LOGICAL_AND_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.LOGICAL_AND_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicalAndExpressionAccess().getRightInclusiveOrExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=LogicalOrExpression_LogicalOrExpression_1_0 right=LogicalAndExpression)
	 */
	protected void sequence_LogicalOrExpression(EObject context, LogicalOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.LOGICAL_OR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.LOGICAL_OR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.LOGICAL_OR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.LOGICAL_OR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicalOrExpressionAccess().getRightLogicalAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicativeExpression_MultiplicativeExpression_1_0 (op=SKW_STAR | op=SKW_DIV | op=SKW_MOD) right=CastExpression)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (argumentExpressionList=ArgumentExpressionList?)
	 */
	protected void sequence_PostfixExpressionSuffixArgument(EObject context, PostfixExpressionSuffixArgument semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=PostfixExpression_PostfixExpression_1_0 suffix=PostfixExpressionSuffixArgument)
	 */
	protected void sequence_PostfixExpression(EObject context, PostfixExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.POSTFIX_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.POSTFIX_EXPRESSION__EXPR));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.POSTFIX_EXPRESSION__SUFFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.POSTFIX_EXPRESSION__SUFFIX));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getPostfixExpressionAccess().getPostfixExpressionExprAction_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getPostfixExpressionAccess().getSuffixPostfixExpressionSuffixArgumentParserRuleCall_1_1_0(), semanticObject.getSuffix());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (const=Constant1 | ident=ID | (parentheses?=SKW_LEFTPAREN expr=Expression))
	 */
	protected void sequence_PrimaryExpression(EObject context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=RelationalExpression_RelationalExpression_1_0 
	 *         (op=SKW_LESS | op=SKW_GREATER | op=SKW_LESSEQUAL | op=SKW_GREATEREQUAL) 
	 *         right=ShiftExpression
	 *     )
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ShiftExpression_ShiftExpression_1_0 (op=SKW_LEFTSHIFT | op=SKW_RIGHTSHIFT) right=AdditiveExpression)
	 */
	protected void sequence_ShiftExpression(EObject context, ShiftExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=UnaryOperator expr=CastExpression)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.UNARY_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.UNARY_EXPRESSION__EXPR));
			if(transientValues.isValueTransient((EObject)semanticObject, CommonPackage.Literals.UNARY_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, CommonPackage.Literals.UNARY_EXPRESSION__OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getExprCastExpressionParserRuleCall_1_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
}
