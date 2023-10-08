/**
 */
package ccsl.elements.namedElements.complexType;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage
 * @generated
 */
public interface ComplexTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComplexTypeFactory eINSTANCE = ccsl.elements.namedElements.complexType.impl.ComplexTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JInterface</em>'.
	 * @generated
	 */
	JInterface createJInterface();

	/**
	 * Returns a new object of class '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class</em>'.
	 * @generated
	 */
	AnonymousClass createAnonymousClass();

	/**
	 * Returns a new object of class '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClass</em>'.
	 * @generated
	 */
	JClass createJClass();

	/**
	 * Returns a new object of class '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Declaration</em>'.
	 * @generated
	 */
	TypeDeclaration createTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type</em>'.
	 * @generated
	 */
	ComplexType createComplexType();

	/**
	 * Returns a new object of class '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type</em>'.
	 * @generated
	 */
	AnnotationType createAnnotationType();

	/**
	 * Returns a new object of class '<em>Annotation Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Field</em>'.
	 * @generated
	 */
	AnnotationField createAnnotationField();

	/**
	 * Returns a new object of class '<em>JEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JEnum</em>'.
	 * @generated
	 */
	JEnum createJEnum();

	/**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
	ComplexTypeDeclaration createComplexTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Construct Complex Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Construct Complex Type Declaration</em>'.
	 * @generated
	 */
	ConstructComplexTypeDeclaration createConstructComplexTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Enum Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Constant</em>'.
	 * @generated
	 */
	EnumConstant createEnumConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComplexTypePackage getComplexTypePackage();

} //ComplexTypeFactory
