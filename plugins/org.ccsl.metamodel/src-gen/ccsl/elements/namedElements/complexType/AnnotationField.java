/**
 */
package ccsl.elements.namedElements.complexType;

import ccsl.elements.datatype.DataType;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.AnnotationField#getDefault <em>Default</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.AnnotationField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getAnnotationField()
 * @model
 * @generated
 */
public interface AnnotationField extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #setDefault(Expression)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getAnnotationField_Default()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Expression getDefault();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationField#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Expression value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationField#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefault()
	 * @see #getDefault()
	 * @see #setDefault(Expression)
	 * @generated
	 */
	void unsetDefault();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationField#getDefault <em>Default</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default</em>' containment reference is set.
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @see #setDefault(Expression)
	 * @generated
	 */
	boolean isSetDefault();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(DataType)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getAnnotationField_Type()
	 * @model unsettable="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationField#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationField#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(DataType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationField#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(DataType)
	 * @generated
	 */
	boolean isSetType();

} // AnnotationField
