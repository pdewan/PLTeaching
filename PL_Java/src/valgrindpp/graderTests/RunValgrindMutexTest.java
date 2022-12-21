package valgrindpp.graderTests;

import grader.basics.config.BasicExecutionSpecificationSelector;
import gradingTools.valgrindTestCases.MutexTestSuite;
import trace.grader.basics.GraderBasicsTraceUtility;
import util.trace.Tracer;

public class RunValgrindMutexTest {
	public static void main (String[] args) {
		GraderBasicsTraceUtility.setTracerShowInfo(true);	
		GraderBasicsTraceUtility.setBufferTracedMessages(false);
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
//		setStudentGradableProjectLocation(
//		 "D:\\dewan_backup\\Java\\GraderBasics\\src\\valgrindpp\\examples\\mutex");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\Java\\eclipse\\test-c");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\CorrectMutexLRU");
		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcMutex");

		
		MutexTestSuite.main(args);
//		AddMultiplySuite.main(args);
	}
}
