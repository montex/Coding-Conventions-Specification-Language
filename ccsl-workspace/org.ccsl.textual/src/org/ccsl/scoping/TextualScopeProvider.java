package org.ccsl.scoping;

import java.util.ArrayList;
import java.util.List;

import ccsl.AtomicRule;
import ccsl.ccslPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import ccsl.elements.Element;
import ccsl.elements.ElementsPackage;
import ccsl.elements.datatype.ObjectType;
import ccsl.elements.namedElements.complexType.AnnotationType;
import ccsl.elements.namedElements.complexType.AnonymousClass;
import ccsl.elements.namedElements.complexType.ComplexTypePackage;
import ccsl.elements.namedElements.complexType.JClass;
import ccsl.elements.namedElements.complexType.TypeDeclaration;
import ccsl.elements.expressions.annotation.*;
import ccsl.functions.booleanFunctions.BooleanFunctionsPackage;
import ccsl.functions.booleanFunctions.filters.*;
import ccsl.functions.booleanFunctions.filters.TemplateFilter;
import ccsl.functions.booleanFunctions.filters.ImplicityContainerFilter;


/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class TextualScopeProvider extends AbstractTextualScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
        if (context instanceof TypeDeclaration && reference == ComplexTypePackage.Literals.TYPE_DECLARATION__NESTED_TYPES) {
            EObject rootElement = EcoreUtil2.getRootContainer(context);
            List<TypeDeclaration> candidates = EcoreUtil2.getAllContentsOfType(rootElement, TypeDeclaration.class);
            return Scopes.scopeFor(candidates);
        } else if (context instanceof AnonymousClass && reference == ComplexTypePackage.Literals.ANONYMOUS_CLASS__TYPE) {
            EObject rootElement = EcoreUtil2.getRootContainer(context);
            List<TypeDeclaration> candidates = EcoreUtil2.getAllContentsOfType(rootElement, TypeDeclaration.class);
            List<EObject> allCandidates = new ArrayList<>();
            allCandidates.addAll(candidates);
            allCandidates.addAll(EcoreUtil2.getAllContentsOfType(rootElement, Element.class));
            return Scopes.scopeFor(allCandidates);
        }
        else if (context instanceof Annotation && reference == ComplexTypePackage.Literals.ANNOTATION_TYPE) {
        	EObject rootElement = EcoreUtil2.getRootContainer(context);
            List<AnnotationType> candidates = EcoreUtil2.getAllContentsOfType(rootElement, AnnotationType.class);
            return Scopes.scopeFor(candidates);
        }
        else if (context instanceof JClass && reference == ComplexTypePackage.Literals.JCLASS) {
        	EObject rootElement = EcoreUtil2.getRootContainer(context);
            List<JClass> candidates = EcoreUtil2.getAllContentsOfType(rootElement, JClass.class);
            return Scopes.scopeFor(candidates);
        }
        else if (context instanceof TemplateFilter && reference == FiltersPackage.Literals.TEMPLATE_FILTER) {
        	EObject rootElement = EcoreUtil2.getRootContainer(context);
            List<Element> candidates = EcoreUtil2.getAllContentsOfType(rootElement, Element.class);
            return Scopes.scopeFor(candidates);
        }
        else if (context instanceof ImplicityContainerFilter && reference == FiltersPackage.Literals.IMPLICITY_CONTAINER_FILTER) {
        	EObject rootElement = EcoreUtil2.getRootContainer(context);
            List<Element> candidates = EcoreUtil2.getAllContentsOfType(rootElement, Element.class);
            return Scopes.scopeFor(candidates);
        }
        /*else if (context instanceof AtomicRule && reference == ccslPackage.Literals.ATOMIC_RULE) {
        	EObject rootElement = EcoreUtil2.getRootContainer(context);
            List<Element> candidates = EcoreUtil2.getAllContentsOfType(rootElement, Element.class);
            return Scopes.scopeFor(candidates);
        }*/
        return super.getScope(context, reference);
    }
}