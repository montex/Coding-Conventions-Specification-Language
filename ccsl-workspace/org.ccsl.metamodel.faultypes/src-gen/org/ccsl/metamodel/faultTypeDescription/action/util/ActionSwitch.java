/**
 */
package org.ccsl.metamodel.faultTypeDescription.action.util;

import org.ccsl.metamodel.faultTypeDescription.action.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage
 * @generated
 */
public class ActionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ActionPackage.DELETE_ACTION: {
			DeleteAction deleteAction = (DeleteAction) theEObject;
			T result = caseDeleteAction(deleteAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.MOVE_SCOPE_UP_ACTION: {
			MoveScopeUpAction moveScopeUpAction = (MoveScopeUpAction) theEObject;
			T result = caseMoveScopeUpAction(moveScopeUpAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.DELETE_INFIX_OPERATOR_ACTION: {
			DeleteInfixOperatorAction deleteInfixOperatorAction = (DeleteInfixOperatorAction) theEObject;
			T result = caseDeleteInfixOperatorAction(deleteInfixOperatorAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.CHANGE_LITERAL_VALUE_ACTION: {
			ChangeLiteralValueAction changeLiteralValueAction = (ChangeLiteralValueAction) theEObject;
			T result = caseChangeLiteralValueAction(changeLiteralValueAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.DELETE_RANDOM_STATEMENT_ACTION: {
			DeleteRandomStatementAction deleteRandomStatementAction = (DeleteRandomStatementAction) theEObject;
			T result = caseDeleteRandomStatementAction(deleteRandomStatementAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.REPLACE_VARIABLE_ACCESS_ACTION: {
			ReplaceVariableAccessAction replaceVariableAccessAction = (ReplaceVariableAccessAction) theEObject;
			T result = caseReplaceVariableAccessAction(replaceVariableAccessAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION: {
			ReplaceArithmeticOperatorAction replaceArithmeticOperatorAction = (ReplaceArithmeticOperatorAction) theEObject;
			T result = caseReplaceArithmeticOperatorAction(replaceArithmeticOperatorAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.ARITHMETIC_OPERATOR_MAP: {
			ArithmeticOperatorMap arithmeticOperatorMap = (ArithmeticOperatorMap) theEObject;
			T result = caseArithmeticOperatorMap(arithmeticOperatorMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAction(DeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Scope Up Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Scope Up Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveScopeUpAction(MoveScopeUpAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Infix Operator Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Infix Operator Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteInfixOperatorAction(DeleteInfixOperatorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Literal Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Literal Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeLiteralValueAction(ChangeLiteralValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Random Statement Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Random Statement Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteRandomStatementAction(DeleteRandomStatementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Variable Access Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Variable Access Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceVariableAccessAction(ReplaceVariableAccessAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Arithmetic Operator Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Arithmetic Operator Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceArithmeticOperatorAction(ReplaceArithmeticOperatorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operator Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operator Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticOperatorMap(ArithmeticOperatorMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActionSwitch
