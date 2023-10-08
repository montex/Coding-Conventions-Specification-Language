/**
 */
package ccsl.functions.booleanFunctions.filters.util;

import ccsl.functions.CcslFunction;

import ccsl.functions.booleanFunctions.CcslBooleanFunction;

import ccsl.functions.booleanFunctions.filters.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ccsl.functions.booleanFunctions.filters.FiltersPackage
 * @generated
 */
public class FiltersSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiltersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersSwitch() {
		if (modelPackage == null) {
			modelPackage = FiltersPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case FiltersPackage.FILTER: {
			Filter filter = (Filter) theEObject;
			Object result = caseFilter(filter);
			if (result == null)
				result = caseCcslBooleanFunction(filter);
			if (result == null)
				result = caseCcslFunction(filter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.ATOMIC_FILTER: {
			AtomicFilter atomicFilter = (AtomicFilter) theEObject;
			Object result = caseAtomicFilter(atomicFilter);
			if (result == null)
				result = caseFilter(atomicFilter);
			if (result == null)
				result = caseCcslBooleanFunction(atomicFilter);
			if (result == null)
				result = caseCcslFunction(atomicFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.COMPOSITE_FILTER: {
			CompositeFilter compositeFilter = (CompositeFilter) theEObject;
			Object result = caseCompositeFilter(compositeFilter);
			if (result == null)
				result = caseFilter(compositeFilter);
			if (result == null)
				result = caseCcslBooleanFunction(compositeFilter);
			if (result == null)
				result = caseCcslFunction(compositeFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.PROPERTY_FILTER: {
			PropertyFilter propertyFilter = (PropertyFilter) theEObject;
			Object result = casePropertyFilter(propertyFilter);
			if (result == null)
				result = caseAtomicFilter(propertyFilter);
			if (result == null)
				result = caseFilter(propertyFilter);
			if (result == null)
				result = caseCcslBooleanFunction(propertyFilter);
			if (result == null)
				result = caseCcslFunction(propertyFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.TEMPLATE_FILTER: {
			TemplateFilter templateFilter = (TemplateFilter) theEObject;
			Object result = caseTemplateFilter(templateFilter);
			if (result == null)
				result = caseAtomicFilter(templateFilter);
			if (result == null)
				result = caseFilter(templateFilter);
			if (result == null)
				result = caseCcslBooleanFunction(templateFilter);
			if (result == null)
				result = caseCcslFunction(templateFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.SAME_NAME_FILTER: {
			SameNameFilter sameNameFilter = (SameNameFilter) theEObject;
			Object result = caseSameNameFilter(sameNameFilter);
			if (result == null)
				result = caseAtomicFilter(sameNameFilter);
			if (result == null)
				result = caseFilter(sameNameFilter);
			if (result == null)
				result = caseCcslBooleanFunction(sameNameFilter);
			if (result == null)
				result = caseCcslFunction(sameNameFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.COUNT_FILTER: {
			CountFilter countFilter = (CountFilter) theEObject;
			Object result = caseCountFilter(countFilter);
			if (result == null)
				result = caseAtomicFilter(countFilter);
			if (result == null)
				result = caseFilter(countFilter);
			if (result == null)
				result = caseCcslBooleanFunction(countFilter);
			if (result == null)
				result = caseCcslFunction(countFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.REGEX_MATCH: {
			RegexMatch regexMatch = (RegexMatch) theEObject;
			Object result = caseRegexMatch(regexMatch);
			if (result == null)
				result = caseAtomicFilter(regexMatch);
			if (result == null)
				result = caseFilter(regexMatch);
			if (result == null)
				result = caseCcslBooleanFunction(regexMatch);
			if (result == null)
				result = caseCcslFunction(regexMatch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.IMPLICITY_OPERAND_FILTER: {
			ImplicityOperandFilter implicityOperandFilter = (ImplicityOperandFilter) theEObject;
			Object result = caseImplicityOperandFilter(implicityOperandFilter);
			if (result == null)
				result = caseTemplateFilter(implicityOperandFilter);
			if (result == null)
				result = caseAtomicFilter(implicityOperandFilter);
			if (result == null)
				result = caseFilter(implicityOperandFilter);
			if (result == null)
				result = caseCcslBooleanFunction(implicityOperandFilter);
			if (result == null)
				result = caseCcslFunction(implicityOperandFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.IMPLICITY_CONTAINER_FILTER: {
			ImplicityContainerFilter implicityContainerFilter = (ImplicityContainerFilter) theEObject;
			Object result = caseImplicityContainerFilter(implicityContainerFilter);
			if (result == null)
				result = caseAtomicFilter(implicityContainerFilter);
			if (result == null)
				result = caseFilter(implicityContainerFilter);
			if (result == null)
				result = caseCcslBooleanFunction(implicityContainerFilter);
			if (result == null)
				result = caseCcslFunction(implicityContainerFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.IS_KIND_OF_FILTER: {
			IsKindOfFilter isKindOfFilter = (IsKindOfFilter) theEObject;
			Object result = caseIsKindOfFilter(isKindOfFilter);
			if (result == null)
				result = caseAtomicFilter(isKindOfFilter);
			if (result == null)
				result = caseFilter(isKindOfFilter);
			if (result == null)
				result = caseCcslBooleanFunction(isKindOfFilter);
			if (result == null)
				result = caseCcslFunction(isKindOfFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.SUPER_METHOD_CLOSURE_FILTER: {
			SuperMethodClosureFilter superMethodClosureFilter = (SuperMethodClosureFilter) theEObject;
			Object result = caseSuperMethodClosureFilter(superMethodClosureFilter);
			if (result == null)
				result = caseAtomicFilter(superMethodClosureFilter);
			if (result == null)
				result = caseFilter(superMethodClosureFilter);
			if (result == null)
				result = caseCcslBooleanFunction(superMethodClosureFilter);
			if (result == null)
				result = caseCcslFunction(superMethodClosureFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.IS_TYPE_OF_FILTER: {
			IsTypeOfFilter isTypeOfFilter = (IsTypeOfFilter) theEObject;
			Object result = caseIsTypeOfFilter(isTypeOfFilter);
			if (result == null)
				result = caseAtomicFilter(isTypeOfFilter);
			if (result == null)
				result = caseFilter(isTypeOfFilter);
			if (result == null)
				result = caseCcslBooleanFunction(isTypeOfFilter);
			if (result == null)
				result = caseCcslFunction(isTypeOfFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.CHILD_CLOSURE_COMPLEX_TYPE_FILTER: {
			ChildClosureComplexTypeFilter childClosureComplexTypeFilter = (ChildClosureComplexTypeFilter) theEObject;
			Object result = caseChildClosureComplexTypeFilter(childClosureComplexTypeFilter);
			if (result == null)
				result = caseAtomicFilter(childClosureComplexTypeFilter);
			if (result == null)
				result = caseFilter(childClosureComplexTypeFilter);
			if (result == null)
				result = caseCcslBooleanFunction(childClosureComplexTypeFilter);
			if (result == null)
				result = caseCcslFunction(childClosureComplexTypeFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.IS_STRING_FILTER: {
			IsStringFilter isStringFilter = (IsStringFilter) theEObject;
			Object result = caseIsStringFilter(isStringFilter);
			if (result == null)
				result = caseAtomicFilter(isStringFilter);
			if (result == null)
				result = caseFilter(isStringFilter);
			if (result == null)
				result = caseCcslBooleanFunction(isStringFilter);
			if (result == null)
				result = caseCcslFunction(isStringFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.EQUATION_FILTER: {
			EquationFilter equationFilter = (EquationFilter) theEObject;
			Object result = caseEquationFilter(equationFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.FROM_CLOSURE_FILTER: {
			FromClosureFilter fromClosureFilter = (FromClosureFilter) theEObject;
			Object result = caseFromClosureFilter(fromClosureFilter);
			if (result == null)
				result = caseAtomicFilter(fromClosureFilter);
			if (result == null)
				result = caseFilter(fromClosureFilter);
			if (result == null)
				result = caseCcslBooleanFunction(fromClosureFilter);
			if (result == null)
				result = caseCcslFunction(fromClosureFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.HAS_SUPER_CLASS_FILTER: {
			HasSuperClassFilter hasSuperClassFilter = (HasSuperClassFilter) theEObject;
			Object result = caseHasSuperClassFilter(hasSuperClassFilter);
			if (result == null)
				result = caseAtomicFilter(hasSuperClassFilter);
			if (result == null)
				result = caseFilter(hasSuperClassFilter);
			if (result == null)
				result = caseCcslBooleanFunction(hasSuperClassFilter);
			if (result == null)
				result = caseCcslFunction(hasSuperClassFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.BLOCK_LAST_STATEMENT_FILTER: {
			BlockLastStatementFilter blockLastStatementFilter = (BlockLastStatementFilter) theEObject;
			Object result = caseBlockLastStatementFilter(blockLastStatementFilter);
			if (result == null)
				result = caseAtomicFilter(blockLastStatementFilter);
			if (result == null)
				result = caseFilter(blockLastStatementFilter);
			if (result == null)
				result = caseCcslBooleanFunction(blockLastStatementFilter);
			if (result == null)
				result = caseCcslFunction(blockLastStatementFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.HAS_SAME_REFERENCE_FILTER: {
			HasSameReferenceFilter hasSameReferenceFilter = (HasSameReferenceFilter) theEObject;
			Object result = caseHasSameReferenceFilter(hasSameReferenceFilter);
			if (result == null)
				result = caseAtomicFilter(hasSameReferenceFilter);
			if (result == null)
				result = caseFilter(hasSameReferenceFilter);
			if (result == null)
				result = caseCcslBooleanFunction(hasSameReferenceFilter);
			if (result == null)
				result = caseCcslFunction(hasSameReferenceFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.IS_EMPTY_BLOCK_FILTER: {
			IsEmptyBlockFilter isEmptyBlockFilter = (IsEmptyBlockFilter) theEObject;
			Object result = caseIsEmptyBlockFilter(isEmptyBlockFilter);
			if (result == null)
				result = caseAtomicFilter(isEmptyBlockFilter);
			if (result == null)
				result = caseFilter(isEmptyBlockFilter);
			if (result == null)
				result = caseCcslBooleanFunction(isEmptyBlockFilter);
			if (result == null)
				result = caseCcslFunction(isEmptyBlockFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.IMPLICIT_CONTENTS_FILTER: {
			ImplicitContentsFilter implicitContentsFilter = (ImplicitContentsFilter) theEObject;
			Object result = caseImplicitContentsFilter(implicitContentsFilter);
			if (result == null)
				result = caseAtomicFilter(implicitContentsFilter);
			if (result == null)
				result = caseFilter(implicitContentsFilter);
			if (result == null)
				result = caseCcslBooleanFunction(implicitContentsFilter);
			if (result == null)
				result = caseCcslFunction(implicitContentsFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAtomicFilter(AtomicFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompositeFilter(CompositeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyFilter(PropertyFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateFilter(TemplateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Name Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Name Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSameNameFilter(SameNameFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCountFilter(CountFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regex Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regex Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegexMatch(RegexMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicity Operand Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicity Operand Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImplicityOperandFilter(ImplicityOperandFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicity Container Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicity Container Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImplicityContainerFilter(ImplicityContainerFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Kind Of Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Kind Of Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIsKindOfFilter(IsKindOfFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Closure Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Closure Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSuperMethodClosureFilter(SuperMethodClosureFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Type Of Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Type Of Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIsTypeOfFilter(IsTypeOfFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Closure Complex Type Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Closure Complex Type Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChildClosureComplexTypeFilter(ChildClosureComplexTypeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is String Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is String Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIsStringFilter(IsStringFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEquationFilter(EquationFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Closure Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Closure Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFromClosureFilter(FromClosureFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Super Class Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Super Class Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHasSuperClassFilter(HasSuperClassFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Last Statement Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Last Statement Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlockLastStatementFilter(BlockLastStatementFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Same Reference Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Same Reference Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHasSameReferenceFilter(HasSameReferenceFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Empty Block Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Empty Block Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIsEmptyBlockFilter(IsEmptyBlockFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Contents Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Contents Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImplicitContentsFilter(ImplicitContentsFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ccsl Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ccsl Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCcslFunction(CcslFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ccsl Boolean Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ccsl Boolean Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCcslBooleanFunction(CcslBooleanFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //FiltersSwitch
