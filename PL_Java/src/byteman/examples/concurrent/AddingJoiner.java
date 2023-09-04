package byteman.examples.concurrent;



public class AddingJoiner {
	private int threads,finished,total;
	
	public AddingJoiner(int numThreads) {
		threads=numThreads;
		finished=0;
		total=0;
	}
	
	public synchronized int join() throws InterruptedException {
		if(finished<threads) {
			wait();
		}else {
			notifyAll();
		}
		
		int retval = total;
		total=0;
		finished=0;
		return retval;
	}
	
	public synchronized void finish(int val) throws InterruptedException{
		total+=val;
		finished++;
		if(finished<threads) {
			wait();
		}else {
			notifyAll();
		}
	}
	
}
