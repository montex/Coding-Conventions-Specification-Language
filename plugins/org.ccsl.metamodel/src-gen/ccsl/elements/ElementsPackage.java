/**
 */
package ccsl.elements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ccsl.elements.ElementsFactory
 * @model kind="package"
 * @generated
 */
public interface ElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElementsPackage eINSTANCE = ccsl.elements.impl.ElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.impl.ElementImpl
	 * @see ccsl.elements.impl.ElementsPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNIQUE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.impl.ControlledAccessElementImpl <em>Controlled Access Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.impl.ControlledAccessElementImpl
	 * @see ccsl.elements.impl.ElementsPackageImpl#getControlledAccessElement()
	 * @generated
	 */
	int CONTROLLED_ACCESS_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_ACCESS_ELEMENT__UNIQUE_NAME = ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_ACCESS_ELEMENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controlled Access Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_ACCESS_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.impl.AnnotableImpl <em>Annotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.impl.AnnotableImpl
	 * @see ccsl.elements.impl.ElementsPackageImpl#getAnnotable()
	 * @generated
	 */
	int ANNOTABLE = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE__UNIQUE_NAME = ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE__ANNOTATIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.Visibility
	 * @see ccsl.elements.impl.ElementsPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 3;

	/**
	 * The meta object id for the '{@link ccsl.elements.Inheritance <em>Inheritance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.Inheritance
	 * @see ccsl.elements.impl.ElementsPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 4;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ccsl.elements.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.Element#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see ccsl.elements.Element#getUniqueName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UniqueName();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.ControlledAccessElement <em>Controlled Access Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlled Access Element</em>'.
	 * @see ccsl.elements.ControlledAccessElement
	 * @generated
	 */
	EClass getControlledAccessElement();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.ControlledAccessElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see ccsl.elements.ControlledAccessElement#getVisibility()
	 * @see #getControlledAccessElement()
	 * @generated
	 */
	EAttribute getControlledAccessElement_Visibility();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.Annotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable</em>'.
	 * @see ccsl.elements.Annotable
	 * @generated
	 */
	EClass getAnnotable();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.Annotable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see ccsl.elements.Annotable#getAnnotations()
	 * @see #getAnnotable()
	 * @generated
	 */
	EReference getAnnotable_Annotations();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see ccsl.elements.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance</em>'.
	 * @see ccsl.elements.Inheritance
	 * @generated
	 */
	EEnum getInheritance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElementsFactory getElementsFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.impl.ElementImpl
		 * @see ccsl.elements.impl.ElementsPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UNIQUE_NAME = eINSTANCE.getElement_UniqueName();

		/**
		 * The meta object literal for the '{@link ccsl.elements.impl.ControlledAccessElementImpl <em>Controlled Access Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.impl.ControlledAccessElementImpl
		 * @see ccsl.elements.impl.ElementsPackageImpl#getControlledAccessElement()
		 * @generated
		 */
		EClass CONTROLLED_ACCESS_ELEMENT = eINSTANCE.getControlledAccessElement();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLED_ACCESS_ELEMENT__VISIBILITY = eINSTANCE.getControlledAccessElement_Visibility();

		/**
		 * The meta object literal for the '{@link ccsl.elements.impl.AnnotableImpl <em>Annotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.impl.AnnotableImpl
		 * @see ccsl.elements.impl.ElementsPackageImpl#getAnnotable()
		 * @generated
		 */
		EClass ANNOTABLE = eINSTANCE.getAnnotable();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTABLE__ANNOTATIONS = eINSTANCE.getAnnotable_Annotations();

		/**
		 * The meta object literal for the '{@link ccsl.elements.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.Visibility
		 * @see ccsl.elements.impl.ElementsPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link ccsl.elements.Inheritance <em>Inheritance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.Inheritance
		 * @see ccsl.elements.impl.ElementsPackageImpl#getInheritance()
		 * @generated
		 */
		EEnum INHERITANCE = eINSTANCE.getInheritance();

	}

} //ElementsPackage
