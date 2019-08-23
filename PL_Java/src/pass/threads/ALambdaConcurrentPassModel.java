package pass.threads;

import pass.PassUtil;
import pass.model.AnAbstractPassModel;

public class ALambdaConcurrentPassModel extends AnAbstractPassModel  {
	protected Boolean highFinalPass = null;

	public ALambdaConcurrentPassModel() {
		new Thread(() -> run()).start();
	}
	
	protected void resetProperties() {
		super.resetProperties();
		resetHighFinalPass();
		System.out.println(Thread.currentThread() + ": Reset scores");
		unblockPeer(); // announce null values
	}
	@Override
	public Boolean isPass() {		
		unblockPeer(); // notify high pass thread
		Boolean aRegularPass = PassUtil.regularPass(getTotalScore());
		System.out.println(Thread.currentThread()+": regularPass = " + aRegularPass);
		return aRegularPass || waitForHighFinalPass();		
	}

	public synchronized void waitForNewScores() {
		if (getTotalScore() == null || getFinalScore() == null) {
			try {
				System.out.println(Thread.currentThread() + ": waiting for new scores");
				wait();
				System.out.println(Thread.currentThread() + ":unblocked");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	protected synchronized void waitForNullScores() {
		if (getTotalScore() != null || getFinalScore() != null) {
			try {
				System.out.println(Thread.currentThread() + ": waiting for null scores");
				wait();
				System.out.println(Thread.currentThread() + ":unblocked");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	protected synchronized void unblockPeer() {
		System.out.println(Thread.currentThread() + ": unblocking peer");

		notify();
	}
	protected synchronized boolean waitForHighFinalPass() {
		if (highFinalPass == null) {
			try {
				System.out.println(Thread.currentThread() + ": waiting for high final grade");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return highFinalPass;
		
	}
	protected void resetHighFinalPass() {
		highFinalPass = null;
	}
	protected void run() {
		System.out.println(Thread.currentThread()+ " started");
		while (true) {
			waitForNewScores();
			highFinalPass = PassUtil.highFinalPass(getTotalScore(), getFinalScore());
			System.out.println(Thread.currentThread() + ": highFinalPass = " + highFinalPass);
			unblockPeer();
			waitForNullScores();
		}
		
	}

}
