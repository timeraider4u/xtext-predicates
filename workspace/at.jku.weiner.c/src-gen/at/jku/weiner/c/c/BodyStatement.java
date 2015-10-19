/**
 */
package at.jku.weiner.c.c;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.jku.weiner.c.c.BodyStatement#getBlockList <em>Block List</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.jku.weiner.c.c.CPackage#getBodyStatement()
 * @model
 * @generated
 */
public interface BodyStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Block List</b></em>' containment reference list.
   * The list contents are of type {@link at.jku.weiner.c.c.BlockList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block List</em>' containment reference list.
   * @see at.jku.weiner.c.c.CPackage#getBodyStatement_BlockList()
   * @model containment="true"
   * @generated
   */
  EList<BlockList> getBlockList();

} // BodyStatement