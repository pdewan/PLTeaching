package pass.controller;

import pass.regular.ARegularPassModel;

public class PassControllerFactory {
	static PassController passController;

	public static PassController getPassController() {
		if (passController == null) {
			passController = new AConsolePassController();
		}
		return passController;
	}

	public static void setPassController(PassController newVal) {
		passController = newVal;
	}

}
