package pass.threads;

import pass.model.PassModel;
import pass.model.PassModelFactory;
import pass.regular.PassUtil;

public class AHighFinalRunnable implements HighFinalRunnable{
	protected Boolean highFinalPass = null;
	PassModel passModel = PassModelFactory.getPassModel();
	@Override
	public synchronized void waitForNewScores() {
		if (passModel.getTotalScore() == null || passModel.getFinalScore() == null) {
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
	@Override
	public synchronized void waitForNullScores() {
		if (passModel.getTotalScore() != null || passModel.getFinalScore() != null) {
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
	@Override
	public synchronized void unblockPeer() {
		System.out.println(Thread.currentThread() + ": unblocking peer");

		notify();
	}
	public synchronized boolean waitForHighFinalPass() {
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
	@Override
	public void resetHighFinalPass() {
		highFinalPass = null;
	}
	@Override
	public void run() {

		System.out.println(Thread.currentThread()+ " started");
		while (true) {
			waitForNewScores();
			highFinalPass = PassUtil.highFinalPass(passModel.getTotalScore(), passModel.getFinalScore());
			System.out.println(Thread.currentThread() + ": highFinalPass = " + highFinalPass);
			unblockPeer();
			waitForNullScores();
		}
		
	}

}
