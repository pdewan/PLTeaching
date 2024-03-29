package tests;

import java.util.Vector;

import byteman.tools.exampleTestCases.BytemanTest;
import grader.basics.checkstyle.CheckStyleInvoker;
import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.project.BasicProject;
import gradingTools.comp524f20.assignment0_1.F20Assignment0_1Suite;
//import gradingTools.comp524f19.assignment5.Assignment5Suite;
import util.trace.Tracer;

public class RunBytemanTest {
//	public static void main (String[] args) {
////		Tracer.showInfo(true);
//		BytemanTest.main(args);
//	}
	
	static final String CHECKSTYLE_CONFIGURATION = "unc_checks_byteman_test.xml";
	public static void main (String[] args) {
//		Vector v = new Vector();
//		v.size();
//		BasicProject.setCheckEclipseFolder(false);
//		BasicProject.setCheckCheckstyleFolder(false);
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification()
		.setCheckStyleConfiguration("unc_checks_byteman_test.xml");
//		Tracer.showInfo(true);
		BytemanTest.main(args);
	}


}
