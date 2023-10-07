/**
 */
package ccsl.functions.numberFunctions;

import ccsl.functions.FunctionsPackage;

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
 * @see ccsl.functions.numberFunctions.NumberFunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface NumberFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "numberFunctions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/functions/numberFunctions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "numberFunctions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NumberFunctionsPackage eINSTANCE = ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.functions.numberFunctions.impl.CcslNumberFunctionImpl <em>Ccsl Number Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.numberFunctions.impl.CcslNumberFunctionImpl
	 * @see ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl#getCcslNumberFunction()
	 * @generated
	 */
	int CCSL_NUMBER_FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Ccsl Number Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCSL_NUMBER_FUNCTION_FEATURE_COUNT = FunctionsPackage.CCSL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.functions.numberFunctions.impl.CcslIntegerLiteralImpl <em>Ccsl Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.numberFunctions.impl.CcslIntegerLiteralImpl
	 * @see ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl#getCcslIntegerLiteral()
	 * @generated
	 */
	int CCSL_INTEGER_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCSL_INTEGER_LITERAL__VALUE = CCSL_NUMBER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ccsl Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCSL_INTEGER_LITERAL_FEATURE_COUNT = CCSL_NUMBER_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.functions.numberFunctions.impl.GetIndexOfImpl <em>Get Index Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.functions.numberFunctions.impl.GetIndexOfImpl
	 * @see ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl#getGetIndexOf()
	 * @generated
	 */
	int GET_INDEX_OF = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INDEX_OF__CONTAINER = CCSL_NUMBER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INDEX_OF__FIELD = CCSL_NUMBER_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Index Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INDEX_OF_FEATURE_COUNT = CCSL_NUMBER_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ccsl.functions.numberFunctions.CcslNumberFunction <em>Ccsl Number Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ccsl Number Function</em>'.
	 * @see ccsl.functions.numberFunctions.CcslNumberFunction
	 * @generated
	 */
	EClass getCcslNumberFunction();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.numberFunctions.CcslIntegerLiteral <em>Ccsl Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ccsl Integer Literal</em>'.
	 * @see ccsl.functions.numberFunctions.CcslIntegerLiteral
	 * @generated
	 */
	EClass getCcslIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.functions.numberFunctions.CcslIntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ccsl.functions.numberFunctions.CcslIntegerLiteral#getValue()
	 * @see #getCcslIntegerLiteral()
	 * @generated
	 */
	EAttribute getCcslIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link ccsl.functions.numberFunctions.GetIndexOf <em>Get Index Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Index Of</em>'.
	 * @see ccsl.functions.numberFunctions.GetIndexOf
	 * @generated
	 */
	EClass getGetIndexOf();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.numberFunctions.GetIndexOf#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see ccsl.functions.numberFunctions.GetIndexOf#getContainer()
	 * @see #getGetIndexOf()
	 * @generated
	 */
	EReference getGetIndexOf_Container();

	/**
	 * Returns the meta object for the reference '{@link ccsl.functions.numberFunctions.GetIndexOf#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see ccsl.functions.numberFunctions.GetIndexOf#getField()
	 * @see #getGetIndexOf()
	 * @generated
	 */
	EReference getGetIndexOf_Field();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NumberFunctionsFactory getNumberFunctionsFactory();

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
		 * The meta object literal for the '{@link ccsl.functions.numberFunctions.impl.CcslNumberFunctionImpl <em>Ccsl Number Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.numberFunctions.impl.CcslNumberFunctionImpl
		 * @see ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl#getCcslNumberFunction()
		 * @generated
		 */
		EClass CCSL_NUMBER_FUNCTION = eINSTANCE.getCcslNumberFunction();

		/**
		 * The meta object literal for the '{@link ccsl.functions.numberFunctions.impl.CcslIntegerLiteralImpl <em>Ccsl Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.numberFunctions.impl.CcslIntegerLiteralImpl
		 * @see ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl#getCcslIntegerLiteral()
		 * @generated
		 */
		EClass CCSL_INTEGER_LITERAL = eINSTANCE.getCcslIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCSL_INTEGER_LITERAL__VALUE = eINSTANCE.getCcslIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link ccsl.functions.numberFunctions.impl.GetIndexOfImpl <em>Get Index Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.functions.numberFunctions.impl.GetIndexOfImpl
		 * @see ccsl.functions.numberFunctions.impl.NumberFunctionsPackageImpl#getGetIndexOf()
		 * @generated
		 */
		EClass GET_INDEX_OF = eINSTANCE.getGetIndexOf();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_INDEX_OF__CONTAINER = eINSTANCE.getGetIndexOf_Container();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_INDEX_OF__FIELD = eINSTANCE.getGetIndexOf_Field();

	}

} //NumberFunctionsPackage
