/**
 */
package ccsl.elements.namedElements.complexType;

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
 * @see ccsl.elements.namedElements.complexType.ComplexTypeFactory
 * @model kind="package"
 * @generated
 */
public interface ComplexTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "complexType";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/namedElements/complexType";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "complexType";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComplexTypePackage eINSTANCE = ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__UNIQUE_NAME = NamedElementsPackage.NAMED_ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ANNOTATIONS = NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = NamedElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE = NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__VISIBILITY = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__STATIC = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__IMPORTS = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NESTED_TYPES = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__INHERITANCE = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getComplexTypeDeclaration()
	 * @generated
	 */
	int COMPLEX_TYPE_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__UNIQUE_NAME = TYPE_DECLARATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE = TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__VISIBILITY = TYPE_DECLARATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__STATIC = TYPE_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__IMPORTS = TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__NESTED_TYPES = TYPE_DECLARATION__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__INHERITANCE = TYPE_DECLARATION__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__FIELDS = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__METHODS = TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__FIELDS_KIND = TYPE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Methods Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__METHODS_KIND = TYPE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES = TYPE_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.JInterfaceImpl <em>JInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.JInterfaceImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getJInterface()
	 * @generated
	 */
	int JINTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__UNIQUE_NAME = COMPLEX_TYPE_DECLARATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__ANNOTATIONS = COMPLEX_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__NAME = COMPLEX_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__AVAILABLE_IN_SOURCE_CODE = COMPLEX_TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__VISIBILITY = COMPLEX_TYPE_DECLARATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__STATIC = COMPLEX_TYPE_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__IMPORTS = COMPLEX_TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__NESTED_TYPES = COMPLEX_TYPE_DECLARATION__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__INHERITANCE = COMPLEX_TYPE_DECLARATION__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__FIELDS = COMPLEX_TYPE_DECLARATION__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__METHODS = COMPLEX_TYPE_DECLARATION__METHODS;

	/**
	 * The feature id for the '<em><b>Fields Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__FIELDS_KIND = COMPLEX_TYPE_DECLARATION__FIELDS_KIND;

	/**
	 * The feature id for the '<em><b>Methods Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__METHODS_KIND = COMPLEX_TYPE_DECLARATION__METHODS_KIND;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__SUPER_INTERFACES = COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The number of structural features of the '<em>JInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE_FEATURE_COUNT = COMPLEX_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypeImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__UNIQUE_NAME = ElementsPackage.ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__FIELDS = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__METHODS = ElementsPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__FIELDS_KIND = ElementsPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Methods Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__METHODS_KIND = ElementsPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.AnonymousClassImpl <em>Anonymous Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.AnonymousClassImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getAnonymousClass()
	 * @generated
	 */
	int ANONYMOUS_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS__UNIQUE_NAME = COMPLEX_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS__FIELDS = COMPLEX_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS__METHODS = COMPLEX_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Fields Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS__FIELDS_KIND = COMPLEX_TYPE__FIELDS_KIND;

	/**
	 * The feature id for the '<em><b>Methods Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS__METHODS_KIND = COMPLEX_TYPE__METHODS_KIND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS__TYPE = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anonymous Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.ConstructComplexTypeDeclarationImpl <em>Construct Complex Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.ConstructComplexTypeDeclarationImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getConstructComplexTypeDeclaration()
	 * @generated
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION = 9;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__UNIQUE_NAME = COMPLEX_TYPE_DECLARATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__ANNOTATIONS = COMPLEX_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__NAME = COMPLEX_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE = COMPLEX_TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__VISIBILITY = COMPLEX_TYPE_DECLARATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__STATIC = COMPLEX_TYPE_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__IMPORTS = COMPLEX_TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__NESTED_TYPES = COMPLEX_TYPE_DECLARATION__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__INHERITANCE = COMPLEX_TYPE_DECLARATION__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__FIELDS = COMPLEX_TYPE_DECLARATION__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__METHODS = COMPLEX_TYPE_DECLARATION__METHODS;

	/**
	 * The feature id for the '<em><b>Fields Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__FIELDS_KIND = COMPLEX_TYPE_DECLARATION__FIELDS_KIND;

	/**
	 * The feature id for the '<em><b>Methods Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__METHODS_KIND = COMPLEX_TYPE_DECLARATION__METHODS_KIND;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES = COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS = COMPLEX_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Construct Complex Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_COMPLEX_TYPE_DECLARATION_FEATURE_COUNT = COMPLEX_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.JClassImpl <em>JClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.JClassImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getJClass()
	 * @generated
	 */
	int JCLASS = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__UNIQUE_NAME = CONSTRUCT_COMPLEX_TYPE_DECLARATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ANNOTATIONS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NAME = CONSTRUCT_COMPLEX_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__AVAILABLE_IN_SOURCE_CODE = CONSTRUCT_COMPLEX_TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__VISIBILITY = CONSTRUCT_COMPLEX_TYPE_DECLARATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__STATIC = CONSTRUCT_COMPLEX_TYPE_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__IMPORTS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NESTED_TYPES = CONSTRUCT_COMPLEX_TYPE_DECLARATION__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__INHERITANCE = CONSTRUCT_COMPLEX_TYPE_DECLARATION__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FIELDS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__METHODS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__METHODS;

	/**
	 * The feature id for the '<em><b>Fields Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FIELDS_KIND = CONSTRUCT_COMPLEX_TYPE_DECLARATION__FIELDS_KIND;

	/**
	 * The feature id for the '<em><b>Methods Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__METHODS_KIND = CONSTRUCT_COMPLEX_TYPE_DECLARATION__METHODS_KIND;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__SUPER_INTERFACES = CONSTRUCT_COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__CONSTRUCTORS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__SUPER_CLASS = CONSTRUCT_COMPLEX_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_FEATURE_COUNT = CONSTRUCT_COMPLEX_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.AnnotationTypeImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__UNIQUE_NAME = TYPE_DECLARATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__AVAILABLE_IN_SOURCE_CODE = TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__VISIBILITY = TYPE_DECLARATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__STATIC = TYPE_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__IMPORTS = TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NESTED_TYPES = TYPE_DECLARATION__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__INHERITANCE = TYPE_DECLARATION__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__FIELDS = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.AnnotationFieldImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getAnnotationField()
	 * @generated
	 */
	int ANNOTATION_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD__UNIQUE_NAME = NamedElementsPackage.NAMED_ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD__ANNOTATIONS = NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD__NAME = NamedElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD__AVAILABLE_IN_SOURCE_CODE = NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD__DEFAULT = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD__TYPE = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FIELD_FEATURE_COUNT = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.JEnumImpl <em>JEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.JEnumImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getJEnum()
	 * @generated
	 */
	int JENUM = 7;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__UNIQUE_NAME = CONSTRUCT_COMPLEX_TYPE_DECLARATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__ANNOTATIONS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__NAME = CONSTRUCT_COMPLEX_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__AVAILABLE_IN_SOURCE_CODE = CONSTRUCT_COMPLEX_TYPE_DECLARATION__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__VISIBILITY = CONSTRUCT_COMPLEX_TYPE_DECLARATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__STATIC = CONSTRUCT_COMPLEX_TYPE_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__IMPORTS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__NESTED_TYPES = CONSTRUCT_COMPLEX_TYPE_DECLARATION__NESTED_TYPES;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__INHERITANCE = CONSTRUCT_COMPLEX_TYPE_DECLARATION__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__FIELDS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__METHODS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__METHODS;

	/**
	 * The feature id for the '<em><b>Fields Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__FIELDS_KIND = CONSTRUCT_COMPLEX_TYPE_DECLARATION__FIELDS_KIND;

	/**
	 * The feature id for the '<em><b>Methods Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__METHODS_KIND = CONSTRUCT_COMPLEX_TYPE_DECLARATION__METHODS_KIND;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__SUPER_INTERFACES = CONSTRUCT_COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__CONSTRUCTORS = CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS;

	/**
	 * The feature id for the '<em><b>Enum Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM__ENUM_CONSTANTS = CONSTRUCT_COMPLEX_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUM_FEATURE_COUNT = CONSTRUCT_COMPLEX_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.namedElements.complexType.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.namedElements.complexType.impl.EnumConstantImpl
	 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getEnumConstant()
	 * @generated
	 */
	int ENUM_CONSTANT = 10;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__UNIQUE_NAME = NamedElementsPackage.NAMED_ELEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__ANNOTATIONS = NamedElementsPackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__NAME = NamedElementsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Available In Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__AVAILABLE_IN_SOURCE_CODE = NamedElementsPackage.NAMED_ELEMENT__AVAILABLE_IN_SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__ARGUMENTS = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__ARGUMENTS_KIND = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_FEATURE_COUNT = NamedElementsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.JInterface <em>JInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JInterface</em>'.
	 * @see ccsl.elements.namedElements.complexType.JInterface
	 * @generated
	 */
	EClass getJInterface();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.AnonymousClass <em>Anonymous Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class</em>'.
	 * @see ccsl.elements.namedElements.complexType.AnonymousClass
	 * @generated
	 */
	EClass getAnonymousClass();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.namedElements.complexType.AnonymousClass#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.namedElements.complexType.AnonymousClass#getType()
	 * @see #getAnonymousClass()
	 * @generated
	 */
	EReference getAnonymousClass_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClass</em>'.
	 * @see ccsl.elements.namedElements.complexType.JClass
	 * @generated
	 */
	EClass getJClass();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.namedElements.complexType.JClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see ccsl.elements.namedElements.complexType.JClass#getSuperClass()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_SuperClass();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see ccsl.elements.namedElements.complexType.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see ccsl.elements.namedElements.complexType.TypeDeclaration#getStatic()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EAttribute getTypeDeclaration_Static();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see ccsl.elements.namedElements.complexType.TypeDeclaration#getImports()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getNestedTypes <em>Nested Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Types</em>'.
	 * @see ccsl.elements.namedElements.complexType.TypeDeclaration#getNestedTypes()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_NestedTypes();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance</em>'.
	 * @see ccsl.elements.namedElements.complexType.TypeDeclaration#getInheritance()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EAttribute getTypeDeclaration_Inheritance();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see ccsl.elements.namedElements.complexType.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.ComplexType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see ccsl.elements.namedElements.complexType.ComplexType#getFields()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.ComplexType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see ccsl.elements.namedElements.complexType.ComplexType#getMethods()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Methods();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.complexType.ComplexType#getFieldsKind <em>Fields Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fields Kind</em>'.
	 * @see ccsl.elements.namedElements.complexType.ComplexType#getFieldsKind()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_FieldsKind();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.complexType.ComplexType#getMethodsKind <em>Methods Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Methods Kind</em>'.
	 * @see ccsl.elements.namedElements.complexType.ComplexType#getMethodsKind()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_MethodsKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see ccsl.elements.namedElements.complexType.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.AnnotationType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see ccsl.elements.namedElements.complexType.AnnotationType#getFields()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Fields();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.AnnotationField <em>Annotation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Field</em>'.
	 * @see ccsl.elements.namedElements.complexType.AnnotationField
	 * @generated
	 */
	EClass getAnnotationField();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.namedElements.complexType.AnnotationField#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ccsl.elements.namedElements.complexType.AnnotationField#getDefault()
	 * @see #getAnnotationField()
	 * @generated
	 */
	EReference getAnnotationField_Default();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.namedElements.complexType.AnnotationField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.namedElements.complexType.AnnotationField#getType()
	 * @see #getAnnotationField()
	 * @generated
	 */
	EReference getAnnotationField_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.JEnum <em>JEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JEnum</em>'.
	 * @see ccsl.elements.namedElements.complexType.JEnum
	 * @generated
	 */
	EClass getJEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.JEnum#getEnumConstants <em>Enum Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Constants</em>'.
	 * @see ccsl.elements.namedElements.complexType.JEnum#getEnumConstants()
	 * @see #getJEnum()
	 * @generated
	 */
	EReference getJEnum_EnumConstants();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.ComplexTypeDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see ccsl.elements.namedElements.complexType.ComplexTypeDeclaration
	 * @generated
	 */
	EClass getComplexTypeDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.elements.namedElements.complexType.ComplexTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Interfaces</em>'.
	 * @see ccsl.elements.namedElements.complexType.ComplexTypeDeclaration#getSuperInterfaces()
	 * @see #getComplexTypeDeclaration()
	 * @generated
	 */
	EReference getComplexTypeDeclaration_SuperInterfaces();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration <em>Construct Complex Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct Complex Type Declaration</em>'.
	 * @see ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration
	 * @generated
	 */
	EClass getConstructComplexTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructors</em>'.
	 * @see ccsl.elements.namedElements.complexType.ConstructComplexTypeDeclaration#getConstructors()
	 * @see #getConstructComplexTypeDeclaration()
	 * @generated
	 */
	EReference getConstructComplexTypeDeclaration_Constructors();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.namedElements.complexType.EnumConstant <em>Enum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Constant</em>'.
	 * @see ccsl.elements.namedElements.complexType.EnumConstant
	 * @generated
	 */
	EClass getEnumConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.namedElements.complexType.EnumConstant#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see ccsl.elements.namedElements.complexType.EnumConstant#getArguments()
	 * @see #getEnumConstant()
	 * @generated
	 */
	EReference getEnumConstant_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.namedElements.complexType.EnumConstant#getArgumentsKind <em>Arguments Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arguments Kind</em>'.
	 * @see ccsl.elements.namedElements.complexType.EnumConstant#getArgumentsKind()
	 * @see #getEnumConstant()
	 * @generated
	 */
	EAttribute getEnumConstant_ArgumentsKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComplexTypeFactory getComplexTypeFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.JInterfaceImpl <em>JInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.JInterfaceImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getJInterface()
		 * @generated
		 */
		EClass JINTERFACE = eINSTANCE.getJInterface();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.AnonymousClassImpl <em>Anonymous Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.AnonymousClassImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getAnonymousClass()
		 * @generated
		 */
		EClass ANONYMOUS_CLASS = eINSTANCE.getAnonymousClass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CLASS__TYPE = eINSTANCE.getAnonymousClass_Type();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.JClassImpl <em>JClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.JClassImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getJClass()
		 * @generated
		 */
		EClass JCLASS = eINSTANCE.getJClass();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__SUPER_CLASS = eINSTANCE.getJClass_SuperClass();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DECLARATION__STATIC = eINSTANCE.getTypeDeclaration_Static();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__IMPORTS = eINSTANCE.getTypeDeclaration_Imports();

		/**
		 * The meta object literal for the '<em><b>Nested Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__NESTED_TYPES = eINSTANCE.getTypeDeclaration_NestedTypes();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DECLARATION__INHERITANCE = eINSTANCE.getTypeDeclaration_Inheritance();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypeImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__FIELDS = eINSTANCE.getComplexType_Fields();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__METHODS = eINSTANCE.getComplexType_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__FIELDS_KIND = eINSTANCE.getComplexType_FieldsKind();

		/**
		 * The meta object literal for the '<em><b>Methods Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__METHODS_KIND = eINSTANCE.getComplexType_MethodsKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.AnnotationTypeImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getAnnotationType()
		 * @generated
		 */
		EClass ANNOTATION_TYPE = eINSTANCE.getAnnotationType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE__FIELDS = eINSTANCE.getAnnotationType_Fields();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.AnnotationFieldImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getAnnotationField()
		 * @generated
		 */
		EClass ANNOTATION_FIELD = eINSTANCE.getAnnotationField();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_FIELD__DEFAULT = eINSTANCE.getAnnotationField_Default();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_FIELD__TYPE = eINSTANCE.getAnnotationField_Type();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.JEnumImpl <em>JEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.JEnumImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getJEnum()
		 * @generated
		 */
		EClass JENUM = eINSTANCE.getJEnum();

		/**
		 * The meta object literal for the '<em><b>Enum Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JENUM__ENUM_CONSTANTS = eINSTANCE.getJEnum_EnumConstants();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypeDeclarationImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getComplexTypeDeclaration()
		 * @generated
		 */
		EClass COMPLEX_TYPE_DECLARATION = eINSTANCE.getComplexTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Super Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE_DECLARATION__SUPER_INTERFACES = eINSTANCE.getComplexTypeDeclaration_SuperInterfaces();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.ConstructComplexTypeDeclarationImpl <em>Construct Complex Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.ConstructComplexTypeDeclarationImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getConstructComplexTypeDeclaration()
		 * @generated
		 */
		EClass CONSTRUCT_COMPLEX_TYPE_DECLARATION = eINSTANCE.getConstructComplexTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCT_COMPLEX_TYPE_DECLARATION__CONSTRUCTORS = eINSTANCE
				.getConstructComplexTypeDeclaration_Constructors();

		/**
		 * The meta object literal for the '{@link ccsl.elements.namedElements.complexType.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.namedElements.complexType.impl.EnumConstantImpl
		 * @see ccsl.elements.namedElements.complexType.impl.ComplexTypePackageImpl#getEnumConstant()
		 * @generated
		 */
		EClass ENUM_CONSTANT = eINSTANCE.getEnumConstant();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_CONSTANT__ARGUMENTS = eINSTANCE.getEnumConstant_Arguments();

		/**
		 * The meta object literal for the '<em><b>Arguments Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_CONSTANT__ARGUMENTS_KIND = eINSTANCE.getEnumConstant_ArgumentsKind();

	}

} //ComplexTypePackage
