/**
 */
package ccsl.functions.numberFunctions.util;

import ccsl.functions.CcslFunction;

import ccsl.functions.numberFunctions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.functions.numberFunctions.NumberFunctionsPackage
 * @generated
 */
public class NumberFunctionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NumberFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberFunctionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NumberFunctionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberFunctionsSwitch modelSwitch = new NumberFunctionsSwitch() {
		public Object caseCcslNumberFunction(CcslNumberFunction object) {
			return createCcslNumberFunctionAdapter();
		}

		public Object caseCcslIntegerLiteral(CcslIntegerLiteral object) {
			return createCcslIntegerLiteralAdapter();
		}

		public Object caseGetIndexOf(GetIndexOf object) {
			return createGetIndexOfAdapter();
		}

		public Object caseCcslFunction(CcslFunction object) {
			return createCcslFunctionAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.numberFunctions.CcslNumberFunction <em>Ccsl Number Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.numberFunctions.CcslNumberFunction
	 * @generated
	 */
	public Adapter createCcslNumberFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.numberFunctions.CcslIntegerLiteral <em>Ccsl Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.numberFunctions.CcslIntegerLiteral
	 * @generated
	 */
	public Adapter createCcslIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.numberFunctions.GetIndexOf <em>Get Index Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.numberFunctions.GetIndexOf
	 * @generated
	 */
	public Adapter createGetIndexOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.CcslFunction <em>Ccsl Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.CcslFunction
	 * @generated
	 */
	public Adapter createCcslFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NumberFunctionsAdapterFactory
