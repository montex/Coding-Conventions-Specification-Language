/**
 */
package ccsl.elements.expressions.arrays;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Indexes Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexesKind <em>Indexes Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayIndexesAccess()
 * @model
 * @generated
 */
public interface ArrayIndexesAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see #isSetIndexes()
	 * @see #unsetIndexes()
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayIndexesAccess_Indexes()
	 * @model type="ccsl.elements.expressions.Expression" containment="true" unsettable="true"
	 * @generated
	 */
	EList getIndexes();

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexes <em>Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexes()
	 * @see #getIndexes()
	 * @generated
	 */
	void unsetIndexes();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexes <em>Indexes</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indexes</em>' containment reference list is set.
	 * @see #unsetIndexes()
	 * @see #getIndexes()
	 * @generated
	 */
	boolean isSetIndexes();

	/**
	 * Returns the value of the '<em><b>Indexes Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setIndexesKind(CollectionKind)
	 * @see ccsl.elements.expressions.arrays.ArraysPackage#getArrayIndexesAccess_IndexesKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getIndexesKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexesKind <em>Indexes Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexes Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getIndexesKind()
	 * @generated
	 */
	void setIndexesKind(CollectionKind value);

} // ArrayIndexesAccess
