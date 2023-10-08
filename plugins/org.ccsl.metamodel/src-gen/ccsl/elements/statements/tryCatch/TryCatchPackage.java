/**
 */
package ccsl.elements.statements.tryCatch;

import ccsl.elements.statements.StatementsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ccsl.elements.statements.tryCatch.TryCatchFactory
 * @model kind="package"
 * @generated
 */
public interface TryCatchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tryCatch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/statements/tryCatch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tryCatch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TryCatchPackage eINSTANCE = ccsl.elements.statements.tryCatch.impl.TryCatchPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl <em>Try Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.tryCatch.impl.TryStatementImpl
	 * @see ccsl.elements.statements.tryCatch.impl.TryCatchPackageImpl#getTryStatement()
	 * @generated
	 */
	int TRY_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__UNIQUE_NAME = StatementsPackage.STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Catch Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__CATCH_CLAUSES = StatementsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finally Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__FINALLY_BLOCK = StatementsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catch Clauses Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__CATCH_CLAUSES_KIND = StatementsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__RESOURCES = StatementsPackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resources Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__RESOURCES_KIND = StatementsPackage.STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Try Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__TRY_BLOCK = StatementsPackage.STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Try Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT_FEATURE_COUNT = StatementsPackage.STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.tryCatch.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.tryCatch.impl.CatchClauseImpl
	 * @see ccsl.elements.statements.tryCatch.impl.TryCatchPackageImpl#getCatchClause()
	 * @generated
	 */
	int CATCH_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__UNIQUE_NAME = StatementsPackage.STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__BODY = StatementsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__VARIABLE = StatementsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handled Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__HANDLED_EXCEPTIONS = StatementsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE_FEATURE_COUNT = StatementsPackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.tryCatch.TryStatement <em>Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Statement</em>'.
	 * @see ccsl.elements.statements.tryCatch.TryStatement
	 * @generated
	 */
	EClass getTryStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.tryCatch.TryStatement#getCatchClauses <em>Catch Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Clauses</em>'.
	 * @see ccsl.elements.statements.tryCatch.TryStatement#getCatchClauses()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_CatchClauses();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.tryCatch.TryStatement#getFinallyBlock <em>Finally Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finally Block</em>'.
	 * @see ccsl.elements.statements.tryCatch.TryStatement#getFinallyBlock()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_FinallyBlock();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.tryCatch.TryStatement#getCatchClausesKind <em>Catch Clauses Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catch Clauses Kind</em>'.
	 * @see ccsl.elements.statements.tryCatch.TryStatement#getCatchClausesKind()
	 * @see #getTryStatement()
	 * @generated
	 */
	EAttribute getTryStatement_CatchClausesKind();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.tryCatch.TryStatement#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see ccsl.elements.statements.tryCatch.TryStatement#getResources()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_Resources();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.tryCatch.TryStatement#getResourcesKind <em>Resources Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources Kind</em>'.
	 * @see ccsl.elements.statements.tryCatch.TryStatement#getResourcesKind()
	 * @see #getTryStatement()
	 * @generated
	 */
	EAttribute getTryStatement_ResourcesKind();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.tryCatch.TryStatement#getTryBlock <em>Try Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Try Block</em>'.
	 * @see ccsl.elements.statements.tryCatch.TryStatement#getTryBlock()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_TryBlock();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.tryCatch.CatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Clause</em>'.
	 * @see ccsl.elements.statements.tryCatch.CatchClause
	 * @generated
	 */
	EClass getCatchClause();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.tryCatch.CatchClause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ccsl.elements.statements.tryCatch.CatchClause#getBody()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_Body();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.tryCatch.CatchClause#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see ccsl.elements.statements.tryCatch.CatchClause#getVariable()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_Variable();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.elements.statements.tryCatch.CatchClause#getHandledExceptions <em>Handled Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Handled Exceptions</em>'.
	 * @see ccsl.elements.statements.tryCatch.CatchClause#getHandledExceptions()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_HandledExceptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TryCatchFactory getTryCatchFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.statements.tryCatch.impl.TryStatementImpl <em>Try Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.tryCatch.impl.TryStatementImpl
		 * @see ccsl.elements.statements.tryCatch.impl.TryCatchPackageImpl#getTryStatement()
		 * @generated
		 */
		EClass TRY_STATEMENT = eINSTANCE.getTryStatement();

		/**
		 * The meta object literal for the '<em><b>Catch Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__CATCH_CLAUSES = eINSTANCE.getTryStatement_CatchClauses();

		/**
		 * The meta object literal for the '<em><b>Finally Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__FINALLY_BLOCK = eINSTANCE.getTryStatement_FinallyBlock();

		/**
		 * The meta object literal for the '<em><b>Catch Clauses Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRY_STATEMENT__CATCH_CLAUSES_KIND = eINSTANCE.getTryStatement_CatchClausesKind();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__RESOURCES = eINSTANCE.getTryStatement_Resources();

		/**
		 * The meta object literal for the '<em><b>Resources Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRY_STATEMENT__RESOURCES_KIND = eINSTANCE.getTryStatement_ResourcesKind();

		/**
		 * The meta object literal for the '<em><b>Try Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__TRY_BLOCK = eINSTANCE.getTryStatement_TryBlock();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.tryCatch.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.tryCatch.impl.CatchClauseImpl
		 * @see ccsl.elements.statements.tryCatch.impl.TryCatchPackageImpl#getCatchClause()
		 * @generated
		 */
		EClass CATCH_CLAUSE = eINSTANCE.getCatchClause();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_CLAUSE__BODY = eINSTANCE.getCatchClause_Body();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_CLAUSE__VARIABLE = eINSTANCE.getCatchClause_Variable();

		/**
		 * The meta object literal for the '<em><b>Handled Exceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_CLAUSE__HANDLED_EXCEPTIONS = eINSTANCE.getCatchClause_HandledExceptions();

	}

} //TryCatchPackage
