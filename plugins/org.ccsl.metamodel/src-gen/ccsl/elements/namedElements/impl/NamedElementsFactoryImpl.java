/**
 */
package ccsl.elements.namedElements.impl;

import ccsl.elements.namedElements.NamedElement;
import ccsl.elements.namedElements.NamedElementsFactory;
import ccsl.elements.namedElements.NamedElementsPackage;

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
public class NamedElementsFactoryImpl extends EFactoryImpl implements NamedElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NamedElementsFactory init() {
		try {
			NamedElementsFactory theNamedElementsFactory = (NamedElementsFactory) EPackage.Registry.INSTANCE
					.getEFactory(NamedElementsPackage.eNS_URI);
			if (theNamedElementsFactory != null) {
				return theNamedElementsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NamedElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NamedElementsPackage.NAMED_ELEMENT:
			return createNamedElement();
		case NamedElementsPackage.PACKAGE:
			return createPackage();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ccsl.elements.namedElements.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementsPackage getNamedElementsPackage() {
		return (NamedElementsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static NamedElementsPackage getPackage() {
		return NamedElementsPackage.eINSTANCE;
	}

} //NamedElementsFactoryImpl
