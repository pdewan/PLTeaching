package pass.regular;

import pass.controller.PassControllerFactory;
import pass.model.PassModelFactory;
import pass.view.PassViewFactory;

public class RegularPassMain {
	public static void main (String[] args) {
		PassModelFactory.setPassModel(new ARegularPassModel());
		PassUtil.startPassMVC();
	}

}
