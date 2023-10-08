/**
 */
package ccsl.elements.namedElements.complexType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.JClass#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends ConstructComplexTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #isSetSuperClass()
	 * @see #unsetSuperClass()
	 * @see #setSuperClass(JClass)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getJClass_SuperClass()
	 * @model unsettable="true"
	 * @generated
	 */
	JClass getSuperClass();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.JClass#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #isSetSuperClass()
	 * @see #unsetSuperClass()
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(JClass value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.JClass#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuperClass()
	 * @see #getSuperClass()
	 * @see #setSuperClass(JClass)
	 * @generated
	 */
	void unsetSuperClass();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.JClass#getSuperClass <em>Super Class</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Super Class</em>' reference is set.
	 * @see #unsetSuperClass()
	 * @see #getSuperClass()
	 * @see #setSuperClass(JClass)
	 * @generated
	 */
	boolean isSetSuperClass();

} // JClass
