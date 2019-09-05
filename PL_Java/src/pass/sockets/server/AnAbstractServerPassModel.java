package pass.sockets.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import pass.model.AnAbstractPassModel;

public abstract class AnAbstractServerPassModel extends AnAbstractPassModel implements PassServerModel {
	PrintWriter serverOut;
	BufferedReader serverIn;
	ServerSocket serverSocketFactory;
	Socket serverEndOfCurrentClient;

	@Override
	protected void resetProperties() {
		if (serverOut != null) {
			System.out.println("Sending:" + pass);
			serverOut.println(pass);
		}
		super.resetProperties();
	}

	protected void createSocketFactory() {
		try {
			serverSocketFactory = new ServerSocket(PORT_NUMBER);
			System.out.println("Waiting for clients to connect");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void processNextEntry() throws IOException {
		String aTotalScoreString = serverIn.readLine();
		double aTotalScore = Double.parseDouble(aTotalScoreString);				
		String aFinalScoreString = serverIn.readLine();
		System.out.println("Received:" + aTotalScoreString + "," + aFinalScoreString);
		double aFinalScore = Double.parseDouble(aFinalScoreString);
		setScores(aTotalScore, aFinalScore);
	}

	protected void serveNextClient() {
		try {
			System.out.println("Waiting for next client to connect.");
			serverEndOfCurrentClient = serverSocketFactory.accept();
			System.out.println("Client connected:" + serverEndOfCurrentClient);
			serverOut = new PrintWriter(serverEndOfCurrentClient.getOutputStream(), true);
			serverIn = new BufferedReader(
					new InputStreamReader(serverEndOfCurrentClient.getInputStream()));
			while (true) {
				processNextEntry();
			}
		} catch (Exception e) {
			if (e.getMessage().equals("Connection reset")) {
				System.out.println("Client terminated");				
			}
		}	
	}
	public void processClients() {
		try {
			serverSocketFactory = new ServerSocket(PORT_NUMBER);
			while (true) {
				serveNextClient();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
