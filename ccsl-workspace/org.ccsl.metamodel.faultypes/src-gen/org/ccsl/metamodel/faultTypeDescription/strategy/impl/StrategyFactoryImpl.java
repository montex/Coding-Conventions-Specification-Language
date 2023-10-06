/**
 */
package org.ccsl.metamodel.faultTypeDescription.strategy.impl;

import org.ccsl.metamodel.faultTypeDescription.strategy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategyFactoryImpl extends EFactoryImpl implements StrategyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StrategyFactory init() {
		try {
			StrategyFactory theStrategyFactory = (StrategyFactory) EPackage.Registry.INSTANCE
					.getEFactory(StrategyPackage.eNS_URI);
			if (theStrategyFactory != null) {
				return theStrategyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StrategyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StrategyPackage.ALL_STRATEGY:
			return createAllStrategy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllStrategy createAllStrategy() {
		AllStrategyImpl allStrategy = new AllStrategyImpl();
		return allStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyPackage getStrategyPackage() {
		return (StrategyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static StrategyPackage getPackage() {
		return StrategyPackage.eINSTANCE;
	}

} //StrategyFactoryImpl
