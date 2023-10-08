/**
 */
package ccsl.functions.booleanFunctions.filters;

import ccsl.context.Context;

import ccsl.elements.namedElements.complexType.JClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Super Class Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#isIncludesTarget <em>Includes Target</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getHasSuperClassFilter()
 * @model
 * @generated
 */
public interface HasSuperClassFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(JClass)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getHasSuperClassFilter_SuperClass()
	 * @model
	 * @generated
	 */
	JClass getSuperClass();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(JClass value);

	/**
	 * Returns the value of the '<em><b>Sub Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class</em>' reference.
	 * @see #setSubClass(JClass)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getHasSuperClassFilter_SubClass()
	 * @model
	 * @generated
	 */
	JClass getSubClass();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getSubClass <em>Sub Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class</em>' reference.
	 * @see #getSubClass()
	 * @generated
	 */
	void setSubClass(JClass value);

	/**
	 * Returns the value of the '<em><b>Includes Target</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Target</em>' attribute.
	 * @see #setIncludesTarget(boolean)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getHasSuperClassFilter_IncludesTarget()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIncludesTarget();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#isIncludesTarget <em>Includes Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes Target</em>' attribute.
	 * @see #isIncludesTarget()
	 * @generated
	 */
	void setIncludesTarget(boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getHasSuperClassFilter_Context()
	 * @model containment="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // HasSuperClassFilter
