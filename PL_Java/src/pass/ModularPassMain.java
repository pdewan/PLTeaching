package pass;

public class ModularPassMain {
	public static void main (String[] args) {
		for (;;) {
			double totalScore = PassUtil.inputDouble("Please input the total score");
			if (totalScore < 0) {
				break;
			}
			double finalScore = PassUtil.inputDouble("Please input the final score");
			System.out.println(String.format("isPass:%s", PassUtil.pass(totalScore, finalScore) ? "true" : "false"));
		}
	}
}
