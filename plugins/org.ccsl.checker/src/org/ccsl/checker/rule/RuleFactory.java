package org.ccsl.checker.rule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.ccsl.checker.utils.FileUtils;
import org.ccsl.gen.ocl.main.MainGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;


public class RuleFactory {

	private static final String OUT_OCL_NAME = "ocl-gen.txt";
	
	public static Rule createRuleFromFile(File f) throws IOException {
		String extension = FileUtils.getFileExtension(f);
		String ruleName=  FileUtils.getFileNameWithoutExtension(f);
		if(extension.equalsIgnoreCase("ocl")) {
			return new Rule(ruleName, getOclFromOclFile(f));
		}else if(extension.equalsIgnoreCase("ccsl") ||
				 extension.equalsIgnoreCase("ccslt")) {
			return new Rule(ruleName, getOclFromCcslFile(f));
		}else {
			return null;
		}
	}
	
	private static String getOclFromOclFile(File oclFile) throws IOException {
		Path path = oclFile.toPath();
		try(Stream<String> fileStream = Files.lines(path)){
			return fileStream.collect(Collectors.joining("\n"));
		}
	}

	private static String getOclFromCcslFile(File ccslFile) throws IOException {
		
		String outFolder = System.getProperty("java.io.tmpdir");

		List<String> arguments = new ArrayList<String>();

		// Run the transformation (URI of file, output folder, arguments)
		MainGenerator generator = new MainGenerator(
				URI.createFileURI(ccslFile.getAbsolutePath()),
				new File(outFolder),
				arguments
		);
		generator.doGenerate(new BasicMonitor());

		File generatedOclFile = new File(outFolder + "/" + OUT_OCL_NAME);

		return getOclFromOclFile(generatedOclFile);
	}
}