/**
 */
package ccsl.elements.namedElements.method;

import ccsl.CollectionKind;

import ccsl.elements.Annotable;
import ccsl.elements.ControlledAccessElement;
import ccsl.elements.Element;

import ccsl.elements.statements.Block;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.method.SimpleMethod#getParams <em>Params</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.SimpleMethod#getParamsKind <em>Params Kind</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.SimpleMethod#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.method.SimpleMethod#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.method.MethodPackage#getSimpleMethod()
 * @model
 * @generated
 */
public interface SimpleMethod extends Element, ControlledAccessElement, Annotable {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.variable.ParameterVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see #isSetParams()
	 * @see #unsetParams()
	 * @see ccsl.elements.namedElements.method.MethodPackage#getSimpleMethod_Params()
	 * @model type="ccsl.elements.namedElements.variable.ParameterVariable" containment="true" unsettable="true"
	 * @generated
	 */
	EList getParams();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getParams <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParams()
	 * @see #getParams()
	 * @generated
	 */
	void unsetParams();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getParams <em>Params</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Params</em>' containment reference list is set.
	 * @see #unsetParams()
	 * @see #getParams()
	 * @generated
	 */
	boolean isSetParams();

	/**
	 * Returns the value of the '<em><b>Params Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setParamsKind(CollectionKind)
	 * @see ccsl.elements.namedElements.method.MethodPackage#getSimpleMethod_ParamsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getParamsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getParamsKind <em>Params Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getParamsKind()
	 * @generated
	 */
	void setParamsKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.complexType.JClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' reference list.
	 * @see #isSetThrownExceptions()
	 * @see #unsetThrownExceptions()
	 * @see ccsl.elements.namedElements.method.MethodPackage#getSimpleMethod_ThrownExceptions()
	 * @model type="ccsl.elements.namedElements.complexType.JClass" unsettable="true"
	 * @generated
	 */
	EList getThrownExceptions();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getThrownExceptions <em>Thrown Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThrownExceptions()
	 * @see #getThrownExceptions()
	 * @generated
	 */
	void unsetThrownExceptions();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getThrownExceptions <em>Thrown Exceptions</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thrown Exceptions</em>' reference list is set.
	 * @see #unsetThrownExceptions()
	 * @see #getThrownExceptions()
	 * @generated
	 */
	boolean isSetThrownExceptions();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #setBody(Block)
	 * @see ccsl.elements.namedElements.method.MethodPackage#getSimpleMethod_Body()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBody()
	 * @see #getBody()
	 * @see #setBody(Block)
	 * @generated
	 */
	void unsetBody();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.method.SimpleMethod#getBody <em>Body</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' containment reference is set.
	 * @see #unsetBody()
	 * @see #getBody()
	 * @see #setBody(Block)
	 * @generated
	 */
	boolean isSetBody();

} // SimpleMethod
