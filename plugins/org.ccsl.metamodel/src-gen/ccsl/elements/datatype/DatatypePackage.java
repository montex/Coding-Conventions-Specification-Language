/**
 */
package ccsl.elements.datatype;

import ccsl.elements.ElementsPackage;

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
 * @see ccsl.elements.datatype.DatatypeFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/datatype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypePackage eINSTANCE = ccsl.elements.datatype.impl.DatatypePackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.DataTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UNIQUE_NAME = ElementsPackage.ELEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.PrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__UNIQUE_NAME = DATA_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.BooleanPrimitiveTypeImpl <em>Boolean Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.BooleanPrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getBooleanPrimitiveType()
	 * @generated
	 */
	int BOOLEAN_PRIMITIVE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Boolean Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.ShortPrimitiveTypeImpl <em>Short Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.ShortPrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getShortPrimitiveType()
	 * @generated
	 */
	int SHORT_PRIMITIVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Short Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.ObjectTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__UNIQUE_NAME = DATA_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.ParameterizedTypeImpl <em>Parameterized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.ParameterizedTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getParameterizedType()
	 * @generated
	 */
	int PARAMETERIZED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__UNIQUE_NAME = OBJECT_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE_ARGUMENTS = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.IntPrimitiveTypeImpl <em>Int Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.IntPrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getIntPrimitiveType()
	 * @generated
	 */
	int INT_PRIMITIVE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Int Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.ArrayTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__UNIQUE_NAME = OBJECT_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIMENSIONS = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__TYPE = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.VoidTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.TypeParameterImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__UNIQUE_NAME = OBJECT_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BOUNDS = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounds Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BOUNDS_KIND = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.WildCardTypeImpl <em>Wild Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.WildCardTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getWildCardType()
	 * @generated
	 */
	int WILD_CARD_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__UNIQUE_NAME = OBJECT_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__BOUND = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wild Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.BytePrimitiveTypeImpl <em>Byte Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.BytePrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getBytePrimitiveType()
	 * @generated
	 */
	int BYTE_PRIMITIVE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Byte Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.CharPrimitiveTypeImpl <em>Char Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.CharPrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getCharPrimitiveType()
	 * @generated
	 */
	int CHAR_PRIMITIVE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Char Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.DoublePrimitiveTypeImpl <em>Double Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.DoublePrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getDoublePrimitiveType()
	 * @generated
	 */
	int DOUBLE_PRIMITIVE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Double Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.FloatPrimitiveTypeImpl <em>Float Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.FloatPrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getFloatPrimitiveType()
	 * @generated
	 */
	int FLOAT_PRIMITIVE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Float Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.datatype.impl.LongPrimitiveTypeImpl <em>Long Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.datatype.impl.LongPrimitiveTypeImpl
	 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getLongPrimitiveType()
	 * @generated
	 */
	int LONG_PRIMITIVE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRIMITIVE_TYPE__UNIQUE_NAME = PRIMITIVE_TYPE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Long Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see ccsl.elements.datatype.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see ccsl.elements.datatype.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.BooleanPrimitiveType <em>Boolean Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Primitive Type</em>'.
	 * @see ccsl.elements.datatype.BooleanPrimitiveType
	 * @generated
	 */
	EClass getBooleanPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.ShortPrimitiveType <em>Short Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Primitive Type</em>'.
	 * @see ccsl.elements.datatype.ShortPrimitiveType
	 * @generated
	 */
	EClass getShortPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see ccsl.elements.datatype.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.ParameterizedType <em>Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Type</em>'.
	 * @see ccsl.elements.datatype.ParameterizedType
	 * @generated
	 */
	EClass getParameterizedType();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.elements.datatype.ParameterizedType#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Arguments</em>'.
	 * @see ccsl.elements.datatype.ParameterizedType#getTypeArguments()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_TypeArguments();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.datatype.ParameterizedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.datatype.ParameterizedType#getType()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.IntPrimitiveType <em>Int Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Primitive Type</em>'.
	 * @see ccsl.elements.datatype.IntPrimitiveType
	 * @generated
	 */
	EClass getIntPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see ccsl.elements.datatype.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.datatype.ArrayType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see ccsl.elements.datatype.ArrayType#getDimensions()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Dimensions();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.datatype.ArrayType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.datatype.ArrayType#getType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see ccsl.elements.datatype.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see ccsl.elements.datatype.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.elements.datatype.TypeParameter#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bounds</em>'.
	 * @see ccsl.elements.datatype.TypeParameter#getBounds()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.datatype.TypeParameter#getBoundsKind <em>Bounds Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounds Kind</em>'.
	 * @see ccsl.elements.datatype.TypeParameter#getBoundsKind()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EAttribute getTypeParameter_BoundsKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.WildCardType <em>Wild Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wild Card Type</em>'.
	 * @see ccsl.elements.datatype.WildCardType
	 * @generated
	 */
	EClass getWildCardType();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.datatype.WildCardType#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound</em>'.
	 * @see ccsl.elements.datatype.WildCardType#getBound()
	 * @see #getWildCardType()
	 * @generated
	 */
	EReference getWildCardType_Bound();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.BytePrimitiveType <em>Byte Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Primitive Type</em>'.
	 * @see ccsl.elements.datatype.BytePrimitiveType
	 * @generated
	 */
	EClass getBytePrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.CharPrimitiveType <em>Char Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Primitive Type</em>'.
	 * @see ccsl.elements.datatype.CharPrimitiveType
	 * @generated
	 */
	EClass getCharPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.DoublePrimitiveType <em>Double Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Primitive Type</em>'.
	 * @see ccsl.elements.datatype.DoublePrimitiveType
	 * @generated
	 */
	EClass getDoublePrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.FloatPrimitiveType <em>Float Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Primitive Type</em>'.
	 * @see ccsl.elements.datatype.FloatPrimitiveType
	 * @generated
	 */
	EClass getFloatPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.datatype.LongPrimitiveType <em>Long Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Primitive Type</em>'.
	 * @see ccsl.elements.datatype.LongPrimitiveType
	 * @generated
	 */
	EClass getLongPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypeFactory getDatatypeFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.DataTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.PrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.BooleanPrimitiveTypeImpl <em>Boolean Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.BooleanPrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getBooleanPrimitiveType()
		 * @generated
		 */
		EClass BOOLEAN_PRIMITIVE_TYPE = eINSTANCE.getBooleanPrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.ShortPrimitiveTypeImpl <em>Short Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.ShortPrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getShortPrimitiveType()
		 * @generated
		 */
		EClass SHORT_PRIMITIVE_TYPE = eINSTANCE.getShortPrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.ObjectTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.ParameterizedTypeImpl <em>Parameterized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.ParameterizedTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getParameterizedType()
		 * @generated
		 */
		EClass PARAMETERIZED_TYPE = eINSTANCE.getParameterizedType();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TYPE__TYPE_ARGUMENTS = eINSTANCE.getParameterizedType_TypeArguments();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TYPE__TYPE = eINSTANCE.getParameterizedType_Type();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.IntPrimitiveTypeImpl <em>Int Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.IntPrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getIntPrimitiveType()
		 * @generated
		 */
		EClass INT_PRIMITIVE_TYPE = eINSTANCE.getIntPrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.ArrayTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__DIMENSIONS = eINSTANCE.getArrayType_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__TYPE = eINSTANCE.getArrayType_Type();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.VoidTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.TypeParameterImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER__BOUNDS = eINSTANCE.getTypeParameter_Bounds();

		/**
		 * The meta object literal for the '<em><b>Bounds Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_PARAMETER__BOUNDS_KIND = eINSTANCE.getTypeParameter_BoundsKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.WildCardTypeImpl <em>Wild Card Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.WildCardTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getWildCardType()
		 * @generated
		 */
		EClass WILD_CARD_TYPE = eINSTANCE.getWildCardType();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILD_CARD_TYPE__BOUND = eINSTANCE.getWildCardType_Bound();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.BytePrimitiveTypeImpl <em>Byte Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.BytePrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getBytePrimitiveType()
		 * @generated
		 */
		EClass BYTE_PRIMITIVE_TYPE = eINSTANCE.getBytePrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.CharPrimitiveTypeImpl <em>Char Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.CharPrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getCharPrimitiveType()
		 * @generated
		 */
		EClass CHAR_PRIMITIVE_TYPE = eINSTANCE.getCharPrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.DoublePrimitiveTypeImpl <em>Double Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.DoublePrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getDoublePrimitiveType()
		 * @generated
		 */
		EClass DOUBLE_PRIMITIVE_TYPE = eINSTANCE.getDoublePrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.FloatPrimitiveTypeImpl <em>Float Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.FloatPrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getFloatPrimitiveType()
		 * @generated
		 */
		EClass FLOAT_PRIMITIVE_TYPE = eINSTANCE.getFloatPrimitiveType();

		/**
		 * The meta object literal for the '{@link ccsl.elements.datatype.impl.LongPrimitiveTypeImpl <em>Long Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.datatype.impl.LongPrimitiveTypeImpl
		 * @see ccsl.elements.datatype.impl.DatatypePackageImpl#getLongPrimitiveType()
		 * @generated
		 */
		EClass LONG_PRIMITIVE_TYPE = eINSTANCE.getLongPrimitiveType();

	}

} //DatatypePackage
