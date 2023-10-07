/**
 */
package ccsl.elements.namedElements.variable;

import ccsl.elements.datatype.DataType;

import ccsl.elements.namedElements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.variable.Variable#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.variable.Variable#getFinal <em>Final</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.variable.VariablePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see ccsl.elements.namedElements.variable.VariablePackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.variable.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #setFinal(Boolean)
	 * @see ccsl.elements.namedElements.variable.VariablePackage#getVariable_Final()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getFinal();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.variable.Variable#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Boolean value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.variable.Variable#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinal()
	 * @see #getFinal()
	 * @see #setFinal(Boolean)
	 * @generated
	 */
	void unsetFinal();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.variable.Variable#getFinal <em>Final</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final</em>' attribute is set.
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @see #setFinal(Boolean)
	 * @generated
	 */
	boolean isSetFinal();

} // Variable
