/**
 */
package at.jku.weiner.c.c;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initializer List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.jku.weiner.c.c.InitializerList#getInitializer <em>Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.jku.weiner.c.c.CPackage#getInitializerList()
 * @model
 * @generated
 */
public interface InitializerList extends EObject
{
  /**
   * Returns the value of the '<em><b>Initializer</b></em>' containment reference list.
   * The list contents are of type {@link at.jku.weiner.c.c.Initializer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initializer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initializer</em>' containment reference list.
   * @see at.jku.weiner.c.c.CPackage#getInitializerList_Initializer()
   * @model containment="true"
   * @generated
   */
  EList<Initializer> getInitializer();

} // InitializerList
