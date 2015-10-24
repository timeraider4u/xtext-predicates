/**
 */
package at.jku.weiner.c.c;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.weiner.c.c.EnumSpecifier#getEnumList <em>Enum List</em>}</li>
 *   <li>{@link at.jku.weiner.c.c.EnumSpecifier#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see at.jku.weiner.c.c.CPackage#getEnumSpecifier()
 * @model
 * @generated
 */
public interface EnumSpecifier extends DeclarationSpecifier
{
  /**
   * Returns the value of the '<em><b>Enum List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum List</em>' containment reference.
   * @see #setEnumList(EnumeratorList)
   * @see at.jku.weiner.c.c.CPackage#getEnumSpecifier_EnumList()
   * @model containment="true"
   * @generated
   */
  EnumeratorList getEnumList();

  /**
   * Sets the value of the '{@link at.jku.weiner.c.c.EnumSpecifier#getEnumList <em>Enum List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum List</em>' containment reference.
   * @see #getEnumList()
   * @generated
   */
  void setEnumList(EnumeratorList value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see at.jku.weiner.c.c.CPackage#getEnumSpecifier_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link at.jku.weiner.c.c.EnumSpecifier#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // EnumSpecifier
