package byteman.examples.view;



import java.beans.PropertyChangeEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AppletView implements View {

	private JTextField field = new JTextField("Last Sum");
	
	public AppletView() {
		JFrame frame = new JFrame();
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(field);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		field.setText("Sum:\n"+evt.getNewValue().toString());

	}

}
