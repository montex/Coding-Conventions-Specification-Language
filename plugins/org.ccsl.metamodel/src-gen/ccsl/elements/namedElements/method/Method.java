/**
 */
package ccsl.elements.namedElements.method;

import ccsl.elements.Inheritance;

import ccsl.elements.datatype.DataType;

import ccsl.elements.namedElements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.method.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.Method#getStatic <em>Static</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.Method#getInheritance <em>Inheritance</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.method.MethodPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement, SimpleMethod {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(DataType)
	 * @see ccsl.elements.namedElements.method.MethodPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.method.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #isSetStatic()
	 * @see #unsetStatic()
	 * @see #setStatic(Boolean)
	 * @see ccsl.elements.namedElements.method.MethodPackage#getMethod_Static()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getStatic();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.method.Method#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isSetStatic()
	 * @see #unsetStatic()
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Boolean value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.method.Method#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatic()
	 * @see #getStatic()
	 * @see #setStatic(Boolean)
	 * @generated
	 */
	void unsetStatic();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.method.Method#getStatic <em>Static</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Static</em>' attribute is set.
	 * @see #unsetStatic()
	 * @see #getStatic()
	 * @see #setStatic(Boolean)
	 * @generated
	 */
	boolean isSetStatic();

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.elements.Inheritance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' attribute.
	 * @see ccsl.elements.Inheritance
	 * @see #setInheritance(Inheritance)
	 * @see ccsl.elements.namedElements.method.MethodPackage#getMethod_Inheritance()
	 * @model default="ANY"
	 * @generated
	 */
	Inheritance getInheritance();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.method.Method#getInheritance <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' attribute.
	 * @see ccsl.elements.Inheritance
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(Inheritance value);

} // Method
