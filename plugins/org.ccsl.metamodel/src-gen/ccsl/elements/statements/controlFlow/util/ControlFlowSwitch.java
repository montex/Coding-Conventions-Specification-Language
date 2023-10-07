/**
 */
package ccsl.elements.statements.controlFlow.util;

import ccsl.elements.Element;

import ccsl.elements.statements.Block;
import ccsl.elements.statements.ControlFlowStatement;
import ccsl.elements.statements.Statement;

import ccsl.elements.statements.controlFlow.*;

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
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage
 * @generated
 */
public class ControlFlowSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlFlowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowSwitch() {
		if (modelPackage == null) {
			modelPackage = ControlFlowPackage.eINSTANCE;
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
		case ControlFlowPackage.SWITCH_STATEMENT: {
			SwitchStatement switchStatement = (SwitchStatement) theEObject;
			Object result = caseSwitchStatement(switchStatement);
			if (result == null)
				result = caseConditionalControlFlowStatement(switchStatement);
			if (result == null)
				result = caseControlFlowStatement(switchStatement);
			if (result == null)
				result = caseStatement(switchStatement);
			if (result == null)
				result = caseElement(switchStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.SWITCH_CASE_BLOCK: {
			SwitchCaseBlock switchCaseBlock = (SwitchCaseBlock) theEObject;
			Object result = caseSwitchCaseBlock(switchCaseBlock);
			if (result == null)
				result = caseBlock(switchCaseBlock);
			if (result == null)
				result = caseStatement(switchCaseBlock);
			if (result == null)
				result = caseElement(switchCaseBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.IF_STATEMENT: {
			IfStatement ifStatement = (IfStatement) theEObject;
			Object result = caseIfStatement(ifStatement);
			if (result == null)
				result = caseConditionalControlFlowStatement(ifStatement);
			if (result == null)
				result = caseControlFlowStatement(ifStatement);
			if (result == null)
				result = caseStatement(ifStatement);
			if (result == null)
				result = caseElement(ifStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.LOOP_STATEMENT: {
			LoopStatement loopStatement = (LoopStatement) theEObject;
			Object result = caseLoopStatement(loopStatement);
			if (result == null)
				result = caseControlFlowStatement(loopStatement);
			if (result == null)
				result = caseStatement(loopStatement);
			if (result == null)
				result = caseElement(loopStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.WHILE_STATEMENT: {
			WhileStatement whileStatement = (WhileStatement) theEObject;
			Object result = caseWhileStatement(whileStatement);
			if (result == null)
				result = caseLoopStatement(whileStatement);
			if (result == null)
				result = caseControlFlowStatement(whileStatement);
			if (result == null)
				result = caseStatement(whileStatement);
			if (result == null)
				result = caseElement(whileStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.DO_STATEMENT: {
			DoStatement doStatement = (DoStatement) theEObject;
			Object result = caseDoStatement(doStatement);
			if (result == null)
				result = caseConditionalControlFlowStatement(doStatement);
			if (result == null)
				result = caseLoopStatement(doStatement);
			if (result == null)
				result = caseControlFlowStatement(doStatement);
			if (result == null)
				result = caseStatement(doStatement);
			if (result == null)
				result = caseElement(doStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.FOR_STATEMENT: {
			ForStatement forStatement = (ForStatement) theEObject;
			Object result = caseForStatement(forStatement);
			if (result == null)
				result = caseLoopStatement(forStatement);
			if (result == null)
				result = caseConditionalControlFlowStatement(forStatement);
			if (result == null)
				result = caseControlFlowStatement(forStatement);
			if (result == null)
				result = caseStatement(forStatement);
			if (result == null)
				result = caseElement(forStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.FOR_EACH_STATEMENT: {
			ForEachStatement forEachStatement = (ForEachStatement) theEObject;
			Object result = caseForEachStatement(forEachStatement);
			if (result == null)
				result = caseLoopStatement(forEachStatement);
			if (result == null)
				result = caseControlFlowStatement(forEachStatement);
			if (result == null)
				result = caseStatement(forEachStatement);
			if (result == null)
				result = caseElement(forEachStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ControlFlowPackage.CONDITIONAL_CONTROL_FLOW_STATEMENT: {
			ConditionalControlFlowStatement conditionalControlFlowStatement = (ConditionalControlFlowStatement) theEObject;
			Object result = caseConditionalControlFlowStatement(conditionalControlFlowStatement);
			if (result == null)
				result = caseControlFlowStatement(conditionalControlFlowStatement);
			if (result == null)
				result = caseStatement(conditionalControlFlowStatement);
			if (result == null)
				result = caseElement(conditionalControlFlowStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwitchStatement(SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwitchCaseBlock(SwitchCaseBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoopStatement(LoopStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoStatement(DoStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForEachStatement(ForEachStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Control Flow Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Control Flow Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConditionalControlFlowStatement(ConditionalControlFlowStatement object) {
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

} //ControlFlowSwitch
