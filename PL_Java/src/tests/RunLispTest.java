package tests;

import grader.basics.config.BasicExecutionSpecificationSelector;
import gradingTools.addMultiply.AddMultiplySuite;
import gradingTools.comp524f20.assignment4.Assignment4Suite;
import trace.grader.basics.GraderBasicsTraceUtility;
import util.trace.Tracer;

public class RunLispTest {
	public static void main (String[] args) {
		Tracer.showInfo(true);
		GraderBasicsTraceUtility.setBufferTracedMessages(false);
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setStudentGradableProjectLocation("D:\\dewan_backup\\Java\\eclipse\\test-lisp");
		Assignment4Suite.main(args);
//		AddMultiplySuite.main(args);
	}

}
