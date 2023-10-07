/**
 */
package ccsl.elements.namedElements.method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.method.Constructor#getAvaliableInSourceCode <em>Avaliable In Source Code</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.method.MethodPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends SimpleMethod {
	/**
	 * Returns the value of the '<em><b>Avaliable In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avaliable In Source Code</em>' attribute.
	 * @see #setAvaliableInSourceCode(Boolean)
	 * @see ccsl.elements.namedElements.method.MethodPackage#getConstructor_AvaliableInSourceCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getAvaliableInSourceCode();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.method.Constructor#getAvaliableInSourceCode <em>Avaliable In Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avaliable In Source Code</em>' attribute.
	 * @see #getAvaliableInSourceCode()
	 * @generated
	 */
	void setAvaliableInSourceCode(Boolean value);

} // Constructor
