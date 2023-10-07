/**
 */
package ccsl.elements.statements.tryCatch;

import ccsl.CollectionKind;

import ccsl.elements.statements.Block;
import ccsl.elements.statements.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.tryCatch.TryStatement#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.TryStatement#getFinallyBlock <em>Finally Block</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.TryStatement#getCatchClausesKind <em>Catch Clauses Kind</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.TryStatement#getResources <em>Resources</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.TryStatement#getResourcesKind <em>Resources Kind</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.TryStatement#getTryBlock <em>Try Block</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getTryStatement()
 * @model
 * @generated
 */
public interface TryStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Catch Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.tryCatch.CatchClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clauses</em>' containment reference list.
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getTryStatement_CatchClauses()
	 * @model type="ccsl.elements.statements.tryCatch.CatchClause" containment="true"
	 * @generated
	 */
	EList getCatchClauses();

	/**
	 * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally Block</em>' containment reference.
	 * @see #setFinallyBlock(Block)
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getTryStatement_FinallyBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getFinallyBlock();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.tryCatch.TryStatement#getFinallyBlock <em>Finally Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally Block</em>' containment reference.
	 * @see #getFinallyBlock()
	 * @generated
	 */
	void setFinallyBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Catch Clauses Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clauses Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setCatchClausesKind(CollectionKind)
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getTryStatement_CatchClausesKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getCatchClausesKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.tryCatch.TryStatement#getCatchClausesKind <em>Catch Clauses Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch Clauses Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getCatchClausesKind()
	 * @generated
	 */
	void setCatchClausesKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getTryStatement_Resources()
	 * @model type="ccsl.elements.expressions.Expression" containment="true"
	 * @generated
	 */
	EList getResources();

	/**
	 * Returns the value of the '<em><b>Resources Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setResourcesKind(CollectionKind)
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getTryStatement_ResourcesKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getResourcesKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.tryCatch.TryStatement#getResourcesKind <em>Resources Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getResourcesKind()
	 * @generated
	 */
	void setResourcesKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Try Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Block</em>' containment reference.
	 * @see #setTryBlock(Block)
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getTryStatement_TryBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getTryBlock();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.tryCatch.TryStatement#getTryBlock <em>Try Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Try Block</em>' containment reference.
	 * @see #getTryBlock()
	 * @generated
	 */
	void setTryBlock(Block value);

} // TryStatement
