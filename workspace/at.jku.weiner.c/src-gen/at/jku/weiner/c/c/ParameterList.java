/**
 */
package at.jku.weiner.c.c;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.jku.weiner.c.c.ParameterList#getParameterDeclaration <em>Parameter Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.jku.weiner.c.c.CPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Declaration</b></em>' containment reference list.
   * The list contents are of type {@link at.jku.weiner.c.c.ParameterDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Declaration</em>' containment reference list.
   * @see at.jku.weiner.c.c.CPackage#getParameterList_ParameterDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDeclaration> getParameterDeclaration();

} // ParameterList