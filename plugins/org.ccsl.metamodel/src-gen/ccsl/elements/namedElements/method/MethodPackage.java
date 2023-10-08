/**
 */
package ccsl.elements.namedElements.method;

import ccsl.elements.ElementsPackage;

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
 * @see ccsl.elements.namedElements.method.MethodFactory
 * @model kind="package"
 * @generated
 */
public interface MethodPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "method";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/namedElements/method";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "method";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MethodPackage eINSTANCE = ccsl.elements.namedElements.method.impl.MethodPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl <em>Simple Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.method.impl.SimpleMethodImpl
	 * @see ccsl.elements.namedElements.method.impl.MethodPackageImpl#getSimpleMethod()
	 * @generated
	 */
	int SIMPLE_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD__UNIQUE_NAME = ElementsPackage.ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD__VISIBILITY = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD__ANNOTATIONS = ElementsPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD__PARAMS = ElementsPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Params Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD__PARAMS_KIND = ElementsPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD__THROWN_EXCEPTIONS = ElementsPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD__BODY = ElementsPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simple Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.method.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.method.impl.ConstructorImpl
	 * @see ccsl.elements.namedElements.method.impl.MethodPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__UNIQUE_NAME = SIMPLE_METHOD__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__VISIBILITY = SIMPLE_METHOD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ANNOTATIONS = SIMPLE_METHOD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMS = SIMPLE_METHOD__PARAMS;

	/**
	 * The feature id for the '<em><b>Params Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMS_KIND = SIMPLE_METHOD__PARAMS_KIND;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__THROWN_EXCEPTIONS = SIMPLE_METHOD__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY = SIMPLE_METHOD__BODY;

	/**
	 * The feature id for the '<em><b>Avaliable In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__AVALIABLE_IN_SOURCE_CODE = SIMPLE_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = SIMPLE_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.method.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.method.impl.MethodImpl
	 * @see ccsl.elements.namedElements.method.impl.MethodPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__UNIQUE_NAME = NamedElementsPackage.NAMED_ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATIONS = NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = NamedElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__AVAILABLE_IN_SOURCE_CODE = NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMS = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMS_KIND = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__THROWN_EXCEPTIONS = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATIC = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INHERITANCE = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.method.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see ccsl.elements.namedElements.method.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.method.Constructor#getAvaliableInSourceCode <em>Avaliable In Source Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avaliable In Source Code</em>'.
	 * @see ccsl.elements.namedElements.method.Constructor#getAvaliableInSourceCode()
	 * @see #getConstructor()
	 * @generated
	 */
	EAttribute getConstructor_AvaliableInSourceCode();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.method.SimpleMethod <em>Simple Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Method</em>'.
	 * @see ccsl.elements.namedElements.method.SimpleMethod
	 * @generated
	 */
	EClass getSimpleMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.method.SimpleMethod#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see ccsl.elements.namedElements.method.SimpleMethod#getParams()
	 * @see #getSimpleMethod()
	 * @generated
	 */
	EReference getSimpleMethod_Params();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.method.SimpleMethod#getParamsKind <em>Params Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Params Kind</em>'.
	 * @see ccsl.elements.namedElements.method.SimpleMethod#getParamsKind()
	 * @see #getSimpleMethod()
	 * @generated
	 */
	EAttribute getSimpleMethod_ParamsKind();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.elements.namedElements.method.SimpleMethod#getThrownExceptions <em>Thrown Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thrown Exceptions</em>'.
	 * @see ccsl.elements.namedElements.method.SimpleMethod#getThrownExceptions()
	 * @see #getSimpleMethod()
	 * @generated
	 */
	EReference getSimpleMethod_ThrownExceptions();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.namedElements.method.SimpleMethod#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ccsl.elements.namedElements.method.SimpleMethod#getBody()
	 * @see #getSimpleMethod()
	 * @generated
	 */
	EReference getSimpleMethod_Body();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.method.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see ccsl.elements.namedElements.method.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.namedElements.method.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see ccsl.elements.namedElements.method.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.method.Method#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see ccsl.elements.namedElements.method.Method#getStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Static();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.method.Method#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance</em>'.
	 * @see ccsl.elements.namedElements.method.Method#getInheritance()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Inheritance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MethodFactory getMethodFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.namedElements.method.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.method.impl.ConstructorImpl
		 * @see ccsl.elements.namedElements.method.impl.MethodPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Avaliable In Source Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR__AVALIABLE_IN_SOURCE_CODE = eINSTANCE.getConstructor_AvaliableInSourceCode();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.method.impl.SimpleMethodImpl <em>Simple Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.method.impl.SimpleMethodImpl
		 * @see ccsl.elements.namedElements.method.impl.MethodPackageImpl#getSimpleMethod()
		 * @generated
		 */
		EClass SIMPLE_METHOD = eINSTANCE.getSimpleMethod();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD__PARAMS = eINSTANCE.getSimpleMethod_Params();

		/**
		 * The meta object literal for the '<em><b>Params Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_METHOD__PARAMS_KIND = eINSTANCE.getSimpleMethod_ParamsKind();

		/**
		 * The meta object literal for the '<em><b>Thrown Exceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD__THROWN_EXCEPTIONS = eINSTANCE.getSimpleMethod_ThrownExceptions();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD__BODY = eINSTANCE.getSimpleMethod_Body();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.method.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.method.impl.MethodImpl
		 * @see ccsl.elements.namedElements.method.impl.MethodPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STATIC = eINSTANCE.getMethod_Static();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__INHERITANCE = eINSTANCE.getMethod_Inheritance();

	}

} //MethodPackage
