package pass.model;

import pass.regular.ARegularPassModel;

public class DelegatePassModelFactory {
	static PassModel passModel;

	public static PassModel getPassModel() {
		if (passModel == null) {
			passModel = new ARegularPassModel();
		}
		return passModel;
	}

	public static void setPassModel(PassModel newVal) {
		passModel = newVal;
	}

}
