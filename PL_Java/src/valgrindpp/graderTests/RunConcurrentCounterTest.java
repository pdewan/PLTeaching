package valgrindpp.graderTests;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.execution.BasicProjectExecution;
import gradingTools.shared.testcases.valgrindTestCases.ConcurrentCounterSuite;
import trace.grader.basics.GraderBasicsTraceUtility;

public class RunConcurrentCounterTest {
	final static int TIME = 50;

	public static void main (String[] args) {
		GraderBasicsTraceUtility.setTracerShowInfo(true);
		BasicProjectExecution.setProcessTimeOut(TIME);

		GraderBasicsTraceUtility.setBufferTracedMessages(false);
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
//		setStudentGradableProjectLocation(
//		 "D:\\dewan_backup\\Java\\GraderBasics\\src\\valgrindpp\\examples\\mutex");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\Java\\eclipse\\test-c");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\CorrectMutexLRU");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcMutex");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcCondMutex");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcCondMutexError");
		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\2_threads");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcMutexNoError");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcSleepNoError");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcSequential");
//		setStudentGradableProjectLocation("D:\\dewan_backup\\C\\ValgrindExamples\\NoSrcNoSynchronization");


		ConcurrentCounterSuite.main(args);
//		AddMultiplySuite.main(args);
	}
}
