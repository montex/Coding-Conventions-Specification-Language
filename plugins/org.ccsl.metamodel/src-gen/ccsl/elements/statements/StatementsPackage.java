/**
 */
package ccsl.elements.statements;

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
 * @see ccsl.elements.statements.StatementsFactory
 * @model kind="package"
 * @generated
 */
public interface StatementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/statements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsPackage eINSTANCE = ccsl.elements.statements.impl.StatementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.StatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__UNIQUE_NAME = ElementsPackage.ELEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ControlFlowStatementImpl <em>Control Flow Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ControlFlowStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getControlFlowStatement()
	 * @generated
	 */
	int CONTROL_FLOW_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Control Flow Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.BlockImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS_KIND = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.InstanceCreationImpl <em>Instance Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.InstanceCreationImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getInstanceCreation()
	 * @generated
	 */
	int INSTANCE_CREATION = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__CONSTRUCTOR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__ARGS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Args Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__ARGS_KIND = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.SynchronizedBlockImpl <em>Synchronized Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.SynchronizedBlockImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getSynchronizedBlock()
	 * @generated
	 */
	int SYNCHRONIZED_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BLOCK__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BLOCK__BODY_STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BLOCK__KEY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronized Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ThrowStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.EmptyStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getEmptyStatement()
	 * @generated
	 */
	int EMPTY_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ReturnStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.BreakStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ContinueStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.AssertStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getAssertStatement()
	 * @generated
	 */
	int ASSERT_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__MESSAGE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ExpressionStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.LabelStatementImpl <em>Label Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.LabelStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getLabelStatement()
	 * @generated
	 */
	int LABEL_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STATEMENT__UNIQUE_NAME = STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see ccsl.elements.statements.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.ControlFlowStatement <em>Control Flow Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Statement</em>'.
	 * @see ccsl.elements.statements.ControlFlowStatement
	 * @generated
	 */
	EClass getControlFlowStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see ccsl.elements.statements.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see ccsl.elements.statements.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.Block#getStatementsKind <em>Statements Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statements Kind</em>'.
	 * @see ccsl.elements.statements.Block#getStatementsKind()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_StatementsKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.InstanceCreation <em>Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Creation</em>'.
	 * @see ccsl.elements.statements.InstanceCreation
	 * @generated
	 */
	EClass getInstanceCreation();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.InstanceCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.statements.InstanceCreation#getType()
	 * @see #getInstanceCreation()
	 * @generated
	 */
	EReference getInstanceCreation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.InstanceCreation#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constructor</em>'.
	 * @see ccsl.elements.statements.InstanceCreation#getConstructor()
	 * @see #getInstanceCreation()
	 * @generated
	 */
	EReference getInstanceCreation_Constructor();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.InstanceCreation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see ccsl.elements.statements.InstanceCreation#getArgs()
	 * @see #getInstanceCreation()
	 * @generated
	 */
	EReference getInstanceCreation_Args();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.InstanceCreation#getArgsKind <em>Args Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args Kind</em>'.
	 * @see ccsl.elements.statements.InstanceCreation#getArgsKind()
	 * @see #getInstanceCreation()
	 * @generated
	 */
	EAttribute getInstanceCreation_ArgsKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.SynchronizedBlock <em>Synchronized Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronized Block</em>'.
	 * @see ccsl.elements.statements.SynchronizedBlock
	 * @generated
	 */
	EClass getSynchronizedBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.SynchronizedBlock#getBodyStatements <em>Body Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Statements</em>'.
	 * @see ccsl.elements.statements.SynchronizedBlock#getBodyStatements()
	 * @see #getSynchronizedBlock()
	 * @generated
	 */
	EReference getSynchronizedBlock_BodyStatements();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.SynchronizedBlock#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see ccsl.elements.statements.SynchronizedBlock#getKey()
	 * @see #getSynchronizedBlock()
	 * @generated
	 */
	EReference getSynchronizedBlock_Key();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see ccsl.elements.statements.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.ThrowStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ccsl.elements.statements.ThrowStatement#getExpression()
	 * @see #getThrowStatement()
	 * @generated
	 */
	EReference getThrowStatement_Expression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Statement</em>'.
	 * @see ccsl.elements.statements.EmptyStatement
	 * @generated
	 */
	EClass getEmptyStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see ccsl.elements.statements.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ccsl.elements.statements.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see ccsl.elements.statements.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see ccsl.elements.statements.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.AssertStatement <em>Assert Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Statement</em>'.
	 * @see ccsl.elements.statements.AssertStatement
	 * @generated
	 */
	EClass getAssertStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.AssertStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ccsl.elements.statements.AssertStatement#getExpression()
	 * @see #getAssertStatement()
	 * @generated
	 */
	EReference getAssertStatement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.AssertStatement#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see ccsl.elements.statements.AssertStatement#getMessage()
	 * @see #getAssertStatement()
	 * @generated
	 */
	EReference getAssertStatement_Message();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see ccsl.elements.statements.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ccsl.elements.statements.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.LabelStatement <em>Label Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Statement</em>'.
	 * @see ccsl.elements.statements.LabelStatement
	 * @generated
	 */
	EClass getLabelStatement();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.LabelStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsl.elements.statements.LabelStatement#getName()
	 * @see #getLabelStatement()
	 * @generated
	 */
	EAttribute getLabelStatement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.LabelStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ccsl.elements.statements.LabelStatement#getBody()
	 * @see #getLabelStatement()
	 * @generated
	 */
	EReference getLabelStatement_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementsFactory getStatementsFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.StatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ControlFlowStatementImpl <em>Control Flow Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ControlFlowStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getControlFlowStatement()
		 * @generated
		 */
		EClass CONTROL_FLOW_STATEMENT = eINSTANCE.getControlFlowStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.BlockImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '<em><b>Statements Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__STATEMENTS_KIND = eINSTANCE.getBlock_StatementsKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.InstanceCreationImpl <em>Instance Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.InstanceCreationImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getInstanceCreation()
		 * @generated
		 */
		EClass INSTANCE_CREATION = eINSTANCE.getInstanceCreation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION__TYPE = eINSTANCE.getInstanceCreation_Type();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION__CONSTRUCTOR = eINSTANCE.getInstanceCreation_Constructor();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION__ARGS = eINSTANCE.getInstanceCreation_Args();

		/**
		 * The meta object literal for the '<em><b>Args Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_CREATION__ARGS_KIND = eINSTANCE.getInstanceCreation_ArgsKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.SynchronizedBlockImpl <em>Synchronized Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.SynchronizedBlockImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getSynchronizedBlock()
		 * @generated
		 */
		EClass SYNCHRONIZED_BLOCK = eINSTANCE.getSynchronizedBlock();

		/**
		 * The meta object literal for the '<em><b>Body Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZED_BLOCK__BODY_STATEMENTS = eINSTANCE.getSynchronizedBlock_BodyStatements();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZED_BLOCK__KEY = eINSTANCE.getSynchronizedBlock_Key();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ThrowStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getThrowStatement()
		 * @generated
		 */
		EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_STATEMENT__EXPRESSION = eINSTANCE.getThrowStatement_Expression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.EmptyStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getEmptyStatement()
		 * @generated
		 */
		EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ReturnStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.BreakStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ContinueStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getContinueStatement()
		 * @generated
		 */
		EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.AssertStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getAssertStatement()
		 * @generated
		 */
		EClass ASSERT_STATEMENT = eINSTANCE.getAssertStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_STATEMENT__EXPRESSION = eINSTANCE.getAssertStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_STATEMENT__MESSAGE = eINSTANCE.getAssertStatement_Message();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ExpressionStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.LabelStatementImpl <em>Label Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.LabelStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getLabelStatement()
		 * @generated
		 */
		EClass LABEL_STATEMENT = eINSTANCE.getLabelStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STATEMENT__NAME = eINSTANCE.getLabelStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_STATEMENT__BODY = eINSTANCE.getLabelStatement_Body();

	}

} //StatementsPackage
