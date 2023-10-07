/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Last Statement Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getLastStatement <em>Last Statement</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getBlockLastStatementFilter()
 * @model
 * @generated
 */
public interface BlockLastStatementFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Last Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Statement</em>' reference.
	 * @see #setLastStatement(Statement)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getBlockLastStatementFilter_LastStatement()
	 * @model
	 * @generated
	 */
	Statement getLastStatement();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getLastStatement <em>Last Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Statement</em>' reference.
	 * @see #getLastStatement()
	 * @generated
	 */
	void setLastStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getBlockLastStatementFilter_Context()
	 * @model containment="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // BlockLastStatementFilter
