package pass.threads;

import java.beans.PropertyChangeListener;

import pass.model.DelegatePassModelFactory;
import pass.model.PassModel;
import pass.regular.PassUtil;

public class ADelegatingConcurrentPassModel implements ConcurrentPassModel {
	PassModel delegate;

	public ADelegatingConcurrentPassModel() {
		delegate = DelegatePassModelFactory.getPassModel();
		
	}

	@Override
	public Double getTotalScore() {
		return delegate.getTotalScore();
	}

	@Override
	public Double getFinalScore() {
		return delegate.getTotalScore();
	}

	@Override
	public synchronized Boolean isPass() {
		System.out.println(Thread.currentThread() + ": Unblocking high pass thread");
		notify(); // notify high pass thread
		Boolean aRegularPass = PassUtil.regularPass(getTotalScore());
		System.out.println(Thread.currentThread()+": regularPass =" + aRegularPass);
		return aRegularPass && HighFinalRunnablelFactory.getHighFinalRunnable().waitForHighFinalPass();
		

	}

	@Override
	public void setScores(Double aTotalScore, Double aFinalScore) {
		delegate.setScores(aTotalScore, aFinalScore);

	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener aListener) {
		delegate.addPropertyChangeListener(aListener);
	}

	@Override
	public synchronized void waitForNewScores() {
		if (getTotalScore() == null || getFinalScore() == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
