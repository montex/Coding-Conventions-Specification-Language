/**
 */
package ccsl.functions.booleanFunctions.filters.util;

import ccsl.functions.CcslFunction;

import ccsl.functions.booleanFunctions.CcslBooleanFunction;

import ccsl.functions.booleanFunctions.filters.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage
 * @generated
 */
public class FiltersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiltersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FiltersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiltersSwitch modelSwitch = new FiltersSwitch() {
		public Object caseFilter(Filter object) {
			return createFilterAdapter();
		}

		public Object caseAtomicFilter(AtomicFilter object) {
			return createAtomicFilterAdapter();
		}

		public Object caseCompositeFilter(CompositeFilter object) {
			return createCompositeFilterAdapter();
		}

		public Object casePropertyFilter(PropertyFilter object) {
			return createPropertyFilterAdapter();
		}

		public Object caseTemplateFilter(TemplateFilter object) {
			return createTemplateFilterAdapter();
		}

		public Object caseSameNameFilter(SameNameFilter object) {
			return createSameNameFilterAdapter();
		}

		public Object caseCountFilter(CountFilter object) {
			return createCountFilterAdapter();
		}

		public Object caseRegexMatch(RegexMatch object) {
			return createRegexMatchAdapter();
		}

		public Object caseImplicityOperandFilter(ImplicityOperandFilter object) {
			return createImplicityOperandFilterAdapter();
		}

		public Object caseImplicityContainerFilter(ImplicityContainerFilter object) {
			return createImplicityContainerFilterAdapter();
		}

		public Object caseIsKindOfFilter(IsKindOfFilter object) {
			return createIsKindOfFilterAdapter();
		}

		public Object caseSuperMethodClosureFilter(SuperMethodClosureFilter object) {
			return createSuperMethodClosureFilterAdapter();
		}

		public Object caseIsTypeOfFilter(IsTypeOfFilter object) {
			return createIsTypeOfFilterAdapter();
		}

		public Object caseChildClosureComplexTypeFilter(ChildClosureComplexTypeFilter object) {
			return createChildClosureComplexTypeFilterAdapter();
		}

		public Object caseIsStringFilter(IsStringFilter object) {
			return createIsStringFilterAdapter();
		}

		public Object caseEquationFilter(EquationFilter object) {
			return createEquationFilterAdapter();
		}

		public Object caseFromClosureFilter(FromClosureFilter object) {
			return createFromClosureFilterAdapter();
		}

		public Object caseHasSuperClassFilter(HasSuperClassFilter object) {
			return createHasSuperClassFilterAdapter();
		}

		public Object caseBlockLastStatementFilter(BlockLastStatementFilter object) {
			return createBlockLastStatementFilterAdapter();
		}

		public Object caseHasSameReferenceFilter(HasSameReferenceFilter object) {
			return createHasSameReferenceFilterAdapter();
		}

		public Object caseIsEmptyBlockFilter(IsEmptyBlockFilter object) {
			return createIsEmptyBlockFilterAdapter();
		}

		public Object caseImplicitContentsFilter(ImplicitContentsFilter object) {
			return createImplicitContentsFilterAdapter();
		}

		public Object caseCcslFunction(CcslFunction object) {
			return createCcslFunctionAdapter();
		}

		public Object caseCcslBooleanFunction(CcslBooleanFunction object) {
			return createCcslBooleanFunctionAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.AtomicFilter <em>Atomic Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.AtomicFilter
	 * @generated
	 */
	public Adapter createAtomicFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.CompositeFilter <em>Composite Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.CompositeFilter
	 * @generated
	 */
	public Adapter createCompositeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.PropertyFilter <em>Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.PropertyFilter
	 * @generated
	 */
	public Adapter createPropertyFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.TemplateFilter <em>Template Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.TemplateFilter
	 * @generated
	 */
	public Adapter createTemplateFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.SameNameFilter <em>Same Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.SameNameFilter
	 * @generated
	 */
	public Adapter createSameNameFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.CountFilter <em>Count Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.CountFilter
	 * @generated
	 */
	public Adapter createCountFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.RegexMatch <em>Regex Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.RegexMatch
	 * @generated
	 */
	public Adapter createRegexMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter <em>Implicity Operand Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityOperandFilter
	 * @generated
	 */
	public Adapter createImplicityOperandFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter <em>Implicity Container Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter
	 * @generated
	 */
	public Adapter createImplicityContainerFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.IsKindOfFilter <em>Is Kind Of Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.IsKindOfFilter
	 * @generated
	 */
	public Adapter createIsKindOfFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter <em>Super Method Closure Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.SuperMethodClosureFilter
	 * @generated
	 */
	public Adapter createSuperMethodClosureFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.IsTypeOfFilter <em>Is Type Of Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.IsTypeOfFilter
	 * @generated
	 */
	public Adapter createIsTypeOfFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter <em>Child Closure Complex Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.ChildClosureComplexTypeFilter
	 * @generated
	 */
	public Adapter createChildClosureComplexTypeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.IsStringFilter <em>Is String Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.IsStringFilter
	 * @generated
	 */
	public Adapter createIsStringFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.EquationFilter <em>Equation Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.EquationFilter
	 * @generated
	 */
	public Adapter createEquationFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.FromClosureFilter <em>From Closure Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.FromClosureFilter
	 * @generated
	 */
	public Adapter createFromClosureFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter <em>Has Super Class Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.HasSuperClassFilter
	 * @generated
	 */
	public Adapter createHasSuperClassFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter <em>Block Last Statement Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.BlockLastStatementFilter
	 * @generated
	 */
	public Adapter createBlockLastStatementFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.HasSameReferenceFilter <em>Has Same Reference Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.HasSameReferenceFilter
	 * @generated
	 */
	public Adapter createHasSameReferenceFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter <em>Is Empty Block Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.IsEmptyBlockFilter
	 * @generated
	 */
	public Adapter createIsEmptyBlockFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter <em>Implicit Contents Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.filters.ImplicitContentsFilter
	 * @generated
	 */
	public Adapter createImplicitContentsFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.CcslFunction <em>Ccsl Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.CcslFunction
	 * @generated
	 */
	public Adapter createCcslFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ccsl.functions.booleanFunctions.CcslBooleanFunction <em>Ccsl Boolean Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ccsl.functions.booleanFunctions.CcslBooleanFunction
	 * @generated
	 */
	public Adapter createCcslBooleanFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FiltersAdapterFactory
