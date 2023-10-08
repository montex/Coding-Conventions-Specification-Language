/**
 */
package ccsl.elements.namedElements.variable;

import ccsl.elements.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initializable Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.variable.InitializableVariable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.variable.VariablePackage#getInitializableVariable()
 * @model
 * @generated
 */
public interface InitializableVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #setInitialValue(Expression)
	 * @see ccsl.elements.namedElements.variable.VariablePackage#getInitializableVariable_InitialValue()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.variable.InitializableVariable#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.variable.InitializableVariable#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialValue()
	 * @see #getInitialValue()
	 * @see #setInitialValue(Expression)
	 * @generated
	 */
	void unsetInitialValue();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.variable.InitializableVariable#getInitialValue <em>Initial Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Value</em>' containment reference is set.
	 * @see #unsetInitialValue()
	 * @see #getInitialValue()
	 * @see #setInitialValue(Expression)
	 * @generated
	 */
	boolean isSetInitialValue();

} // InitializableVariable
