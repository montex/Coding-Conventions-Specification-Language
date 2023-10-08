/**
 */
package ccsl.elements.statements.controlFlow.util;

import ccsl.elements.Element;

import ccsl.elements.statements.Block;
import ccsl.elements.statements.ControlFlowStatement;
import ccsl.elements.statements.Statement;

import ccsl.elements.statements.controlFlow.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.elements.statements.controlFlow.ControlFlowPackage
 * @generated
 */
public class ControlFlowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlFlowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ControlFlowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowSwitch modelSwitch = new ControlFlowSwitch() {
		public Object caseSwitchStatement(SwitchStatement object) {
			return createSwitchStatementAdapter();
		}

		public Object caseSwitchCaseBlock(SwitchCaseBlock object) {
			return createSwitchCaseBlockAdapter();
		}

		public Object caseIfStatement(IfStatement object) {
			return createIfStatementAdapter();
		}

		public Object caseLoopStatement(LoopStatement object) {
			return createLoopStatementAdapter();
		}

		public Object caseWhileStatement(WhileStatement object) {
			return createWhileStatementAdapter();
		}

		public Object caseDoStatement(DoStatement object) {
			return createDoStatementAdapter();
		}

		public Object caseForStatement(ForStatement object) {
			return createForStatementAdapter();
		}

		public Object caseForEachStatement(ForEachStatement object) {
			return createForEachStatementAdapter();
		}

		public Object caseConditionalControlFlowStatement(ConditionalControlFlowStatement object) {
			return createConditionalControlFlowStatementAdapter();
		}

		public Object caseElement(Element object) {
			return createElementAdapter();
		}

		public Object caseStatement(Statement object) {
			return createStatementAdapter();
		}

		public Object caseControlFlowStatement(ControlFlowStatement object) {
			return createControlFlowStatementAdapter();
		}

		public Object caseBlock(Block object) {
			return createBlockAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.SwitchCaseBlock <em>Switch Case Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.SwitchCaseBlock
	 * @generated
	 */
	public Adapter createSwitchCaseBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.LoopStatement
	 * @generated
	 */
	public Adapter createLoopStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.DoStatement
	 * @generated
	 */
	public Adapter createDoStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.ForEachStatement <em>For Each Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.ForEachStatement
	 * @generated
	 */
	public Adapter createForEachStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement <em>Conditional Control Flow Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement
	 * @generated
	 */
	public Adapter createConditionalControlFlowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.ControlFlowStatement <em>Control Flow Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.ControlFlowStatement
	 * @generated
	 */
	public Adapter createControlFlowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.elements.statements.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.elements.statements.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ControlFlowAdapterFactory
