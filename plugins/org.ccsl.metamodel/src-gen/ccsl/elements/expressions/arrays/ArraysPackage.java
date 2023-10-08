/**
 */
package ccsl.elements.expressions.arrays;

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
 * @see ccsl.elements.expressions.arrays.ArraysFactory
 * @model kind="package"
 * @generated
 */
public interface ArraysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arrays";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/expressions/arrays";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arrays";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArraysPackage eINSTANCE = ccsl.elements.expressions.arrays.impl.ArraysPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.arrays.impl.ArrayCreationImpl <em>Array Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.arrays.impl.ArrayCreationImpl
	 * @see ccsl.elements.expressions.arrays.impl.ArraysPackageImpl#getArrayCreation()
	 * @generated
	 */
	int ARRAY_CREATION = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__UNIQUE_NAME = ExpressionsPackage.EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__TYPE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__INITIALIZER = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__DIMENSIONS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dimensions Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__DIMENSIONS_KIND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Array Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.arrays.impl.ArrayIndexesAccessImpl <em>Array Indexes Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.arrays.impl.ArrayIndexesAccessImpl
	 * @see ccsl.elements.expressions.arrays.impl.ArraysPackageImpl#getArrayIndexesAccess()
	 * @generated
	 */
	int ARRAY_INDEXES_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEXES_ACCESS__UNIQUE_NAME = ExpressionsPackage.EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEXES_ACCESS__INDEXES = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexes Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEXES_ACCESS__INDEXES_KIND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Indexes Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEXES_ACCESS_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.arrays.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.arrays.impl.ArrayInitializerImpl
	 * @see ccsl.elements.expressions.arrays.impl.ArraysPackageImpl#getArrayInitializer()
	 * @generated
	 */
	int ARRAY_INITIALIZER = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__UNIQUE_NAME = ExpressionsPackage.EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__VALUES = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values Kind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__VALUES_KIND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.arrays.ArrayCreation <em>Array Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Creation</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayCreation
	 * @generated
	 */
	EClass getArrayCreation();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.arrays.ArrayCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayCreation#getType()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.arrays.ArrayCreation#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayCreation#getInitializer()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Initializer();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.expressions.arrays.ArrayCreation#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayCreation#getDimensions()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.arrays.ArrayCreation#getDimensionsKind <em>Dimensions Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions Kind</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayCreation#getDimensionsKind()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EAttribute getArrayCreation_DimensionsKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess <em>Array Indexes Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Indexes Access</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayIndexesAccess
	 * @generated
	 */
	EClass getArrayIndexesAccess();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexes()
	 * @see #getArrayIndexesAccess()
	 * @generated
	 */
	EReference getArrayIndexesAccess_Indexes();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexesKind <em>Indexes Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexes Kind</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayIndexesAccess#getIndexesKind()
	 * @see #getArrayIndexesAccess()
	 * @generated
	 */
	EAttribute getArrayIndexesAccess_IndexesKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.arrays.ArrayInitializer <em>Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Initializer</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayInitializer
	 * @generated
	 */
	EClass getArrayInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.expressions.arrays.ArrayInitializer#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayInitializer#getValues()
	 * @see #getArrayInitializer()
	 * @generated
	 */
	EReference getArrayInitializer_Values();

	/**
	 * Returns the meta object for the attribute list '{@link ccsl.elements.expressions.arrays.ArrayInitializer#getValuesKind <em>Values Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values Kind</em>'.
	 * @see ccsl.elements.expressions.arrays.ArrayInitializer#getValuesKind()
	 * @see #getArrayInitializer()
	 * @generated
	 */
	EAttribute getArrayInitializer_ValuesKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArraysFactory getArraysFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.expressions.arrays.impl.ArrayCreationImpl <em>Array Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.arrays.impl.ArrayCreationImpl
		 * @see ccsl.elements.expressions.arrays.impl.ArraysPackageImpl#getArrayCreation()
		 * @generated
		 */
		EClass ARRAY_CREATION = eINSTANCE.getArrayCreation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CREATION__TYPE = eINSTANCE.getArrayCreation_Type();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CREATION__INITIALIZER = eINSTANCE.getArrayCreation_Initializer();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CREATION__DIMENSIONS = eINSTANCE.getArrayCreation_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Dimensions Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_CREATION__DIMENSIONS_KIND = eINSTANCE.getArrayCreation_DimensionsKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.arrays.impl.ArrayIndexesAccessImpl <em>Array Indexes Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.arrays.impl.ArrayIndexesAccessImpl
		 * @see ccsl.elements.expressions.arrays.impl.ArraysPackageImpl#getArrayIndexesAccess()
		 * @generated
		 */
		EClass ARRAY_INDEXES_ACCESS = eINSTANCE.getArrayIndexesAccess();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INDEXES_ACCESS__INDEXES = eINSTANCE.getArrayIndexesAccess_Indexes();

		/**
		 * The meta object literal for the '<em><b>Indexes Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_INDEXES_ACCESS__INDEXES_KIND = eINSTANCE.getArrayIndexesAccess_IndexesKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.arrays.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.arrays.impl.ArrayInitializerImpl
		 * @see ccsl.elements.expressions.arrays.impl.ArraysPackageImpl#getArrayInitializer()
		 * @generated
		 */
		EClass ARRAY_INITIALIZER = eINSTANCE.getArrayInitializer();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INITIALIZER__VALUES = eINSTANCE.getArrayInitializer_Values();

		/**
		 * The meta object literal for the '<em><b>Values Kind</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_INITIALIZER__VALUES_KIND = eINSTANCE.getArrayInitializer_ValuesKind();

	}

} //ArraysPackage
