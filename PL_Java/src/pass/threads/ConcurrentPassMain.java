package pass.threads;

import pass.controller.PassControllerFactory;
import pass.highFinal.APassModel;
import pass.model.DelegatePassModelFactory;
import pass.model.PassModelFactory;
import pass.regular.PassUtil;
import pass.view.PassViewFactory;

public class ConcurrentPassMain {
	public static void main (String[] args) {
		PassModelFactory.setPassModel(new AConcurrentPassModel()); // used by view and controller
		HighFinalRunnablelFactory.setHighFinalRunnable(new AHighFinalRunnable());			
		ConcurrentPassUtil.startHighFinalThread();
		PassUtil.startPassMVC();
	}

}
