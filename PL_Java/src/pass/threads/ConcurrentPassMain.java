package pass.threads;

import pass.controller.PassControllerFactory;
import pass.highFinal.APassModel;
import pass.model.DelegatePassModelFactory;
import pass.model.MVCPassUtil;
import pass.model.PassModelFactory;
import pass.view.PassViewFactory;

public class ConcurrentPassMain {
	public static void main (String[] args) {
		PassModelFactory.setPassModel(new ALambdaConcurrentPassModel()); // used by view and controller
		MVCPassUtil.startPassMVC();
	}

}
