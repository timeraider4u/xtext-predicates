/**
 */
package at.jku.weiner.c.c;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.jku.weiner.c.c.BlockList#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link at.jku.weiner.c.c.BlockList#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.jku.weiner.c.c.CPackage#getBlockList()
 * @model
 * @generated
 */
public interface BlockList extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
   * The list contents are of type {@link at.jku.weiner.c.c.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference list.
   * @see at.jku.weiner.c.c.CPackage#getBlockList_Declaration()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclaration();

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link at.jku.weiner.c.c.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see at.jku.weiner.c.c.CPackage#getBlockList_Statement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatement();

} // BlockList