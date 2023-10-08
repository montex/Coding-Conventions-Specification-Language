/**
 */
package ccsl.elements.expressions.util;

import ccsl.elements.Element;

import ccsl.elements.expressions.*;

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
 * @see ccsl.elements.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
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
		case ExpressionsPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			Object result = caseExpression(expression);
			if (result == null)
				result = caseElement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.VAR_DECLARATION: {
			VarDeclaration varDeclaration = (VarDeclaration) theEObject;
			Object result = caseVarDeclaration(varDeclaration);
			if (result == null)
				result = caseExpression(varDeclaration);
			if (result == null)
				result = caseElement(varDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.CAST_EXPRESSION: {
			CastExpression castExpression = (CastExpression) theEObject;
			Object result = caseCastExpression(castExpression);
			if (result == null)
				result = caseExpression(castExpression);
			if (result == null)
				result = caseElement(castExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.TERNARY_EXPRESSION: {
			TernaryExpression ternaryExpression = (TernaryExpression) theEObject;
			Object result = caseTernaryExpression(ternaryExpression);
			if (result == null)
				result = caseExpression(ternaryExpression);
			if (result == null)
				result = caseElement(ternaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.INSTANCEOF_EXPRESSION: {
			InstanceofExpression instanceofExpression = (InstanceofExpression) theEObject;
			Object result = caseInstanceofExpression(instanceofExpression);
			if (result == null)
				result = caseExpression(instanceofExpression);
			if (result == null)
				result = caseElement(instanceofExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.ARITHMETIC_EXPRESSION: {
			ArithmeticExpression arithmeticExpression = (ArithmeticExpression) theEObject;
			Object result = caseArithmeticExpression(arithmeticExpression);
			if (result == null)
				result = caseOperandExpression(arithmeticExpression);
			if (result == null)
				result = caseExpression(arithmeticExpression);
			if (result == null)
				result = caseElement(arithmeticExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.STRING_CONCATENATION: {
			StringConcatenation stringConcatenation = (StringConcatenation) theEObject;
			Object result = caseStringConcatenation(stringConcatenation);
			if (result == null)
				result = caseOperandExpression(stringConcatenation);
			if (result == null)
				result = caseExpression(stringConcatenation);
			if (result == null)
				result = caseElement(stringConcatenation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.BOOLEAN_EXPRESSION: {
			BooleanExpression booleanExpression = (BooleanExpression) theEObject;
			Object result = caseBooleanExpression(booleanExpression);
			if (result == null)
				result = caseOperandExpression(booleanExpression);
			if (result == null)
				result = caseExpression(booleanExpression);
			if (result == null)
				result = caseElement(booleanExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.BINARY_EXPRESSION: {
			BinaryExpression binaryExpression = (BinaryExpression) theEObject;
			Object result = caseBinaryExpression(binaryExpression);
			if (result == null)
				result = caseOperandExpression(binaryExpression);
			if (result == null)
				result = caseExpression(binaryExpression);
			if (result == null)
				result = caseElement(binaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionsPackage.OPERAND_EXPRESSION: {
			OperandExpression operandExpression = (OperandExpression) theEObject;
			Object result = caseOperandExpression(operandExpression);
			if (result == null)
				result = caseExpression(operandExpression);
			if (result == null)
				result = caseElement(operandExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVarDeclaration(VarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCastExpression(CastExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTernaryExpression(TernaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanceof Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanceof Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceofExpression(InstanceofExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Concatenation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringConcatenation(StringConcatenation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperandExpression(OperandExpression object) {
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

} //ExpressionsSwitch
