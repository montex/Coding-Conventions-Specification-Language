/**
 */
package ccsl.elements.expressions.accesses;

import ccsl.elements.expressions.ExpressionsPackage;

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
 * @see ccsl.elements.expressions.accesses.AccessesFactory
 * @model kind="package"
 * @generated
 */
public interface AccessesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accesses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/expressions/accesses";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accesses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessesPackage eINSTANCE = ccsl.elements.expressions.accesses.impl.AccessesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.accesses.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.accesses.impl.AccessImpl
	 * @see ccsl.elements.expressions.accesses.impl.AccessesPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__UNIQUE_NAME = ExpressionsPackage.EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__FROM = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.accesses.impl.VariableAccessImpl <em>Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.accesses.impl.VariableAccessImpl
	 * @see ccsl.elements.expressions.accesses.impl.AccessesPackageImpl#getVariableAccess()
	 * @generated
	 */
	int VARIABLE_ACCESS = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__UNIQUE_NAME = ACCESS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__FROM = ACCESS__FROM;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__VARIABLE = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.accesses.impl.DataTypeAccessImpl <em>Data Type Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.accesses.impl.DataTypeAccessImpl
	 * @see ccsl.elements.expressions.accesses.impl.AccessesPackageImpl#getDataTypeAccess()
	 * @generated
	 */
	int DATA_TYPE_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ACCESS__UNIQUE_NAME = ACCESS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ACCESS__FROM = ACCESS__FROM;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ACCESS__DATATYPE = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.accesses.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Access</em>'.
	 * @see ccsl.elements.expressions.accesses.VariableAccess
	 * @generated
	 */
	EClass getVariableAccess();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.accesses.VariableAccess#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ccsl.elements.expressions.accesses.VariableAccess#getVariable()
	 * @see #getVariableAccess()
	 * @generated
	 */
	EReference getVariableAccess_Variable();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.accesses.DataTypeAccess <em>Data Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Access</em>'.
	 * @see ccsl.elements.expressions.accesses.DataTypeAccess
	 * @generated
	 */
	EClass getDataTypeAccess();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.accesses.DataTypeAccess#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see ccsl.elements.expressions.accesses.DataTypeAccess#getDatatype()
	 * @see #getDataTypeAccess()
	 * @generated
	 */
	EReference getDataTypeAccess_Datatype();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.accesses.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see ccsl.elements.expressions.accesses.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.accesses.Access#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see ccsl.elements.expressions.accesses.Access#getFrom()
	 * @see #getAccess()
	 * @generated
	 */
	EReference getAccess_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccessesFactory getAccessesFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.expressions.accesses.impl.VariableAccessImpl <em>Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.accesses.impl.VariableAccessImpl
		 * @see ccsl.elements.expressions.accesses.impl.AccessesPackageImpl#getVariableAccess()
		 * @generated
		 */
		EClass VARIABLE_ACCESS = eINSTANCE.getVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACCESS__VARIABLE = eINSTANCE.getVariableAccess_Variable();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.accesses.impl.DataTypeAccessImpl <em>Data Type Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.accesses.impl.DataTypeAccessImpl
		 * @see ccsl.elements.expressions.accesses.impl.AccessesPackageImpl#getDataTypeAccess()
		 * @generated
		 */
		EClass DATA_TYPE_ACCESS = eINSTANCE.getDataTypeAccess();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_ACCESS__DATATYPE = eINSTANCE.getDataTypeAccess_Datatype();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.accesses.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.accesses.impl.AccessImpl
		 * @see ccsl.elements.expressions.accesses.impl.AccessesPackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS__FROM = eINSTANCE.getAccess_From();

	}

} //AccessesPackage
