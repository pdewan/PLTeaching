package pass.sockets.server.flexible;

import pass.PassUtil;
import pass.sockets.server.AnAbstractServerPassModel;

public class AServerPassModel extends AnAbstractServerPassModel{
	@Override
	public Boolean isPass() {
		return PassUtil.pass(getTotalScore(), getFinalScore());
	}
}
