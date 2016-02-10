/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.preprocess.serializer;

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
import at.jku.weiner.c.common.common.RelationalExpression;
import at.jku.weiner.c.common.common.ShiftExpression;
import at.jku.weiner.c.common.common.UnaryExpression;
import at.jku.weiner.c.common.serializer.CommonSemanticSequencer;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.ConditionalDirective;
import at.jku.weiner.c.preprocess.preprocess.DefineFunctionLikeMacro;
import at.jku.weiner.c.preprocess.preprocess.DefineObjectMacro;
import at.jku.weiner.c.preprocess.preprocess.ElIfConditional;
import at.jku.weiner.c.preprocess.preprocess.ElseConditional;
import at.jku.weiner.c.preprocess.preprocess.ErrorDirective;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt2;
import at.jku.weiner.c.preprocess.preprocess.IdentifierList;
import at.jku.weiner.c.preprocess.preprocess.IfConditional;
import at.jku.weiner.c.preprocess.preprocess.IfDefConditional;
import at.jku.weiner.c.preprocess.preprocess.IfNotDefConditional;
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective;
import at.jku.weiner.c.preprocess.preprocess.NewLineLine;
import at.jku.weiner.c.preprocess.preprocess.NullDirective;
import at.jku.weiner.c.preprocess.preprocess.PragmaDirective;
import at.jku.weiner.c.preprocess.preprocess.Preprocess;
import at.jku.weiner.c.preprocess.preprocess.PreprocessPackage;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.PrimaryExpression;
import at.jku.weiner.c.preprocess.preprocess.UnDefineDirective;
import at.jku.weiner.c.preprocess.preprocess.WarningDirective;
import at.jku.weiner.c.preprocess.services.PreprocessGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PreprocessSemanticSequencer extends CommonSemanticSequencer {

	@Inject
	private PreprocessGrammarAccess grammarAccess;
	
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
		else if(semanticObject.eClass().getEPackage() == PreprocessPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PreprocessPackage.CODE:
				sequence_Code(context, (Code) semanticObject); 
				return; 
			case PreprocessPackage.CONDITIONAL_DIRECTIVE:
				sequence_ConditionalDirective(context, (ConditionalDirective) semanticObject); 
				return; 
			case PreprocessPackage.DEFINE_FUNCTION_LIKE_MACRO:
				sequence_DefineFunctionLikeMacro(context, (DefineFunctionLikeMacro) semanticObject); 
				return; 
			case PreprocessPackage.DEFINE_OBJECT_MACRO:
				sequence_DefineObjectMacro(context, (DefineObjectMacro) semanticObject); 
				return; 
			case PreprocessPackage.EL_IF_CONDITIONAL:
				sequence_ElIfConditional(context, (ElIfConditional) semanticObject); 
				return; 
			case PreprocessPackage.ELSE_CONDITIONAL:
				sequence_ElseConditional(context, (ElseConditional) semanticObject); 
				return; 
			case PreprocessPackage.ERROR_DIRECTIVE:
				sequence_ErrorDirective(context, (ErrorDirective) semanticObject); 
				return; 
			case PreprocessPackage.GROUP_OPT:
				sequence_GroupOpt(context, (GroupOpt) semanticObject); 
				return; 
			case PreprocessPackage.GROUP_OPT2:
				sequence_GroupOpt2(context, (GroupOpt2) semanticObject); 
				return; 
			case PreprocessPackage.IDENTIFIER_LIST:
				sequence_IdentifierList(context, (IdentifierList) semanticObject); 
				return; 
			case PreprocessPackage.IF_CONDITIONAL:
				sequence_IfConditional(context, (IfConditional) semanticObject); 
				return; 
			case PreprocessPackage.IF_DEF_CONDITIONAL:
				sequence_IfDefConditional(context, (IfDefConditional) semanticObject); 
				return; 
			case PreprocessPackage.IF_NOT_DEF_CONDITIONAL:
				sequence_IfNotDefConditional(context, (IfNotDefConditional) semanticObject); 
				return; 
			case PreprocessPackage.INCLUDE_DIRECTIVE:
				sequence_IncludeDirective(context, (IncludeDirective) semanticObject); 
				return; 
			case PreprocessPackage.NEW_LINE_LINE:
				sequence_NewLineLine(context, (NewLineLine) semanticObject); 
				return; 
			case PreprocessPackage.NULL_DIRECTIVE:
				sequence_NullDirective(context, (NullDirective) semanticObject); 
				return; 
			case PreprocessPackage.PRAGMA_DIRECTIVE:
				sequence_PragmaDirective(context, (PragmaDirective) semanticObject); 
				return; 
			case PreprocessPackage.PREPROCESS:
				sequence_Preprocess(context, (Preprocess) semanticObject); 
				return; 
			case PreprocessPackage.PREPROCESSOR_DIRECTIVES:
				sequence_PreprocessorDirectives(context, (PreprocessorDirectives) semanticObject); 
				return; 
			case PreprocessPackage.PRIMARY_EXPRESSION:
				sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
				return; 
			case PreprocessPackage.UN_DEFINE_DIRECTIVE:
				sequence_UnDefineDirective(context, (UnDefineDirective) semanticObject); 
				return; 
			case PreprocessPackage.WARNING_DIRECTIVE:
				sequence_WarningDirective(context, (WarningDirective) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     code=MyCodeLineExtended
	 */
	protected void sequence_Code(EObject context, Code semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PreprocessPackage.Literals.CODE__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PreprocessPackage.Literals.CODE__CODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCodeAccess().getCodeMyCodeLineExtendedParserRuleCall_1_0(), semanticObject.getCode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((conditional=IfConditional | conditional=IfDefConditional | conditional=IfNotDefConditional) elifs+=ElIfConditional* else=ElseConditional?)
	 */
	protected void sequence_ConditionalDirective(EObject context, ConditionalDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=MyCode list=IdentifierList? string=MyDefineLineFunction?)
	 */
	protected void sequence_DefineFunctionLikeMacro(EObject context, DefineFunctionLikeMacro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=MyCode string=MyDefineLineObject?)
	 */
	protected void sequence_DefineObjectMacro(EObject context, DefineObjectMacro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression group=GroupOpt)
	 */
	protected void sequence_ElIfConditional(EObject context, ElIfConditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     group=GroupOpt
	 */
	protected void sequence_ElseConditional(EObject context, ElseConditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (msg=MyCodeLine?)
	 */
	protected void sequence_ErrorDirective(EObject context, ErrorDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lines+=GroupOptTemp1* lines+=GroupOptTemp2?)
	 */
	protected void sequence_GroupOpt2(EObject context, GroupOpt2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lines+=GroupOptTemp1*)
	 */
	protected void sequence_GroupOpt(EObject context, GroupOpt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((id+=ID id+=ID* (variadic?=Ellipsis | (varID=ID variadic?=Ellipsis))?) | (varID=ID? variadic?=Ellipsis))
	 */
	protected void sequence_IdentifierList(EObject context, IdentifierList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression group=GroupOpt)
	 */
	protected void sequence_IfConditional(EObject context, IfConditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID group=GroupOpt)
	 */
	protected void sequence_IfDefConditional(EObject context, IfDefConditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID group=GroupOpt)
	 */
	protected void sequence_IfNotDefConditional(EObject context, IfNotDefConditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (next?=INCLUDE_NEXT? string=MyCodeLine)
	 */
	protected void sequence_IncludeDirective(EObject context, IncludeDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NewLineLine}
	 */
	protected void sequence_NewLineLine(EObject context, NewLineLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullDirective}
	 */
	protected void sequence_NullDirective(EObject context, NullDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pragma=MyCodeLine?)
	 */
	protected void sequence_PragmaDirective(EObject context, PragmaDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     group=GroupOpt2
	 */
	protected void sequence_Preprocess(EObject context, Preprocess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PreprocessPackage.Literals.PREPROCESS__GROUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PreprocessPackage.Literals.PREPROCESS__GROUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPreprocessAccess().getGroupGroupOpt2ParserRuleCall_1_0(), semanticObject.getGroup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         directive=IncludeDirective | 
	 *         directive=DefineDirective | 
	 *         directive=ErrorDirective | 
	 *         directive=WarningDirective | 
	 *         directive=UnDefineDirective | 
	 *         directive=ConditionalDirective | 
	 *         directive=PragmaDirective | 
	 *         directive=NullDirective
	 *     )
	 */
	protected void sequence_PreprocessorDirectives(EObject context, PreprocessorDirectives semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((defined?=DEFINED? id=ID) | (defined?=DEFINED? id=ID) | const=Constant1 | (parentheses?=SKW_LEFTPAREN expr=Expression))
	 */
	protected void sequence_PrimaryExpression(EObject context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_UnDefineDirective(EObject context, UnDefineDirective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PreprocessPackage.Literals.UN_DEFINE_DIRECTIVE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PreprocessPackage.Literals.UN_DEFINE_DIRECTIVE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnDefineDirectiveAccess().getIdIDTerminalRuleCall_3_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (msg=MyCodeLine?)
	 */
	protected void sequence_WarningDirective(EObject context, WarningDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
