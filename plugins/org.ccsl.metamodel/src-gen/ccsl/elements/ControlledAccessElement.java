/**
 */
package ccsl.elements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlled Access Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.ControlledAccessElement#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.ElementsPackage#getControlledAccessElement()
 * @model abstract="true"
 * @generated
 */
public interface ControlledAccessElement extends Element {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.elements.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see ccsl.elements.Visibility
	 * @see #setVisibility(Visibility)
	 * @see ccsl.elements.ElementsPackage#getControlledAccessElement_Visibility()
	 * @model default="ANY"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link ccsl.elements.ControlledAccessElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see ccsl.elements.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // ControlledAccessElement
