/**
 */
package ccsl.elements.datatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.datatype.ArrayType#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link ccsl.elements.datatype.ArrayType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.datatype.DatatypePackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #isSetDimensions()
	 * @see #unsetDimensions()
	 * @see #setDimensions(int)
	 * @see ccsl.elements.datatype.DatatypePackage#getArrayType_Dimensions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getDimensions();

	/**
	 * Sets the value of the '{@link ccsl.elements.datatype.ArrayType#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #isSetDimensions()
	 * @see #unsetDimensions()
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(int value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.datatype.ArrayType#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDimensions()
	 * @see #getDimensions()
	 * @see #setDimensions(int)
	 * @generated
	 */
	void unsetDimensions();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.datatype.ArrayType#getDimensions <em>Dimensions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dimensions</em>' attribute is set.
	 * @see #unsetDimensions()
	 * @see #getDimensions()
	 * @see #setDimensions(int)
	 * @generated
	 */
	boolean isSetDimensions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see ccsl.elements.datatype.DatatypePackage#getArrayType_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.datatype.ArrayType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // ArrayType
