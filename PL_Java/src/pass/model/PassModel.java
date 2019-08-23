package pass.model;
import java.beans.PropertyChangeListener;
public interface PassModel {
	public static final String FINAL_SCORE = "finalScore";
	public static final String TOTAL_SCORE = "totalScore";
	public static final String PASS = "pass";
	Double getTotalScore();
	Double getFinalScore();
	Boolean isPass();
	void setScores(Double aTotalScore, Double aFinalScore);
	void addPropertyChangeListener(PropertyChangeListener aListener);
}