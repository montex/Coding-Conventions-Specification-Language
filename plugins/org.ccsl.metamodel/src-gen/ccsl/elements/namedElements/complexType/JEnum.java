/**
 */
package ccsl.elements.namedElements.complexType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.JEnum#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getJEnum()
 * @model
 * @generated
 */
public interface JEnum extends ConstructComplexTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Enum Constants</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.complexType.EnumConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Constants</em>' containment reference list.
	 * @see #isSetEnumConstants()
	 * @see #unsetEnumConstants()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getJEnum_EnumConstants()
	 * @model type="ccsl.elements.namedElements.complexType.EnumConstant" containment="true" unsettable="true"
	 * @generated
	 */
	EList getEnumConstants();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.JEnum#getEnumConstants <em>Enum Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnumConstants()
	 * @see #getEnumConstants()
	 * @generated
	 */
	void unsetEnumConstants();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.JEnum#getEnumConstants <em>Enum Constants</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enum Constants</em>' containment reference list is set.
	 * @see #unsetEnumConstants()
	 * @see #getEnumConstants()
	 * @generated
	 */
	boolean isSetEnumConstants();

} // JEnum
