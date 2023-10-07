/**
 */
package ccsl.elements.expressions.arrays;

import ccsl.CollectionKind;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayCreation#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayCreation#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayCreation#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayCreation#getDimensionsKind <em>Dimensions Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayCreation()
 * @model
 * @generated
 */
public interface ArrayCreation extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ObjectType)
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayCreation_Type()
	 * @model
	 * @generated
	 */
	ObjectType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.arrays.ArrayCreation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #isSetInitializer()
	 * @see #unsetInitializer()
	 * @see #setInitializer(ArrayInitializer)
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayCreation_Initializer()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	ArrayInitializer getInitializer();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.arrays.ArrayCreation#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #isSetInitializer()
	 * @see #unsetInitializer()
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(ArrayInitializer value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.arrays.ArrayCreation#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitializer()
	 * @see #getInitializer()
	 * @see #setInitializer(ArrayInitializer)
	 * @generated
	 */
	void unsetInitializer();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.arrays.ArrayCreation#getInitializer <em>Initializer</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initializer</em>' containment reference is set.
	 * @see #unsetInitializer()
	 * @see #getInitializer()
	 * @see #setInitializer(ArrayInitializer)
	 * @generated
	 */
	boolean isSetInitializer();

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see #isSetDimensions()
	 * @see #unsetDimensions()
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayCreation_Dimensions()
	 * @model type="ccsl.elements.expressions.Expression" containment="true" unsettable="true"
	 * @generated
	 */
	EList getDimensions();

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.arrays.ArrayCreation#getDimensions <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDimensions()
	 * @see #getDimensions()
	 * @generated
	 */
	void unsetDimensions();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.arrays.ArrayCreation#getDimensions <em>Dimensions</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dimensions</em>' containment reference list is set.
	 * @see #unsetDimensions()
	 * @see #getDimensions()
	 * @generated
	 */
	boolean isSetDimensions();

	/**
	 * Returns the value of the '<em><b>Dimensions Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setDimensionsKind(CollectionKind)
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayCreation_DimensionsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getDimensionsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.arrays.ArrayCreation#getDimensionsKind <em>Dimensions Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getDimensionsKind()
	 * @generated
	 */
	void setDimensionsKind(CollectionKind value);

} // ArrayCreation
