package pass.threads;


public class HighFinalRunnablelFactory {
	static HighFinalRunnable highFinalRunnable;

	public static HighFinalRunnable getHighFinalRunnable() {
		if (highFinalRunnable == null) {
			highFinalRunnable = new AHighFinalRunnable();
		}
		return highFinalRunnable;
	}

	public static void setHighFinalRunnable(HighFinalRunnable newVal) {
		highFinalRunnable = newVal;
	}

}
