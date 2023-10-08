/**
 */
package ccsl.functions.numberFunctions.impl;

import ccsl.functions.numberFunctions.*;

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
public class NumberFunctionsFactoryImpl extends EFactoryImpl implements NumberFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumberFunctionsFactory init() {
		try {
			NumberFunctionsFactory theNumberFunctionsFactory = (NumberFunctionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(NumberFunctionsPackage.eNS_URI);
			if (theNumberFunctionsFactory != null) {
				return theNumberFunctionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NumberFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberFunctionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NumberFunctionsPackage.CCSL_INTEGER_LITERAL:
			return createCcslIntegerLiteral();
		case NumberFunctionsPackage.GET_INDEX_OF:
			return createGetIndexOf();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcslIntegerLiteral createCcslIntegerLiteral() {
		CcslIntegerLiteralImpl ccslIntegerLiteral = new CcslIntegerLiteralImpl();
		return ccslIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetIndexOf createGetIndexOf() {
		GetIndexOfImpl getIndexOf = new GetIndexOfImpl();
		return getIndexOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberFunctionsPackage getNumberFunctionsPackage() {
		return (NumberFunctionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static NumberFunctionsPackage getPackage() {
		return NumberFunctionsPackage.eINSTANCE;
	}

} //NumberFunctionsFactoryImpl
