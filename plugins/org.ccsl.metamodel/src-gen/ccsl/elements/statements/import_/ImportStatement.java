/**
 */
package ccsl.elements.statements.import_;

import ccsl.elements.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.import_.ImportStatement#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link ccsl.elements.statements.import_.ImportStatement#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.import_.ImportPackage#getImportStatement()
 * @model
 * @generated
 */
public interface ImportStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference.
	 * @see #isSetImportedElement()
	 * @see #unsetImportedElement()
	 * @see #setImportedElement(ImportableElement)
	 * @see ccsl.elements.statements.import_.ImportPackage#getImportStatement_ImportedElement()
	 * @model unsettable="true"
	 * @generated
	 */
	ImportableElement getImportedElement();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.import_.ImportStatement#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' reference.
	 * @see #isSetImportedElement()
	 * @see #unsetImportedElement()
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(ImportableElement value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.import_.ImportStatement#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImportedElement()
	 * @see #getImportedElement()
	 * @see #setImportedElement(ImportableElement)
	 * @generated
	 */
	void unsetImportedElement();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.import_.ImportStatement#getImportedElement <em>Imported Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Imported Element</em>' reference is set.
	 * @see #unsetImportedElement()
	 * @see #getImportedElement()
	 * @see #setImportedElement(ImportableElement)
	 * @generated
	 */
	boolean isSetImportedElement();

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #isSetStatic()
	 * @see #unsetStatic()
	 * @see #setStatic(boolean)
	 * @see ccsl.elements.statements.import_.ImportPackage#getImportStatement_Static()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.import_.ImportStatement#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isSetStatic()
	 * @see #unsetStatic()
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Unsets the value of the '{@link ccsl.elements.statements.import_.ImportStatement#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatic()
	 * @see #isStatic()
	 * @see #setStatic(boolean)
	 * @generated
	 */
	void unsetStatic();

	/**
	 * Returns whether the value of the '{@link ccsl.elements.statements.import_.ImportStatement#isStatic <em>Static</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Static</em>' attribute is set.
	 * @see #unsetStatic()
	 * @see #isStatic()
	 * @see #setStatic(boolean)
	 * @generated
	 */
	boolean isSetStatic();

} // ImportStatement
