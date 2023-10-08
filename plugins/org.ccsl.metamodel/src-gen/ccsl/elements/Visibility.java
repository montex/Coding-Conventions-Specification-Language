/**
 */
package ccsl.elements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visibility</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.elements.ElementsPackage#getVisibility()
 * @model
 * @generated
 */
public final class Visibility extends AbstractEnumerator {
	/**
	 * The '<em><b>PRIVATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE = 0;

	/**
	 * The '<em><b>PACKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE = 1;

	/**
	 * The '<em><b>PROTECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECTED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED = 2;

	/**
	 * The '<em><b>PUBLIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC = 3;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 4;

	/**
	 * The '<em><b>PRIVATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @generated
	 * @ordered
	 */
	public static final Visibility PRIVATE_LITERAL = new Visibility(PRIVATE, "PRIVATE", "PRIVATE");

	/**
	 * The '<em><b>PACKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @generated
	 * @ordered
	 */
	public static final Visibility PACKAGE_LITERAL = new Visibility(PACKAGE, "PACKAGE", "PACKAGE");

	/**
	 * The '<em><b>PROTECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECTED
	 * @generated
	 * @ordered
	 */
	public static final Visibility PROTECTED_LITERAL = new Visibility(PROTECTED, "PROTECTED", "PROTECTED");

	/**
	 * The '<em><b>PUBLIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC
	 * @generated
	 * @ordered
	 */
	public static final Visibility PUBLIC_LITERAL = new Visibility(PUBLIC, "PUBLIC", "PUBLIC");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final Visibility ANY_LITERAL = new Visibility(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Visibility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Visibility[] VALUES_ARRAY = new Visibility[] { PRIVATE_LITERAL, PACKAGE_LITERAL,
			PROTECTED_LITERAL, PUBLIC_LITERAL, ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Visibility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Visibility</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visibility get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Visibility result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visibility getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Visibility result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visibility get(int value) {
		switch (value) {
		case PRIVATE:
			return PRIVATE_LITERAL;
		case PACKAGE:
			return PACKAGE_LITERAL;
		case PROTECTED:
			return PROTECTED_LITERAL;
		case PUBLIC:
			return PUBLIC_LITERAL;
		case ANY:
			return ANY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Visibility(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Visibility
