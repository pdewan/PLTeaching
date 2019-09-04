package pass.sockets.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import pass.model.AnAbstractPassModel;

public abstract class AnAbstractServerPassModel extends AnAbstractPassModel implements PassServerModel {
	PrintWriter serverOut;
	@Override
	protected void resetProperties() {
		if (serverOut != null) {
			System.out.println("Sending:" + pass);
			serverOut.println(pass);
		}
		super.resetProperties();
	}
	public void processSingleClientMessages() {
		try {
			ServerSocket aServerSocketFactory = new ServerSocket(PORT_NUMBER);
			System.out.println("Waiting for a single client to connect");
			Socket aServerEnd = aServerSocketFactory.accept();
			System.out.println("Client connected:" + aServerEnd);
			serverOut = new PrintWriter(aServerEnd.getOutputStream(), true);
			BufferedReader aServerIn = new BufferedReader(new InputStreamReader(aServerEnd.getInputStream()));
			while (true) {
				String aTotalScoreString = aServerIn.readLine();
				String aFinalScoreString = aServerIn.readLine();
				System.out.println("Received:" + aTotalScoreString + "," + aFinalScoreString);
				setScores(Double.parseDouble(aTotalScoreString), Double.parseDouble(aFinalScoreString));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
