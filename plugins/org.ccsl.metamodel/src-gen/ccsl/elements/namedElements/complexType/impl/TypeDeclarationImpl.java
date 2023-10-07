/**
 */
package ccsl.elements.namedElements.complexType.impl;

import ccsl.elements.ControlledAccessElement;
import ccsl.elements.ElementsPackage;
import ccsl.elements.Inheritance;
import ccsl.elements.Visibility;

import ccsl.elements.datatype.DataType;
import ccsl.elements.datatype.ObjectType;

import ccsl.elements.namedElements.complexType.ComplexTypePackage;
import ccsl.elements.namedElements.complexType.TypeDeclaration;

import ccsl.elements.namedElements.impl.NamedElementImpl;

import ccsl.elements.statements.import_.ImportStatement;
import ccsl.elements.statements.import_.ImportableElement;

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
 * An implementation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl#getNestedTypes <em>Nested Types</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.impl.TypeDeclarationImpl#getInheritance <em>Inheritance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationImpl extends NamedElementImpl implements TypeDeclaration {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean static_ = STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList imports;

	/**
	 * The cached value of the '{@link #getNestedTypes() <em>Nested Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList nestedTypes;

	/**
	 * The default value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final Inheritance INHERITANCE_EDEFAULT = Inheritance.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected Inheritance inheritance = INHERITANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ComplexTypePackage.Literals.TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComplexTypePackage.TYPE_DECLARATION__VISIBILITY,
					oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Boolean newStatic) {
		Boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComplexTypePackage.TYPE_DECLARATION__STATIC,
					oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList.Unsettable(ImportStatement.class, this,
					ComplexTypePackage.TYPE_DECLARATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImports() {
		if (imports != null)
			((InternalEList.Unsettable) imports).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImports() {
		return imports != null && ((InternalEList.Unsettable) imports).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedTypes() {
		if (nestedTypes == null) {
			nestedTypes = new EObjectContainmentEList.Unsettable(TypeDeclaration.class, this,
					ComplexTypePackage.TYPE_DECLARATION__NESTED_TYPES);
		}
		return nestedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNestedTypes() {
		if (nestedTypes != null)
			((InternalEList.Unsettable) nestedTypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNestedTypes() {
		return nestedTypes != null && ((InternalEList.Unsettable) nestedTypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritance(Inheritance newInheritance) {
		Inheritance oldInheritance = inheritance;
		inheritance = newInheritance == null ? INHERITANCE_EDEFAULT : newInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComplexTypePackage.TYPE_DECLARATION__INHERITANCE,
					oldInheritance, inheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComplexTypePackage.TYPE_DECLARATION__IMPORTS:
			return ((InternalEList) getImports()).basicRemove(otherEnd, msgs);
		case ComplexTypePackage.TYPE_DECLARATION__NESTED_TYPES:
			return ((InternalEList) getNestedTypes()).basicRemove(otherEnd, msgs);
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
		case ComplexTypePackage.TYPE_DECLARATION__VISIBILITY:
			return getVisibility();
		case ComplexTypePackage.TYPE_DECLARATION__STATIC:
			return getStatic();
		case ComplexTypePackage.TYPE_DECLARATION__IMPORTS:
			return getImports();
		case ComplexTypePackage.TYPE_DECLARATION__NESTED_TYPES:
			return getNestedTypes();
		case ComplexTypePackage.TYPE_DECLARATION__INHERITANCE:
			return getInheritance();
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
		case ComplexTypePackage.TYPE_DECLARATION__VISIBILITY:
			setVisibility((Visibility) newValue);
			return;
		case ComplexTypePackage.TYPE_DECLARATION__STATIC:
			setStatic((Boolean) newValue);
			return;
		case ComplexTypePackage.TYPE_DECLARATION__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection) newValue);
			return;
		case ComplexTypePackage.TYPE_DECLARATION__NESTED_TYPES:
			getNestedTypes().clear();
			getNestedTypes().addAll((Collection) newValue);
			return;
		case ComplexTypePackage.TYPE_DECLARATION__INHERITANCE:
			setInheritance((Inheritance) newValue);
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
		case ComplexTypePackage.TYPE_DECLARATION__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case ComplexTypePackage.TYPE_DECLARATION__STATIC:
			setStatic(STATIC_EDEFAULT);
			return;
		case ComplexTypePackage.TYPE_DECLARATION__IMPORTS:
			unsetImports();
			return;
		case ComplexTypePackage.TYPE_DECLARATION__NESTED_TYPES:
			unsetNestedTypes();
			return;
		case ComplexTypePackage.TYPE_DECLARATION__INHERITANCE:
			setInheritance(INHERITANCE_EDEFAULT);
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
		case ComplexTypePackage.TYPE_DECLARATION__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case ComplexTypePackage.TYPE_DECLARATION__STATIC:
			return STATIC_EDEFAULT == null ? static_ != null : !STATIC_EDEFAULT.equals(static_);
		case ComplexTypePackage.TYPE_DECLARATION__IMPORTS:
			return isSetImports();
		case ComplexTypePackage.TYPE_DECLARATION__NESTED_TYPES:
			return isSetNestedTypes();
		case ComplexTypePackage.TYPE_DECLARATION__INHERITANCE:
			return inheritance != INHERITANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ObjectType.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ImportableElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ControlledAccessElement.class) {
			switch (derivedFeatureID) {
			case ComplexTypePackage.TYPE_DECLARATION__VISIBILITY:
				return ElementsPackage.CONTROLLED_ACCESS_ELEMENT__VISIBILITY;
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
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ObjectType.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ImportableElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ControlledAccessElement.class) {
			switch (baseFeatureID) {
			case ElementsPackage.CONTROLLED_ACCESS_ELEMENT__VISIBILITY:
				return ComplexTypePackage.TYPE_DECLARATION__VISIBILITY;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", static: ");
		result.append(static_);
		result.append(", inheritance: ");
		result.append(inheritance);
		result.append(')');
		return result.toString();
	}

} //TypeDeclarationImpl
