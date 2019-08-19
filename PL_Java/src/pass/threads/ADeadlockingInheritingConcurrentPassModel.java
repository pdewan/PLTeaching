package pass.threads;

import pass.model.AnAbstractPassModel;
import pass.regular.PassUtil;

public class ADeadlockingInheritingConcurrentPassModel extends AnAbstractPassModel implements ConcurrentPassModel {
	@Override
	public synchronized Boolean isPass() {
		System.out.println(Thread.currentThread() + ": Unblocking high pass thread");
		this.notify(); // notify high pass thread
		Boolean aRegularPass = PassUtil.regularPass(getTotalScore());
		System.out.println(Thread.currentThread()+": regularPass =" + aRegularPass);
		return aRegularPass && HighFinalRunnablelFactory.getHighFinalRunnable().waitForHighFinalPass();		
	}

	@Override
	public synchronized void waitForNewScores() {
		if (getTotalScore() == null || getFinalScore() == null) {
			try {
				wait();
				System.out.println("unblocked");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
