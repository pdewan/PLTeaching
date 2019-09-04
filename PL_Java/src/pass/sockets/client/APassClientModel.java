package pass.sockets.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import pass.PassUtil;
import pass.model.AnAbstractPassModel;
import pass.sockets.server.APassServer;
import pass.sockets.server.PassServerModel;
public class APassClientModel extends AnAbstractPassModel{
	String serverHostName;
	Socket clientEnd;
	PrintWriter clientOut;
	BufferedReader clientIn;
	public APassClientModel(String aServerHostName) {
		serverHostName = aServerHostName;
		try {
			clientEnd = new Socket(serverHostName, PassServerModel.PORT_NUMBER);
			System.out.println("Connected to server:" + clientEnd);
			clientOut = new PrintWriter(clientEnd.getOutputStream(), true);
			clientIn = new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
		} catch (IOException e) {
			
			e.printStackTrace();
			System.exit(-1);
		}		
	}
	@Override
	public Boolean isPass() {
		try {
		clientOut.println(getTotalScore());
		clientOut.println(getFinalScore());
	
			return Boolean.parseBoolean(clientIn.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}
	}
}
