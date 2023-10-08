/**
 */
package ccsl.elements.datatype.util;

import ccsl.elements.Element;

import ccsl.elements.datatype.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ccsl.elements.datatype.DatatypePackage
 * @generated
 */
public class DatatypeSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DatatypePackage.DATA_TYPE: {
			DataType dataType = (DataType) theEObject;
			Object result = caseDataType(dataType);
			if (result == null)
				result = caseElement(dataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			Object result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseDataType(primitiveType);
			if (result == null)
				result = caseElement(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.BOOLEAN_PRIMITIVE_TYPE: {
			BooleanPrimitiveType booleanPrimitiveType = (BooleanPrimitiveType) theEObject;
			Object result = caseBooleanPrimitiveType(booleanPrimitiveType);
			if (result == null)
				result = casePrimitiveType(booleanPrimitiveType);
			if (result == null)
				result = caseDataType(booleanPrimitiveType);
			if (result == null)
				result = caseElement(booleanPrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.SHORT_PRIMITIVE_TYPE: {
			ShortPrimitiveType shortPrimitiveType = (ShortPrimitiveType) theEObject;
			Object result = caseShortPrimitiveType(shortPrimitiveType);
			if (result == null)
				result = casePrimitiveType(shortPrimitiveType);
			if (result == null)
				result = caseDataType(shortPrimitiveType);
			if (result == null)
				result = caseElement(shortPrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.OBJECT_TYPE: {
			ObjectType objectType = (ObjectType) theEObject;
			Object result = caseObjectType(objectType);
			if (result == null)
				result = caseDataType(objectType);
			if (result == null)
				result = caseElement(objectType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.PARAMETERIZED_TYPE: {
			ParameterizedType parameterizedType = (ParameterizedType) theEObject;
			Object result = caseParameterizedType(parameterizedType);
			if (result == null)
				result = caseObjectType(parameterizedType);
			if (result == null)
				result = caseDataType(parameterizedType);
			if (result == null)
				result = caseElement(parameterizedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.INT_PRIMITIVE_TYPE: {
			IntPrimitiveType intPrimitiveType = (IntPrimitiveType) theEObject;
			Object result = caseIntPrimitiveType(intPrimitiveType);
			if (result == null)
				result = casePrimitiveType(intPrimitiveType);
			if (result == null)
				result = caseDataType(intPrimitiveType);
			if (result == null)
				result = caseElement(intPrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.ARRAY_TYPE: {
			ArrayType arrayType = (ArrayType) theEObject;
			Object result = caseArrayType(arrayType);
			if (result == null)
				result = caseObjectType(arrayType);
			if (result == null)
				result = caseDataType(arrayType);
			if (result == null)
				result = caseElement(arrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.VOID_TYPE: {
			VoidType voidType = (VoidType) theEObject;
			Object result = caseVoidType(voidType);
			if (result == null)
				result = casePrimitiveType(voidType);
			if (result == null)
				result = caseDataType(voidType);
			if (result == null)
				result = caseElement(voidType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.TYPE_PARAMETER: {
			TypeParameter typeParameter = (TypeParameter) theEObject;
			Object result = caseTypeParameter(typeParameter);
			if (result == null)
				result = caseObjectType(typeParameter);
			if (result == null)
				result = caseDataType(typeParameter);
			if (result == null)
				result = caseElement(typeParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.WILD_CARD_TYPE: {
			WildCardType wildCardType = (WildCardType) theEObject;
			Object result = caseWildCardType(wildCardType);
			if (result == null)
				result = caseObjectType(wildCardType);
			if (result == null)
				result = caseDataType(wildCardType);
			if (result == null)
				result = caseElement(wildCardType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.BYTE_PRIMITIVE_TYPE: {
			BytePrimitiveType bytePrimitiveType = (BytePrimitiveType) theEObject;
			Object result = caseBytePrimitiveType(bytePrimitiveType);
			if (result == null)
				result = casePrimitiveType(bytePrimitiveType);
			if (result == null)
				result = caseDataType(bytePrimitiveType);
			if (result == null)
				result = caseElement(bytePrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.CHAR_PRIMITIVE_TYPE: {
			CharPrimitiveType charPrimitiveType = (CharPrimitiveType) theEObject;
			Object result = caseCharPrimitiveType(charPrimitiveType);
			if (result == null)
				result = casePrimitiveType(charPrimitiveType);
			if (result == null)
				result = caseDataType(charPrimitiveType);
			if (result == null)
				result = caseElement(charPrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.DOUBLE_PRIMITIVE_TYPE: {
			DoublePrimitiveType doublePrimitiveType = (DoublePrimitiveType) theEObject;
			Object result = caseDoublePrimitiveType(doublePrimitiveType);
			if (result == null)
				result = casePrimitiveType(doublePrimitiveType);
			if (result == null)
				result = caseDataType(doublePrimitiveType);
			if (result == null)
				result = caseElement(doublePrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.FLOAT_PRIMITIVE_TYPE: {
			FloatPrimitiveType floatPrimitiveType = (FloatPrimitiveType) theEObject;
			Object result = caseFloatPrimitiveType(floatPrimitiveType);
			if (result == null)
				result = casePrimitiveType(floatPrimitiveType);
			if (result == null)
				result = caseDataType(floatPrimitiveType);
			if (result == null)
				result = caseElement(floatPrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypePackage.LONG_PRIMITIVE_TYPE: {
			LongPrimitiveType longPrimitiveType = (LongPrimitiveType) theEObject;
			Object result = caseLongPrimitiveType(longPrimitiveType);
			if (result == null)
				result = casePrimitiveType(longPrimitiveType);
			if (result == null)
				result = caseDataType(longPrimitiveType);
			if (result == null)
				result = caseElement(longPrimitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanPrimitiveType(BooleanPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShortPrimitiveType(ShortPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameterizedType(ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntPrimitiveType(IntPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wild Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wild Card Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWildCardType(WildCardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBytePrimitiveType(BytePrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCharPrimitiveType(CharPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoublePrimitiveType(DoublePrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFloatPrimitiveType(FloatPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLongPrimitiveType(LongPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //DatatypeSwitch
