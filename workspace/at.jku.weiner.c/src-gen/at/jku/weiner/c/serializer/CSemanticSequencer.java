/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.serializer;

import at.jku.weiner.c.c.AdditiveExpression;
import at.jku.weiner.c.c.AndExpression;
import at.jku.weiner.c.c.AssignmentExpression;
import at.jku.weiner.c.c.AssignmentOperator;
import at.jku.weiner.c.c.BlockList;
import at.jku.weiner.c.c.BodyStatement;
import at.jku.weiner.c.c.CPackage;
import at.jku.weiner.c.c.CastExpression;
import at.jku.weiner.c.c.CompoundStatement;
import at.jku.weiner.c.c.ConditionalExpression;
import at.jku.weiner.c.c.Constant;
import at.jku.weiner.c.c.Declaration;
import at.jku.weiner.c.c.DeclarationSpecifiers;
import at.jku.weiner.c.c.Declarator;
import at.jku.weiner.c.c.DeclaratorSuffix;
import at.jku.weiner.c.c.DirectDeclarator;
import at.jku.weiner.c.c.DirectDeclaratorLastSuffix;
import at.jku.weiner.c.c.EqualityExpression;
import at.jku.weiner.c.c.ExclusiveOrExpression;
import at.jku.weiner.c.c.Expression;
import at.jku.weiner.c.c.ExpressionStatement;
import at.jku.weiner.c.c.ExternalDeclaration;
import at.jku.weiner.c.c.FunctionDefHead;
import at.jku.weiner.c.c.FunctionDefinition;
import at.jku.weiner.c.c.IdentifierList;
import at.jku.weiner.c.c.InclusiveOrExpression;
import at.jku.weiner.c.c.InitDeclarator;
import at.jku.weiner.c.c.InitDeclaratorList;
import at.jku.weiner.c.c.Initializer;
import at.jku.weiner.c.c.JumpStatement;
import at.jku.weiner.c.c.LogicalAndExpression;
import at.jku.weiner.c.c.LogicalOrExpression;
import at.jku.weiner.c.c.Model;
import at.jku.weiner.c.c.MultiplicativeExpression;
import at.jku.weiner.c.c.MyIdentifier;
import at.jku.weiner.c.c.ParameterDeclaration;
import at.jku.weiner.c.c.ParameterList;
import at.jku.weiner.c.c.ParameterTypeList;
import at.jku.weiner.c.c.PostfixExpression;
import at.jku.weiner.c.c.PrimaryExpression;
import at.jku.weiner.c.c.RelationalExpression;
import at.jku.weiner.c.c.ShiftExpression;
import at.jku.weiner.c.c.SpecifierQualifierList;
import at.jku.weiner.c.c.Statement;
import at.jku.weiner.c.c.StorageClassSpecifier;
import at.jku.weiner.c.c.TranslationUnit;
import at.jku.weiner.c.c.TypeName;
import at.jku.weiner.c.c.TypeQualifier;
import at.jku.weiner.c.c.TypeSpecifier;
import at.jku.weiner.c.c.TypedefName;
import at.jku.weiner.c.c.UnaryExpression;
import at.jku.weiner.c.c.UnaryOperator;
import at.jku.weiner.c.services.CGrammarAccess;
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
public class CSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CPackage.ADDITIVE_EXPRESSION:
				sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
				return; 
			case CPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case CPackage.ASSIGNMENT_EXPRESSION:
				sequence_AssignmentExpression(context, (AssignmentExpression) semanticObject); 
				return; 
			case CPackage.ASSIGNMENT_OPERATOR:
				sequence_AssignmentOperator(context, (AssignmentOperator) semanticObject); 
				return; 
			case CPackage.BLOCK_LIST:
				sequence_BlockList(context, (BlockList) semanticObject); 
				return; 
			case CPackage.BODY_STATEMENT:
				sequence_BodyStatement(context, (BodyStatement) semanticObject); 
				return; 
			case CPackage.CAST_EXPRESSION:
				sequence_CastExpression(context, (CastExpression) semanticObject); 
				return; 
			case CPackage.COMPOUND_STATEMENT:
				sequence_CompoundStatement(context, (CompoundStatement) semanticObject); 
				return; 
			case CPackage.CONDITIONAL_EXPRESSION:
				sequence_ConditionalExpression(context, (ConditionalExpression) semanticObject); 
				return; 
			case CPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case CPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case CPackage.DECLARATION_SPECIFIERS:
				sequence_DeclarationSpecifiers(context, (DeclarationSpecifiers) semanticObject); 
				return; 
			case CPackage.DECLARATOR:
				sequence_Declarator(context, (Declarator) semanticObject); 
				return; 
			case CPackage.DECLARATOR_SUFFIX:
				sequence_DeclaratorSuffix(context, (DeclaratorSuffix) semanticObject); 
				return; 
			case CPackage.DIRECT_DECLARATOR:
				sequence_DirectDeclarator(context, (DirectDeclarator) semanticObject); 
				return; 
			case CPackage.DIRECT_DECLARATOR_LAST_SUFFIX:
				sequence_DirectDeclaratorLastSuffix(context, (DirectDeclaratorLastSuffix) semanticObject); 
				return; 
			case CPackage.EQUALITY_EXPRESSION:
				sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
				return; 
			case CPackage.EXCLUSIVE_OR_EXPRESSION:
				sequence_ExclusiveOrExpression(context, (ExclusiveOrExpression) semanticObject); 
				return; 
			case CPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case CPackage.EXPRESSION_STATEMENT:
				sequence_ExpressionStatement(context, (ExpressionStatement) semanticObject); 
				return; 
			case CPackage.EXTERNAL_DECLARATION:
				sequence_ExternalDeclaration(context, (ExternalDeclaration) semanticObject); 
				return; 
			case CPackage.FUNCTION_DEF_HEAD:
				sequence_FunctionDefHead(context, (FunctionDefHead) semanticObject); 
				return; 
			case CPackage.FUNCTION_DEFINITION:
				sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
				return; 
			case CPackage.IDENTIFIER_LIST:
				sequence_IdentifierList(context, (IdentifierList) semanticObject); 
				return; 
			case CPackage.INCLUSIVE_OR_EXPRESSION:
				sequence_InclusiveOrExpression(context, (InclusiveOrExpression) semanticObject); 
				return; 
			case CPackage.INIT_DECLARATOR:
				sequence_InitDeclarator(context, (InitDeclarator) semanticObject); 
				return; 
			case CPackage.INIT_DECLARATOR_LIST:
				sequence_InitDeclaratorList(context, (InitDeclaratorList) semanticObject); 
				return; 
			case CPackage.INITIALIZER:
				sequence_Initializer(context, (Initializer) semanticObject); 
				return; 
			case CPackage.JUMP_STATEMENT:
				sequence_JumpStatement(context, (JumpStatement) semanticObject); 
				return; 
			case CPackage.LOGICAL_AND_EXPRESSION:
				sequence_LogicalAndExpression(context, (LogicalAndExpression) semanticObject); 
				return; 
			case CPackage.LOGICAL_OR_EXPRESSION:
				sequence_LogicalOrExpression(context, (LogicalOrExpression) semanticObject); 
				return; 
			case CPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case CPackage.MULTIPLICATIVE_EXPRESSION:
				sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
				return; 
			case CPackage.MY_IDENTIFIER:
				sequence_MyIdentifier(context, (MyIdentifier) semanticObject); 
				return; 
			case CPackage.PARAMETER_DECLARATION:
				sequence_ParameterDeclaration(context, (ParameterDeclaration) semanticObject); 
				return; 
			case CPackage.PARAMETER_LIST:
				sequence_ParameterList(context, (ParameterList) semanticObject); 
				return; 
			case CPackage.PARAMETER_TYPE_LIST:
				sequence_ParameterTypeList(context, (ParameterTypeList) semanticObject); 
				return; 
			case CPackage.POSTFIX_EXPRESSION:
				sequence_PostfixExpression(context, (PostfixExpression) semanticObject); 
				return; 
			case CPackage.PRIMARY_EXPRESSION:
				sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
				return; 
			case CPackage.RELATIONAL_EXPRESSION:
				sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
				return; 
			case CPackage.SHIFT_EXPRESSION:
				sequence_ShiftExpression(context, (ShiftExpression) semanticObject); 
				return; 
			case CPackage.SPECIFIER_QUALIFIER_LIST:
				sequence_SpecifierQualifierList(context, (SpecifierQualifierList) semanticObject); 
				return; 
			case CPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case CPackage.STORAGE_CLASS_SPECIFIER:
				sequence_StorageClassSpecifier(context, (StorageClassSpecifier) semanticObject); 
				return; 
			case CPackage.TRANSLATION_UNIT:
				sequence_TranslationUnit(context, (TranslationUnit) semanticObject); 
				return; 
			case CPackage.TYPE_NAME:
				sequence_TypeName(context, (TypeName) semanticObject); 
				return; 
			case CPackage.TYPE_QUALIFIER:
				sequence_TypeQualifier(context, (TypeQualifier) semanticObject); 
				return; 
			case CPackage.TYPE_SPECIFIER:
				sequence_TypeSpecifier(context, (TypeSpecifier) semanticObject); 
				return; 
			case CPackage.TYPEDEF_NAME:
				sequence_TypedefName(context, (TypedefName) semanticObject); 
				return; 
			case CPackage.UNARY_EXPRESSION:
				sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
				return; 
			case CPackage.UNARY_OPERATOR:
				sequence_UnaryOperator(context, (UnaryOperator) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (expr+=MultiplicativeExpression ((op+=PLUS | op+=MINUS) expr+=MultiplicativeExpression)*)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=EqualityExpression expr+=EqualityExpression*)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ConditionalExpression | (expr=UnaryExpression op=AssignmentOperator assignmentExpr+=AssignmentExpression))
	 */
	protected void sequence_AssignmentExpression(EObject context, AssignmentExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     op=ASSIGN
	 */
	protected void sequence_AssignmentOperator(EObject context, AssignmentOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.ASSIGNMENT_OPERATOR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.ASSIGNMENT_OPERATOR__OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentOperatorAccess().getOpASSIGNTerminalRuleCall_0_1_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declaration+=Declaration | statement+=Statement)+
	 */
	protected void sequence_BlockList(EObject context, BlockList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (blockList+=BlockList?)
	 */
	protected void sequence_BodyStatement(EObject context, BodyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=UnaryExpression | (type=TypeName expr=CastExpression))
	 */
	protected void sequence_CastExpression(EObject context, CastExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     body=BodyStatement
	 */
	protected void sequence_CompoundStatement(EObject context, CompoundStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=LogicalOrExpression (qExpr=Expression cExpr=ConditionalExpression)?)
	 */
	protected void sequence_ConditionalExpression(EObject context, ConditionalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     hex=HEX_LITERAL
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarationSpecifier+=StorageClassSpecifier | declarationSpecifier+=TypeSpecifier | declarationSpecifier+=TypeQualifier)+
	 */
	protected void sequence_DeclarationSpecifiers(EObject context, DeclarationSpecifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (specifiers=DeclarationSpecifiers initDeclaratorList+=InitDeclaratorList? semi=SEMI)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lastSuffix=DirectDeclaratorLastSuffix
	 */
	protected void sequence_DeclaratorSuffix(EObject context, DeclaratorSuffix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.DECLARATOR_SUFFIX__LAST_SUFFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.DECLARATOR_SUFFIX__LAST_SUFFIX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclaratorSuffixAccess().getLastSuffixDirectDeclaratorLastSuffixParserRuleCall_1_0(), semanticObject.getLastSuffix());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     declarator=DirectDeclarator
	 */
	protected void sequence_Declarator(EObject context, Declarator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.DECLARATOR__DECLARATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.DECLARATOR__DECLARATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclaratorAccess().getDeclaratorDirectDeclaratorParserRuleCall_1_0(), semanticObject.getDeclarator());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameterTypeList+=ParameterTypeList | identifierList=IdentifierList?)
	 */
	protected void sequence_DirectDeclaratorLastSuffix(EObject context, DirectDeclaratorLastSuffix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((id=ID | declarator=Declarator) declaratorSuffix+=DeclaratorSuffix*)
	 */
	protected void sequence_DirectDeclarator(EObject context, DirectDeclarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=RelationalExpression ((op+=EQUAL | op+=NOTEQUAL) expr+=RelationalExpression)*)
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=AndExpression expr+=AndExpression*)
	 */
	protected void sequence_ExclusiveOrExpression(EObject context, ExclusiveOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression? semi=SEMI)
	 */
	protected void sequence_ExpressionStatement(EObject context, ExpressionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exprExpr+=AssignmentExpression exprExpr+=AssignmentExpression*)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((functiondefHead=FunctionDefHead functionDefinition=FunctionDefinition) | declaration=Declaration | semi=SEMI)
	 */
	protected void sequence_ExternalDeclaration(EObject context, ExternalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (funDeclSpecifiers=DeclarationSpecifiers? funDeclarator=Declarator funDeclaration+=Declaration*)
	 */
	protected void sequence_FunctionDefHead(EObject context, FunctionDefHead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     body=BodyStatement
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.FUNCTION_DEFINITION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.FUNCTION_DEFINITION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionDefinitionAccess().getBodyBodyStatementParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id+=MyIdentifier id+=MyIdentifier*)
	 */
	protected void sequence_IdentifierList(EObject context, IdentifierList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=ExclusiveOrExpression expr+=ExclusiveOrExpression*)
	 */
	protected void sequence_InclusiveOrExpression(EObject context, InclusiveOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initDeclarator+=InitDeclarator initDeclarator2+=InitDeclarator*)
	 */
	protected void sequence_InitDeclaratorList(EObject context, InitDeclaratorList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarator=Declarator initializer=Initializer?)
	 */
	protected void sequence_InitDeclarator(EObject context, InitDeclarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=AssignmentExpression
	 */
	protected void sequence_Initializer(EObject context, Initializer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.INITIALIZER__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.INITIALIZER__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInitializerAccess().getExprAssignmentExpressionParserRuleCall_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression? semi=SEMI)
	 */
	protected void sequence_JumpStatement(EObject context, JumpStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=InclusiveOrExpression expr+=InclusiveOrExpression*)
	 */
	protected void sequence_LogicalAndExpression(EObject context, LogicalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=LogicalAndExpression expr+=LogicalAndExpression*)
	 */
	protected void sequence_LogicalOrExpression(EObject context, LogicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unit+=TranslationUnit?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=CastExpression ((op+=STAR | op+=DIV | op+=MOD) expr+=CastExpression)*)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_MyIdentifier(EObject context, MyIdentifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.MY_IDENTIFIER__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.MY_IDENTIFIER__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyIdentifierAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declSpecifiers=DeclarationSpecifiers declarator=Declarator?)
	 */
	protected void sequence_ParameterDeclaration(EObject context, ParameterDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameterDeclaration+=ParameterDeclaration parameterDeclaration+=ParameterDeclaration*)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list=ParameterList
	 */
	protected void sequence_ParameterTypeList(EObject context, ParameterTypeList semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.PARAMETER_TYPE_LIST__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.PARAMETER_TYPE_LIST__LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterTypeListAccess().getListParameterListParserRuleCall_1_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr+=PrimaryExpression
	 */
	protected void sequence_PostfixExpression(EObject context, PostfixExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID | const=Constant | expr=Expression)
	 */
	protected void sequence_PrimaryExpression(EObject context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=ShiftExpression ((op+=LESS | op+=GREATER | op+=LESSEQUAL | op+=GREATEREQUAL) expr+=ShiftExpression)*)
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=AdditiveExpression ((op+=LEFTSHIFT | op+=RIGHTSHIFT) expr+=AdditiveExpression)*)
	 */
	protected void sequence_ShiftExpression(EObject context, ShiftExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeSpecifier+=TypeSpecifier | typeQualifier+=TypeQualifier)+
	 */
	protected void sequence_SpecifierQualifierList(EObject context, SpecifierQualifierList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stmt=CompoundStatement | stmt=ExpressionStatement | stmt=JumpStatement)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         class=KW_TYPEDEF | 
	 *         class=KW_EXTERN | 
	 *         class=KW_STATIC | 
	 *         class=KW_THREADLOCAL | 
	 *         class=KW_AUTO | 
	 *         class=KW_REGISTER
	 *     )
	 */
	protected void sequence_StorageClassSpecifier(EObject context, StorageClassSpecifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     external+=ExternalDeclaration+
	 */
	protected void sequence_TranslationUnit(EObject context, TranslationUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list=SpecifierQualifierList
	 */
	protected void sequence_TypeName(EObject context, TypeName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.TYPE_NAME__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.TYPE_NAME__LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeNameAccess().getListSpecifierQualifierListParserRuleCall_1_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=KW_CONST | type=KW_RESTRICT | type=KW_VOLATILE | type=KW_ATOMIC)
	 */
	protected void sequence_TypeQualifier(EObject context, TypeQualifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=KW_VOID
	 */
	protected void sequence_TypeSpecifier(EObject context, TypeSpecifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_TypedefName(EObject context, TypedefName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CPackage.Literals.TYPEDEF_NAME__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.TYPEDEF_NAME__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedefNameAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((expr=PostfixExpression | (op=UnaryOperator expr=CastExpression))?)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         op=AND | 
	 *         op=STAR | 
	 *         op=PLUS | 
	 *         op=MINUS | 
	 *         op=TILDE | 
	 *         op=NOT
	 *     )
	 */
	protected void sequence_UnaryOperator(EObject context, UnaryOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
