package org.ccsl.checker.popup.ccslChecker.output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import org.ccsl.checker.popup.ccslChecker.Violation;

public class CcslCheckerReportWritter {



	public static void writeRuleViolations(File f, Collection<Violation> violations) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(f));
		for (Violation v : violations) {
			writer.append(v.getMessage()).append('\n');
		}
		writer.close();
	}
}
