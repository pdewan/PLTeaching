package byteman.examples.view;

import java.beans.PropertyChangeEvent;

public class TextView implements View {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Sum:\n"+evt.getNewValue());
	}

}
