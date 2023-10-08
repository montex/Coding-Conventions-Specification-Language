/**
 */
package ccsl.elements.namedElements.complexType;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.AnonymousClass#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getAnonymousClass()
 * @model
 * @generated
 */
public interface AnonymousClass extends ComplexType, Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ObjectType)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getAnonymousClass_Type()
	 * @model unsettable="true"
	 * @generated
	 */
	ObjectType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.AnonymousClass#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ObjectType value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.AnonymousClass#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ObjectType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.AnonymousClass#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ObjectType)
	 * @generated
	 */
	boolean isSetType();

} // AnonymousClass
