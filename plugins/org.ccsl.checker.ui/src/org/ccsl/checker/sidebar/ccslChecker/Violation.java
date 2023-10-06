package org.ccsl.checker.sidebar.ccslChecker;

import org.eclipse.modisco.java.ASTNode;

public class Violation {

	private ASTNode nodeViolation;
	private int line;
	
	public Violation(ASTNode nodeViolation, int line) {
		this.nodeViolation = nodeViolation;
		this.line = line;
	}
	
	public String getMessage() {
		return "Violation found in " + nodeViolation.getOriginalCompilationUnit().getOriginalFilePath() +":" + line;
	}
	
	public ASTNode getNodeViolation() {
		return nodeViolation;
	}
	
	public int getLine() {
		return line;
	}
	
    public String getFilePath() {
        return nodeViolation.getOriginalCompilationUnit().getOriginalFilePath();
    }
}
