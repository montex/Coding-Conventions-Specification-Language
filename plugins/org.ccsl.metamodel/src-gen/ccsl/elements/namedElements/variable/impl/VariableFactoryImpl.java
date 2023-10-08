/**
 */
package ccsl.elements.namedElements.variable.impl;

import ccsl.elements.namedElements.variable.*;

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
public class VariableFactoryImpl extends EFactoryImpl implements VariableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VariableFactory init() {
		try {
			VariableFactory theVariableFactory = (VariableFactory) EPackage.Registry.INSTANCE
					.getEFactory(VariablePackage.eNS_URI);
			if (theVariableFactory != null) {
				return theVariableFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VariableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VariablePackage.VARIABLE:
			return createVariable();
		case VariablePackage.PARAMETER_VARIABLE:
			return createParameterVariable();
		case VariablePackage.LOCAL_VARIABLE:
			return createLocalVariable();
		case VariablePackage.INITIALIZABLE_VARIABLE:
			return createInitializableVariable();
		case VariablePackage.FIELD_VARIABLE:
			return createFieldVariable();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterVariable createParameterVariable() {
		ParameterVariableImpl parameterVariable = new ParameterVariableImpl();
		return parameterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableVariable createInitializableVariable() {
		InitializableVariableImpl initializableVariable = new InitializableVariableImpl();
		return initializableVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldVariable createFieldVariable() {
		FieldVariableImpl fieldVariable = new FieldVariableImpl();
		return fieldVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablePackage getVariablePackage() {
		return (VariablePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static VariablePackage getPackage() {
		return VariablePackage.eINSTANCE;
	}

} //VariableFactoryImpl
