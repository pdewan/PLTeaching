package pass.highFinal;
import pass.PassUtil;
import pass.model.AnAbstractPassModel;
public class APassModel extends AnAbstractPassModel{
	@Override
	public Boolean isPass() {
		return PassUtil.pass(getTotalScore(), getFinalScore());
	}
}
