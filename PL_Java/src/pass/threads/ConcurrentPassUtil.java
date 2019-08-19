package pass.threads;

public class ConcurrentPassUtil {
	public static void startHighFinalThread() {
		Thread aHighFinalThread = new Thread(HighFinalRunnablelFactory.getHighFinalRunnable());
		System.out.println(Thread.currentThread() + ": starting " + aHighFinalThread);
		aHighFinalThread.start();
	}
}
