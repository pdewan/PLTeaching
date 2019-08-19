package pass.view;

import pass.regular.ARegularPassModel;

public class PassViewFactory {
	static PassView passView;

	public static PassView getPassView() {
		if (passView == null) {
			passView = new AConsolePassView();
		}
		return passView;
	}

	public static void setPassView(PassView newVal) {
		passView = newVal;
	}

}
