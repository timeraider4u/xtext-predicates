/**
 */
package at.jku.weiner.xtexttest.xtextTest.impl;

import at.jku.weiner.xtexttest.xtextTest.Tokens;
import at.jku.weiner.xtexttest.xtextTest.XtextTestPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tokens</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.jku.weiner.xtexttest.xtextTest.impl.TokensImpl#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokensImpl extends MinimalEObjectImpl.Container implements Tokens
{
  /**
   * The cached value of the '{@link #getTokens() <em>Tokens</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTokens()
   * @generated
   * @ordered
   */
  protected EList<String> tokens;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TokensImpl()
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
    return XtextTestPackage.Literals.TOKENS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTokens()
  {
    if (tokens == null)
    {
      tokens = new EDataTypeEList<String>(String.class, this, XtextTestPackage.TOKENS__TOKENS);
    }
    return tokens;
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
      case XtextTestPackage.TOKENS__TOKENS:
        return getTokens();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XtextTestPackage.TOKENS__TOKENS:
        getTokens().clear();
        getTokens().addAll((Collection<? extends String>)newValue);
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
      case XtextTestPackage.TOKENS__TOKENS:
        getTokens().clear();
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
      case XtextTestPackage.TOKENS__TOKENS:
        return tokens != null && !tokens.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tokens: ");
    result.append(tokens);
    result.append(')');
    return result.toString();
  }

} //TokensImpl
