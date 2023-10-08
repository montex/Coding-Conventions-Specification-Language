/**
 */
package ccsl.elements.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arithmetic Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.ExpressionsPackage#getArithmeticOperator()
 * @model
 * @generated
 */
public final class ArithmeticOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>ADDITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDITION = 0;

	/**
	 * The '<em><b>MULTIPLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICATION = 1;

	/**
	 * The '<em><b>DIVIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIVIDE = 2;

	/**
	 * The '<em><b>SUBTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACT = 3;

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
	 * The '<em><b>ADDITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITION
	 * @generated
	 * @ordered
	 */
	public static final ArithmeticOperator ADDITION_LITERAL = new ArithmeticOperator(ADDITION, "ADDITION", "ADDITION");

	/**
	 * The '<em><b>MULTIPLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION
	 * @generated
	 * @ordered
	 */
	public static final ArithmeticOperator MULTIPLICATION_LITERAL = new ArithmeticOperator(MULTIPLICATION,
			"MULTIPLICATION", "MULTIPLICATION");

	/**
	 * The '<em><b>DIVIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE
	 * @generated
	 * @ordered
	 */
	public static final ArithmeticOperator DIVIDE_LITERAL = new ArithmeticOperator(DIVIDE, "DIVIDE", "DIVIDE");

	/**
	 * The '<em><b>SUBTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT
	 * @generated
	 * @ordered
	 */
	public static final ArithmeticOperator SUBTRACT_LITERAL = new ArithmeticOperator(SUBTRACT, "SUBTRACT", "SUBTRACT");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final ArithmeticOperator ANY_LITERAL = new ArithmeticOperator(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Arithmetic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArithmeticOperator[] VALUES_ARRAY = new ArithmeticOperator[] { ADDITION_LITERAL,
			MULTIPLICATION_LITERAL, DIVIDE_LITERAL, SUBTRACT_LITERAL, ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Arithmetic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arithmetic Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArithmeticOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArithmeticOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arithmetic Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArithmeticOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArithmeticOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arithmetic Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArithmeticOperator get(int value) {
		switch (value) {
		case ADDITION:
			return ADDITION_LITERAL;
		case MULTIPLICATION:
			return MULTIPLICATION_LITERAL;
		case DIVIDE:
			return DIVIDE_LITERAL;
		case SUBTRACT:
			return SUBTRACT_LITERAL;
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
	private ArithmeticOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ArithmeticOperator
