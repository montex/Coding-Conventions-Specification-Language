/**
 */
package ccsl.elements.datatype.impl;

import ccsl.elements.datatype.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypeFactoryImpl extends EFactoryImpl implements DatatypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeFactory init() {
		try {
			DatatypeFactory theDatatypeFactory = (DatatypeFactory) EPackage.Registry.INSTANCE
					.getEFactory(DatatypePackage.eNS_URI);
			if (theDatatypeFactory != null) {
				return theDatatypeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DatatypePackage.DATA_TYPE:
			return createDataType();
		case DatatypePackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case DatatypePackage.BOOLEAN_PRIMITIVE_TYPE:
			return createBooleanPrimitiveType();
		case DatatypePackage.SHORT_PRIMITIVE_TYPE:
			return createShortPrimitiveType();
		case DatatypePackage.OBJECT_TYPE:
			return createObjectType();
		case DatatypePackage.PARAMETERIZED_TYPE:
			return createParameterizedType();
		case DatatypePackage.INT_PRIMITIVE_TYPE:
			return createIntPrimitiveType();
		case DatatypePackage.ARRAY_TYPE:
			return createArrayType();
		case DatatypePackage.VOID_TYPE:
			return createVoidType();
		case DatatypePackage.TYPE_PARAMETER:
			return createTypeParameter();
		case DatatypePackage.WILD_CARD_TYPE:
			return createWildCardType();
		case DatatypePackage.BYTE_PRIMITIVE_TYPE:
			return createBytePrimitiveType();
		case DatatypePackage.CHAR_PRIMITIVE_TYPE:
			return createCharPrimitiveType();
		case DatatypePackage.DOUBLE_PRIMITIVE_TYPE:
			return createDoublePrimitiveType();
		case DatatypePackage.FLOAT_PRIMITIVE_TYPE:
			return createFloatPrimitiveType();
		case DatatypePackage.LONG_PRIMITIVE_TYPE:
			return createLongPrimitiveType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanPrimitiveType createBooleanPrimitiveType() {
		BooleanPrimitiveTypeImpl booleanPrimitiveType = new BooleanPrimitiveTypeImpl();
		return booleanPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortPrimitiveType createShortPrimitiveType() {
		ShortPrimitiveTypeImpl shortPrimitiveType = new ShortPrimitiveTypeImpl();
		return shortPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedType createParameterizedType() {
		ParameterizedTypeImpl parameterizedType = new ParameterizedTypeImpl();
		return parameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntPrimitiveType createIntPrimitiveType() {
		IntPrimitiveTypeImpl intPrimitiveType = new IntPrimitiveTypeImpl();
		return intPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildCardType createWildCardType() {
		WildCardTypeImpl wildCardType = new WildCardTypeImpl();
		return wildCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BytePrimitiveType createBytePrimitiveType() {
		BytePrimitiveTypeImpl bytePrimitiveType = new BytePrimitiveTypeImpl();
		return bytePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharPrimitiveType createCharPrimitiveType() {
		CharPrimitiveTypeImpl charPrimitiveType = new CharPrimitiveTypeImpl();
		return charPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoublePrimitiveType createDoublePrimitiveType() {
		DoublePrimitiveTypeImpl doublePrimitiveType = new DoublePrimitiveTypeImpl();
		return doublePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatPrimitiveType createFloatPrimitiveType() {
		FloatPrimitiveTypeImpl floatPrimitiveType = new FloatPrimitiveTypeImpl();
		return floatPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongPrimitiveType createLongPrimitiveType() {
		LongPrimitiveTypeImpl longPrimitiveType = new LongPrimitiveTypeImpl();
		return longPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypePackage getDatatypePackage() {
		return (DatatypePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static DatatypePackage getPackage() {
		return DatatypePackage.eINSTANCE;
	}

} //DatatypeFactoryImpl
