/**
 */
package org.ccsl.metamodel.faultTypeDescription.action;

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
 * @see org.ccsl.metamodel.faultTypeDescription.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/faultTypeDescription/action";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionPackage eINSTANCE = org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getDeleteAction()
	 * @generated
	 */
	int DELETE_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.MoveScopeUpActionImpl <em>Move Scope Up Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.MoveScopeUpActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getMoveScopeUpAction()
	 * @generated
	 */
	int MOVE_SCOPE_UP_ACTION = 1;

	/**
	 * The number of structural features of the '<em>Move Scope Up Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCOPE_UP_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteInfixOperatorActionImpl <em>Delete Infix Operator Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteInfixOperatorActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getDeleteInfixOperatorAction()
	 * @generated
	 */
	int DELETE_INFIX_OPERATOR_ACTION = 2;

	/**
	 * The number of structural features of the '<em>Delete Infix Operator Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_INFIX_OPERATOR_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ChangeLiteralValueActionImpl <em>Change Literal Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ChangeLiteralValueActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getChangeLiteralValueAction()
	 * @generated
	 */
	int CHANGE_LITERAL_VALUE_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Change Literal Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LITERAL_VALUE_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteRandomStatementActionImpl <em>Delete Random Statement Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteRandomStatementActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getDeleteRandomStatementAction()
	 * @generated
	 */
	int DELETE_RANDOM_STATEMENT_ACTION = 4;

	/**
	 * The number of structural features of the '<em>Delete Random Statement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_RANDOM_STATEMENT_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceVariableAccessActionImpl <em>Replace Variable Access Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceVariableAccessActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getReplaceVariableAccessAction()
	 * @generated
	 */
	int REPLACE_VARIABLE_ACCESS_ACTION = 5;

	/**
	 * The number of structural features of the '<em>Replace Variable Access Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_VARIABLE_ACCESS_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceArithmeticOperatorActionImpl <em>Replace Arithmetic Operator Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceArithmeticOperatorActionImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getReplaceArithmeticOperatorAction()
	 * @generated
	 */
	int REPLACE_ARITHMETIC_OPERATOR_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Replace Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP = 0;

	/**
	 * The number of structural features of the '<em>Replace Arithmetic Operator Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_ARITHMETIC_OPERATOR_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ArithmeticOperatorMapImpl <em>Arithmetic Operator Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ArithmeticOperatorMapImpl
	 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getArithmeticOperatorMap()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR_MAP = 7;

	/**
	 * The feature id for the '<em><b>Old Arithmetic Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>New Arithmetic Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Arithmetic Operator Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_MAP_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.DeleteAction
	 * @generated
	 */
	EClass getDeleteAction();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.MoveScopeUpAction <em>Move Scope Up Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Scope Up Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.MoveScopeUpAction
	 * @generated
	 */
	EClass getMoveScopeUpAction();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.DeleteInfixOperatorAction <em>Delete Infix Operator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Infix Operator Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.DeleteInfixOperatorAction
	 * @generated
	 */
	EClass getDeleteInfixOperatorAction();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.ChangeLiteralValueAction <em>Change Literal Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Literal Value Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ChangeLiteralValueAction
	 * @generated
	 */
	EClass getChangeLiteralValueAction();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.DeleteRandomStatementAction <em>Delete Random Statement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Random Statement Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.DeleteRandomStatementAction
	 * @generated
	 */
	EClass getDeleteRandomStatementAction();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.ReplaceVariableAccessAction <em>Replace Variable Access Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Variable Access Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ReplaceVariableAccessAction
	 * @generated
	 */
	EClass getReplaceVariableAccessAction();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction <em>Replace Arithmetic Operator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Arithmetic Operator Action</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction
	 * @generated
	 */
	EClass getReplaceArithmeticOperatorAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction#getReplaceMap <em>Replace Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace Map</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ReplaceArithmeticOperatorAction#getReplaceMap()
	 * @see #getReplaceArithmeticOperatorAction()
	 * @generated
	 */
	EReference getReplaceArithmeticOperatorAction_ReplaceMap();

	/**
	 * Returns the meta object for class '{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap <em>Arithmetic Operator Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operator Map</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap
	 * @generated
	 */
	EClass getArithmeticOperatorMap();

	/**
	 * Returns the meta object for the attribute '{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getOldArithmeticOperator <em>Old Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Arithmetic Operator</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getOldArithmeticOperator()
	 * @see #getArithmeticOperatorMap()
	 * @generated
	 */
	EAttribute getArithmeticOperatorMap_OldArithmeticOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getNewArithmeticOperator <em>New Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Arithmetic Operator</em>'.
	 * @see org.ccsl.metamodel.faultTypeDescription.action.ArithmeticOperatorMap#getNewArithmeticOperator()
	 * @see #getArithmeticOperatorMap()
	 * @generated
	 */
	EAttribute getArithmeticOperatorMap_NewArithmeticOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionFactory getActionFactory();

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
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getDeleteAction()
		 * @generated
		 */
		EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.MoveScopeUpActionImpl <em>Move Scope Up Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.MoveScopeUpActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getMoveScopeUpAction()
		 * @generated
		 */
		EClass MOVE_SCOPE_UP_ACTION = eINSTANCE.getMoveScopeUpAction();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteInfixOperatorActionImpl <em>Delete Infix Operator Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteInfixOperatorActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getDeleteInfixOperatorAction()
		 * @generated
		 */
		EClass DELETE_INFIX_OPERATOR_ACTION = eINSTANCE.getDeleteInfixOperatorAction();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ChangeLiteralValueActionImpl <em>Change Literal Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ChangeLiteralValueActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getChangeLiteralValueAction()
		 * @generated
		 */
		EClass CHANGE_LITERAL_VALUE_ACTION = eINSTANCE.getChangeLiteralValueAction();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteRandomStatementActionImpl <em>Delete Random Statement Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.DeleteRandomStatementActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getDeleteRandomStatementAction()
		 * @generated
		 */
		EClass DELETE_RANDOM_STATEMENT_ACTION = eINSTANCE.getDeleteRandomStatementAction();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceVariableAccessActionImpl <em>Replace Variable Access Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceVariableAccessActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getReplaceVariableAccessAction()
		 * @generated
		 */
		EClass REPLACE_VARIABLE_ACCESS_ACTION = eINSTANCE.getReplaceVariableAccessAction();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceArithmeticOperatorActionImpl <em>Replace Arithmetic Operator Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ReplaceArithmeticOperatorActionImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getReplaceArithmeticOperatorAction()
		 * @generated
		 */
		EClass REPLACE_ARITHMETIC_OPERATOR_ACTION = eINSTANCE.getReplaceArithmeticOperatorAction();

		/**
		 * The meta object literal for the '<em><b>Replace Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_ARITHMETIC_OPERATOR_ACTION__REPLACE_MAP = eINSTANCE
				.getReplaceArithmeticOperatorAction_ReplaceMap();

		/**
		 * The meta object literal for the '{@link org.ccsl.metamodel.faultTypeDescription.action.impl.ArithmeticOperatorMapImpl <em>Arithmetic Operator Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ArithmeticOperatorMapImpl
		 * @see org.ccsl.metamodel.faultTypeDescription.action.impl.ActionPackageImpl#getArithmeticOperatorMap()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATOR_MAP = eINSTANCE.getArithmeticOperatorMap();

		/**
		 * The meta object literal for the '<em><b>Old Arithmetic Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OPERATOR_MAP__OLD_ARITHMETIC_OPERATOR = eINSTANCE
				.getArithmeticOperatorMap_OldArithmeticOperator();

		/**
		 * The meta object literal for the '<em><b>New Arithmetic Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OPERATOR_MAP__NEW_ARITHMETIC_OPERATOR = eINSTANCE
				.getArithmeticOperatorMap_NewArithmeticOperator();

	}

} //ActionPackage
