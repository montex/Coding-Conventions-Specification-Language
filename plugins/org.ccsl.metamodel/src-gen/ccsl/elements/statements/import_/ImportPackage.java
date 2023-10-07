/**
 */
package ccsl.elements.statements.import_;

import ccsl.elements.ElementsPackage;

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
 * @see ccsl.elements.statements.import_.ImportFactory
 * @model kind="package"
 * @generated
 */
public interface ImportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "import";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/elements/statements/import";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "import";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImportPackage eINSTANCE = ccsl.elements.statements.import_.impl.ImportPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.import_.impl.ImportableElementImpl <em>Importable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.import_.impl.ImportableElementImpl
	 * @see ccsl.elements.statements.import_.impl.ImportPackageImpl#getImportableElement()
	 * @generated
	 */
	int IMPORTABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTABLE_ELEMENT__UNIQUE_NAME = ElementsPackage.ELEMENT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Importable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTABLE_ELEMENT_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.import_.impl.ImportStatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.import_.impl.ImportStatementImpl
	 * @see ccsl.elements.statements.import_.impl.ImportPackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__UNIQUE_NAME = StatementsPackage.STATEMENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IMPORTED_ELEMENT = StatementsPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__STATIC = StatementsPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_FEATURE_COUNT = StatementsPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.import_.ImportableElement <em>Importable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Importable Element</em>'.
	 * @see ccsl.elements.statements.import_.ImportableElement
	 * @generated
	 */
	EClass getImportableElement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.import_.ImportStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see ccsl.elements.statements.import_.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.import_.ImportStatement#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Element</em>'.
	 * @see ccsl.elements.statements.import_.ImportStatement#getImportedElement()
	 * @see #getImportStatement()
	 * @generated
	 */
	EReference getImportStatement_ImportedElement();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.import_.ImportStatement#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see ccsl.elements.statements.import_.ImportStatement#isStatic()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_Static();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImportFactory getImportFactory();

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
		 * The meta object literal for the '{@link ccsl.elements.statements.import_.impl.ImportableElementImpl <em>Importable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.import_.impl.ImportableElementImpl
		 * @see ccsl.elements.statements.import_.impl.ImportPackageImpl#getImportableElement()
		 * @generated
		 */
		EClass IMPORTABLE_ELEMENT = eINSTANCE.getImportableElement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.import_.impl.ImportStatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.import_.impl.ImportStatementImpl
		 * @see ccsl.elements.statements.import_.impl.ImportPackageImpl#getImportStatement()
		 * @generated
		 */
		EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

		/**
		 * The meta object literal for the '<em><b>Imported Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_STATEMENT__IMPORTED_ELEMENT = eINSTANCE.getImportStatement_ImportedElement();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__STATIC = eINSTANCE.getImportStatement_Static();

	}

} //ImportPackage
