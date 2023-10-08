/**
 */
package ccsl.elements.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expression Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.ExpressionsPackage#getExpressionKind()
 * @model
 * @generated
 */
public final class ExpressionKind extends AbstractEnumerator {
	/**
	 * The '<em><b>INFIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFIX_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFIX = 0;

	/**
	 * The '<em><b>UNARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNARY = 1;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 2;

	/**
	 * The '<em><b>INFIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFIX
	 * @generated
	 * @ordered
	 */
	public static final ExpressionKind INFIX_LITERAL = new ExpressionKind(INFIX, "INFIX", "INFIX");

	/**
	 * The '<em><b>UNARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY
	 * @generated
	 * @ordered
	 */
	public static final ExpressionKind UNARY_LITERAL = new ExpressionKind(UNARY, "UNARY", "UNARY");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final ExpressionKind ANY_LITERAL = new ExpressionKind(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Expression Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpressionKind[] VALUES_ARRAY = new ExpressionKind[] { INFIX_LITERAL, UNARY_LITERAL,
			ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Expression Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionKind get(int value) {
		switch (value) {
		case INFIX:
			return INFIX_LITERAL;
		case UNARY:
			return UNARY_LITERAL;
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
	private ExpressionKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ExpressionKind
