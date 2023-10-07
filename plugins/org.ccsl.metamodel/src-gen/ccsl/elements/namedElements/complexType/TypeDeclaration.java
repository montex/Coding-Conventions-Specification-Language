/**
 */
package ccsl.elements.namedElements.complexType;

import ccsl.elements.ControlledAccessElement;
import ccsl.elements.Inheritance;

import ccsl.elements.datatype.ObjectType;

import ccsl.elements.namedElements.NamedElement;

import ccsl.elements.statements.import_.ImportableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getStatic <em>Static</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getImports <em>Imports</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getNestedTypes <em>Nested Types</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getInheritance <em>Inheritance</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends NamedElement, ObjectType, ImportableElement, ControlledAccessElement {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(Boolean)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getTypeDeclaration_Static()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getStatic();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.import_.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see #isSetImports()
	 * @see #unsetImports()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getTypeDeclaration_Imports()
	 * @model type="ccsl.elements.statements.import_.ImportStatement" containment="true" unsettable="true"
	 * @generated
	 */
	EList getImports();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getImports <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImports()
	 * @see #getImports()
	 * @generated
	 */
	void unsetImports();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getImports <em>Imports</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Imports</em>' containment reference list is set.
	 * @see #unsetImports()
	 * @see #getImports()
	 * @generated
	 */
	boolean isSetImports();

	/**
	 * Returns the value of the '<em><b>Nested Types</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.complexType.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Types</em>' containment reference list.
	 * @see #isSetNestedTypes()
	 * @see #unsetNestedTypes()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getTypeDeclaration_NestedTypes()
	 * @model type="ccsl.elements.namedElements.complexType.TypeDeclaration" containment="true" unsettable="true"
	 * @generated
	 */
	EList getNestedTypes();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getNestedTypes <em>Nested Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNestedTypes()
	 * @see #getNestedTypes()
	 * @generated
	 */
	void unsetNestedTypes();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getNestedTypes <em>Nested Types</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nested Types</em>' containment reference list is set.
	 * @see #unsetNestedTypes()
	 * @see #getNestedTypes()
	 * @generated
	 */
	boolean isSetNestedTypes();

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.elements.Inheritance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' attribute.
	 * @see ccsl.elements.Inheritance
	 * @see #setInheritance(Inheritance)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getTypeDeclaration_Inheritance()
	 * @model default="ANY"
	 * @generated
	 */
	Inheritance getInheritance();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.TypeDeclaration#getInheritance <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' attribute.
	 * @see ccsl.elements.Inheritance
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(Inheritance value);

} // TypeDeclaration
