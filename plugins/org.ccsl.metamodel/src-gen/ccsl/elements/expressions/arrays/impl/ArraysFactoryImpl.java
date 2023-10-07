/**
 */
package ccsl.elements.expressions.arrays.impl;

import ccsl.elements.expressions.arrays.*;

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
public class ArraysFactoryImpl extends EFactoryImpl implements ArraysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArraysFactory init() {
		try {
			ArraysFactory theArraysFactory = (ArraysFactory) EPackage.Registry.INSTANCE
					.getEFactory(ArraysPackage.eNS_URI);
			if (theArraysFactory != null) {
				return theArraysFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArraysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArraysPackage.ARRAY_CREATION:
			return createArrayCreation();
		case ArraysPackage.ARRAY_INDEXES_ACCESS:
			return createArrayIndexesAccess();
		case ArraysPackage.ARRAY_INITIALIZER:
			return createArrayInitializer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayCreation createArrayCreation() {
		ArrayCreationImpl arrayCreation = new ArrayCreationImpl();
		return arrayCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayIndexesAccess createArrayIndexesAccess() {
		ArrayIndexesAccessImpl arrayIndexesAccess = new ArrayIndexesAccessImpl();
		return arrayIndexesAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer createArrayInitializer() {
		ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraysPackage getArraysPackage() {
		return (ArraysPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ArraysPackage getPackage() {
		return ArraysPackage.eINSTANCE;
	}

} //ArraysFactoryImpl
