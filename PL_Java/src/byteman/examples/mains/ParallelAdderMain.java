package byteman.examples.mains;

import byteman.examples.controller.ControllerImpl;
import byteman.examples.model.Model;
import byteman.examples.model.ParallelModel;
import byteman.examples.view.AppletView;
import byteman.examples.view.TextView;

public class ParallelAdderMain {

	public static void main(String[] args) {
		Model model = new ParallelModel();
		model.addView(new TextView());
		model.addView(new AppletView());
		new ControllerImpl(model).start();
	}

}
