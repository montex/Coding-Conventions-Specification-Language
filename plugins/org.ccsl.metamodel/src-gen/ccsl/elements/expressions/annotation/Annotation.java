/**
 */
package ccsl.elements.expressions.annotation;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.complexType.AnnotationType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.annotation.Annotation#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.expressions.annotation.Annotation#getValues <em>Values</em>}</li>
 *   <li>{@link ccsl.elements.expressions.annotation.Annotation#getValuesKind <em>Values Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.annotation.AnnotationPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AnnotationType)
	 * @see ccsl.elements.expressions.annotation.AnnotationPackage#getAnnotation_Type()
	 * @model
	 * @generated
	 */
	AnnotationType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.annotation.Annotation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AnnotationType value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.annotation.AnnotationFieldValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see #isSetValues()
	 * @see #unsetValues()
	 * @see ccsl.elements.expressions.annotation.AnnotationPackage#getAnnotation_Values()
	 * @model type="ccsl.elements.expressions.annotation.AnnotationFieldValue" containment="true" unsettable="true"
	 * @generated
	 */
	EList getValues();

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.annotation.Annotation#getValues <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValues()
	 * @see #getValues()
	 * @generated
	 */
	void unsetValues();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.annotation.Annotation#getValues <em>Values</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Values</em>' containment reference list is set.
	 * @see #unsetValues()
	 * @see #getValues()
	 * @generated
	 */
	boolean isSetValues();

	/**
	 * Returns the value of the '<em><b>Values Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setValuesKind(CollectionKind)
	 * @see ccsl.elements.expressions.annotation.AnnotationPackage#getAnnotation_ValuesKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getValuesKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.annotation.Annotation#getValuesKind <em>Values Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getValuesKind()
	 * @generated
	 */
	void setValuesKind(CollectionKind value);

} // Annotation
