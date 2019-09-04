package pass.sockets.server;

import pass.PassUtil;

public class ARegularServerPassModel extends AnAbstractServerPassModel{
	@Override
	public Boolean isPass() {
		return PassUtil.regularPass(getTotalScore());
	}
	

}
