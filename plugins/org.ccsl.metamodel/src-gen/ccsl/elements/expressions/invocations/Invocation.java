/**
 */
package ccsl.elements.expressions.invocations;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.method.SimpleMethod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.expressions.invocations.Invocation#getArgsKind <em>Args Kind</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.Invocation#getMethod <em>Method</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.Invocation#getArgs <em>Args</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.Invocation#getTypeArgs <em>Type Args</em>}</li>
 *   <li>{@link ccsl.elements.expressions.invocations.Invocation#getTypeArgsKind <em>Type Args Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getInvocation()
 * @model
 * @generated
 */
public interface Invocation extends Expression {
	/**
	 * Returns the value of the '<em><b>Args Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setArgsKind(CollectionKind)
	 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getInvocation_ArgsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getArgsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.invocations.Invocation#getArgsKind <em>Args Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getArgsKind()
	 * @generated
	 */
	void setArgsKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(SimpleMethod)
	 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getInvocation_Method()
	 * @model
	 * @generated
	 */
	SimpleMethod getMethod();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.invocations.Invocation#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(SimpleMethod value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see #isSetArgs()
	 * @see #unsetArgs()
	 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getInvocation_Args()
	 * @model type="ccsl.elements.expressions.Expression" containment="true" unsettable="true"
	 * @generated
	 */
	EList getArgs();

	/**
	 * Unsets the value of the '{@link ccsl.elements.expressions.invocations.Invocation#getArgs <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArgs()
	 * @see #getArgs()
	 * @generated
	 */
	void unsetArgs();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.expressions.invocations.Invocation#getArgs <em>Args</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Args</em>' containment reference list is set.
	 * @see #unsetArgs()
	 * @see #getArgs()
	 * @generated
	 */
	boolean isSetArgs();

	/**
	 * Returns the value of the '<em><b>Type Args</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.datatype.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Args</em>' reference list.
	 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getInvocation_TypeArgs()
	 * @model type="ccsl.elements.datatype.ObjectType"
	 * @generated
	 */
	EList getTypeArgs();

	/**
	 * Returns the value of the '<em><b>Type Args Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Args Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setTypeArgsKind(CollectionKind)
	 * @see ccsl.elements.expressions.invocations.InvocationsPackage#getInvocation_TypeArgsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getTypeArgsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.expressions.invocations.Invocation#getTypeArgsKind <em>Type Args Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Args Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getTypeArgsKind()
	 * @generated
	 */
	void setTypeArgsKind(CollectionKind value);

} // Invocation
