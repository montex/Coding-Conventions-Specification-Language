/**
 */
package ccsl.elements.statements.controlFlow;

import ccsl.CollectionKind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.ForStatement#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.ForStatement#getInitializersKind <em>Initializers Kind</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.ForStatement#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.ForStatement#getUpdatersKind <em>Updaters Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends LoopStatement, ConditionalControlFlowStatement {
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializers</em>' containment reference list.
	 * @see #isSetInitializers()
	 * @see #unsetInitializers()
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForStatement_Initializers()
	 * @model type="ccsl.elements.expressions.Expression" containment="true" unsettable="true"
	 * @generated
	 */
	EList getInitializers();

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.controlFlow.ForStatement#getInitializers <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitializers()
	 * @see #getInitializers()
	 * @generated
	 */
	void unsetInitializers();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.controlFlow.ForStatement#getInitializers <em>Initializers</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initializers</em>' containment reference list is set.
	 * @see #unsetInitializers()
	 * @see #getInitializers()
	 * @generated
	 */
	boolean isSetInitializers();

	/**
	 * Returns the value of the '<em><b>Initializers Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializers Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setInitializersKind(CollectionKind)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForStatement_InitializersKind()
	 * @model
	 * @generated
	 */
	CollectionKind getInitializersKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.ForStatement#getInitializersKind <em>Initializers Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializers Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getInitializersKind()
	 * @generated
	 */
	void setInitializersKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Updaters</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updaters</em>' containment reference list.
	 * @see #isSetUpdaters()
	 * @see #unsetUpdaters()
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForStatement_Updaters()
	 * @model type="ccsl.elements.expressions.Expression" containment="true" unsettable="true"
	 * @generated
	 */
	EList getUpdaters();

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.controlFlow.ForStatement#getUpdaters <em>Updaters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdaters()
	 * @see #getUpdaters()
	 * @generated
	 */
	void unsetUpdaters();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.controlFlow.ForStatement#getUpdaters <em>Updaters</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Updaters</em>' containment reference list is set.
	 * @see #unsetUpdaters()
	 * @see #getUpdaters()
	 * @generated
	 */
	boolean isSetUpdaters();

	/**
	 * Returns the value of the '<em><b>Updaters Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updaters Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setUpdatersKind(CollectionKind)
	 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage#getForStatement_UpdatersKind()
	 * @model
	 * @generated
	 */
	CollectionKind getUpdatersKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.controlFlow.ForStatement#getUpdatersKind <em>Updaters Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updaters Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getUpdatersKind()
	 * @generated
	 */
	void setUpdatersKind(CollectionKind value);

} // ForStatement
