package pass.threads;

public interface HighFinalRunnable extends Runnable{

	boolean waitForHighFinalPass();

	void waitForNewScores();

	void unblockPeer();

	void waitForNullScores();

	void resetHighFinalPass();

}
