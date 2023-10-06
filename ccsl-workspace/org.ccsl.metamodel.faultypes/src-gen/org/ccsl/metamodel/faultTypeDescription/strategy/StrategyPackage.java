/**
 */
package org.ccsl.metamodel.faultTypeDescription.strategy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.ccsl.metamodel.faultTypeDescription.strategy.StrategyFactory
 * @model kind="package"
 * @generated
 */
public interface StrategyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "strategy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/faultTypeDescription/strategy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "strategy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StrategyPackage eINSTANCE = org.ccsl.metamodel.faultTypeDescription.strategy.impl.StrategyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.strategy.impl.AllStrategyImpl <em>All Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.strategy.impl.AllStrategyImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.strategy.impl.StrategyPackageImpl#getAllStrategy()
	 * @generated
	 */
	int ALL_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>All Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.strategy.AllStrategy <em>All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Strategy</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.strategy.AllStrategy
	 * @generated
	 */
	EClass getAllStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StrategyFactory getStrategyFactory();

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
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.strategy.impl.AllStrategyImpl <em>All Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.strategy.impl.AllStrategyImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.strategy.impl.StrategyPackageImpl#getAllStrategy()
		 * @generated
		 */
		EClass ALL_STRATEGY = eINSTANCE.getAllStrategy();

	}

} //StrategyPackage
