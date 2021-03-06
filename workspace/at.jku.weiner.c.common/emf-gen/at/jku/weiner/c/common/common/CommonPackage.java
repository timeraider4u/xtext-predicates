/**
 */
package at.jku.weiner.c.common.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.jku.weiner.c.common.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.jku.at/weiner/c/common/Common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = at.jku.weiner.c.common.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ModelImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__UNITS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.TranslationUnitImpl <em>Translation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.TranslationUnitImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getTranslationUnit()
	 * @generated
	 */
	int TRANSLATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Preprocess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__PREPROCESS = 0;

	/**
	 * The feature id for the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__PARSER = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__PATH = 2;

	/**
	 * The feature id for the '<em><b>Additional Preprocessing Directives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT__ADDITIONAL_PREPROCESSING_DIRECTIVES = 3;

	/**
	 * The number of structural features of the '<em>Translation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_UNIT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.PreprocessImpl <em>Preprocess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.PreprocessImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPreprocess()
	 * @generated
	 */
	int PREPROCESS = 2;

	/**
	 * The number of structural features of the '<em>Preprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ParserImpl <em>Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ParserImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getParser()
	 * @generated
	 */
	int PARSER = 3;

	/**
	 * The number of structural features of the '<em>Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixImpl <em>Postfix Expression Suffix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPostfixExpressionSuffix()
	 * @generated
	 */
	int POSTFIX_EXPRESSION_SUFFIX = 5;

	/**
	 * The number of structural features of the '<em>Postfix Expression Suffix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_SUFFIX_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ArgumentExpressionListImpl <em>Argument Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ArgumentExpressionListImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getArgumentExpressionList()
	 * @generated
	 */
	int ARGUMENT_EXPRESSION_LIST = 6;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_EXPRESSION_LIST__EXPR = 0;

	/**
	 * The number of structural features of the '<em>Argument Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_EXPRESSION_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.Constant2Impl <em>Constant2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.Constant2Impl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConstant2()
	 * @generated
	 */
	int CONSTANT2 = 7;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2__HEX = 0;

	/**
	 * The feature id for the '<em><b>Oct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2__OCT = 1;

	/**
	 * The feature id for the '<em><b>Dec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2__DEC = 2;

	/**
	 * The feature id for the '<em><b>Ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2__CH = 3;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2__STR = 4;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2__FLOAT = 5;

	/**
	 * The feature id for the '<em><b>Bin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2__BIN = 6;

	/**
	 * The number of structural features of the '<em>Constant2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT2_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ConstantExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConstantExpression()
	 * @generated
	 */
	int CONSTANT_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ConditionalExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QExpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__QEXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CExpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CEXPR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.LogicalOrExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getLogicalOrExpression()
	 * @generated
	 */
	int LOGICAL_OR_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.LogicalAndExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getLogicalAndExpression()
	 * @generated
	 */
	int LOGICAL_AND_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_AND_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_AND_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.InclusiveOrExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getInclusiveOrExpression()
	 * @generated
	 */
	int INCLUSIVE_OR_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inclusive Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ExclusiveOrExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getExclusiveOrExpression()
	 * @generated
	 */
	int EXCLUSIVE_OR_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.AndExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.EqualityExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getEqualityExpression()
	 * @generated
	 */
	int EQUALITY_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.RelationalExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.ShiftExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getShiftExpression()
	 * @generated
	 */
	int SHIFT_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shift Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.AdditiveExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getAdditiveExpression()
	 * @generated
	 */
	int ADDITIVE_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.MultiplicativeExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getMultiplicativeExpression()
	 * @generated
	 */
	int MULTIPLICATIVE_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.CastExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 20;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.UnaryExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.PostfixExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPostfixExpression()
	 * @generated
	 */
	int POSTFIX_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__SUFFIX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixArgumentImpl <em>Postfix Expression Suffix Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixArgumentImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPostfixExpressionSuffixArgument()
	 * @generated
	 */
	int POSTFIX_EXPRESSION_SUFFIX_ARGUMENT = 23;

	/**
	 * The feature id for the '<em><b>Argument Expression List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_SUFFIX_ARGUMENT__ARGUMENT_EXPRESSION_LIST = POSTFIX_EXPRESSION_SUFFIX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postfix Expression Suffix Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_SUFFIX_ARGUMENT_FEATURE_COUNT = POSTFIX_EXPRESSION_SUFFIX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.PrimaryExpressionImpl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPrimaryExpression()
	 * @generated
	 */
	int PRIMARY_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__CONST = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__IDENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parentheses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__PARENTHESES = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Primary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link at.jku.weiner.c.common.common.impl.Constant1Impl <em>Constant1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.weiner.c.common.common.impl.Constant1Impl
	 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConstant1()
	 * @generated
	 */
	int CONSTANT1 = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT1__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT1_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see at.jku.weiner.c.common.common.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.weiner.c.common.common.Model#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see at.jku.weiner.c.common.common.Model#getUnits()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Units();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.TranslationUnit <em>Translation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Unit</em>'.
	 * @see at.jku.weiner.c.common.common.TranslationUnit
	 * @generated
	 */
	EClass getTranslationUnit();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.TranslationUnit#getPreprocess <em>Preprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preprocess</em>'.
	 * @see at.jku.weiner.c.common.common.TranslationUnit#getPreprocess()
	 * @see #getTranslationUnit()
	 * @generated
	 */
	EReference getTranslationUnit_Preprocess();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.TranslationUnit#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parser</em>'.
	 * @see at.jku.weiner.c.common.common.TranslationUnit#getParser()
	 * @see #getTranslationUnit()
	 * @generated
	 */
	EReference getTranslationUnit_Parser();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.TranslationUnit#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see at.jku.weiner.c.common.common.TranslationUnit#getPath()
	 * @see #getTranslationUnit()
	 * @generated
	 */
	EAttribute getTranslationUnit_Path();

	/**
	 * Returns the meta object for the reference '{@link at.jku.weiner.c.common.common.TranslationUnit#getAdditionalPreprocessingDirectives <em>Additional Preprocessing Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additional Preprocessing Directives</em>'.
	 * @see at.jku.weiner.c.common.common.TranslationUnit#getAdditionalPreprocessingDirectives()
	 * @see #getTranslationUnit()
	 * @generated
	 */
	EReference getTranslationUnit_AdditionalPreprocessingDirectives();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.Preprocess <em>Preprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocess</em>'.
	 * @see at.jku.weiner.c.common.common.Preprocess
	 * @generated
	 */
	EClass getPreprocess();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.Parser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser</em>'.
	 * @see at.jku.weiner.c.common.common.Parser
	 * @generated
	 */
	EClass getParser();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see at.jku.weiner.c.common.common.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.PostfixExpressionSuffix <em>Postfix Expression Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Expression Suffix</em>'.
	 * @see at.jku.weiner.c.common.common.PostfixExpressionSuffix
	 * @generated
	 */
	EClass getPostfixExpressionSuffix();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.ArgumentExpressionList <em>Argument Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Expression List</em>'.
	 * @see at.jku.weiner.c.common.common.ArgumentExpressionList
	 * @generated
	 */
	EClass getArgumentExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.weiner.c.common.common.ArgumentExpressionList#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expr</em>'.
	 * @see at.jku.weiner.c.common.common.ArgumentExpressionList#getExpr()
	 * @see #getArgumentExpressionList()
	 * @generated
	 */
	EReference getArgumentExpressionList_Expr();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.Constant2 <em>Constant2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant2</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2
	 * @generated
	 */
	EClass getConstant2();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant2#getHex <em>Hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hex</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2#getHex()
	 * @see #getConstant2()
	 * @generated
	 */
	EAttribute getConstant2_Hex();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant2#getOct <em>Oct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oct</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2#getOct()
	 * @see #getConstant2()
	 * @generated
	 */
	EAttribute getConstant2_Oct();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant2#getDec <em>Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dec</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2#getDec()
	 * @see #getConstant2()
	 * @generated
	 */
	EAttribute getConstant2_Dec();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant2#getCh <em>Ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ch</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2#getCh()
	 * @see #getConstant2()
	 * @generated
	 */
	EAttribute getConstant2_Ch();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant2#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2#getStr()
	 * @see #getConstant2()
	 * @generated
	 */
	EAttribute getConstant2_Str();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant2#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2#getFloat()
	 * @see #getConstant2()
	 * @generated
	 */
	EAttribute getConstant2_Float();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant2#getBin <em>Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin</em>'.
	 * @see at.jku.weiner.c.common.common.Constant2#getBin()
	 * @see #getConstant2()
	 * @generated
	 */
	EAttribute getConstant2_Bin();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Expression</em>'.
	 * @see at.jku.weiner.c.common.common.ConstantExpression
	 * @generated
	 */
	EClass getConstantExpression();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see at.jku.weiner.c.common.common.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.ConditionalExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see at.jku.weiner.c.common.common.ConditionalExpression#getExpr()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.ConditionalExpression#getQExpr <em>QExpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>QExpr</em>'.
	 * @see at.jku.weiner.c.common.common.ConditionalExpression#getQExpr()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_QExpr();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.ConditionalExpression#getCExpr <em>CExpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CExpr</em>'.
	 * @see at.jku.weiner.c.common.common.ConditionalExpression#getCExpr()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_CExpr();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.LogicalOrExpression <em>Logical Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Or Expression</em>'.
	 * @see at.jku.weiner.c.common.common.LogicalOrExpression
	 * @generated
	 */
	EClass getLogicalOrExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.LogicalOrExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.LogicalOrExpression#getLeft()
	 * @see #getLogicalOrExpression()
	 * @generated
	 */
	EReference getLogicalOrExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.LogicalOrExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.LogicalOrExpression#getRight()
	 * @see #getLogicalOrExpression()
	 * @generated
	 */
	EReference getLogicalOrExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.LogicalAndExpression <em>Logical And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical And Expression</em>'.
	 * @see at.jku.weiner.c.common.common.LogicalAndExpression
	 * @generated
	 */
	EClass getLogicalAndExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.LogicalAndExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.LogicalAndExpression#getLeft()
	 * @see #getLogicalAndExpression()
	 * @generated
	 */
	EReference getLogicalAndExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.LogicalAndExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.LogicalAndExpression#getRight()
	 * @see #getLogicalAndExpression()
	 * @generated
	 */
	EReference getLogicalAndExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive Or Expression</em>'.
	 * @see at.jku.weiner.c.common.common.InclusiveOrExpression
	 * @generated
	 */
	EClass getInclusiveOrExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.InclusiveOrExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.InclusiveOrExpression#getLeft()
	 * @see #getInclusiveOrExpression()
	 * @generated
	 */
	EReference getInclusiveOrExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.InclusiveOrExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.InclusiveOrExpression#getRight()
	 * @see #getInclusiveOrExpression()
	 * @generated
	 */
	EReference getInclusiveOrExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Or Expression</em>'.
	 * @see at.jku.weiner.c.common.common.ExclusiveOrExpression
	 * @generated
	 */
	EClass getExclusiveOrExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.ExclusiveOrExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.ExclusiveOrExpression#getLeft()
	 * @see #getExclusiveOrExpression()
	 * @generated
	 */
	EReference getExclusiveOrExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.ExclusiveOrExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.ExclusiveOrExpression#getRight()
	 * @see #getExclusiveOrExpression()
	 * @generated
	 */
	EReference getExclusiveOrExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see at.jku.weiner.c.common.common.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.AndExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.AndExpression#getLeft()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.AndExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.AndExpression#getRight()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Expression</em>'.
	 * @see at.jku.weiner.c.common.common.EqualityExpression
	 * @generated
	 */
	EClass getEqualityExpression();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.EqualityExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see at.jku.weiner.c.common.common.EqualityExpression#getOp()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EAttribute getEqualityExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.EqualityExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.EqualityExpression#getLeft()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EReference getEqualityExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.EqualityExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.EqualityExpression#getRight()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EReference getEqualityExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see at.jku.weiner.c.common.common.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.RelationalExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see at.jku.weiner.c.common.common.RelationalExpression#getOp()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.RelationalExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.RelationalExpression#getLeft()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.RelationalExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.RelationalExpression#getRight()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Expression</em>'.
	 * @see at.jku.weiner.c.common.common.ShiftExpression
	 * @generated
	 */
	EClass getShiftExpression();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.ShiftExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see at.jku.weiner.c.common.common.ShiftExpression#getOp()
	 * @see #getShiftExpression()
	 * @generated
	 */
	EAttribute getShiftExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.ShiftExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.ShiftExpression#getLeft()
	 * @see #getShiftExpression()
	 * @generated
	 */
	EReference getShiftExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.ShiftExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.ShiftExpression#getRight()
	 * @see #getShiftExpression()
	 * @generated
	 */
	EReference getShiftExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Expression</em>'.
	 * @see at.jku.weiner.c.common.common.AdditiveExpression
	 * @generated
	 */
	EClass getAdditiveExpression();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.AdditiveExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see at.jku.weiner.c.common.common.AdditiveExpression#getOp()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EAttribute getAdditiveExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.AdditiveExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.AdditiveExpression#getLeft()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EReference getAdditiveExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.AdditiveExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.AdditiveExpression#getRight()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EReference getAdditiveExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Expression</em>'.
	 * @see at.jku.weiner.c.common.common.MultiplicativeExpression
	 * @generated
	 */
	EClass getMultiplicativeExpression();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.MultiplicativeExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see at.jku.weiner.c.common.common.MultiplicativeExpression#getOp()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EAttribute getMultiplicativeExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.MultiplicativeExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see at.jku.weiner.c.common.common.MultiplicativeExpression#getLeft()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EReference getMultiplicativeExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.MultiplicativeExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see at.jku.weiner.c.common.common.MultiplicativeExpression#getRight()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EReference getMultiplicativeExpression_Right();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see at.jku.weiner.c.common.common.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see at.jku.weiner.c.common.common.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.UnaryExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see at.jku.weiner.c.common.common.UnaryExpression#getExpr()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expr();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.UnaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see at.jku.weiner.c.common.common.UnaryExpression#getOp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Op();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.PostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Expression</em>'.
	 * @see at.jku.weiner.c.common.common.PostfixExpression
	 * @generated
	 */
	EClass getPostfixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.PostfixExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see at.jku.weiner.c.common.common.PostfixExpression#getExpr()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EReference getPostfixExpression_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.PostfixExpression#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see at.jku.weiner.c.common.common.PostfixExpression#getSuffix()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EReference getPostfixExpression_Suffix();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.PostfixExpressionSuffixArgument <em>Postfix Expression Suffix Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Expression Suffix Argument</em>'.
	 * @see at.jku.weiner.c.common.common.PostfixExpressionSuffixArgument
	 * @generated
	 */
	EClass getPostfixExpressionSuffixArgument();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.PostfixExpressionSuffixArgument#getArgumentExpressionList <em>Argument Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Expression List</em>'.
	 * @see at.jku.weiner.c.common.common.PostfixExpressionSuffixArgument#getArgumentExpressionList()
	 * @see #getPostfixExpressionSuffixArgument()
	 * @generated
	 */
	EReference getPostfixExpressionSuffixArgument_ArgumentExpressionList();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Expression</em>'.
	 * @see at.jku.weiner.c.common.common.PrimaryExpression
	 * @generated
	 */
	EClass getPrimaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.PrimaryExpression#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see at.jku.weiner.c.common.common.PrimaryExpression#getConst()
	 * @see #getPrimaryExpression()
	 * @generated
	 */
	EAttribute getPrimaryExpression_Const();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.PrimaryExpression#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident</em>'.
	 * @see at.jku.weiner.c.common.common.PrimaryExpression#getIdent()
	 * @see #getPrimaryExpression()
	 * @generated
	 */
	EAttribute getPrimaryExpression_Ident();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.weiner.c.common.common.PrimaryExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see at.jku.weiner.c.common.common.PrimaryExpression#getExpr()
	 * @see #getPrimaryExpression()
	 * @generated
	 */
	EReference getPrimaryExpression_Expr();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.PrimaryExpression#isParentheses <em>Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parentheses</em>'.
	 * @see at.jku.weiner.c.common.common.PrimaryExpression#isParentheses()
	 * @see #getPrimaryExpression()
	 * @generated
	 */
	EAttribute getPrimaryExpression_Parentheses();

	/**
	 * Returns the meta object for class '{@link at.jku.weiner.c.common.common.Constant1 <em>Constant1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant1</em>'.
	 * @see at.jku.weiner.c.common.common.Constant1
	 * @generated
	 */
	EClass getConstant1();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.weiner.c.common.common.Constant1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.jku.weiner.c.common.common.Constant1#getValue()
	 * @see #getConstant1()
	 * @generated
	 */
	EAttribute getConstant1_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ModelImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__UNITS = eINSTANCE.getModel_Units();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.TranslationUnitImpl <em>Translation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.TranslationUnitImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getTranslationUnit()
		 * @generated
		 */
		EClass TRANSLATION_UNIT = eINSTANCE.getTranslationUnit();

		/**
		 * The meta object literal for the '<em><b>Preprocess</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_UNIT__PREPROCESS = eINSTANCE.getTranslationUnit_Preprocess();

		/**
		 * The meta object literal for the '<em><b>Parser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_UNIT__PARSER = eINSTANCE.getTranslationUnit_Parser();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION_UNIT__PATH = eINSTANCE.getTranslationUnit_Path();

		/**
		 * The meta object literal for the '<em><b>Additional Preprocessing Directives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_UNIT__ADDITIONAL_PREPROCESSING_DIRECTIVES = eINSTANCE.getTranslationUnit_AdditionalPreprocessingDirectives();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.PreprocessImpl <em>Preprocess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.PreprocessImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPreprocess()
		 * @generated
		 */
		EClass PREPROCESS = eINSTANCE.getPreprocess();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ParserImpl <em>Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ParserImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getParser()
		 * @generated
		 */
		EClass PARSER = eINSTANCE.getParser();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixImpl <em>Postfix Expression Suffix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPostfixExpressionSuffix()
		 * @generated
		 */
		EClass POSTFIX_EXPRESSION_SUFFIX = eINSTANCE.getPostfixExpressionSuffix();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ArgumentExpressionListImpl <em>Argument Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ArgumentExpressionListImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getArgumentExpressionList()
		 * @generated
		 */
		EClass ARGUMENT_EXPRESSION_LIST = eINSTANCE.getArgumentExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_EXPRESSION_LIST__EXPR = eINSTANCE.getArgumentExpressionList_Expr();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.Constant2Impl <em>Constant2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.Constant2Impl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConstant2()
		 * @generated
		 */
		EClass CONSTANT2 = eINSTANCE.getConstant2();

		/**
		 * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT2__HEX = eINSTANCE.getConstant2_Hex();

		/**
		 * The meta object literal for the '<em><b>Oct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT2__OCT = eINSTANCE.getConstant2_Oct();

		/**
		 * The meta object literal for the '<em><b>Dec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT2__DEC = eINSTANCE.getConstant2_Dec();

		/**
		 * The meta object literal for the '<em><b>Ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT2__CH = eINSTANCE.getConstant2_Ch();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT2__STR = eINSTANCE.getConstant2_Str();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT2__FLOAT = eINSTANCE.getConstant2_Float();

		/**
		 * The meta object literal for the '<em><b>Bin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT2__BIN = eINSTANCE.getConstant2_Bin();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ConstantExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConstantExpression()
		 * @generated
		 */
		EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ConditionalExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__EXPR = eINSTANCE.getConditionalExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>QExpr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__QEXPR = eINSTANCE.getConditionalExpression_QExpr();

		/**
		 * The meta object literal for the '<em><b>CExpr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__CEXPR = eINSTANCE.getConditionalExpression_CExpr();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.LogicalOrExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getLogicalOrExpression()
		 * @generated
		 */
		EClass LOGICAL_OR_EXPRESSION = eINSTANCE.getLogicalOrExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OR_EXPRESSION__LEFT = eINSTANCE.getLogicalOrExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OR_EXPRESSION__RIGHT = eINSTANCE.getLogicalOrExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.LogicalAndExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getLogicalAndExpression()
		 * @generated
		 */
		EClass LOGICAL_AND_EXPRESSION = eINSTANCE.getLogicalAndExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_AND_EXPRESSION__LEFT = eINSTANCE.getLogicalAndExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_AND_EXPRESSION__RIGHT = eINSTANCE.getLogicalAndExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.InclusiveOrExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getInclusiveOrExpression()
		 * @generated
		 */
		EClass INCLUSIVE_OR_EXPRESSION = eINSTANCE.getInclusiveOrExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSIVE_OR_EXPRESSION__LEFT = eINSTANCE.getInclusiveOrExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSIVE_OR_EXPRESSION__RIGHT = eINSTANCE.getInclusiveOrExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ExclusiveOrExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getExclusiveOrExpression()
		 * @generated
		 */
		EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusiveOrExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_OR_EXPRESSION__LEFT = eINSTANCE.getExclusiveOrExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_OR_EXPRESSION__RIGHT = eINSTANCE.getExclusiveOrExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.AndExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.EqualityExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getEqualityExpression()
		 * @generated
		 */
		EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY_EXPRESSION__OP = eINSTANCE.getEqualityExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY_EXPRESSION__LEFT = eINSTANCE.getEqualityExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY_EXPRESSION__RIGHT = eINSTANCE.getEqualityExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.RelationalExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OP = eINSTANCE.getRelationalExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT = eINSTANCE.getRelationalExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT = eINSTANCE.getRelationalExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.ShiftExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getShiftExpression()
		 * @generated
		 */
		EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT_EXPRESSION__OP = eINSTANCE.getShiftExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_EXPRESSION__LEFT = eINSTANCE.getShiftExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_EXPRESSION__RIGHT = eINSTANCE.getShiftExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.AdditiveExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getAdditiveExpression()
		 * @generated
		 */
		EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIVE_EXPRESSION__OP = eINSTANCE.getAdditiveExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_EXPRESSION__LEFT = eINSTANCE.getAdditiveExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_EXPRESSION__RIGHT = eINSTANCE.getAdditiveExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.MultiplicativeExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getMultiplicativeExpression()
		 * @generated
		 */
		EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICATIVE_EXPRESSION__OP = eINSTANCE.getMultiplicativeExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICATIVE_EXPRESSION__LEFT = eINSTANCE.getMultiplicativeExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICATIVE_EXPRESSION__RIGHT = eINSTANCE.getMultiplicativeExpression_Right();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.CastExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getCastExpression()
		 * @generated
		 */
		EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.UnaryExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getUnaryExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.PostfixExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPostfixExpression()
		 * @generated
		 */
		EClass POSTFIX_EXPRESSION = eINSTANCE.getPostfixExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTFIX_EXPRESSION__EXPR = eINSTANCE.getPostfixExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTFIX_EXPRESSION__SUFFIX = eINSTANCE.getPostfixExpression_Suffix();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixArgumentImpl <em>Postfix Expression Suffix Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.PostfixExpressionSuffixArgumentImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPostfixExpressionSuffixArgument()
		 * @generated
		 */
		EClass POSTFIX_EXPRESSION_SUFFIX_ARGUMENT = eINSTANCE.getPostfixExpressionSuffixArgument();

		/**
		 * The meta object literal for the '<em><b>Argument Expression List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTFIX_EXPRESSION_SUFFIX_ARGUMENT__ARGUMENT_EXPRESSION_LIST = eINSTANCE.getPostfixExpressionSuffixArgument_ArgumentExpressionList();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.PrimaryExpressionImpl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getPrimaryExpression()
		 * @generated
		 */
		EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_EXPRESSION__CONST = eINSTANCE.getPrimaryExpression_Const();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_EXPRESSION__IDENT = eINSTANCE.getPrimaryExpression_Ident();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_EXPRESSION__EXPR = eINSTANCE.getPrimaryExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Parentheses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_EXPRESSION__PARENTHESES = eINSTANCE.getPrimaryExpression_Parentheses();

		/**
		 * The meta object literal for the '{@link at.jku.weiner.c.common.common.impl.Constant1Impl <em>Constant1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.weiner.c.common.common.impl.Constant1Impl
		 * @see at.jku.weiner.c.common.common.impl.CommonPackageImpl#getConstant1()
		 * @generated
		 */
		EClass CONSTANT1 = eINSTANCE.getConstant1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT1__VALUE = eINSTANCE.getConstant1_Value();

	}

} //CommonPackage
