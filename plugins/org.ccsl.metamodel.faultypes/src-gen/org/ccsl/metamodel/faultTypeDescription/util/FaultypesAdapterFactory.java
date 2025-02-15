/**
 */
package org.ccsl.metamodel.faultTypeDescription.util;

import ccsl.Root;

import org.ccsl.metamodel.faultTypeDescription.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesPackage
 * @generated
 */
public class FaultypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FaultypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FaultypesPackage.eINSTANCE;
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
	protected FaultypesSwitch modelSwitch = new FaultypesSwitch() {
		public Object caseInjectionAction(InjectionAction object) {
			return createInjectionActionAdapter();
		}

		public Object caseInjectionStrategy(InjectionStrategy object) {
			return createInjectionStrategyAdapter();
		}

		public Object caseFaultTypeDescription(FaultTypeDescription object) {
			return createFaultTypeDescriptionAdapter();
		}

		public Object caseRoot(Root object) {
			return createRootAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.InjectionAction <em>Injection Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.InjectionAction
	 * @generated
	 */
	public Adapter createInjectionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.InjectionStrategy <em>Injection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.InjectionStrategy
	 * @generated
	 */
	public Adapter createInjectionStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription <em>Fault Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription
	 * @generated
	 */
	public Adapter createFaultTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
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

} //FaultypesAdapterFactory
