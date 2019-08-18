package pass;

public abstract class AnAbstractPassModel implements PassModel {
	double totalScore;
	double finalScore;
	@Override
	public double getTotalScore() {
		return totalScore;
	}
	@Override
	public void setTotalScore(double newVal) {
		this.totalScore = newVal;
	}
	@Override
	public double getFinalScore() {
		return finalScore;
	}
	@Override
	public void setFinalScore(double newVal) {
		this.finalScore = newVal;
	}


}
