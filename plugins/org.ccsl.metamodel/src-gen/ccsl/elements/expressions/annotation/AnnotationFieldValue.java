/**
 */
package ccsl.elements.expressions.annotation;

import ccsl.elements.Element;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.complexType.AnnotationField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getValue <em>Value</em>}</li>
 *   <li>{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.annotation.AnnotationPackage#getAnnotationFieldValue()
 * @model
 * @generated
 */
public interface AnnotationFieldValue extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(Expression)
	 * @see ccsl.elements.expressions.annotation.AnnotationPackage#getAnnotationFieldValue_Value()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(Expression)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getValue <em>Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' containment reference is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(Expression)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #setField(AnnotationField)
	 * @see ccsl.elements.expressions.annotation.AnnotationPackage#getAnnotationFieldValue_Field()
	 * @model unsettable="true"
	 * @generated
	 */
	AnnotationField getField();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #getField()
	 * @generated
	 */
	void setField(AnnotationField value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetField()
	 * @see #getField()
	 * @see #setField(AnnotationField)
	 * @generated
	 */
	void unsetField();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getField <em>Field</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field</em>' reference is set.
	 * @see #unsetField()
	 * @see #getField()
	 * @see #setField(AnnotationField)
	 * @generated
	 */
	boolean isSetField();

} // AnnotationFieldValue
