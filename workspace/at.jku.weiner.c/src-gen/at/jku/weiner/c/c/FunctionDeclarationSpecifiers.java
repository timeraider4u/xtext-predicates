/**
 */
package at.jku.weiner.c.c;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration Specifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.jku.weiner.c.c.FunctionDeclarationSpecifiers#getDeclarationSpecifier <em>Declaration Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.jku.weiner.c.c.CPackage#getFunctionDeclarationSpecifiers()
 * @model
 * @generated
 */
public interface FunctionDeclarationSpecifiers extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration Specifier</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration Specifier</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration Specifier</em>' containment reference list.
   * @see at.jku.weiner.c.c.CPackage#getFunctionDeclarationSpecifiers_DeclarationSpecifier()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getDeclarationSpecifier();

} // FunctionDeclarationSpecifiers
