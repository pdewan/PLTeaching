package pass.threads;

import pass.PassUtil;
import pass.model.AnAbstractPassModel;

public class ALambdaConcurrentPassModel extends AnAbstractPassModel {
	protected Boolean highFinalPass = null;
	public ALambdaConcurrentPassModel() {
		new Thread(() -> run()).start();
	}
	protected void run() {
		System.out.println(Thread.currentThread() + " started");
		while (true) {
			waitForNewScores();
			highFinalPass = PassUtil.highFinalPass(getTotalScore(), getFinalScore());
			System.out.println(Thread.currentThread() + ": highFinalPass = " + highFinalPass);
			unblockPeer();
			waitForNullScores();
		}
	}
	public synchronized void waitForNewScores() {
		System.out.println(Thread.currentThread() + ": waiting for new scores");
		if (getTotalScore() == null || getFinalScore() == null) {
			try {
				wait();
				System.out.println(Thread.currentThread() + ":unblocked");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	protected synchronized void waitForNullScores() {
		System.out.println(Thread.currentThread() + ": waiting for null scores");
		if (getTotalScore() != null || getFinalScore() != null) {
			try {
				wait();
				System.out.println(Thread.currentThread() + ":unblocked");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

	@Override
	public Boolean isPass() {
		unblockPeer(); // notify high pass thread
		Boolean aRegularPass = PassUtil.regularPass(getTotalScore());
		System.out.println(Thread.currentThread() + ": regularPass = " + aRegularPass);
		return aRegularPass | waitForHighFinalPass();
	}

	
	protected void resetProperties() {
		super.resetProperties();
		resetHighFinalPass();
		System.out.println(Thread.currentThread() + ": Reset scores");
		unblockPeer(); // announce null values
	}
	protected void resetHighFinalPass() {
		highFinalPass = null;
	}
	protected synchronized void unblockPeer() {
		System.out.println(Thread.currentThread() + ": unblocking peer");
		notify();
	}

	protected synchronized boolean waitForHighFinalPass() {
		System.out.println(Thread.currentThread() + ": waiting for high final grade");
		if (highFinalPass == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return highFinalPass;
	}

	

	

}
