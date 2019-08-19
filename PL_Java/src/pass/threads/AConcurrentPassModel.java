package pass.threads;

import pass.model.AnAbstractPassModel;
import pass.regular.PassUtil;

public class AConcurrentPassModel extends AnAbstractPassModel  {
	protected void resetProperties() {
		super.resetProperties();
		HighFinalRunnablelFactory.getHighFinalRunnable().resetHighFinalPass();
		System.out.println(Thread.currentThread() + ": Reset scores");
		HighFinalRunnablelFactory.getHighFinalRunnable().unblockPeer(); // announce null values
	}
	@Override
	public Boolean isPass() {		
		HighFinalRunnablelFactory.getHighFinalRunnable().unblockPeer(); // notify high pass thread
		Boolean aRegularPass = PassUtil.regularPass(getTotalScore());
		System.out.println(Thread.currentThread()+": regularPass = " + aRegularPass);
		return aRegularPass || HighFinalRunnablelFactory.getHighFinalRunnable().waitForHighFinalPass();		
	}

	

}
