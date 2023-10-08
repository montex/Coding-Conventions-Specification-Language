/**
 */
package ccsl.functions.booleanFunctions.impl;

import ccsl.functions.booleanFunctions.*;

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
public class BooleanFunctionsFactoryImpl extends EFactoryImpl implements BooleanFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanFunctionsFactory init() {
		try {
			BooleanFunctionsFactory theBooleanFunctionsFactory = (BooleanFunctionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(BooleanFunctionsPackage.eNS_URI);
			if (theBooleanFunctionsFactory != null) {
				return theBooleanFunctionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BooleanFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanFunctionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanFunctionsPackage getBooleanFunctionsPackage() {
		return (BooleanFunctionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static BooleanFunctionsPackage getPackage() {
		return BooleanFunctionsPackage.eINSTANCE;
	}

} //BooleanFunctionsFactoryImpl
