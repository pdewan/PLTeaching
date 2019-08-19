package pass.view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import pass.model.PassModel;

public class AConsolePassView implements PassView {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (PassModel.PASS == evt.getPropertyName()) {
			Boolean aPass = (Boolean) evt.getNewValue();
			System.out.println(String.format("isPass:%s", aPass ? "true" : "false"));
		}		
	}

}
