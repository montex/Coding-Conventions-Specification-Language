/**
 */
package ccsl.elements.expressions.accesses;

import ccsl.elements.datatype.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.accesses.DataTypeAccess#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.accesses.AccessesPackage#getDataTypeAccess()
 * @model
 * @generated
 */
public interface DataTypeAccess extends Access {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see ccsl.elements.expressions.accesses.AccessesPackage#getDataTypeAccess_Datatype()
	 * @model
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.accesses.DataTypeAccess#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // DataTypeAccess
