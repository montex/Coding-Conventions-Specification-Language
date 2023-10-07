/**
 */
package ccsl.elements.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.ExpressionsPackage#getBinaryOperator()
 * @model
 * @generated
 */
public final class BinaryOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>LEFT SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_SHIFT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_SHIFT = 0;

	/**
	 * The '<em><b>RIGHT SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_SHIFT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_SHIFT = 1;

	/**
	 * The '<em><b>UNSIGNED LEFT SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LEFT_SHIFT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LEFT_SHIFT = 2;

	/**
	 * The '<em><b>UNSIGNED RIGHT SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_RIGHT_SHIFT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_RIGHT_SHIFT = 3;

	/**
	 * The '<em><b>COMPLEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEMENT = 4;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 5;

	/**
	 * The '<em><b>LEFT SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_SHIFT
	 * @generated
	 * @ordered
	 */
	public static final BinaryOperator LEFT_SHIFT_LITERAL = new BinaryOperator(LEFT_SHIFT, "LEFT_SHIFT", "LEFT_SHIFT");

	/**
	 * The '<em><b>RIGHT SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_SHIFT
	 * @generated
	 * @ordered
	 */
	public static final BinaryOperator RIGHT_SHIFT_LITERAL = new BinaryOperator(RIGHT_SHIFT, "RIGHT_SHIFT",
			"RIGHT_SHIFT");

	/**
	 * The '<em><b>UNSIGNED LEFT SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LEFT_SHIFT
	 * @generated
	 * @ordered
	 */
	public static final BinaryOperator UNSIGNED_LEFT_SHIFT_LITERAL = new BinaryOperator(UNSIGNED_LEFT_SHIFT,
			"UNSIGNED_LEFT_SHIFT", "UNSIGNED_LEFT_SHIFT");

	/**
	 * The '<em><b>UNSIGNED RIGHT SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_RIGHT_SHIFT
	 * @generated
	 * @ordered
	 */
	public static final BinaryOperator UNSIGNED_RIGHT_SHIFT_LITERAL = new BinaryOperator(UNSIGNED_RIGHT_SHIFT,
			"UNSIGNED_RIGHT_SHIFT", "UNSIGNED_RIGHT_SHIFT");

	/**
	 * The '<em><b>COMPLEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT
	 * @generated
	 * @ordered
	 */
	public static final BinaryOperator COMPLEMENT_LITERAL = new BinaryOperator(COMPLEMENT, "COMPLEMENT", "COMPLEMENT");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final BinaryOperator ANY_LITERAL = new BinaryOperator(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Binary Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BinaryOperator[] VALUES_ARRAY = new BinaryOperator[] { LEFT_SHIFT_LITERAL, RIGHT_SHIFT_LITERAL,
			UNSIGNED_LEFT_SHIFT_LITERAL, UNSIGNED_RIGHT_SHIFT_LITERAL, COMPLEMENT_LITERAL, ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Binary Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BinaryOperator get(int value) {
		switch (value) {
		case LEFT_SHIFT:
			return LEFT_SHIFT_LITERAL;
		case RIGHT_SHIFT:
			return RIGHT_SHIFT_LITERAL;
		case UNSIGNED_LEFT_SHIFT:
			return UNSIGNED_LEFT_SHIFT_LITERAL;
		case UNSIGNED_RIGHT_SHIFT:
			return UNSIGNED_RIGHT_SHIFT_LITERAL;
		case COMPLEMENT:
			return COMPLEMENT_LITERAL;
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
	private BinaryOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //BinaryOperator
