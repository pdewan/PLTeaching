package pass.model;
import pass.controller.PassControllerFactory;
import pass.view.PassViewFactory;
public class MVCPassUtil {
	public static void startPassMVC () {
		PassModelFactory.getPassModel().addPropertyChangeListener(PassViewFactory.getPassView());
		PassControllerFactory.getPassController().processInput();
	}
}
