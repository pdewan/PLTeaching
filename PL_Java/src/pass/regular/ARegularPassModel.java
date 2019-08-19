package pass.regular;

import pass.model.AnAbstractPassModel;

public class ARegularPassModel extends AnAbstractPassModel{
	@Override
	public Boolean isPass() {
		return PassUtil.regularPass(getTotalScore());
	}

}
