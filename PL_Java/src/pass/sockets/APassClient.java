package pass.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class APassClient {

	public static void main(String[] args) {
		String hostName = args.length > 0? args[0]:"localhost";
//		int portNumber = Integer.parseInt(args[1]);

		try {
			Socket aClientEnd = new Socket(hostName, APassServer.PORT_NUMBER);
			PrintWriter aClientOut = new PrintWriter(aClientEnd.getOutputStream(), true);
			BufferedReader aClientIn = new BufferedReader(new InputStreamReader(aClientEnd.getInputStream()));
//			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			aClientOut.println("40");
			aClientOut.println("60");
			String aResult = aClientIn.readLine();
			System.out.println("result:" + aResult);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
