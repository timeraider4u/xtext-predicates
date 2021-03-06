/**
 */
package at.jku.weiner.c.parser.parser;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.jku.weiner.c.parser.parser.Declarator#getPointer <em>Pointer</em>}</li>
 *   <li>{@link at.jku.weiner.c.parser.parser.Declarator#getGccDeclExt1 <em>Gcc Decl Ext1</em>}</li>
 *   <li>{@link at.jku.weiner.c.parser.parser.Declarator#getDeclarator <em>Declarator</em>}</li>
 *   <li>{@link at.jku.weiner.c.parser.parser.Declarator#getGccDeclExt2 <em>Gcc Decl Ext2</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.jku.weiner.c.parser.parser.ParserPackage#getDeclarator()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Declarator extends PersistentEObject
{
	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference.
	 * @see #setPointer(Pointer)
	 * @see at.jku.weiner.c.parser.parser.ParserPackage#getDeclarator_Pointer()
	 * @model containment="true"
	 * @generated
	 */
	Pointer getPointer();

	/**
	 * Sets the value of the '{@link at.jku.weiner.c.parser.parser.Declarator#getPointer <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' containment reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(Pointer value);

	/**
	 * Returns the value of the '<em><b>Gcc Decl Ext1</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.weiner.c.parser.parser.GccDeclaratorExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gcc Decl Ext1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gcc Decl Ext1</em>' containment reference list.
	 * @see at.jku.weiner.c.parser.parser.ParserPackage#getDeclarator_GccDeclExt1()
	 * @model containment="true"
	 * @generated
	 */
	EList<GccDeclaratorExtension> getGccDeclExt1();

	/**
	 * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator</em>' containment reference.
	 * @see #setDeclarator(DirectDeclarator)
	 * @see at.jku.weiner.c.parser.parser.ParserPackage#getDeclarator_Declarator()
	 * @model containment="true"
	 * @generated
	 */
	DirectDeclarator getDeclarator();

	/**
	 * Sets the value of the '{@link at.jku.weiner.c.parser.parser.Declarator#getDeclarator <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator</em>' containment reference.
	 * @see #getDeclarator()
	 * @generated
	 */
	void setDeclarator(DirectDeclarator value);

	/**
	 * Returns the value of the '<em><b>Gcc Decl Ext2</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.weiner.c.parser.parser.GccDeclaratorExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gcc Decl Ext2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gcc Decl Ext2</em>' containment reference list.
	 * @see at.jku.weiner.c.parser.parser.ParserPackage#getDeclarator_GccDeclExt2()
	 * @model containment="true"
	 * @generated
	 */
	EList<GccDeclaratorExtension> getGccDeclExt2();

} // Declarator
