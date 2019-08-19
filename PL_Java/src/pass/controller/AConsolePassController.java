package pass.controller;

import pass.model.PassModelFactory;
import pass.regular.PassUtil;

public class AConsolePassController implements PassController {
	@Override
	public void processInput() {
		for (;;) {
			double aTotalScore = PassUtil.inputDouble("Please input the total score");
			if (aTotalScore < 0) {
				break;
			}
			double aFinalScore = PassUtil.inputDouble("Please input the final score");
			PassModelFactory.getPassModel().setScores(aTotalScore, aFinalScore);
		}
	}

}
