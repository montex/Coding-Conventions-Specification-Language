/**
 */
package ccsl.elements.statements.util;

import ccsl.elements.Element;

import ccsl.elements.statements.*;

import java.util.List;

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
 * @see ccsl.elements.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsSwitch() {
		if (modelPackage == null) {
			modelPackage = StatementsPackage.eINSTANCE;
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
		case StatementsPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			Object result = caseStatement(statement);
			if (result == null)
				result = caseElement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.CONTROL_FLOW_STATEMENT: {
			ControlFlowStatement controlFlowStatement = (ControlFlowStatement) theEObject;
			Object result = caseControlFlowStatement(controlFlowStatement);
			if (result == null)
				result = caseStatement(controlFlowStatement);
			if (result == null)
				result = caseElement(controlFlowStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.BLOCK: {
			Block block = (Block) theEObject;
			Object result = caseBlock(block);
			if (result == null)
				result = caseStatement(block);
			if (result == null)
				result = caseElement(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.INSTANCE_CREATION: {
			InstanceCreation instanceCreation = (InstanceCreation) theEObject;
			Object result = caseInstanceCreation(instanceCreation);
			if (result == null)
				result = caseStatement(instanceCreation);
			if (result == null)
				result = caseElement(instanceCreation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.SYNCHRONIZED_BLOCK: {
			SynchronizedBlock synchronizedBlock = (SynchronizedBlock) theEObject;
			Object result = caseSynchronizedBlock(synchronizedBlock);
			if (result == null)
				result = caseStatement(synchronizedBlock);
			if (result == null)
				result = caseElement(synchronizedBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.THROW_STATEMENT: {
			ThrowStatement throwStatement = (ThrowStatement) theEObject;
			Object result = caseThrowStatement(throwStatement);
			if (result == null)
				result = caseStatement(throwStatement);
			if (result == null)
				result = caseElement(throwStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.EMPTY_STATEMENT: {
			EmptyStatement emptyStatement = (EmptyStatement) theEObject;
			Object result = caseEmptyStatement(emptyStatement);
			if (result == null)
				result = caseStatement(emptyStatement);
			if (result == null)
				result = caseElement(emptyStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.RETURN_STATEMENT: {
			ReturnStatement returnStatement = (ReturnStatement) theEObject;
			Object result = caseReturnStatement(returnStatement);
			if (result == null)
				result = caseStatement(returnStatement);
			if (result == null)
				result = caseElement(returnStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.BREAK_STATEMENT: {
			BreakStatement breakStatement = (BreakStatement) theEObject;
			Object result = caseBreakStatement(breakStatement);
			if (result == null)
				result = caseStatement(breakStatement);
			if (result == null)
				result = caseElement(breakStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.CONTINUE_STATEMENT: {
			ContinueStatement continueStatement = (ContinueStatement) theEObject;
			Object result = caseContinueStatement(continueStatement);
			if (result == null)
				result = caseStatement(continueStatement);
			if (result == null)
				result = caseElement(continueStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.ASSERT_STATEMENT: {
			AssertStatement assertStatement = (AssertStatement) theEObject;
			Object result = caseAssertStatement(assertStatement);
			if (result == null)
				result = caseStatement(assertStatement);
			if (result == null)
				result = caseElement(assertStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.EXPRESSION_STATEMENT: {
			ExpressionStatement expressionStatement = (ExpressionStatement) theEObject;
			Object result = caseExpressionStatement(expressionStatement);
			if (result == null)
				result = caseStatement(expressionStatement);
			if (result == null)
				result = caseElement(expressionStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.LABEL_STATEMENT: {
			LabelStatement labelStatement = (LabelStatement) theEObject;
			Object result = caseLabelStatement(labelStatement);
			if (result == null)
				result = caseStatement(labelStatement);
			if (result == null)
				result = caseElement(labelStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlFlowStatement(ControlFlowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceCreation(InstanceCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSynchronizedBlock(SynchronizedBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseThrowStatement(ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmptyStatement(EmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBreakStatement(BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContinueStatement(ContinueStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssertStatement(AssertStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLabelStatement(LabelStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
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

} //StatementsSwitch
