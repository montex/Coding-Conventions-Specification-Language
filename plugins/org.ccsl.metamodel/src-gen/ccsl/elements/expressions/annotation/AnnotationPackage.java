/**
 */
package ccsl.elements.expressions.annotation;

import ccsl.elements.ElementsPackage;

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
 * @see ccsl.elements.expressions.annotation.AnnotationFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/expressions/annotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationPackage eINSTANCE = ccsl.elements.expressions.annotation.impl.AnnotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.annotation.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.annotation.impl.AnnotationImpl
	 * @see ccsl.elements.expressions.annotation.impl.AnnotationPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__UNIQUE_NAME = ExpressionsPackage.EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUES = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUES_KIND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.annotation.impl.AnnotationFieldValueImpl <em>Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.annotation.impl.AnnotationFieldValueImpl
	 * @see ccsl.elements.expressions.annotation.impl.AnnotationPackageImpl#getAnnotationFieldValue()
	 * @generated
	 */
	int ANNOTATION_FIELD_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD_VALUE__UNIQUE_NAME = ElementsPackage.ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD_VALUE__VALUE = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD_VALUE__FIELD = ElementsPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD_VALUE_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.annotation.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ccsl.elements.expressions.annotation.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.annotation.Annotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.expressions.annotation.Annotation#getType()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.expressions.annotation.Annotation#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see ccsl.elements.expressions.annotation.Annotation#getValues()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Values();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.annotation.Annotation#getValuesKind <em>Values Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values Kind</em>'.
	 * @see ccsl.elements.expressions.annotation.Annotation#getValuesKind()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_ValuesKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Value</em>'.
	 * @see ccsl.elements.expressions.annotation.AnnotationFieldValue
	 * @generated
	 */
	EClass getAnnotationFieldValue();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ccsl.elements.expressions.annotation.AnnotationFieldValue#getValue()
	 * @see #getAnnotationFieldValue()
	 * @generated
	 */
	EReference getAnnotationFieldValue_Value();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.annotation.AnnotationFieldValue#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see ccsl.elements.expressions.annotation.AnnotationFieldValue#getField()
	 * @see #getAnnotationFieldValue()
	 * @generated
	 */
	EReference getAnnotationFieldValue_Field();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationFactory getAnnotationFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.expressions.annotation.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.annotation.impl.AnnotationImpl
		 * @see ccsl.elements.expressions.annotation.impl.AnnotationPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TYPE = eINSTANCE.getAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__VALUES = eINSTANCE.getAnnotation_Values();

		/**
		 * The meta object literal for the '<em><b>Values Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUES_KIND = eINSTANCE.getAnnotation_ValuesKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.annotation.impl.AnnotationFieldValueImpl <em>Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.annotation.impl.AnnotationFieldValueImpl
		 * @see ccsl.elements.expressions.annotation.impl.AnnotationPackageImpl#getAnnotationFieldValue()
		 * @generated
		 */
		EClass ANNOTATION_FIELD_VALUE = eINSTANCE.getAnnotationFieldValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_FIELD_VALUE__VALUE = eINSTANCE.getAnnotationFieldValue_Value();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_FIELD_VALUE__FIELD = eINSTANCE.getAnnotationFieldValue_Field();

	}

} //AnnotationPackage
