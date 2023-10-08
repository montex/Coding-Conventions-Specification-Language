/**
 */
package ccsl.elements.expressions.assignment;

import ccsl.elements.expressions.ExpressionsPackage;

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
 * @see ccsl.elements.expressions.assignment.AssignmentFactory
 * @model kind="package"
 * @generated
 */
public interface AssignmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/statements/assignment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignmentPackage eINSTANCE = ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.assignment.impl.SimpleAssignmentImpl <em>Simple Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.assignment.impl.SimpleAssignmentImpl
	 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getSimpleAssignment()
	 * @generated
	 */
	int SIMPLE_ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ASSIGNMENT__UNIQUE_NAME = ExpressionsPackage.EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ASSIGNMENT__OPERAND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ASSIGNMENT_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.assignment.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.assignment.impl.AssignmentImpl
	 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__UNIQUE_NAME = SIMPLE_ASSIGNMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERAND = SIMPLE_ASSIGNMENT__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERATOR = SIMPLE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = SIMPLE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = SIMPLE_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.assignment.impl.UnaryAssignmentImpl <em>Unary Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.assignment.impl.UnaryAssignmentImpl
	 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getUnaryAssignment()
	 * @generated
	 */
	int UNARY_ASSIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ASSIGNMENT__UNIQUE_NAME = SIMPLE_ASSIGNMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ASSIGNMENT__OPERAND = SIMPLE_ASSIGNMENT__OPERAND;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ASSIGNMENT__KIND = SIMPLE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ASSIGNMENT__OPERATOR = SIMPLE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ASSIGNMENT_FEATURE_COUNT = SIMPLE_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.assignment.AssignmentOperator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.assignment.AssignmentOperator
	 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getAssignmentOperator()
	 * @generated
	 */
	int ASSIGNMENT_OPERATOR = 3;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.assignment.UnaryAssignmentOperator <em>Unary Assignment Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentOperator
	 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getUnaryAssignmentOperator()
	 * @generated
	 */
	int UNARY_ASSIGNMENT_OPERATOR = 4;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.assignment.UnaryAssignmentKind <em>Unary Assignment Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentKind
	 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getUnaryAssignmentKind()
	 * @generated
	 */
	int UNARY_ASSIGNMENT_KIND = 5;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.assignment.SimpleAssignment <em>Simple Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Assignment</em>'.
	 * @see ccsl.elements.expressions.assignment.SimpleAssignment
	 * @generated
	 */
	EClass getSimpleAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.assignment.SimpleAssignment#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see ccsl.elements.expressions.assignment.SimpleAssignment#getOperand()
	 * @see #getSimpleAssignment()
	 * @generated
	 */
	EReference getSimpleAssignment_Operand();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.assignment.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see ccsl.elements.expressions.assignment.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.assignment.Assignment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.elements.expressions.assignment.Assignment#getOperator()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.assignment.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ccsl.elements.expressions.assignment.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.assignment.UnaryAssignment <em>Unary Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Assignment</em>'.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignment
	 * @generated
	 */
	EClass getUnaryAssignment();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.assignment.UnaryAssignment#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignment#getKind()
	 * @see #getUnaryAssignment()
	 * @generated
	 */
	EAttribute getUnaryAssignment_Kind();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.assignment.UnaryAssignment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignment#getOperator()
	 * @see #getUnaryAssignment()
	 * @generated
	 */
	EAttribute getUnaryAssignment_Operator();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.expressions.assignment.AssignmentOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see ccsl.elements.expressions.assignment.AssignmentOperator
	 * @generated
	 */
	EEnum getAssignmentOperator();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.expressions.assignment.UnaryAssignmentOperator <em>Unary Assignment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Assignment Operator</em>'.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentOperator
	 * @generated
	 */
	EEnum getUnaryAssignmentOperator();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.expressions.assignment.UnaryAssignmentKind <em>Unary Assignment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Assignment Kind</em>'.
	 * @see ccsl.elements.expressions.assignment.UnaryAssignmentKind
	 * @generated
	 */
	EEnum getUnaryAssignmentKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssignmentFactory getAssignmentFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.expressions.assignment.impl.SimpleAssignmentImpl <em>Simple Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.assignment.impl.SimpleAssignmentImpl
		 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getSimpleAssignment()
		 * @generated
		 */
		EClass SIMPLE_ASSIGNMENT = eINSTANCE.getSimpleAssignment();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ASSIGNMENT__OPERAND = eINSTANCE.getSimpleAssignment_Operand();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.assignment.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.assignment.impl.AssignmentImpl
		 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__OPERATOR = eINSTANCE.getAssignment_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.assignment.impl.UnaryAssignmentImpl <em>Unary Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.assignment.impl.UnaryAssignmentImpl
		 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getUnaryAssignment()
		 * @generated
		 */
		EClass UNARY_ASSIGNMENT = eINSTANCE.getUnaryAssignment();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_ASSIGNMENT__KIND = eINSTANCE.getUnaryAssignment_Kind();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_ASSIGNMENT__OPERATOR = eINSTANCE.getUnaryAssignment_Operator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.assignment.AssignmentOperator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.assignment.AssignmentOperator
		 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getAssignmentOperator()
		 * @generated
		 */
		EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.assignment.UnaryAssignmentOperator <em>Unary Assignment Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.assignment.UnaryAssignmentOperator
		 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getUnaryAssignmentOperator()
		 * @generated
		 */
		EEnum UNARY_ASSIGNMENT_OPERATOR = eINSTANCE.getUnaryAssignmentOperator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.assignment.UnaryAssignmentKind <em>Unary Assignment Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.assignment.UnaryAssignmentKind
		 * @see ccsl.elements.expressions.assignment.impl.AssignmentPackageImpl#getUnaryAssignmentKind()
		 * @generated
		 */
		EEnum UNARY_ASSIGNMENT_KIND = eINSTANCE.getUnaryAssignmentKind();

	}

} //AssignmentPackage
