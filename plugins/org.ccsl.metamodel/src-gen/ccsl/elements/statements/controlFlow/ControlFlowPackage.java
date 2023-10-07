/**
 */
package ccsl.elements.statements.controlFlow;

import ccsl.elements.statements.StatementsPackage;

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
 * @see ccsl.elements.statements.controlFlow.ControlFlowFactory
 * @model kind="package"
 * @generated
 */
public interface ControlFlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controlFlow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/statements/controlFlow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controlFlow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlFlowPackage eINSTANCE = ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.ConditionalControlFlowStatementImpl <em>Conditional Control Flow Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.ConditionalControlFlowStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getConditionalControlFlowStatement()
	 * @generated
	 */
	int CONDITIONAL_CONTROL_FLOW_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONTROL_FLOW_STATEMENT__UNIQUE_NAME = StatementsPackage.CONTROL_FLOW_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION = StatementsPackage.CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Control Flow Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT = StatementsPackage.CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.SwitchStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__UNIQUE_NAME = CONDITIONAL_CONTROL_FLOW_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__CONDITION = CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__CASES = CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.SwitchCaseBlockImpl <em>Switch Case Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.SwitchCaseBlockImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getSwitchCaseBlock()
	 * @generated
	 */
	int SWITCH_CASE_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BLOCK__UNIQUE_NAME = StatementsPackage.BLOCK__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BLOCK__STATEMENTS = StatementsPackage.BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Statements Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BLOCK__STATEMENTS_KIND = StatementsPackage.BLOCK__STATEMENTS_KIND;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BLOCK__DEFAULT = StatementsPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BLOCK__CASE_EXPRESSION = StatementsPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Case Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_BLOCK_FEATURE_COUNT = StatementsPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.IfStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__UNIQUE_NAME = CONDITIONAL_CONTROL_FLOW_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Then Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_STATEMENT = CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_STATEMENT = CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.LoopStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getLoopStatement()
	 * @generated
	 */
	int LOOP_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__UNIQUE_NAME = StatementsPackage.CONTROL_FLOW_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__BODY = StatementsPackage.CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_FEATURE_COUNT = StatementsPackage.CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.WhileStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__UNIQUE_NAME = LOOP_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.DoStatementImpl <em>Do Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.DoStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getDoStatement()
	 * @generated
	 */
	int DO_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__UNIQUE_NAME = CONDITIONAL_CONTROL_FLOW_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__CONDITION = CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__BODY = CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Do Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT_FEATURE_COUNT = CONDITIONAL_CONTROL_FLOW_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.ForStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__UNIQUE_NAME = LOOP_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INITIALIZERS = LOOP_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initializers Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INITIALIZERS_KIND = LOOP_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__UPDATERS = LOOP_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Updaters Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__UPDATERS_KIND = LOOP_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.controlFlow.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.controlFlow.impl.ForEachStatementImpl
	 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getForEachStatement()
	 * @generated
	 */
	int FOR_EACH_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__UNIQUE_NAME = LOOP_STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__EXPRESSION = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__VARIABLE = LOOP_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Each Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.controlFlow.SwitchStatement#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see ccsl.elements.statements.controlFlow.SwitchStatement#getCases()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Cases();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock <em>Switch Case Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case Block</em>'.
	 * @see ccsl.elements.statements.controlFlow.SwitchCaseBlock
	 * @generated
	 */
	EClass getSwitchCaseBlock();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see ccsl.elements.statements.controlFlow.SwitchCaseBlock#isDefault()
	 * @see #getSwitchCaseBlock()
	 * @generated
	 */
	EAttribute getSwitchCaseBlock_Default();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock#getCaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Expression</em>'.
	 * @see ccsl.elements.statements.controlFlow.SwitchCaseBlock#getCaseExpression()
	 * @see #getSwitchCaseBlock()
	 * @generated
	 */
	EReference getSwitchCaseBlock_CaseExpression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.controlFlow.IfStatement#getThenStatement <em>Then Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.IfStatement#getThenStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.controlFlow.IfStatement#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.IfStatement#getElseStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.LoopStatement
	 * @generated
	 */
	EClass getLoopStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.controlFlow.LoopStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ccsl.elements.statements.controlFlow.LoopStatement#getBody()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Body();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.DoStatement
	 * @generated
	 */
	EClass getDoStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.controlFlow.ForStatement#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializers</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForStatement#getInitializers()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Initializers();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.controlFlow.ForStatement#getInitializersKind <em>Initializers Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initializers Kind</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForStatement#getInitializersKind()
	 * @see #getForStatement()
	 * @generated
	 */
	EAttribute getForStatement_InitializersKind();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.controlFlow.ForStatement#getUpdaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updaters</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForStatement#getUpdaters()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Updaters();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.controlFlow.ForStatement#getUpdatersKind <em>Updaters Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updaters Kind</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForStatement#getUpdatersKind()
	 * @see #getForStatement()
	 * @generated
	 */
	EAttribute getForStatement_UpdatersKind();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.ForEachStatement <em>For Each Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForEachStatement
	 * @generated
	 */
	EClass getForEachStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.controlFlow.ForEachStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForEachStatement#getExpression()
	 * @see #getForEachStatement()
	 * @generated
	 */
	EReference getForEachStatement_Expression();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.controlFlow.ForEachStatement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ccsl.elements.statements.controlFlow.ForEachStatement#getVariable()
	 * @see #getForEachStatement()
	 * @generated
	 */
	EReference getForEachStatement_Variable();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement <em>Conditional Control Flow Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Control Flow Statement</em>'.
	 * @see ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement
	 * @generated
	 */
	EClass getConditionalControlFlowStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement#getCondition()
	 * @see #getConditionalControlFlowStatement()
	 * @generated
	 */
	EReference getConditionalControlFlowStatement_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlFlowFactory getControlFlowFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.SwitchStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getSwitchStatement()
		 * @generated
		 */
		EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__CASES = eINSTANCE.getSwitchStatement_Cases();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.SwitchCaseBlockImpl <em>Switch Case Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.SwitchCaseBlockImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getSwitchCaseBlock()
		 * @generated
		 */
		EClass SWITCH_CASE_BLOCK = eINSTANCE.getSwitchCaseBlock();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_CASE_BLOCK__DEFAULT = eINSTANCE.getSwitchCaseBlock_Default();

		/**
		 * The meta object literal for the '<em><b>Case Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE_BLOCK__CASE_EXPRESSION = eINSTANCE.getSwitchCaseBlock_CaseExpression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.IfStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Then Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_STATEMENT = eINSTANCE.getIfStatement_ThenStatement();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIfStatement_ElseStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.LoopStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getLoopStatement()
		 * @generated
		 */
		EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__BODY = eINSTANCE.getLoopStatement_Body();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.WhileStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.DoStatementImpl <em>Do Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.DoStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getDoStatement()
		 * @generated
		 */
		EClass DO_STATEMENT = eINSTANCE.getDoStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.ForStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__INITIALIZERS = eINSTANCE.getForStatement_Initializers();

		/**
		 * The meta object literal for the '<em><b>Initializers Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_STATEMENT__INITIALIZERS_KIND = eINSTANCE.getForStatement_InitializersKind();

		/**
		 * The meta object literal for the '<em><b>Updaters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__UPDATERS = eINSTANCE.getForStatement_Updaters();

		/**
		 * The meta object literal for the '<em><b>Updaters Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_STATEMENT__UPDATERS_KIND = eINSTANCE.getForStatement_UpdatersKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.ForEachStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getForEachStatement()
		 * @generated
		 */
		EClass FOR_EACH_STATEMENT = eINSTANCE.getForEachStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_STATEMENT__EXPRESSION = eINSTANCE.getForEachStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_STATEMENT__VARIABLE = eINSTANCE.getForEachStatement_Variable();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.controlFlow.impl.ConditionalControlFlowStatementImpl <em>Conditional Control Flow Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.controlFlow.impl.ConditionalControlFlowStatementImpl
		 * @see ccsl.elements.statements.controlFlow.impl.ControlFlowPackageImpl#getConditionalControlFlowStatement()
		 * @generated
		 */
		EClass CONDITIONAL_CONTROL_FLOW_STATEMENT = eINSTANCE.getConditionalControlFlowStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION = eINSTANCE
				.getConditionalControlFlowStatement_Condition();

	}

} //ControlFlowPackage
