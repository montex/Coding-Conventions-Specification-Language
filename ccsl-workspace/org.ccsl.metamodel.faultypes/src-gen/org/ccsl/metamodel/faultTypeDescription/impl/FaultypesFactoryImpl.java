/**
 */
package org.ccsl.metamodel.faultTypeDescription.impl;

import org.ccsl.metamodel.faultTypeDescription.*;

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
public class FaultypesFactoryImpl extends EFactoryImpl implements FaultypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FaultypesFactory init() {
		try {
			FaultypesFactory theFaultypesFactory = (FaultypesFactory) EPackage.Registry.INSTANCE
					.getEFactory(FaultypesPackage.eNS_URI);
			if (theFaultypesFactory != null) {
				return theFaultypesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FaultypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FaultypesPackage.FAULT_TYPE_DESCRIPTION:
			return createFaultTypeDescription();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTypeDescription createFaultTypeDescription() {
		FaultTypeDescriptionImpl faultTypeDescription = new FaultTypeDescriptionImpl();
		return faultTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultypesPackage getFaultypesPackage() {
		return (FaultypesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FaultypesPackage getPackage() {
		return FaultypesPackage.eINSTANCE;
	}

} //FaultypesFactoryImpl
