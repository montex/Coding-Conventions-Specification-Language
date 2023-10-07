/**
 */
package ccsl.elements.statements;

import ccsl.CollectionKind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.Block#getStatements <em>Statements</em>}</li>
 *   <li>{@link ccsl.elements.statements.Block#getStatementsKind <em>Statements Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.StatementsPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see #isSetStatements()
	 * @see #unsetStatements()
	 * @see ccsl.elements.statements.StatementsPackage#getBlock_Statements()
	 * @model type="ccsl.elements.statements.Statement" containment="true" unsettable="true"
	 * @generated
	 */
	EList getStatements();

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.Block#getStatements <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatements()
	 * @see #getStatements()
	 * @generated
	 */
	void unsetStatements();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.Block#getStatements <em>Statements</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statements</em>' containment reference list is set.
	 * @see #unsetStatements()
	 * @see #getStatements()
	 * @generated
	 */
	boolean isSetStatements();

	/**
	 * Returns the value of the '<em><b>Statements Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setStatementsKind(CollectionKind)
	 * @see ccsl.elements.statements.StatementsPackage#getBlock_StatementsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getStatementsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.Block#getStatementsKind <em>Statements Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getStatementsKind()
	 * @generated
	 */
	void setStatementsKind(CollectionKind value);

} // Block
