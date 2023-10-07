/**
 */
package ccsl.elements.statements.controlFlow.impl;

import ccsl.elements.statements.controlFlow.*;

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
public class ControlFlowFactoryImpl extends EFactoryImpl implements ControlFlowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlFlowFactory init() {
		try {
			ControlFlowFactory theControlFlowFactory = (ControlFlowFactory) EPackage.Registry.INSTANCE
					.getEFactory(ControlFlowPackage.eNS_URI);
			if (theControlFlowFactory != null) {
				return theControlFlowFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlFlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ControlFlowPackage.SWITCH_STATEMENT:
			return createSwitchStatement();
		case ControlFlowPackage.SWITCH_CASE_BLOCK:
			return createSwitchCaseBlock();
		case ControlFlowPackage.IF_STATEMENT:
			return createIfStatement();
		case ControlFlowPackage.LOOP_STATEMENT:
			return createLoopStatement();
		case ControlFlowPackage.WHILE_STATEMENT:
			return createWhileStatement();
		case ControlFlowPackage.DO_STATEMENT:
			return createDoStatement();
		case ControlFlowPackage.FOR_STATEMENT:
			return createForStatement();
		case ControlFlowPackage.FOR_EACH_STATEMENT:
			return createForEachStatement();
		case ControlFlowPackage.CONDITIONAL_CONTROL_FLOW_STATEMENT:
			return createConditionalControlFlowStatement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCaseBlock createSwitchCaseBlock() {
		SwitchCaseBlockImpl switchCaseBlock = new SwitchCaseBlockImpl();
		return switchCaseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopStatement createLoopStatement() {
		LoopStatementImpl loopStatement = new LoopStatementImpl();
		return loopStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoStatement createDoStatement() {
		DoStatementImpl doStatement = new DoStatementImpl();
		return doStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachStatement createForEachStatement() {
		ForEachStatementImpl forEachStatement = new ForEachStatementImpl();
		return forEachStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalControlFlowStatement createConditionalControlFlowStatement() {
		ConditionalControlFlowStatementImpl conditionalControlFlowStatement = new ConditionalControlFlowStatementImpl();
		return conditionalControlFlowStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowPackage getControlFlowPackage() {
		return (ControlFlowPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ControlFlowPackage getPackage() {
		return ControlFlowPackage.eINSTANCE;
	}

} //ControlFlowFactoryImpl
