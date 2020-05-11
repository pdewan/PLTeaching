package tests;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import gradingTools.logs.DifficultyCommandsExtractor;

public class DifficultyCommandsDriver {
	public static void main (String[] args) {
		DifficultyCommandsExtractor.processLogsInProjectFolder(new File("."));
//		DifficultyCommandsExtractor.fillDifficultyCommandsInProjectDirectory(new File("."));
//		System.out.println(DifficultyCommandsExtractor.getDifficultyContext()());
//		System.out.println(aDates);
////		Collections.sort(aDates);
////		System.out.println(aDates);



	}

}
