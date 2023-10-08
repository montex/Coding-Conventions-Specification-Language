/**
 */
package ccsl.elements.statements;

import ccsl.CollectionKind;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.namedElements.method.Constructor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.InstanceCreation#getType <em>Type</em>}</li>
 *   <li>{@link ccsl.elements.statements.InstanceCreation#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link ccsl.elements.statements.InstanceCreation#getArgs <em>Args</em>}</li>
 *   <li>{@link ccsl.elements.statements.InstanceCreation#getArgsKind <em>Args Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.StatementsPackage#getInstanceCreation()
 * @model
 * @generated
 */
public interface InstanceCreation extends Statement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ObjectType)
	 * @see ccsl.elements.statements.StatementsPackage#getInstanceCreation_Type()
	 * @model
	 * @generated
	 */
	ObjectType getType();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.InstanceCreation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor</em>' containment reference.
	 * @see #setConstructor(Constructor)
	 * @see ccsl.elements.statements.StatementsPackage#getInstanceCreation_Constructor()
	 * @model containment="true"
	 * @generated
	 */
	Constructor getConstructor();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.InstanceCreation#getConstructor <em>Constructor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' containment reference.
	 * @see #getConstructor()
	 * @generated
	 */
	void setConstructor(Constructor value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see #isSetArgs()
	 * @see #unsetArgs()
	 * @see ccsl.elements.statements.StatementsPackage#getInstanceCreation_Args()
	 * @model type="ccsl.elements.statements.Statement" containment="true" unsettable="true"
	 * @generated
	 */
	EList getArgs();

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.InstanceCreation#getArgs <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArgs()
	 * @see #getArgs()
	 * @generated
	 */
	void unsetArgs();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.InstanceCreation#getArgs <em>Args</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Args</em>' containment reference list is set.
	 * @see #unsetArgs()
	 * @see #getArgs()
	 * @generated
	 */
	boolean isSetArgs();

	/**
	 * Returns the value of the '<em><b>Args Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setArgsKind(CollectionKind)
	 * @see ccsl.elements.statements.StatementsPackage#getInstanceCreation_ArgsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getArgsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.InstanceCreation#getArgsKind <em>Args Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getArgsKind()
	 * @generated
	 */
	void setArgsKind(CollectionKind value);

} // InstanceCreation
