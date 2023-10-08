/**
 */
package org.ccsl.metamodel.faultTypeDescription.action.util;

import java.util.List;

import org.ccsl.metamodel.faultTypeDescription.action.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
public class ActionSwitch {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ActionPackage.DELETE_ACTION: {
			DeleteAction deleteAction = (DeleteAction) theEObject;
			Object result = caseDeleteAction(deleteAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.MOVE_SCOPE_UP_ACTION: {
			MoveScopeUpAction moveScopeUpAction = (MoveScopeUpAction) theEObject;
			Object result = caseMoveScopeUpAction(moveScopeUpAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.DELETE_INFIX_OPERATOR_ACTION: {
			DeleteInfixOperatorAction deleteInfixOperatorAction = (DeleteInfixOperatorAction) theEObject;
			Object result = caseDeleteInfixOperatorAction(deleteInfixOperatorAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.CHANGE_LITERAL_VALUE_ACTION: {
			ChangeLiteralValueAction changeLiteralValueAction = (ChangeLiteralValueAction) theEObject;
			Object result = caseChangeLiteralValueAction(changeLiteralValueAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.DELETE_RANDOM_STATEMENT_ACTION: {
			DeleteRandomStatementAction deleteRandomStatementAction = (DeleteRandomStatementAction) theEObject;
			Object result = caseDeleteRandomStatementAction(deleteRandomStatementAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.REPLACE_VARIABLE_ACCESS_ACTION: {
			ReplaceVariableAccessAction replaceVariableAccessAction = (ReplaceVariableAccessAction) theEObject;
			Object result = caseReplaceVariableAccessAction(replaceVariableAccessAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION: {
			ReplaceArithmeticOperatorAction replaceArithmeticOperatorAction = (ReplaceArithmeticOperatorAction) theEObject;
			Object result = caseReplaceArithmeticOperatorAction(replaceArithmeticOperatorAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionPackage.ARITHMETIC_OPERATOR_MAP: {
			ArithmeticOperatorMap arithmeticOperatorMap = (ArithmeticOperatorMap) theEObject;
			Object result = caseArithmeticOperatorMap(arithmeticOperatorMap);
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
	public Object caseDeleteAction(DeleteAction object) {
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
	public Object caseMoveScopeUpAction(MoveScopeUpAction object) {
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
	public Object caseDeleteInfixOperatorAction(DeleteInfixOperatorAction object) {
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
	public Object caseChangeLiteralValueAction(ChangeLiteralValueAction object) {
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
	public Object caseDeleteRandomStatementAction(DeleteRandomStatementAction object) {
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
	public Object caseReplaceVariableAccessAction(ReplaceVariableAccessAction object) {
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
	public Object caseReplaceArithmeticOperatorAction(ReplaceArithmeticOperatorAction object) {
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
	public Object caseArithmeticOperatorMap(ArithmeticOperatorMap object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //ActionSwitch
