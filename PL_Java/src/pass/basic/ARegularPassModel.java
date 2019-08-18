package pass.basic;

import pass.AnAbstractPassModel;

public class ARegularPassModel extends AnAbstractPassModel{
	@Override
	public boolean isPass() {
		return PassUtil.regularPass(getTotalScore());
	}

}
