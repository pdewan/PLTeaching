package tests;

import grader.basics.checkstyle.CheckStyleInvoker;
import grader.basics.config.BasicExecutionSpecificationSelector;
import gradingTools.comp524f20.assignment0_1.F20Assignment0_1Suite;
//import gradingTools.comp524f19.assignment5.Assignment5Suite;
import util.trace.Tracer;

public class RunA5Tests {
	public static void main (String[] args) {
		Tracer.showInfo(true);
//		Assignment5Suite.main(args);
		F20Assignment0_1Suite.main(args);

		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setCheckStyleConfiguration("D:/dewan_backup/Java/UNC_Checkstyle_8/checks/524_f20/unc_checks_524_A0_1.xml");
		CheckStyleInvoker.main(args);
	}

}
