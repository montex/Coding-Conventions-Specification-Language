/**
 */
package org.ccsl.metamodel.faultTypeDescription.action.impl;

import org.ccsl.metamodel.faultTypeDescription.action.*;

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
public class ActionFactoryImpl extends EFactoryImpl implements ActionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionFactory init() {
		try {
			ActionFactory theActionFactory = (ActionFactory) EPackage.Registry.INSTANCE
					.getEFactory(ActionPackage.eNS_URI);
			if (theActionFactory != null) {
				return theActionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ActionPackage.DELETE_ACTION:
			return createDeleteAction();
		case ActionPackage.MOVE_SCOPE_UP_ACTION:
			return createMoveScopeUpAction();
		case ActionPackage.DELETE_INFIX_OPERATOR_ACTION:
			return createDeleteInfixOperatorAction();
		case ActionPackage.CHANGE_LITERAL_VALUE_ACTION:
			return createChangeLiteralValueAction();
		case ActionPackage.DELETE_RANDOM_STATEMENT_ACTION:
			return createDeleteRandomStatementAction();
		case ActionPackage.REPLACE_VARIABLE_ACCESS_ACTION:
			return createReplaceVariableAccessAction();
		case ActionPackage.REPLACE_ARITHMETIC_OPERATOR_ACTION:
			return createReplaceArithmeticOperatorAction();
		case ActionPackage.ARITHMETIC_OPERATOR_MAP:
			return createArithmeticOperatorMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAction createDeleteAction() {
		DeleteActionImpl deleteAction = new DeleteActionImpl();
		return deleteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveScopeUpAction createMoveScopeUpAction() {
		MoveScopeUpActionImpl moveScopeUpAction = new MoveScopeUpActionImpl();
		return moveScopeUpAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteInfixOperatorAction createDeleteInfixOperatorAction() {
		DeleteInfixOperatorActionImpl deleteInfixOperatorAction = new DeleteInfixOperatorActionImpl();
		return deleteInfixOperatorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLiteralValueAction createChangeLiteralValueAction() {
		ChangeLiteralValueActionImpl changeLiteralValueAction = new ChangeLiteralValueActionImpl();
		return changeLiteralValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRandomStatementAction createDeleteRandomStatementAction() {
		DeleteRandomStatementActionImpl deleteRandomStatementAction = new DeleteRandomStatementActionImpl();
		return deleteRandomStatementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceVariableAccessAction createReplaceVariableAccessAction() {
		ReplaceVariableAccessActionImpl replaceVariableAccessAction = new ReplaceVariableAccessActionImpl();
		return replaceVariableAccessAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceArithmeticOperatorAction createReplaceArithmeticOperatorAction() {
		ReplaceArithmeticOperatorActionImpl replaceArithmeticOperatorAction = new ReplaceArithmeticOperatorActionImpl();
		return replaceArithmeticOperatorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperatorMap createArithmeticOperatorMap() {
		ArithmeticOperatorMapImpl arithmeticOperatorMap = new ArithmeticOperatorMapImpl();
		return arithmeticOperatorMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPackage getActionPackage() {
		return (ActionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ActionPackage getPackage() {
		return ActionPackage.eINSTANCE;
	}

} //ActionFactoryImpl
