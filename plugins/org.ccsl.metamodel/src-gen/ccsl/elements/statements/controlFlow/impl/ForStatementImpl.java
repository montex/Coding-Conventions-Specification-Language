/**
 */
package ccsl.elements.statements.controlFlow.impl;

import ccsl.CollectionKind;

import ccsl.elements.expressions.Expression;

import ccsl.elements.statements.controlFlow.ConditionalControlFlowStatement;
import ccsl.elements.statements.controlFlow.ControlFlowPackage;
import ccsl.elements.statements.controlFlow.ForStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.ForStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.ForStatementImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.ForStatementImpl#getInitializersKind <em>Initializers Kind</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.ForStatementImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link ccsl.elements.statements.controlFlow.impl.ForStatementImpl#getUpdatersKind <em>Updaters Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatementImpl extends LoopStatementImpl implements ForStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList initializers;

	/**
	 * The default value of the '{@link #getInitializersKind() <em>Initializers Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializersKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind INITIALIZERS_KIND_EDEFAULT = CollectionKind.EXACT_LITERAL;

	/**
	 * The cached value of the '{@link #getInitializersKind() <em>Initializers Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializersKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind initializersKind = INITIALIZERS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdaters() <em>Updaters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdaters()
	 * @generated
	 * @ordered
	 */
	protected EList updaters;

	/**
	 * The default value of the '{@link #getUpdatersKind() <em>Updaters Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatersKind()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKind UPDATERS_KIND_EDEFAULT = CollectionKind.EXACT_LITERAL;

	/**
	 * The cached value of the '{@link #getUpdatersKind() <em>Updaters Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatersKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionKind updatersKind = UPDATERS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ControlFlowPackage.Literals.FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ControlFlowPackage.FOR_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.FOR_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ControlFlowPackage.FOR_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlFlowPackage.FOR_STATEMENT__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInitializers() {
		if (initializers == null) {
			initializers = new EObjectContainmentEList.Unsettable(Expression.class, this,
					ControlFlowPackage.FOR_STATEMENT__INITIALIZERS);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitializers() {
		if (initializers != null)
			((InternalEList.Unsettable) initializers).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitializers() {
		return initializers != null && ((InternalEList.Unsettable) initializers).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getInitializersKind() {
		return initializersKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializersKind(CollectionKind newInitializersKind) {
		CollectionKind oldInitializersKind = initializersKind;
		initializersKind = newInitializersKind == null ? INITIALIZERS_KIND_EDEFAULT : newInitializersKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlFlowPackage.FOR_STATEMENT__INITIALIZERS_KIND,
					oldInitializersKind, initializersKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUpdaters() {
		if (updaters == null) {
			updaters = new EObjectContainmentEList.Unsettable(Expression.class, this,
					ControlFlowPackage.FOR_STATEMENT__UPDATERS);
		}
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdaters() {
		if (updaters != null)
			((InternalEList.Unsettable) updaters).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdaters() {
		return updaters != null && ((InternalEList.Unsettable) updaters).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind getUpdatersKind() {
		return updatersKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatersKind(CollectionKind newUpdatersKind) {
		CollectionKind oldUpdatersKind = updatersKind;
		updatersKind = newUpdatersKind == null ? UPDATERS_KIND_EDEFAULT : newUpdatersKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlFlowPackage.FOR_STATEMENT__UPDATERS_KIND,
					oldUpdatersKind, updatersKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ControlFlowPackage.FOR_STATEMENT__CONDITION:
			return basicSetCondition(null, msgs);
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS:
			return ((InternalEList) getInitializers()).basicRemove(otherEnd, msgs);
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS:
			return ((InternalEList) getUpdaters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ControlFlowPackage.FOR_STATEMENT__CONDITION:
			return getCondition();
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS:
			return getInitializers();
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS_KIND:
			return getInitializersKind();
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS:
			return getUpdaters();
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS_KIND:
			return getUpdatersKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ControlFlowPackage.FOR_STATEMENT__CONDITION:
			setCondition((Expression) newValue);
			return;
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS:
			getInitializers().clear();
			getInitializers().addAll((Collection) newValue);
			return;
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS_KIND:
			setInitializersKind((CollectionKind) newValue);
			return;
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS:
			getUpdaters().clear();
			getUpdaters().addAll((Collection) newValue);
			return;
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS_KIND:
			setUpdatersKind((CollectionKind) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case ControlFlowPackage.FOR_STATEMENT__CONDITION:
			setCondition((Expression) null);
			return;
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS:
			unsetInitializers();
			return;
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS_KIND:
			setInitializersKind(INITIALIZERS_KIND_EDEFAULT);
			return;
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS:
			unsetUpdaters();
			return;
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS_KIND:
			setUpdatersKind(UPDATERS_KIND_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ControlFlowPackage.FOR_STATEMENT__CONDITION:
			return condition != null;
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS:
			return isSetInitializers();
		case ControlFlowPackage.FOR_STATEMENT__INITIALIZERS_KIND:
			return initializersKind != INITIALIZERS_KIND_EDEFAULT;
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS:
			return isSetUpdaters();
		case ControlFlowPackage.FOR_STATEMENT__UPDATERS_KIND:
			return updatersKind != UPDATERS_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ConditionalControlFlowStatement.class) {
			switch (derivedFeatureID) {
			case ControlFlowPackage.FOR_STATEMENT__CONDITION:
				return ControlFlowPackage.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ConditionalControlFlowStatement.class) {
			switch (baseFeatureID) {
			case ControlFlowPackage.CONDITIONAL_CONTROL_FLOW_STATEMENT__CONDITION:
				return ControlFlowPackage.FOR_STATEMENT__CONDITION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initializersKind: ");
		result.append(initializersKind);
		result.append(", updatersKind: ");
		result.append(updatersKind);
		result.append(')');
		return result.toString();
	}

} //ForStatementImpl
