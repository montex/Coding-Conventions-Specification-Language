/**
 */
package ccsl.elements.namedElements.variable;

import ccsl.elements.ControlledAccessElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.variable.FieldVariable#getStatic <em>Static</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.variable.FieldVariable#getVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.variable.VariablePackage#getFieldVariable()
 * @model
 * @generated
 */
public interface FieldVariable extends InitializableVariable, ControlledAccessElement {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(Boolean)
	 * @see ccsl.elements.namedElements.variable.VariablePackage#getFieldVariable_Static()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getStatic();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.variable.FieldVariable#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(Boolean)
	 * @see ccsl.elements.namedElements.variable.VariablePackage#getFieldVariable_Volatile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getVolatile();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.variable.FieldVariable#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #getVolatile()
	 * @generated
	 */
	void setVolatile(Boolean value);

} // FieldVariable
