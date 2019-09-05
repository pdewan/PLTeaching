package pass.sockets.server.regular;

import pass.PassUtil;
import pass.sockets.server.AnAbstractServerPassModel;

public class ARegularServerPassModel extends AnAbstractServerPassModel{
	@Override
	public Boolean isPass() {
		return PassUtil.regularPass(getTotalScore());
	}

}
