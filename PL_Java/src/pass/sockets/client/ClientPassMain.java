package pass.sockets.client;

import pass.controller.PassControllerFactory;
import pass.model.MVCPassUtil;
import pass.model.PassModelFactory;
import pass.view.PassViewFactory;

public class ClientPassMain {
	public static void main (String[] args) {
		String aHostName = args.length > 0? args[0]:"localhost";
		PassModelFactory.setPassModel(new APassClientModel(aHostName));
		MVCPassUtil.startPassMVC();
	}

}
