package tests;

import grader.basics.config.BasicExecutionSpecificationSelector;
import gradingTools.comp110.assignment1.Assignment1Suite;
import trace.grader.basics.GraderBasicsTraceUtility;
//import trace.grader.basics.GraderBasicsTraceUtility;
import util.trace.Tracer;

public class RunCTest {
	public static void main (String[] args) {
		Tracer.showInfo(true);
		GraderBasicsTraceUtility.setBufferTracedMessages(false);
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setStudentGradableProjectLocation("D:\\dewan_backup\\Java\\eclipse\\test-c");
		Assignment1Suite.main(args);
//		AddMultiplySuite.main(args);
	}

}
