/**
 */
package ccsl.elements.namedElements.variable;

import ccsl.elements.namedElements.NamedElementsPackage;

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
 * @see ccsl.elements.namedElements.variable.VariableFactory
 * @model kind="package"
 * @generated
 */
public interface VariablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/namedElements/variable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablePackage eINSTANCE = ccsl.elements.namedElements.variable.impl.VariablePackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.variable.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.variable.impl.VariableImpl
	 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UNIQUE_NAME = NamedElementsPackage.NAMED_ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANNOTATIONS = NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NamedElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__AVAILABLE_IN_SOURCE_CODE = NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FINAL = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.variable.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.variable.impl.ParameterVariableImpl
	 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getParameterVariable()
	 * @generated
	 */
	int PARAMETER_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__UNIQUE_NAME = VARIABLE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__AVAILABLE_IN_SOURCE_CODE = VARIABLE__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__FINAL = VARIABLE__FINAL;

	/**
	 * The number of structural features of the '<em>Parameter Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.variable.impl.InitializableVariableImpl <em>Initializable Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.variable.impl.InitializableVariableImpl
	 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getInitializableVariable()
	 * @generated
	 */
	int INITIALIZABLE_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE__UNIQUE_NAME = VARIABLE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE__AVAILABLE_IN_SOURCE_CODE = VARIABLE__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE__FINAL = VARIABLE__FINAL;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initializable Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.variable.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.variable.impl.LocalVariableImpl
	 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__UNIQUE_NAME = INITIALIZABLE_VARIABLE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__ANNOTATIONS = INITIALIZABLE_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAME = INITIALIZABLE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__AVAILABLE_IN_SOURCE_CODE = INITIALIZABLE_VARIABLE__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE = INITIALIZABLE_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__FINAL = INITIALIZABLE_VARIABLE__FINAL;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__INITIAL_VALUE = INITIALIZABLE_VARIABLE__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = INITIALIZABLE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.variable.impl.FieldVariableImpl <em>Field Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.variable.impl.FieldVariableImpl
	 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getFieldVariable()
	 * @generated
	 */
	int FIELD_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__UNIQUE_NAME = INITIALIZABLE_VARIABLE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__ANNOTATIONS = INITIALIZABLE_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__NAME = INITIALIZABLE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__AVAILABLE_IN_SOURCE_CODE = INITIALIZABLE_VARIABLE__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__TYPE = INITIALIZABLE_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__FINAL = INITIALIZABLE_VARIABLE__FINAL;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__INITIAL_VALUE = INITIALIZABLE_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__VISIBILITY = INITIALIZABLE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__STATIC = INITIALIZABLE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE__VOLATILE = INITIALIZABLE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VARIABLE_FEATURE_COUNT = INITIALIZABLE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.variable.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ccsl.elements.namedElements.variable.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.namedElements.variable.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.namedElements.variable.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.variable.Variable#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see ccsl.elements.namedElements.variable.Variable#getFinal()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Final();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.variable.ParameterVariable <em>Parameter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Variable</em>'.
	 * @see ccsl.elements.namedElements.variable.ParameterVariable
	 * @generated
	 */
	EClass getParameterVariable();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.variable.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see ccsl.elements.namedElements.variable.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.variable.InitializableVariable <em>Initializable Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializable Variable</em>'.
	 * @see ccsl.elements.namedElements.variable.InitializableVariable
	 * @generated
	 */
	EClass getInitializableVariable();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.namedElements.variable.InitializableVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see ccsl.elements.namedElements.variable.InitializableVariable#getInitialValue()
	 * @see #getInitializableVariable()
	 * @generated
	 */
	EReference getInitializableVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.variable.FieldVariable <em>Field Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Variable</em>'.
	 * @see ccsl.elements.namedElements.variable.FieldVariable
	 * @generated
	 */
	EClass getFieldVariable();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.variable.FieldVariable#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see ccsl.elements.namedElements.variable.FieldVariable#getStatic()
	 * @see #getFieldVariable()
	 * @generated
	 */
	EAttribute getFieldVariable_Static();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.variable.FieldVariable#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see ccsl.elements.namedElements.variable.FieldVariable#getVolatile()
	 * @see #getFieldVariable()
	 * @generated
	 */
	EAttribute getFieldVariable_Volatile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariableFactory getVariableFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.namedElements.variable.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.variable.impl.VariableImpl
		 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__FINAL = eINSTANCE.getVariable_Final();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.variable.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.variable.impl.ParameterVariableImpl
		 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getParameterVariable()
		 * @generated
		 */
		EClass PARAMETER_VARIABLE = eINSTANCE.getParameterVariable();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.variable.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.variable.impl.LocalVariableImpl
		 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.variable.impl.InitializableVariableImpl <em>Initializable Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.variable.impl.InitializableVariableImpl
		 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getInitializableVariable()
		 * @generated
		 */
		EClass INITIALIZABLE_VARIABLE = eINSTANCE.getInitializableVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZABLE_VARIABLE__INITIAL_VALUE = eINSTANCE.getInitializableVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.variable.impl.FieldVariableImpl <em>Field Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.variable.impl.FieldVariableImpl
		 * @see ccsl.elements.namedElements.variable.impl.VariablePackageImpl#getFieldVariable()
		 * @generated
		 */
		EClass FIELD_VARIABLE = eINSTANCE.getFieldVariable();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_VARIABLE__STATIC = eINSTANCE.getFieldVariable_Static();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_VARIABLE__VOLATILE = eINSTANCE.getFieldVariable_Volatile();

	}

} //VariablePackage
