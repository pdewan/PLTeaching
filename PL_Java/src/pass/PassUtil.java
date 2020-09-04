package pass;

import java.util.Scanner;

public class PassUtil {
	static Scanner scanner;
	
	public static Scanner getScanner() {
		return scanner;
	}
	public static void setScanner(Scanner scanner) {
		PassUtil.scanner = scanner;
	}
	public static double inputDouble(String aPrompt) {
		System.out.println(aPrompt);
		return scanner.nextDouble();
	}
	public static final int PASS_CUT_OFF = 60;
	public static boolean regularPass(double totalScore) {
		return totalScore >= PASS_CUT_OFF;
	}
	public static final int HIGH_FINAL_TOTAL_CUTOFF = 40;
	public static final int HIGH_FINAL_CUTOFF = 80;

	public static boolean highFinalPass(double totalScore, double finalScore) {
		return (finalScore >= HIGH_FINAL_CUTOFF) &&
				(totalScore >= HIGH_FINAL_TOTAL_CUTOFF);
	}
	public static boolean pass (double totalScore, double finalScore) {
		return regularPass(totalScore) || highFinalPass(totalScore, finalScore);
	}
	public static void main (String[] args) {
		setScanner(new Scanner(System.in));
		for (;;) {
			double totalScore = inputDouble("Please input the total score");
			if (totalScore < 0) {
				break;
			}
			double finalScore = inputDouble("Please input the final score");
			System.out.println(String.format("isPass:%s", pass(totalScore, finalScore) ? "true" : "false"));
		}
	}

}
