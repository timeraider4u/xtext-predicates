/**
 */
package at.jku.weiner.cpreprocess.cPreprocess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.weiner.cpreprocess.cPreprocess.TranslationUnit#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see at.jku.weiner.cpreprocess.cPreprocess.CPreprocessPackage#getTranslationUnit()
 * @model
 * @generated
 */
public interface TranslationUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link at.jku.weiner.cpreprocess.cPreprocess.SourceCodeLine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see at.jku.weiner.cpreprocess.cPreprocess.CPreprocessPackage#getTranslationUnit_Lines()
   * @model containment="true"
   * @generated
   */
  EList<SourceCodeLine> getLines();

} // TranslationUnit