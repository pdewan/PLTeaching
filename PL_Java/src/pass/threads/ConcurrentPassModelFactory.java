package pass.threads;

import pass.model.PassModel;
import pass.regular.ARegularPassModel;

public class ConcurrentPassModelFactory {
	static ConcurrentPassModel passModel;

	public static ConcurrentPassModel getPassModel() {
		if (passModel == null) {
			passModel = new ADelegatingConcurrentPassModel();
		}
		return passModel;
	}

	public static void setPassModel(ConcurrentPassModel newVal) {
		passModel = newVal;
	}

}
