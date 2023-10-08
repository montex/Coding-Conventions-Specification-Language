/**
 */
package ccsl.elements.namedElements.complexType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.ComplexTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getComplexTypeDeclaration()
 * @model
 * @generated
 */
public interface ComplexTypeDeclaration extends TypeDeclaration, ComplexType {
	/**
	 * Returns the value of the '<em><b>Super Interfaces</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.complexType.JInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Interfaces</em>' reference list.
	 * @see #isSetSuperInterfaces()
	 * @see #unsetSuperInterfaces()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getComplexTypeDeclaration_SuperInterfaces()
	 * @model type="ccsl.elements.namedElements.complexType.JInterface" unsettable="true"
	 * @generated
	 */
	EList getSuperInterfaces();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.ComplexTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuperInterfaces()
	 * @see #getSuperInterfaces()
	 * @generated
	 */
	void unsetSuperInterfaces();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.ComplexTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Super Interfaces</em>' reference list is set.
	 * @see #unsetSuperInterfaces()
	 * @see #getSuperInterfaces()
	 * @generated
	 */
	boolean isSetSuperInterfaces();

} // ComplexTypeDeclaration
