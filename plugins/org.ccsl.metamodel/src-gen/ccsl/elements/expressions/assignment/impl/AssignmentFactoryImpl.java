/**
 */
package ccsl.elements.expressions.assignment.impl;

import ccsl.elements.expressions.assignment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AssignmentFactoryImpl extends EFactoryImpl implements AssignmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignmentFactory init() {
		try {
			AssignmentFactory theAssignmentFactory = (AssignmentFactory) EPackage.Registry.INSTANCE
					.getEFactory(AssignmentPackage.eNS_URI);
			if (theAssignmentFactory != null) {
				return theAssignmentFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssignmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AssignmentPackage.SIMPLE_ASSIGNMENT:
			return createSimpleAssignment();
		case AssignmentPackage.ASSIGNMENT:
			return createAssignment();
		case AssignmentPackage.UNARY_ASSIGNMENT:
			return createUnaryAssignment();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AssignmentPackage.ASSIGNMENT_OPERATOR:
			return createAssignmentOperatorFromString(eDataType, initialValue);
		case AssignmentPackage.UNARY_ASSIGNMENT_OPERATOR:
			return createUnaryAssignmentOperatorFromString(eDataType, initialValue);
		case AssignmentPackage.UNARY_ASSIGNMENT_KIND:
			return createUnaryAssignmentKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AssignmentPackage.ASSIGNMENT_OPERATOR:
			return convertAssignmentOperatorToString(eDataType, instanceValue);
		case AssignmentPackage.UNARY_ASSIGNMENT_OPERATOR:
			return convertUnaryAssignmentOperatorToString(eDataType, instanceValue);
		case AssignmentPackage.UNARY_ASSIGNMENT_KIND:
			return convertUnaryAssignmentKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAssignment createSimpleAssignment() {
		SimpleAssignmentImpl simpleAssignment = new SimpleAssignmentImpl();
		return simpleAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryAssignment createUnaryAssignment() {
		UnaryAssignmentImpl unaryAssignment = new UnaryAssignmentImpl();
		return unaryAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOperator createAssignmentOperatorFromString(EDataType eDataType, String initialValue) {
		AssignmentOperator result = AssignmentOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryAssignmentOperator createUnaryAssignmentOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryAssignmentOperator result = UnaryAssignmentOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryAssignmentOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryAssignmentKind createUnaryAssignmentKindFromString(EDataType eDataType, String initialValue) {
		UnaryAssignmentKind result = UnaryAssignmentKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryAssignmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentPackage getAssignmentPackage() {
		return (AssignmentPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AssignmentPackage getPackage() {
		return AssignmentPackage.eINSTANCE;
	}

} //AssignmentFactoryImpl
