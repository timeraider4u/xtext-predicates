/**
 */
package at.jku.weiner.c.parser.parser;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.weiner.c.parser.parser.IdentifierList#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see at.jku.weiner.c.parser.parser.ParserPackage#getIdentifierList()
 * @model
 * @generated
 */
public interface IdentifierList extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference list.
   * The list contents are of type {@link at.jku.weiner.c.parser.parser.MyIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference list.
   * @see at.jku.weiner.c.parser.parser.ParserPackage#getIdentifierList_Id()
   * @model containment="true"
   * @generated
   */
  EList<MyIdentifier> getId();

} // IdentifierList
