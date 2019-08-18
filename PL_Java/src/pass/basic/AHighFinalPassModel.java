package pass.basic;

import pass.AnAbstractPassModel;

public class AHighFinalPassModel extends AnAbstractPassModel{

	@Override
	public boolean isPass() {
		return PassUtil.pass(getTotalScore(), getFinalScore());
	}

}
