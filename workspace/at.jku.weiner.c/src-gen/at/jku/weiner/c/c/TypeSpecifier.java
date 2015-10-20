/**
 */
package at.jku.weiner.c.c;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.jku.weiner.c.c.TypeSpecifier#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.weiner.c.c.TypeSpecifier#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.jku.weiner.c.c.CPackage#getTypeSpecifier()
 * @model
 * @generated
 */
public interface TypeSpecifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.jku.weiner.c.c.CPackage#getTypeSpecifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.jku.weiner.c.c.TypeSpecifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypedefName)
   * @see at.jku.weiner.c.c.CPackage#getTypeSpecifier_Type()
   * @model containment="true"
   * @generated
   */
  TypedefName getType();

  /**
   * Sets the value of the '{@link at.jku.weiner.c.c.TypeSpecifier#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypedefName value);

} // TypeSpecifier
