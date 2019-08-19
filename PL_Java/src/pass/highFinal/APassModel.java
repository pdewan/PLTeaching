package pass.highFinal;

import pass.model.AnAbstractPassModel;
import pass.regular.PassUtil;

public class APassModel extends AnAbstractPassModel{

	@Override
	public Boolean isPass() {
		return PassUtil.pass(getTotalScore(), getFinalScore());
	}

}
