/**
 */
package ccsl.functions.booleanFunctions.filters;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Empty Block Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowEmptyStatement <em>Allow Empty Statement</em>}</li>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowComments <em>Allow Comments</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getIsEmptyBlockFilter()
 * @model
 * @generated
 */
public interface IsEmptyBlockFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Allow Empty Statement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Empty Statement</em>' attribute.
	 * @see #setAllowEmptyStatement(boolean)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getIsEmptyBlockFilter_AllowEmptyStatement()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAllowEmptyStatement();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowEmptyStatement <em>Allow Empty Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Statement</em>' attribute.
	 * @see #isAllowEmptyStatement()
	 * @generated
	 */
	void setAllowEmptyStatement(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Comments</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Comments</em>' attribute.
	 * @see #setAllowComments(boolean)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getIsEmptyBlockFilter_AllowComments()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAllowComments();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter#isAllowComments <em>Allow Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Comments</em>' attribute.
	 * @see #isAllowComments()
	 * @generated
	 */
	void setAllowComments(boolean value);

} // IsEmptyBlockFilter
