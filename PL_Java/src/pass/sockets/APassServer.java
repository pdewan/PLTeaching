package pass.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class APassServer {
	public static final int PORT_NUMBER = 10000;

	public static void main(String[] args) {
//		int portNumber = Integer.parseInt(args[0]);

		try {
			ServerSocket aServerSocketFactory = new ServerSocket(PORT_NUMBER);
			Socket aServerEnd = aServerSocketFactory.accept();
			PrintWriter aServerOut = new PrintWriter(aServerEnd.getOutputStream(), true);
			BufferedReader aServerIn = new BufferedReader(new InputStreamReader(aServerEnd.getInputStream()));
			while (true) {
				String aTotalScoreString = aServerIn.readLine();
				String aFinalScoreString = aServerIn.readLine();
				System.out.println(aTotalScoreString + " " + aFinalScoreString);
				aServerOut.println("true");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
