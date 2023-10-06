/**
 */
package org.ccsl.metamodel.faultTypeDescription.strategy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ccsl.metamodel.faultTypeDescription.strategy.StrategyPackage
 * @generated
 */
public interface StrategyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StrategyFactory eINSTANCE = org.ccsl.metamodel.faultTypeDescription.strategy.impl.StrategyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>All Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Strategy</em>'.
	 * @generated
	 */
	AllStrategy createAllStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StrategyPackage getStrategyPackage();

} //StrategyFactory
