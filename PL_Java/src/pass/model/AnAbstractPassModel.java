package pass.model;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
public abstract class AnAbstractPassModel implements PassModel {
	protected Double totalScore;
	protected Double finalScore;
	protected Boolean pass;	
	PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	@Override
	public Double getTotalScore() {
		return totalScore;
	}	
	@Override
	public Double getFinalScore() {
		return finalScore;
	}
	/**
	 * Values have been consumed, reset them for the next setScore
	 */
	protected void resetProperties() {
		totalScore = null;
		finalScore = null;
		pass = null;
	}
	@Override
	public void setScores(Double aTotalScore, Double aFinalScore) {
		Double oldTotalScore = totalScore;
		Double oldFinalScore = finalScore;
		Boolean oldPass = pass;
		totalScore = aTotalScore;
		finalScore = aFinalScore;
		pass = isPass();
		propertyChangeSupport.firePropertyChange(TOTAL_SCORE, oldTotalScore, totalScore);
		propertyChangeSupport.firePropertyChange(FINAL_SCORE, oldFinalScore, finalScore);
		propertyChangeSupport.firePropertyChange(PASS, oldPass, pass);
		resetProperties();
	}
	@Override
	public void addPropertyChangeListener(PropertyChangeListener aListener) {
		propertyChangeSupport.addPropertyChangeListener(aListener);
	}
}
