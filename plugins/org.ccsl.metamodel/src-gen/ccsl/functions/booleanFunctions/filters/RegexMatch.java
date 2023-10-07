/**
 */
package ccsl.functions.booleanFunctions.filters;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regex Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.functions.booleanFunctions.filters.RegexMatch#getRegex <em>Regex</em>}</li>
 * </ul>
 *
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getRegexMatch()
 * @model
 * @generated
 */
public interface RegexMatch extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage#getRegexMatch_Regex()
	 * @model
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link ccsl.functions.booleanFunctions.filters.RegexMatch#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

} // RegexMatch
