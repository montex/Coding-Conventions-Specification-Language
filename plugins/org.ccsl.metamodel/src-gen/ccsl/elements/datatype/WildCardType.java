/**
 */
package ccsl.elements.datatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wild Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.datatype.WildCardType#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.datatype.DatatypePackage#getWildCardType()
 * @model
 * @generated
 */
public interface WildCardType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' reference.
	 * @see #setBound(ObjectType)
	 * @see ccsl.elements.datatype.DatatypePackage#getWildCardType_Bound()
	 * @model
	 * @generated
	 */
	ObjectType getBound();

	/**
	 * Sets the value of the '{@link ccsl.elements.datatype.WildCardType#getBound <em>Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(ObjectType value);

} // WildCardType
