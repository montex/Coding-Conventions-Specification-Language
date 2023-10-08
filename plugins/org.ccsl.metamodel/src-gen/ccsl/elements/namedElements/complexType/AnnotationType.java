/**
 */
package ccsl.elements.namedElements.complexType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.AnnotationType#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getAnnotationType()
 * @model
 * @generated
 */
public interface AnnotationType extends TypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.complexType.AnnotationField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getAnnotationType_Fields()
	 * @model type="ccsl.elements.namedElements.complexType.AnnotationField" containment="true" unsettable="true"
	 * @generated
	 */
	EList getFields();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationType#getFields <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFields()
	 * @see #getFields()
	 * @generated
	 */
	void unsetFields();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.AnnotationType#getFields <em>Fields</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fields</em>' containment reference list is set.
	 * @see #unsetFields()
	 * @see #getFields()
	 * @generated
	 */
	boolean isSetFields();

} // AnnotationType
