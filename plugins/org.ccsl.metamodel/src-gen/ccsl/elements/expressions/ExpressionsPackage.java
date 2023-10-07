/**
 */
package ccsl.elements.expressions;

import ccsl.elements.ElementsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ccsl.elements.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = ccsl.elements.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.ExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__UNIQUE_NAME = ElementsPackage.ELEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.VarDeclarationImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getVarDeclaration()
	 * @generated
	 */
	int VAR_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION__UNIQUE_NAME = EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.CastExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__UNIQUE_NAME = EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.TernaryExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getTernaryExpression()
	 * @generated
	 */
	int TERNARY_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__UNIQUE_NAME = EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ternary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.InstanceofExpressionImpl <em>Instanceof Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.InstanceofExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getInstanceofExpression()
	 * @generated
	 */
	int INSTANCEOF_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__UNIQUE_NAME = EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instanceof Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.OperandExpressionImpl <em>Operand Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.OperandExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getOperandExpression()
	 * @generated
	 */
	int OPERAND_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_EXPRESSION__UNIQUE_NAME = EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_EXPRESSION__OPERANDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_EXPRESSION__KIND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operands Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_EXPRESSION__OPERANDS_KIND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operand Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.ArithmeticExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__UNIQUE_NAME = OPERAND_EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERANDS = OPERAND_EXPRESSION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__KIND = OPERAND_EXPRESSION__KIND;

	/**
	 * The feature id for the '<em><b>Operands Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERANDS_KIND = OPERAND_EXPRESSION__OPERANDS_KIND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = OPERAND_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = OPERAND_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.StringConcatenationImpl <em>String Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.StringConcatenationImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getStringConcatenation()
	 * @generated
	 */
	int STRING_CONCATENATION = 6;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONCATENATION__UNIQUE_NAME = OPERAND_EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONCATENATION__OPERANDS = OPERAND_EXPRESSION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONCATENATION__KIND = OPERAND_EXPRESSION__KIND;

	/**
	 * The feature id for the '<em><b>Operands Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONCATENATION__OPERANDS_KIND = OPERAND_EXPRESSION__OPERANDS_KIND;

	/**
	 * The number of structural features of the '<em>String Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONCATENATION_FEATURE_COUNT = OPERAND_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.BooleanExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__UNIQUE_NAME = OPERAND_EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OPERANDS = OPERAND_EXPRESSION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__KIND = OPERAND_EXPRESSION__KIND;

	/**
	 * The feature id for the '<em><b>Operands Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OPERANDS_KIND = OPERAND_EXPRESSION__OPERANDS_KIND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OPERATOR = OPERAND_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = OPERAND_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.impl.BinaryExpressionImpl
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__UNIQUE_NAME = OPERAND_EXPRESSION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERANDS = OPERAND_EXPRESSION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__KIND = OPERAND_EXPRESSION__KIND;

	/**
	 * The feature id for the '<em><b>Operands Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERANDS_KIND = OPERAND_EXPRESSION__OPERANDS_KIND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = OPERAND_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = OPERAND_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.ExpressionKind <em>Expression Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.ExpressionKind
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getExpressionKind()
	 * @generated
	 */
	int EXPRESSION_KIND = 10;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.ArithmeticOperator
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 11;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.BooleanOperator
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 12;

	/**
	 * The meta object id for the '{@link ccsl.elements.expressions.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.expressions.BinaryOperator
	 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 13;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ccsl.elements.expressions.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.VarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Declaration</em>'.
	 * @see ccsl.elements.expressions.VarDeclaration
	 * @generated
	 */
	EClass getVarDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.VarDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see ccsl.elements.expressions.VarDeclaration#getVariable()
	 * @see #getVarDeclaration()
	 * @generated
	 */
	EReference getVarDeclaration_Variable();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see ccsl.elements.expressions.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.CastExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ccsl.elements.expressions.CastExpression#getExpression()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Expression();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.CastExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.expressions.CastExpression#getType()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.TernaryExpression <em>Ternary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ternary Expression</em>'.
	 * @see ccsl.elements.expressions.TernaryExpression
	 * @generated
	 */
	EClass getTernaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.TernaryExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see ccsl.elements.expressions.TernaryExpression#getCondition()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EReference getTernaryExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.TernaryExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see ccsl.elements.expressions.TernaryExpression#getElseExpression()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EReference getTernaryExpression_ElseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.TernaryExpression#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see ccsl.elements.expressions.TernaryExpression#getThenExpression()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EReference getTernaryExpression_ThenExpression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.InstanceofExpression <em>Instanceof Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instanceof Expression</em>'.
	 * @see ccsl.elements.expressions.InstanceofExpression
	 * @generated
	 */
	EClass getInstanceofExpression();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.expressions.InstanceofExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.expressions.InstanceofExpression#getType()
	 * @see #getInstanceofExpression()
	 * @generated
	 */
	EReference getInstanceofExpression_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.expressions.InstanceofExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see ccsl.elements.expressions.InstanceofExpression#getObjectExpression()
	 * @see #getInstanceofExpression()
	 * @generated
	 */
	EReference getInstanceofExpression_ObjectExpression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see ccsl.elements.expressions.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.ArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.elements.expressions.ArithmeticExpression#getOperator()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Operator();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.StringConcatenation <em>String Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Concatenation</em>'.
	 * @see ccsl.elements.expressions.StringConcatenation
	 * @generated
	 */
	EClass getStringConcatenation();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see ccsl.elements.expressions.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.BooleanExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.elements.expressions.BooleanExpression#getOperator()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Operator();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see ccsl.elements.expressions.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.elements.expressions.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.expressions.OperandExpression <em>Operand Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand Expression</em>'.
	 * @see ccsl.elements.expressions.OperandExpression
	 * @generated
	 */
	EClass getOperandExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.expressions.OperandExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see ccsl.elements.expressions.OperandExpression#getOperands()
	 * @see #getOperandExpression()
	 * @generated
	 */
	EReference getOperandExpression_Operands();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.OperandExpression#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ccsl.elements.expressions.OperandExpression#getKind()
	 * @see #getOperandExpression()
	 * @generated
	 */
	EAttribute getOperandExpression_Kind();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.expressions.OperandExpression#getOperandsKind <em>Operands Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operands Kind</em>'.
	 * @see ccsl.elements.expressions.OperandExpression#getOperandsKind()
	 * @see #getOperandExpression()
	 * @generated
	 */
	EAttribute getOperandExpression_OperandsKind();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.expressions.ExpressionKind <em>Expression Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Kind</em>'.
	 * @see ccsl.elements.expressions.ExpressionKind
	 * @generated
	 */
	EEnum getExpressionKind();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.expressions.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see ccsl.elements.expressions.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.expressions.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see ccsl.elements.expressions.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link ccsl.elements.expressions.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see ccsl.elements.expressions.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.ExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.VarDeclarationImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getVarDeclaration()
		 * @generated
		 */
		EClass VAR_DECLARATION = eINSTANCE.getVarDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECLARATION__VARIABLE = eINSTANCE.getVarDeclaration_Variable();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.CastExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getCastExpression()
		 * @generated
		 */
		EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__EXPRESSION = eINSTANCE.getCastExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.TernaryExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getTernaryExpression()
		 * @generated
		 */
		EClass TERNARY_EXPRESSION = eINSTANCE.getTernaryExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_EXPRESSION__CONDITION = eINSTANCE.getTernaryExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getTernaryExpression_ElseExpression();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_EXPRESSION__THEN_EXPRESSION = eINSTANCE.getTernaryExpression_ThenExpression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.InstanceofExpressionImpl <em>Instanceof Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.InstanceofExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getInstanceofExpression()
		 * @generated
		 */
		EClass INSTANCEOF_EXPRESSION = eINSTANCE.getInstanceofExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCEOF_EXPRESSION__TYPE = eINSTANCE.getInstanceofExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCEOF_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getInstanceofExpression_ObjectExpression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.ArithmeticExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.StringConcatenationImpl <em>String Concatenation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.StringConcatenationImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getStringConcatenation()
		 * @generated
		 */
		EClass STRING_CONCATENATION = eINSTANCE.getStringConcatenation();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.BooleanExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__OPERATOR = eINSTANCE.getBooleanExpression_Operator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.BinaryExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.impl.OperandExpressionImpl <em>Operand Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.impl.OperandExpressionImpl
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getOperandExpression()
		 * @generated
		 */
		EClass OPERAND_EXPRESSION = eINSTANCE.getOperandExpression();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND_EXPRESSION__OPERANDS = eINSTANCE.getOperandExpression_Operands();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND_EXPRESSION__KIND = eINSTANCE.getOperandExpression_Kind();

		/**
		 * The meta object literal for the '<em><b>Operands Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND_EXPRESSION__OPERANDS_KIND = eINSTANCE.getOperandExpression_OperandsKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.ExpressionKind <em>Expression Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.ExpressionKind
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getExpressionKind()
		 * @generated
		 */
		EEnum EXPRESSION_KIND = eINSTANCE.getExpressionKind();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.ArithmeticOperator
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.BooleanOperator
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.expressions.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.expressions.BinaryOperator
		 * @see ccsl.elements.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //ExpressionsPackage
