/**
 */
package ccsl.elements.namedElements.complexType.impl;

import ccsl.elements.namedElements.complexType.*;

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
public class ComplexTypeFactoryImpl extends EFactoryImpl implements ComplexTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComplexTypeFactory init() {
		try {
			ComplexTypeFactory theComplexTypeFactory = (ComplexTypeFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComplexTypePackage.eNS_URI);
			if (theComplexTypeFactory != null) {
				return theComplexTypeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComplexTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComplexTypePackage.JINTERFACE:
			return createJInterface();
		case ComplexTypePackage.ANONYMOUS_CLASS:
			return createAnonymousClass();
		case ComplexTypePackage.JCLASS:
			return createJClass();
		case ComplexTypePackage.TYPE_DECLARATION:
			return createTypeDeclaration();
		case ComplexTypePackage.COMPLEX_TYPE:
			return createComplexType();
		case ComplexTypePackage.ANNOTATION_TYPE:
			return createAnnotationType();
		case ComplexTypePackage.ANNOTATION_FIELD:
			return createAnnotationField();
		case ComplexTypePackage.JENUM:
			return createJEnum();
		case ComplexTypePackage.COMPLEX_TYPE_DECLARATION:
			return createComplexTypeDeclaration();
		case ComplexTypePackage.CONSTRUCT_COMPLEX_TYPE_DECLARATION:
			return createConstructComplexTypeDeclaration();
		case ComplexTypePackage.ENUM_CONSTANT:
			return createEnumConstant();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JInterface createJInterface() {
		JInterfaceImpl jInterface = new JInterfaceImpl();
		return jInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClass createAnonymousClass() {
		AnonymousClassImpl anonymousClass = new AnonymousClassImpl();
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass createJClass() {
		JClassImpl jClass = new JClassImpl();
		return jClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationField createAnnotationField() {
		AnnotationFieldImpl annotationField = new AnnotationFieldImpl();
		return annotationField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEnum createJEnum() {
		JEnumImpl jEnum = new JEnumImpl();
		return jEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeDeclaration createComplexTypeDeclaration() {
		ComplexTypeDeclarationImpl complexTypeDeclaration = new ComplexTypeDeclarationImpl();
		return complexTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructComplexTypeDeclaration createConstructComplexTypeDeclaration() {
		ConstructComplexTypeDeclarationImpl constructComplexTypeDeclaration = new ConstructComplexTypeDeclarationImpl();
		return constructComplexTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstant createEnumConstant() {
		EnumConstantImpl enumConstant = new EnumConstantImpl();
		return enumConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypePackage getComplexTypePackage() {
		return (ComplexTypePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ComplexTypePackage getPackage() {
		return ComplexTypePackage.eINSTANCE;
	}

} //ComplexTypeFactoryImpl
