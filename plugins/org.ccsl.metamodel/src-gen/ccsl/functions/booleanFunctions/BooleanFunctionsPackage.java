/**
 */
package ccsl.functions.booleanFunctions;

import ccsl.functions.FunctionsPackage;

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
 * @see ccsl.functions.booleanFunctions.BooleanFunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface BooleanFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "booleanFunctions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/functions/booleanFunctions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "booleanFunctions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BooleanFunctionsPackage eINSTANCE = ccsl.functions.booleanFunctions.impl.BooleanFunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.functions.booleanFunctions.impl.CcslBooleanFunctionImpl <em>Ccsl Boolean Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.booleanFunctions.impl.CcslBooleanFunctionImpl
	 * @see ccsl.functions.booleanFunctions.impl.BooleanFunctionsPackageImpl#getCcslBooleanFunction()
	 * @generated
	 */
	int CCSL_BOOLEAN_FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Ccsl Boolean Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCSL_BOOLEAN_FUNCTION_FEATURE_COUNT = FunctionsPackage.CCSL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ccsl.functions.booleanFunctions.CcslBooleanFunction <em>Ccsl Boolean Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ccsl Boolean Function</em>'.
	 * @see ccsl.functions.booleanFunctions.CcslBooleanFunction
	 * @generated
	 */
	EClass getCcslBooleanFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BooleanFunctionsFactory getBooleanFunctionsFactory();

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
		 * The meta object literal for the '{@link ccsl.functions.booleanFunctions.impl.CcslBooleanFunctionImpl <em>Ccsl Boolean Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.booleanFunctions.impl.CcslBooleanFunctionImpl
		 * @see ccsl.functions.booleanFunctions.impl.BooleanFunctionsPackageImpl#getCcslBooleanFunction()
		 * @generated
		 */
		EClass CCSL_BOOLEAN_FUNCTION = eINSTANCE.getCcslBooleanFunction();

	}

} //BooleanFunctionsPackage
