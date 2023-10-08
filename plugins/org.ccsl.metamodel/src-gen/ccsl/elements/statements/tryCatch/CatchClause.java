/**
 */
package ccsl.elements.statements.tryCatch;

import ccsl.elements.namedElements.variable.ParameterVariable;

import ccsl.elements.statements.Block;
import ccsl.elements.statements.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.tryCatch.CatchClause#getBody <em>Body</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.CatchClause#getVariable <em>Variable</em>}</li>
 *   <li>{@link ccsl.elements.statements.tryCatch.CatchClause#getHandledExceptions <em>Handled Exceptions</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getCatchClause()
 * @model
 * @generated
 */
public interface CatchClause extends Statement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #setBody(Block)
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getCatchClause_Body()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getBody <em>Body</em>}' containment reference.
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
	 * Unsets the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBody()
	 * @see #getBody()
	 * @see #setBody(Block)
	 * @generated
	 */
	void unsetBody();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getBody <em>Body</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' containment reference is set.
	 * @see #unsetBody()
	 * @see #getBody()
	 * @see #setBody(Block)
	 * @generated
	 */
	boolean isSetBody();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #isSetVariable()
	 * @see #unsetVariable()
	 * @see #setVariable(ParameterVariable)
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getCatchClause_Variable()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	ParameterVariable getVariable();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #isSetVariable()
	 * @see #unsetVariable()
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ParameterVariable value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariable()
	 * @see #getVariable()
	 * @see #setVariable(ParameterVariable)
	 * @generated
	 */
	void unsetVariable();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getVariable <em>Variable</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variable</em>' containment reference is set.
	 * @see #unsetVariable()
	 * @see #getVariable()
	 * @see #setVariable(ParameterVariable)
	 * @generated
	 */
	boolean isSetVariable();

	/**
	 * Returns the value of the '<em><b>Handled Exceptions</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.complexType.JClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handled Exceptions</em>' reference list.
	 * @see #isSetHandledExceptions()
	 * @see #unsetHandledExceptions()
	 * @see ccsl.elements.statements.tryCatch.TryCatchPackage#getCatchClause_HandledExceptions()
	 * @model type="ccsl.elements.namedElements.complexType.JClass" unsettable="true"
	 * @generated
	 */
	EList getHandledExceptions();

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getHandledExceptions <em>Handled Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandledExceptions()
	 * @see #getHandledExceptions()
	 * @generated
	 */
	void unsetHandledExceptions();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.tryCatch.CatchClause#getHandledExceptions <em>Handled Exceptions</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handled Exceptions</em>' reference list is set.
	 * @see #unsetHandledExceptions()
	 * @see #getHandledExceptions()
	 * @generated
	 */
	boolean isSetHandledExceptions();

} // CatchClause
