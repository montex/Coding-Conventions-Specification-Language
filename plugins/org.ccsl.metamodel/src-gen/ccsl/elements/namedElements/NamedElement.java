/**
 */
package ccsl.elements.namedElements;

import ccsl.elements.Annotable;
import ccsl.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.NamedElement#getAvailableInSourceCode <em>Available In Source Code</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.NamedElementsPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends Element, Annotable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see ccsl.elements.namedElements.NamedElementsPackage#getNamedElement_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.NamedElement#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available In Source Code</em>' attribute.
	 * @see #setAvailableInSourceCode(Boolean)
	 * @see ccsl.elements.namedElements.NamedElementsPackage#getNamedElement_AvailableInSourceCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getAvailableInSourceCode();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.NamedElement#getAvailableInSourceCode <em>Available In Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available In Source Code</em>' attribute.
	 * @see #getAvailableInSourceCode()
	 * @generated
	 */
	void setAvailableInSourceCode(Boolean value);

} // NamedElement
