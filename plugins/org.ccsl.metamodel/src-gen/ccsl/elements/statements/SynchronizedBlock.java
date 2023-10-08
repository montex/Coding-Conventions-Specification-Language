/**
 */
package ccsl.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronized Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.SynchronizedBlock#getBodyStatements <em>Body Statements</em>}</li>
 *   <li>{@link ccsl.elements.statements.SynchronizedBlock#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.StatementsPackage#getSynchronizedBlock()
 * @model
 * @generated
 */
public interface SynchronizedBlock extends Statement {
	/**
	 * Returns the value of the '<em><b>Body Statements</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Statements</em>' containment reference list.
	 * @see ccsl.elements.statements.StatementsPackage#getSynchronizedBlock_BodyStatements()
	 * @model type="ccsl.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getBodyStatements();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Statement)
	 * @see ccsl.elements.statements.StatementsPackage#getSynchronizedBlock_Key()
	 * @model containment="true"
	 * @generated
	 */
	Statement getKey();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.SynchronizedBlock#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Statement value);

} // SynchronizedBlock
