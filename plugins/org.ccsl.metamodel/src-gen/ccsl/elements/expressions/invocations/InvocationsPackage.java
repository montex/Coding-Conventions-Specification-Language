/**
 */
package ccsl.elements.expressions.invocations;

import ccsl.elements.expressions.ExpressionsPackage;

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
 * @see ccsl.elements.expressions.invocations.InvocationsFactory
 * @model kind="package"
 * @generated
 */
public interface InvocationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "invocations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/expressions/invocations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "invocations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InvocationsPackage eINSTANCE = ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.invocations.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.invocations.impl.InvocationImpl
	 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__UNIQUE_NAME = ExpressionsPackage.EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__ARGS_KIND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__METHOD = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__ARGS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__TYPE_ARGS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__TYPE_ARGS_KIND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.invocations.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.invocations.impl.MethodInvocationImpl
	 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getMethodInvocation()
	 * @generated
	 */
	int METHOD_INVOCATION = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__UNIQUE_NAME = INVOCATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ARGS_KIND = INVOCATION__ARGS_KIND;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__METHOD = INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ARGS = INVOCATION__ARGS;

	/**
	 * The feature id for the '<em><b>Type Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__TYPE_ARGS = INVOCATION__TYPE_ARGS;

	/**
	 * The feature id for the '<em><b>Type Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__TYPE_ARGS_KIND = INVOCATION__TYPE_ARGS_KIND;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__FROM = INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_FEATURE_COUNT = INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.invocations.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.invocations.impl.ConstructorInvocationImpl
	 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getConstructorInvocation()
	 * @generated
	 */
	int CONSTRUCTOR_INVOCATION = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__UNIQUE_NAME = INVOCATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ARGS_KIND = INVOCATION__ARGS_KIND;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__METHOD = INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ARGS = INVOCATION__ARGS;

	/**
	 * The feature id for the '<em><b>Type Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__TYPE_ARGS = INVOCATION__TYPE_ARGS;

	/**
	 * The feature id for the '<em><b>Type Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__TYPE_ARGS_KIND = INVOCATION__TYPE_ARGS_KIND;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__CONSTRUCTOR = INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_FEATURE_COUNT = INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.invocations.impl.SuperMethodInvocationImpl <em>Super Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.invocations.impl.SuperMethodInvocationImpl
	 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getSuperMethodInvocation()
	 * @generated
	 */
	int SUPER_METHOD_INVOCATION = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__UNIQUE_NAME = METHOD_INVOCATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ARGS_KIND = METHOD_INVOCATION__ARGS_KIND;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__METHOD = METHOD_INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ARGS = METHOD_INVOCATION__ARGS;

	/**
	 * The feature id for the '<em><b>Type Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__TYPE_ARGS = METHOD_INVOCATION__TYPE_ARGS;

	/**
	 * The feature id for the '<em><b>Type Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__TYPE_ARGS_KIND = METHOD_INVOCATION__TYPE_ARGS_KIND;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__FROM = METHOD_INVOCATION__FROM;

	/**
	 * The number of structural features of the '<em>Super Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_FEATURE_COUNT = METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.invocations.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation</em>'.
	 * @see ccsl.elements.expressions.invocations.MethodInvocation
	 * @generated
	 */
	EClass getMethodInvocation();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.invocations.MethodInvocation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see ccsl.elements.expressions.invocations.MethodInvocation#getFrom()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_From();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.invocations.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see ccsl.elements.expressions.invocations.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.invocations.Invocation#getArgsKind <em>Args Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args Kind</em>'.
	 * @see ccsl.elements.expressions.invocations.Invocation#getArgsKind()
	 * @see #getInvocation()
	 * @generated
	 */
	EAttribute getInvocation_ArgsKind();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.invocations.Invocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see ccsl.elements.expressions.invocations.Invocation#getMethod()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.expressions.invocations.Invocation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see ccsl.elements.expressions.invocations.Invocation#getArgs()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_Args();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.elements.expressions.invocations.Invocation#getTypeArgs <em>Type Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Args</em>'.
	 * @see ccsl.elements.expressions.invocations.Invocation#getTypeArgs()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_TypeArgs();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.invocations.Invocation#getTypeArgsKind <em>Type Args Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Args Kind</em>'.
	 * @see ccsl.elements.expressions.invocations.Invocation#getTypeArgsKind()
	 * @see #getInvocation()
	 * @generated
	 */
	EAttribute getInvocation_TypeArgsKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.invocations.ConstructorInvocation <em>Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Invocation</em>'.
	 * @see ccsl.elements.expressions.invocations.ConstructorInvocation
	 * @generated
	 */
	EClass getConstructorInvocation();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.invocations.ConstructorInvocation#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constructor</em>'.
	 * @see ccsl.elements.expressions.invocations.ConstructorInvocation#getConstructor()
	 * @see #getConstructorInvocation()
	 * @generated
	 */
	EReference getConstructorInvocation_Constructor();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.invocations.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Method Invocation</em>'.
	 * @see ccsl.elements.expressions.invocations.SuperMethodInvocation
	 * @generated
	 */
	EClass getSuperMethodInvocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InvocationsFactory getInvocationsFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.expressions.invocations.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.invocations.impl.MethodInvocationImpl
		 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getMethodInvocation()
		 * @generated
		 */
		EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__FROM = eINSTANCE.getMethodInvocation_From();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.invocations.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.invocations.impl.InvocationImpl
		 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Args Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION__ARGS_KIND = eINSTANCE.getInvocation_ArgsKind();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__METHOD = eINSTANCE.getInvocation_Method();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__ARGS = eINSTANCE.getInvocation_Args();

		/**
		 * The meta object literal for the '<em><b>Type Args</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__TYPE_ARGS = eINSTANCE.getInvocation_TypeArgs();

		/**
		 * The meta object literal for the '<em><b>Type Args Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION__TYPE_ARGS_KIND = eINSTANCE.getInvocation_TypeArgsKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.invocations.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.invocations.impl.ConstructorInvocationImpl
		 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getConstructorInvocation()
		 * @generated
		 */
		EClass CONSTRUCTOR_INVOCATION = eINSTANCE.getConstructorInvocation();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_INVOCATION__CONSTRUCTOR = eINSTANCE.getConstructorInvocation_Constructor();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.invocations.impl.SuperMethodInvocationImpl <em>Super Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.invocations.impl.SuperMethodInvocationImpl
		 * @see ccsl.elements.expressions.invocations.impl.InvocationsPackageImpl#getSuperMethodInvocation()
		 * @generated
		 */
		EClass SUPER_METHOD_INVOCATION = eINSTANCE.getSuperMethodInvocation();

	}

} //InvocationsPackage
