/**
 */
package ccsl.elements.namedElements.complexType.util;

import ccsl.elements.Annotable;
import ccsl.elements.ControlledAccessElement;
import ccsl.elements.Element;

import ccsl.elements.datatype.DataType;
import ccsl.elements.datatype.ObjectType;

import ccsl.elements.expressions.Expression;

import ccsl.elements.namedElements.NamedElement;

import ccsl.elements.namedElements.complexType.*;

import ccsl.elements.statements.import_.ImportableElement;

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
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage
 * @generated
 */
public class ComplexTypeSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComplexTypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeSwitch() {
		if (modelPackage == null) {
			modelPackage = ComplexTypePackage.eINSTANCE;
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
		case ComplexTypePackage.JINTERFACE: {
			JInterface jInterface = (JInterface) theEObject;
			Object result = caseJInterface(jInterface);
			if (result == null)
				result = caseComplexTypeDeclaration(jInterface);
			if (result == null)
				result = caseTypeDeclaration(jInterface);
			if (result == null)
				result = caseComplexType(jInterface);
			if (result == null)
				result = caseNamedElement(jInterface);
			if (result == null)
				result = caseObjectType(jInterface);
			if (result == null)
				result = caseImportableElement(jInterface);
			if (result == null)
				result = caseControlledAccessElement(jInterface);
			if (result == null)
				result = caseAnnotable(jInterface);
			if (result == null)
				result = caseDataType(jInterface);
			if (result == null)
				result = caseElement(jInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.ANONYMOUS_CLASS: {
			AnonymousClass anonymousClass = (AnonymousClass) theEObject;
			Object result = caseAnonymousClass(anonymousClass);
			if (result == null)
				result = caseComplexType(anonymousClass);
			if (result == null)
				result = caseExpression(anonymousClass);
			if (result == null)
				result = caseElement(anonymousClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.JCLASS: {
			JClass jClass = (JClass) theEObject;
			Object result = caseJClass(jClass);
			if (result == null)
				result = caseConstructComplexTypeDeclaration(jClass);
			if (result == null)
				result = caseComplexTypeDeclaration(jClass);
			if (result == null)
				result = caseTypeDeclaration(jClass);
			if (result == null)
				result = caseComplexType(jClass);
			if (result == null)
				result = caseNamedElement(jClass);
			if (result == null)
				result = caseObjectType(jClass);
			if (result == null)
				result = caseImportableElement(jClass);
			if (result == null)
				result = caseControlledAccessElement(jClass);
			if (result == null)
				result = caseAnnotable(jClass);
			if (result == null)
				result = caseDataType(jClass);
			if (result == null)
				result = caseElement(jClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.TYPE_DECLARATION: {
			TypeDeclaration typeDeclaration = (TypeDeclaration) theEObject;
			Object result = caseTypeDeclaration(typeDeclaration);
			if (result == null)
				result = caseNamedElement(typeDeclaration);
			if (result == null)
				result = caseObjectType(typeDeclaration);
			if (result == null)
				result = caseImportableElement(typeDeclaration);
			if (result == null)
				result = caseControlledAccessElement(typeDeclaration);
			if (result == null)
				result = caseAnnotable(typeDeclaration);
			if (result == null)
				result = caseDataType(typeDeclaration);
			if (result == null)
				result = caseElement(typeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.COMPLEX_TYPE: {
			ComplexType complexType = (ComplexType) theEObject;
			Object result = caseComplexType(complexType);
			if (result == null)
				result = caseElement(complexType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.ANNOTATION_TYPE: {
			AnnotationType annotationType = (AnnotationType) theEObject;
			Object result = caseAnnotationType(annotationType);
			if (result == null)
				result = caseTypeDeclaration(annotationType);
			if (result == null)
				result = caseNamedElement(annotationType);
			if (result == null)
				result = caseObjectType(annotationType);
			if (result == null)
				result = caseImportableElement(annotationType);
			if (result == null)
				result = caseControlledAccessElement(annotationType);
			if (result == null)
				result = caseAnnotable(annotationType);
			if (result == null)
				result = caseDataType(annotationType);
			if (result == null)
				result = caseElement(annotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.ANNOTATION_FIELD: {
			AnnotationField annotationField = (AnnotationField) theEObject;
			Object result = caseAnnotationField(annotationField);
			if (result == null)
				result = caseNamedElement(annotationField);
			if (result == null)
				result = caseAnnotable(annotationField);
			if (result == null)
				result = caseElement(annotationField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.JENUM: {
			JEnum jEnum = (JEnum) theEObject;
			Object result = caseJEnum(jEnum);
			if (result == null)
				result = caseConstructComplexTypeDeclaration(jEnum);
			if (result == null)
				result = caseComplexTypeDeclaration(jEnum);
			if (result == null)
				result = caseTypeDeclaration(jEnum);
			if (result == null)
				result = caseComplexType(jEnum);
			if (result == null)
				result = caseNamedElement(jEnum);
			if (result == null)
				result = caseObjectType(jEnum);
			if (result == null)
				result = caseImportableElement(jEnum);
			if (result == null)
				result = caseControlledAccessElement(jEnum);
			if (result == null)
				result = caseAnnotable(jEnum);
			if (result == null)
				result = caseDataType(jEnum);
			if (result == null)
				result = caseElement(jEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION: {
			ComplexTypeDeclaration complexTypeDeclaration = (ComplexTypeDeclaration) theEObject;
			Object result = caseComplexTypeDeclaration(complexTypeDeclaration);
			if (result == null)
				result = caseTypeDeclaration(complexTypeDeclaration);
			if (result == null)
				result = caseComplexType(complexTypeDeclaration);
			if (result == null)
				result = caseNamedElement(complexTypeDeclaration);
			if (result == null)
				result = caseObjectType(complexTypeDeclaration);
			if (result == null)
				result = caseImportableElement(complexTypeDeclaration);
			if (result == null)
				result = caseControlledAccessElement(complexTypeDeclaration);
			if (result == null)
				result = caseAnnotable(complexTypeDeclaration);
			if (result == null)
				result = caseDataType(complexTypeDeclaration);
			if (result == null)
				result = caseElement(complexTypeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION: {
			ConstructComplexTypeDeclaration constructComplexTypeDeclaration = (ConstructComplexTypeDeclaration) theEObject;
			Object result = caseConstructComplexTypeDeclaration(constructComplexTypeDeclaration);
			if (result == null)
				result = caseComplexTypeDeclaration(constructComplexTypeDeclaration);
			if (result == null)
				result = caseTypeDeclaration(constructComplexTypeDeclaration);
			if (result == null)
				result = caseComplexType(constructComplexTypeDeclaration);
			if (result == null)
				result = caseNamedElement(constructComplexTypeDeclaration);
			if (result == null)
				result = caseObjectType(constructComplexTypeDeclaration);
			if (result == null)
				result = caseImportableElement(constructComplexTypeDeclaration);
			if (result == null)
				result = caseControlledAccessElement(constructComplexTypeDeclaration);
			if (result == null)
				result = caseAnnotable(constructComplexTypeDeclaration);
			if (result == null)
				result = caseDataType(constructComplexTypeDeclaration);
			if (result == null)
				result = caseElement(constructComplexTypeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComplexTypePackage.ENUM_CONSTANT: {
			EnumConstant enumConstant = (EnumConstant) theEObject;
			Object result = caseEnumConstant(enumConstant);
			if (result == null)
				result = caseNamedElement(enumConstant);
			if (result == null)
				result = caseAnnotable(enumConstant);
			if (result == null)
				result = caseElement(enumConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJInterface(JInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnonymousClass(AnonymousClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJClass(JClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnotationField(AnnotationField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJEnum(JEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComplexTypeDeclaration(ComplexTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Construct Complex Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct Complex Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstructComplexTypeDeclaration(ConstructComplexTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumConstant(EnumConstant object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnotable(Annotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Importable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Importable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImportableElement(ImportableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controlled Access Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controlled Access Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlledAccessElement(ControlledAccessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
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

} //ComplexTypeSwitch
