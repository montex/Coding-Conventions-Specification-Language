/**
 */
package org.ccsl.metamodel.faultTypeDescription;

import ccsl.ccslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ccsl.metamodel.faultTypeDescription.FaultypesFactory
 * @model kind="package"
 * @generated
 */
public interface FaultypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "faultTypeDescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/faultTypeDescription";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "faultTypeDescription";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FaultypesPackage eINSTANCE = org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.impl.InjectionActionImpl <em>Injection Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.impl.InjectionActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl#getInjectionAction()
	 * @generated
	 */
	int INJECTION_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_ACTION__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Injection Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.impl.InjectionStrategyImpl <em>Injection Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.impl.InjectionStrategyImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl#getInjectionStrategy()
	 * @generated
	 */
	int INJECTION_STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Injection Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl <em>Fault Type Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl#getFaultTypeDescription()
	 * @generated
	 */
	int FAULT_TYPE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TYPE_DESCRIPTION__NAME = ccslPackage.ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TYPE_DESCRIPTION__RULE = ccslPackage.ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TYPE_DESCRIPTION__ACTIONS = ccslPackage.ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TYPE_DESCRIPTION__STRATEGIES = ccslPackage.ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fault Type Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TYPE_DESCRIPTION_FEATURE_COUNT = ccslPackage.ROOT_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.InjectionAction <em>Injection Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Injection Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.InjectionAction
	 * @generated
	 */
	EClass getInjectionAction();

	/**
	 * Returns the meta object for the reference '{@link org.ccsl.metamodel.faultTypeDescription.InjectionAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.InjectionAction#getTarget()
	 * @see #getInjectionAction()
	 * @generated
	 */
	EReference getInjectionAction_Target();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.InjectionStrategy <em>Injection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Injection Strategy</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.InjectionStrategy
	 * @generated
	 */
	EClass getInjectionStrategy();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription <em>Fault Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Type Description</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription
	 * @generated
	 */
	EClass getFaultTypeDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getName()
	 * @see #getFaultTypeDescription()
	 * @generated
	 */
	EAttribute getFaultTypeDescription_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getRule()
	 * @see #getFaultTypeDescription()
	 * @generated
	 */
	EReference getFaultTypeDescription_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getActions()
	 * @see #getFaultTypeDescription()
	 * @generated
	 */
	EReference getFaultTypeDescription_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.FaultTypeDescription#getStrategies()
	 * @see #getFaultTypeDescription()
	 * @generated
	 */
	EReference getFaultTypeDescription_Strategies();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FaultypesFactory getFaultypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.impl.InjectionActionImpl <em>Injection Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.impl.InjectionActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl#getInjectionAction()
		 * @generated
		 */
		EClass INJECTION_ACTION = eINSTANCE.getInjectionAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INJECTION_ACTION__TARGET = eINSTANCE.getInjectionAction_Target();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.impl.InjectionStrategyImpl <em>Injection Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.impl.InjectionStrategyImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl#getInjectionStrategy()
		 * @generated
		 */
		EClass INJECTION_STRATEGY = eINSTANCE.getInjectionStrategy();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl <em>Fault Type Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultTypeDescriptionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.impl.FaultypesPackageImpl#getFaultTypeDescription()
		 * @generated
		 */
		EClass FAULT_TYPE_DESCRIPTION = eINSTANCE.getFaultTypeDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_TYPE_DESCRIPTION__NAME = eINSTANCE.getFaultTypeDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TYPE_DESCRIPTION__RULE = eINSTANCE.getFaultTypeDescription_Rule();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TYPE_DESCRIPTION__ACTIONS = eINSTANCE.getFaultTypeDescription_Actions();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TYPE_DESCRIPTION__STRATEGIES = eINSTANCE.getFaultTypeDescription_Strategies();

	}

} //FaultypesPackage
