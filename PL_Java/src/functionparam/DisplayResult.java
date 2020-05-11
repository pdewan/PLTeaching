package functionparam;

public class DisplayResult {	
	public static void displayResult(BinaryIntFunction f, int a, int b) {
		System.out.println("Result:" + f.doOperation(a, b));
	}
	public static void main(String[] args) {
		displayResult(new Summer(), 4, 3);
		displayResult((a, b) -> a + b, 4, 3);
	}
}
