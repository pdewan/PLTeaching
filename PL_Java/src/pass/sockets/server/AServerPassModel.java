package pass.sockets.server;

import pass.PassUtil;

public class AServerPassModel extends AnAbstractServerPassModel{
	@Override
	public Boolean isPass() {
		return PassUtil.pass(getTotalScore(), getFinalScore());
	}
	

}
