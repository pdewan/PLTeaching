package byteman.examples.model;

import byteman.examples.concurrent.AdderRunnable;
import byteman.examples.concurrent.AddingJoiner;
import byteman.examples.view.View;

public class ParallelModel extends AbstractModel{
	
	@Override
	public void addView(View view) {
		propertyChange.addPropertyChangeListener(view);
	}
	
	@Override
	public void update(int[] numbers) {
		int THREADS=4;
		int split = numbers.length/THREADS;
		AddingJoiner joiner = new AddingJoiner(THREADS);
		for(int i=0;i<THREADS-1;i++) {
			Thread thread = new Thread(new AdderRunnable(i*split,(i+1)*split,numbers,joiner));
			thread.setName("Thread"+i);
			thread.start();
		}
		Thread thread = new Thread(new AdderRunnable((THREADS-1)*split, numbers.length, numbers, joiner));
		thread.setName("Thread"+(THREADS-1));
		thread.start();
		try {
			propertyChange.firePropertyChange("Summed Total", null, joiner.join());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
