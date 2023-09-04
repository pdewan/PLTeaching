package byteman.examples.concurrent;



public class AdderRunnable implements Runnable{

	private int start,end;
	private int [] arr;
	private AddingJoiner joiner;
	
	public AdderRunnable(int start, int end, int [] arr, AddingJoiner joiner) {
		this.start=start;
		this.end=end;
		this.arr=arr;
		this.joiner=joiner;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for(int i=start;i<end;i++)
			sum+=arr[i];
		try {
			joiner.finish(sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
