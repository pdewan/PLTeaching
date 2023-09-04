package byteman.examples.model;



import java.beans.PropertyChangeSupport;

public abstract class AbstractModel implements Model {

	protected PropertyChangeSupport propertyChange = new PropertyChangeSupport(this);
//	void foo() {};

}
