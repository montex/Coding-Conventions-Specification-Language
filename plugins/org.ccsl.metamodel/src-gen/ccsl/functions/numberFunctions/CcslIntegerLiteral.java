/**
 */
package ccsl.functions.numberFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ccsl Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.numberFunctions.CcslIntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.numberFunctions.NumberFunctionsPackage#getCcslIntegerLiteral()
 * @model
 * @generated
 */
public interface CcslIntegerLiteral extends CcslNumberFunction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see ccsl.functions.numberFunctions.NumberFunctionsPackage#getCcslIntegerLiteral_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ccsl.functions.numberFunctions.CcslIntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // CcslIntegerLiteral
