package tests;

import grader.basics.BasicLanguageDependencyManager;
import grader.basics.config.BasicExecutionSpecificationSelector;
import gradingTools.comp4760.assignment1.Assignment1Suite;
import trace.grader.basics.GraderBasicsTraceUtility;
import util.trace.Tracer;

public class RunOpenMPTrainingTests {
	public static void main (String[] args) {
		Tracer.showInfo(true);
		GraderBasicsTraceUtility.setBufferTracedMessages(false);
//		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\OpenMPTraining");
//		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().setLanguage(BasicLanguageDependencyManager.CPlusPlus_LANGUAGE);
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\OpenMPTraining");
		Assignment1Suite.main(args);
	}

}
