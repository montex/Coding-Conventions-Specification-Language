/**
 */
package ccsl.elements.namedElements.complexType;

import ccsl.CollectionKind;

import ccsl.elements.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.ComplexType#getFields <em>Fields</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.ComplexType#getMethods <em>Methods</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.ComplexType#getFieldsKind <em>Fields Kind</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.ComplexType#getMethodsKind <em>Methods Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends Element {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.variable.FieldVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see #isSetFields()
	 * @see #unsetFields()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getComplexType_Fields()
	 * @model type="ccsl.elements.namedElements.variable.FieldVariable" containment="true" unsettable="true"
	 * @generated
	 */
	EList getFields();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.ComplexType#getFields <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFields()
	 * @see #getFields()
	 * @generated
	 */
	void unsetFields();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.ComplexType#getFields <em>Fields</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fields</em>' containment reference list is set.
	 * @see #unsetFields()
	 * @see #getFields()
	 * @generated
	 */
	boolean isSetFields();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.method.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see #isSetMethods()
	 * @see #unsetMethods()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getComplexType_Methods()
	 * @model type="ccsl.elements.namedElements.method.Method" containment="true" unsettable="true"
	 * @generated
	 */
	EList getMethods();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.ComplexType#getMethods <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethods()
	 * @see #getMethods()
	 * @generated
	 */
	void unsetMethods();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.ComplexType#getMethods <em>Methods</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Methods</em>' containment reference list is set.
	 * @see #unsetMethods()
	 * @see #getMethods()
	 * @generated
	 */
	boolean isSetMethods();

	/**
	 * Returns the value of the '<em><b>Fields Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setFieldsKind(CollectionKind)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getComplexType_FieldsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getFieldsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.ComplexType#getFieldsKind <em>Fields Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getFieldsKind()
	 * @generated
	 */
	void setFieldsKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Methods Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setMethodsKind(CollectionKind)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getComplexType_MethodsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getMethodsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.ComplexType#getMethodsKind <em>Methods Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methods Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getMethodsKind()
	 * @generated
	 */
	void setMethodsKind(CollectionKind value);

} // ComplexType
