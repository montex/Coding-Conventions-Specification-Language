/**
 */
package org.ccsl.metamodel.faultTypeDescription.action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionFactory eINSTANCE = org.ccsl.metamodel.faultTypeDescription.action.impl.ActionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Action</em>'.
	 * @generated
	 */
	DeleteAction createDeleteAction();

	/**
	 * Returns a new object of class '<em>Move Scope Up Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Scope Up Action</em>'.
	 * @generated
	 */
	MoveScopeUpAction createMoveScopeUpAction();

	/**
	 * Returns a new object of class '<em>Delete Infix Operator Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Infix Operator Action</em>'.
	 * @generated
	 */
	DeleteInfixOperatorAction createDeleteInfixOperatorAction();

	/**
	 * Returns a new object of class '<em>Change Literal Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Literal Value Action</em>'.
	 * @generated
	 */
	ChangeLiteralValueAction createChangeLiteralValueAction();

	/**
	 * Returns a new object of class '<em>Delete Random Statement Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Random Statement Action</em>'.
	 * @generated
	 */
	DeleteRandomStatementAction createDeleteRandomStatementAction();

	/**
	 * Returns a new object of class '<em>Replace Variable Access Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Variable Access Action</em>'.
	 * @generated
	 */
	ReplaceVariableAccessAction createReplaceVariableAccessAction();

	/**
	 * Returns a new object of class '<em>Replace Arithmetic Operator Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Arithmetic Operator Action</em>'.
	 * @generated
	 */
	ReplaceArithmeticOperatorAction createReplaceArithmeticOperatorAction();

	/**
	 * Returns a new object of class '<em>Arithmetic Operator Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Operator Map</em>'.
	 * @generated
	 */
	ArithmeticOperatorMap createArithmeticOperatorMap();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionPackage getActionPackage();

} //ActionFactory
