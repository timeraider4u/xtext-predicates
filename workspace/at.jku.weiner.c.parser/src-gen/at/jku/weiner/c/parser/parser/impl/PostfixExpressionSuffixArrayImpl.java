/**
 */
package at.jku.weiner.c.parser.parser.impl;

import at.jku.weiner.c.parser.parser.Expression;
import at.jku.weiner.c.parser.parser.ParserPackage;
import at.jku.weiner.c.parser.parser.PostfixExpressionSuffixArray;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postfix Expression Suffix Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.weiner.c.parser.parser.impl.PostfixExpressionSuffixArrayImpl#getArrayExpr <em>Array Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostfixExpressionSuffixArrayImpl extends PostfixExpressionSuffixImpl implements PostfixExpressionSuffixArray
{
  /**
   * The cached value of the '{@link #getArrayExpr() <em>Array Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayExpr()
   * @generated
   * @ordered
   */
  protected Expression arrayExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostfixExpressionSuffixArrayImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ParserPackage.Literals.POSTFIX_EXPRESSION_SUFFIX_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArrayExpr()
  {
    return arrayExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayExpr(Expression newArrayExpr, NotificationChain msgs)
  {
    Expression oldArrayExpr = arrayExpr;
    arrayExpr = newArrayExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR, oldArrayExpr, newArrayExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayExpr(Expression newArrayExpr)
  {
    if (newArrayExpr != arrayExpr)
    {
      NotificationChain msgs = null;
      if (arrayExpr != null)
        msgs = ((InternalEObject)arrayExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR, null, msgs);
      if (newArrayExpr != null)
        msgs = ((InternalEObject)newArrayExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR, null, msgs);
      msgs = basicSetArrayExpr(newArrayExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR, newArrayExpr, newArrayExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR:
        return basicSetArrayExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR:
        return getArrayExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR:
        setArrayExpr((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR:
        setArrayExpr((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ParserPackage.POSTFIX_EXPRESSION_SUFFIX_ARRAY__ARRAY_EXPR:
        return arrayExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //PostfixExpressionSuffixArrayImpl