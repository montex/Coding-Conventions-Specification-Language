/**
 */
package ccsl.elements.namedElements.complexType;

import ccsl.CollectionKind;

import ccsl.elements.namedElements.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.complexType.EnumConstant#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.complexType.EnumConstant#getArgumentsKind <em>Arguments Kind</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getEnumConstant()
 * @model
 * @generated
 */
public interface EnumConstant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see #isSetArguments()
	 * @see #unsetArguments()
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getEnumConstant_Arguments()
	 * @model type="ccsl.elements.expressions.Expression" containment="true" unsettable="true"
	 * @generated
	 */
	EList getArguments();

	/**
	 * Unsets the value of the '{@link ccsl.elements.namedElements.complexType.EnumConstant#getArguments <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArguments()
	 * @see #getArguments()
	 * @generated
	 */
	void unsetArguments();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.namedElements.complexType.EnumConstant#getArguments <em>Arguments</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arguments</em>' containment reference list is set.
	 * @see #unsetArguments()
	 * @see #getArguments()
	 * @generated
	 */
	boolean isSetArguments();

	/**
	 * Returns the value of the '<em><b>Arguments Kind</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link ccsl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #setArgumentsKind(CollectionKind)
	 * @see ccsl.elements.namedElements.complexType.ComplexTypePackage#getEnumConstant_ArgumentsKind()
	 * @model default="ANY"
	 * @generated
	 */
	CollectionKind getArgumentsKind();

	/**
	 * Sets the value of the '{@link ccsl.elements.namedElements.complexType.EnumConstant#getArgumentsKind <em>Arguments Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments Kind</em>' attribute.
	 * @see ccsl.CollectionKind
	 * @see #getArgumentsKind()
	 * @generated
	 */
	void setArgumentsKind(CollectionKind value);

} // EnumConstant
