/**
 */
package ccsl.elements.statements.impl;

import ccsl.elements.statements.*;

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
public class StatementsFactoryImpl extends EFactoryImpl implements StatementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatementsFactory init() {
		try {
			StatementsFactory theStatementsFactory = (StatementsFactory) EPackage.Registry.INSTANCE
					.getEFactory(StatementsPackage.eNS_URI);
			if (theStatementsFactory != null) {
				return theStatementsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StatementsPackage.STATEMENT:
			return createStatement();
		case StatementsPackage.CONTROL_FLOW_STATEMENT:
			return createControlFlowStatement();
		case StatementsPackage.BLOCK:
			return createBlock();
		case StatementsPackage.INSTANCE_CREATION:
			return createInstanceCreation();
		case StatementsPackage.SYNCHRONIZED_BLOCK:
			return createSynchronizedBlock();
		case StatementsPackage.THROW_STATEMENT:
			return createThrowStatement();
		case StatementsPackage.EMPTY_STATEMENT:
			return createEmptyStatement();
		case StatementsPackage.RETURN_STATEMENT:
			return createReturnStatement();
		case StatementsPackage.BREAK_STATEMENT:
			return createBreakStatement();
		case StatementsPackage.CONTINUE_STATEMENT:
			return createContinueStatement();
		case StatementsPackage.ASSERT_STATEMENT:
			return createAssertStatement();
		case StatementsPackage.EXPRESSION_STATEMENT:
			return createExpressionStatement();
		case StatementsPackage.LABEL_STATEMENT:
			return createLabelStatement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowStatement createControlFlowStatement() {
		ControlFlowStatementImpl controlFlowStatement = new ControlFlowStatementImpl();
		return controlFlowStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCreation createInstanceCreation() {
		InstanceCreationImpl instanceCreation = new InstanceCreationImpl();
		return instanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedBlock createSynchronizedBlock() {
		SynchronizedBlockImpl synchronizedBlock = new SynchronizedBlockImpl();
		return synchronizedBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowStatement createThrowStatement() {
		ThrowStatementImpl throwStatement = new ThrowStatementImpl();
		return throwStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueStatement createContinueStatement() {
		ContinueStatementImpl continueStatement = new ContinueStatementImpl();
		return continueStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertStatement createAssertStatement() {
		AssertStatementImpl assertStatement = new AssertStatementImpl();
		return assertStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStatement createLabelStatement() {
		LabelStatementImpl labelStatement = new LabelStatementImpl();
		return labelStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsPackage getStatementsPackage() {
		return (StatementsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static StatementsPackage getPackage() {
		return StatementsPackage.eINSTANCE;
	}

} //StatementsFactoryImpl
