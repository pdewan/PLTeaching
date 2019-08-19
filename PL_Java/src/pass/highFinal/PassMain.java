package pass.highFinal;

import pass.controller.PassControllerFactory;
import pass.model.PassModelFactory;
import pass.regular.PassUtil;
import pass.view.PassViewFactory;

public class PassMain {
	public static void main (String[] args) {
		PassModelFactory.setPassModel(new APassModel());
		PassUtil.startPassMVC();
	}

}
