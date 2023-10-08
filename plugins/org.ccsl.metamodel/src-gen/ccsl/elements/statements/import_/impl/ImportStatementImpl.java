/**
 */
package ccsl.elements.statements.import_.impl;

import ccsl.elements.statements.impl.StatementImpl;

import ccsl.elements.statements.import_.ImportPackage;
import ccsl.elements.statements.import_.ImportStatement;
import ccsl.elements.statements.import_.ImportableElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.import_.impl.ImportStatementImpl#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link ccsl.elements.statements.import_.impl.ImportStatementImpl#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportStatementImpl extends StatementImpl implements ImportStatement {
	/**
	 * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedElement()
	 * @generated
	 * @ordered
	 */
	protected ImportableElement importedElement;

	/**
	 * This is true if the Imported Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean importedElementESet;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * This is true if the Static attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean staticESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImportPackage.Literals.IMPORT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportableElement getImportedElement() {
		if (importedElement != null && importedElement.eIsProxy()) {
			InternalEObject oldImportedElement = (InternalEObject) importedElement;
			importedElement = (ImportableElement) eResolveProxy(oldImportedElement);
			if (importedElement != oldImportedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ImportPackage.IMPORT_STATEMENT__IMPORTED_ELEMENT, oldImportedElement, importedElement));
			}
		}
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportableElement basicGetImportedElement() {
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedElement(ImportableElement newImportedElement) {
		ImportableElement oldImportedElement = importedElement;
		importedElement = newImportedElement;
		boolean oldImportedElementESet = importedElementESet;
		importedElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.IMPORT_STATEMENT__IMPORTED_ELEMENT,
					oldImportedElement, importedElement, !oldImportedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImportedElement() {
		ImportableElement oldImportedElement = importedElement;
		boolean oldImportedElementESet = importedElementESet;
		importedElement = null;
		importedElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImportPackage.IMPORT_STATEMENT__IMPORTED_ELEMENT,
					oldImportedElement, null, oldImportedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportedElement() {
		return importedElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		boolean oldStaticESet = staticESet;
		staticESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportPackage.IMPORT_STATEMENT__STATIC, oldStatic,
					static_, !oldStaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatic() {
		boolean oldStatic = static_;
		boolean oldStaticESet = staticESet;
		static_ = STATIC_EDEFAULT;
		staticESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImportPackage.IMPORT_STATEMENT__STATIC, oldStatic,
					STATIC_EDEFAULT, oldStaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatic() {
		return staticESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImportPackage.IMPORT_STATEMENT__IMPORTED_ELEMENT:
			if (resolve)
				return getImportedElement();
			return basicGetImportedElement();
		case ImportPackage.IMPORT_STATEMENT__STATIC:
			return isStatic() ? Boolean.TRUE : Boolean.FALSE;
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
		case ImportPackage.IMPORT_STATEMENT__IMPORTED_ELEMENT:
			setImportedElement((ImportableElement) newValue);
			return;
		case ImportPackage.IMPORT_STATEMENT__STATIC:
			setStatic(((Boolean) newValue).booleanValue());
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
		case ImportPackage.IMPORT_STATEMENT__IMPORTED_ELEMENT:
			unsetImportedElement();
			return;
		case ImportPackage.IMPORT_STATEMENT__STATIC:
			unsetStatic();
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
		case ImportPackage.IMPORT_STATEMENT__IMPORTED_ELEMENT:
			return isSetImportedElement();
		case ImportPackage.IMPORT_STATEMENT__STATIC:
			return isSetStatic();
		}
		return super.eIsSet(featureID);
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
		result.append(" (static: ");
		if (staticESet)
			result.append(static_);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ImportStatementImpl
