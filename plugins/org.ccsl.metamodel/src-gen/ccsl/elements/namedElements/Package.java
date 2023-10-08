/**
 */
package ccsl.elements.namedElements;

import ccsl.elements.statements.import_.ImportableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.Package#getDeclaredTypes <em>Declared Types</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.NamedElementsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement, ImportableElement {
	/**
	 * Returns the value of the '<em><b>Declared Types</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.complexType.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Types</em>' containment reference list.
	 * @see #isSetDeclaredTypes()
	 * @see #unsetDeclaredTypes()
	 * @see ccsl.elements.namedElements.NamedElementsPackage#getPackage_DeclaredTypes()
	 * @model type="ccsl.elements.namedElements.complexType.TypeDeclaration" containment="true" unsettable="true"
	 * @generated
	 */
	EList getDeclaredTypes();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.Package#getDeclaredTypes <em>Declared Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeclaredTypes()
	 * @see #getDeclaredTypes()
	 * @generated
	 */
	void unsetDeclaredTypes();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.Package#getDeclaredTypes <em>Declared Types</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Declared Types</em>' containment reference list is set.
	 * @see #unsetDeclaredTypes()
	 * @see #getDeclaredTypes()
	 * @generated
	 */
	boolean isSetDeclaredTypes();

} // Package
