package byteman.examples.model;

import byteman.examples.view.View;

public class SequentialModel extends AbstractModel{

	
	@Override
	public void addView(View view) {
		propertyChange.addPropertyChangeListener(view);
	}
	
	@Override
	public void update(int[] array) {
		int result = 0;
		for(int num:array) {
			result+=num;
		}
		propertyChange.firePropertyChange("Summed Total", null, result);
	}

}
