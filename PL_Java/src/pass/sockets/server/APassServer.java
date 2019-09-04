package pass.sockets.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class APassServer implements PassServerModel {
	

	public static void main(String[] args) {

		try {
			ServerSocket aServerSocketFactory = new ServerSocket(PORT_NUMBER);
			Socket aServerEnd = aServerSocketFactory.accept();
			System.out.println("Connected to client:" + aServerEnd);
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
