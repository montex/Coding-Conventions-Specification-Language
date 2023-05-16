package org.ccsl.QualifiedNameProvider;


import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import ccsl.elements.Element;
import ccsl.AtomicRule;
import ccsl.elements.datatype.ObjectType;
import ccsl.elements.namedElements.complexType.AnnotationType;
import ccsl.elements.namedElements.complexType.AnnotationField;
import ccsl.elements.namedElements.complexType.JInterface;
import ccsl.elements.namedElements.complexType.JClass;
import ccsl.elements.namedElements.complexType.*;
import ccsl.elements.datatype.*;
import ccsl.elements.namedElements.*;
import ccsl.elements.expressions.*;
import ccsl.elements.namedElements.method.*;
import ccsl.elements.statements.*;
import ccsl.elements.namedElements.variable.*;
import ccsl.elements.namedElements.complexType.JClass;

public class QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	public QualifiedName qualifiedName(Element element) {
		return QualifiedName.create(element.getUniqueName());
	}
	/*ADDED CHECK CORRECT*/
	public QualifiedName qualifiedName(Variable variable) {
		return QualifiedName.create(variable.getUniqueName());
	}
	
	/*ADDED CHECK CORRECT*/
	public QualifiedName qualifiedName(LabelStatement labelStatement) {
		return QualifiedName.create(labelStatement.getUniqueName());
	}
	

	
	/*public QualifiedName qualifiedName(ObjectType objecttype) {
		return QualifiedName.create(objecttype.getUniqueName());
	}*/
	
	public QualifiedName qualifiedName(AnnotationType annotationType) {
		return QualifiedName.create(annotationType.getUniqueName());
	}
	
	public QualifiedName qualifiedName(AnnotationField annotationField) {
		return QualifiedName.create(annotationField.getUniqueName());
	}
	
	public QualifiedName qualifiedName(DataType dataType) {
		return QualifiedName.create(dataType.getUniqueName());
	}
	
	public QualifiedName qualifiedName(JInterface jInterface) {
		return QualifiedName.create(jInterface.getUniqueName());
	}
	
	public QualifiedName qualifiedName(JClass jClass) {
		return QualifiedName.create(jClass.getUniqueName());
	}
	/*
	public QualifiedName qualifiedName(NamedElement namedElement) {
		return QualifiedName.create(namedElement.getUniqueName());
	}
	*/
	public QualifiedName qualifiedName(Expression expression) {
		return QualifiedName.create(expression.getUniqueName());
	}
	
	public QualifiedName qualifiedName(Method method) {
		return QualifiedName.create(method.getUniqueName());
	}
	
	/*public QualifiedName qualifiedName(ComplexType complexType) {
		return QualifiedName.create(complexType.getUniqueName());
	}*/
	
	public QualifiedName qualifiedName(Statement statement) {
		return QualifiedName.create(statement.getUniqueName());
	}
	
	
	
	
}

