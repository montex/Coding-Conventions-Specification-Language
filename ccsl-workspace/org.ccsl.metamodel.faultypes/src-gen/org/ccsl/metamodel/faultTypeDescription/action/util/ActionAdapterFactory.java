/**
 */
package org.ccsl.metamodel.faultTypeDescription.action.util;

import org.ccsl.metamodel.faultTypeDescription.action.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionPackage
 * @generated
 */
public class ActionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActionPackage.eINSTANCE;
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
	@Override
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
	protected ActionSwitch<Adapter> modelSwitch = new ActionSwitch<Adapter>() {
		@Override
		public Adapter caseDeleteAction(DeleteAction object) {
			return createDeleteActionAdapter();
		}

		@Override
		public Adapter caseMoveScopeUpAction(MoveScopeUpAction object) {
			return createMoveScopeUpActionAdapter();
		}

		@Override
		public Adapter caseDeleteInfixOperatorAction(DeleteInfixOperatorAction object) {
			return createDeleteInfixOperatorActionAdapter();
		}

		@Override
		public Adapter caseChangeLiteralValueAction(ChangeLiteralValueAction object) {
			return createChangeLiteralValueActionAdapter();
		}

		@Override
		public Adapter caseDeleteRandomStatementAction(DeleteRandomStatementAction object) {
			return createDeleteRandomStatementActionAdapter();
		}

		@Override
		public Adapter caseReplaceVariableAccessAction(ReplaceVariableAccessAction object) {
			return createReplaceVariableAccessActionAdapter();
		}

		@Override
		public Adapter caseReplaceArithmeticOperatorAction(ReplaceArithmeticOperatorAction object) {
			return createReplaceArithmeticOperatorActionAdapter();
		}

		@Override
		public Adapter caseArithmeticOperatorMap(ArithmeticOperatorMap object) {
			return createArithmeticOperatorMapAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.DeleteAction
	 * @generated
	 */
	public Adapter createDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.MoveScopeUpAction <em>Move Scope Up Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.MoveScopeUpAction
	 * @generated
	 */
	public Adapter createMoveScopeUpActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.DeleteInfixOperatorAction <em>Delete Infix Operator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.DeleteInfixOperatorAction
	 * @generated
	 */
	public Adapter createDeleteInfixOperatorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.ChangeLiteralValueAction <em>Change Literal Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ChangeLiteralValueAction
	 * @generated
	 */
	public Adapter createChangeLiteralValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.DeleteRandomStatementAction <em>Delete Random Statement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.DeleteRandomStatementAction
	 * @generated
	 */
	public Adapter createDeleteRandomStatementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.ReplaceVariableAccessAction <em>Replace Variable Access Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ReplaceVariableAccessAction
	 * @generated
	 */
	public Adapter createReplaceVariableAccessActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction <em>Replace Arithmetic Operator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction
	 * @generated
	 */
	public Adapter createReplaceArithmeticOperatorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap <em>Arithmetic Operator Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap
	 * @generated
	 */
	public Adapter createArithmeticOperatorMapAdapter() {
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

} //ActionAdapterFactory
