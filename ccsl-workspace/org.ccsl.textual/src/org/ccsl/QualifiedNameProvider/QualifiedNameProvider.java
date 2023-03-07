package org.ccsl.QualifiedNameProvider;


import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import ccsl.elements.Element;
import ccsl.AtomicRule;

public class QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	public QualifiedName qualifiedName(Element element) {
		return QualifiedName.create(element.getUniqueName());
	}
	
	public QualifiedName qualifiedName(AtomicRule atomicRule) {
		return QualifiedName.create(atomicRule.getSubject().getUniqueName());
	}

}
