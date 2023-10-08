/**
 */
package ccsl.functions.numberFunctions;

import ccsl.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Index Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.numberFunctions.GetIndexOf#getContainer <em>Container</em>}</li>
 *   <li>{@link ccsl.functions.numberFunctions.GetIndexOf#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.numberFunctions.NumberFunctionsPackage#getGetIndexOf()
 * @model
 * @generated
 */
public interface GetIndexOf extends CcslNumberFunction {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Element)
	 * @see ccsl.functions.numberFunctions.NumberFunctionsPackage#getGetIndexOf_Container()
	 * @model required="true"
	 * @generated
	 */
	Element getContainer();

	/**
	 * Sets the value of the '{@link ccsl.functions.numberFunctions.GetIndexOf#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Element value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Element)
	 * @see ccsl.functions.numberFunctions.NumberFunctionsPackage#getGetIndexOf_Field()
	 * @model required="true"
	 * @generated
	 */
	Element getField();

	/**
	 * Sets the value of the '{@link ccsl.functions.numberFunctions.GetIndexOf#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Element value);

} // GetIndexOf
