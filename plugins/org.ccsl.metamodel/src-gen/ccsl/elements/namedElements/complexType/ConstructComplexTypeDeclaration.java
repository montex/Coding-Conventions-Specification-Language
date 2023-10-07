/**
 */
package ccsl.elements.namedElements.complexType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct Complex Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration#getConstructors <em>Constructors</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getConstructComplexTypeDeclaration()
 * @model
 * @generated
 */
public interface ConstructComplexTypeDeclaration extends ComplexTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.method.Constructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructors</em>' containment reference list.
	 * @see #isSetConstructors()
	 * @see #unsetConstructors()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getConstructComplexTypeDeclaration_Constructors()
	 * @model type="ccsl.elements.namedElements.method.Constructor" containment="true" unsettable="true"
	 * @generated
	 */
	EList getConstructors();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration#getConstructors <em>Constructors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstructors()
	 * @see #getConstructors()
	 * @generated
	 */
	void unsetConstructors();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration#getConstructors <em>Constructors</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constructors</em>' containment reference list is set.
	 * @see #unsetConstructors()
	 * @see #getConstructors()
	 * @generated
	 */
	boolean isSetConstructors();

} // ConstructComplexTypeDeclaration
