/**
 */
package ccsl.elements.expressions.arrays;

import ccsl.elements.expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayInitializer#getValues <em>Values</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayInitializer#getValuesKind <em>Values Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayInitializer()
 * @model
 * @generated
 */
public interface ArrayInitializer extends Expression {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayInitializer_Values()
	 * @model type="ccsl.elements.expressions.Expression" containment="true"
	 * @generated
	 */
	EList getValues();

	/**
	 * Returns the value of the '<em><b>Values Kind</b></em>' attribute list.
	 * The list contents are of type {@link ccsl.CollectionKind}.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Kind</em>' attribute list.
	 * @see ccsl.CollectionKind
	 * @see #isSetValuesKind()
	 * @see #unsetValuesKind()
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayInitializer_ValuesKind()
	 * @model default="ANY" unsettable="true" dataType="ccsl.CollectionKind"
	 * @generated
	 */
	EList getValuesKind();

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.arrays.ArrayInitializer#getValuesKind <em>Values Kind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValuesKind()
	 * @see #getValuesKind()
	 * @generated
	 */
	void unsetValuesKind();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.arrays.ArrayInitializer#getValuesKind <em>Values Kind</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Values Kind</em>' attribute list is set.
	 * @see #unsetValuesKind()
	 * @see #getValuesKind()
	 * @generated
	 */
	boolean isSetValuesKind();

} // ArrayInitializer
