package byteman.examples;

public class IterativeFactorial {
	public static Integer factorial(Integer amount) {
		System.out.println("amount:" + amount);
		int value = 1;
		for(int i=1;i<=amount;i++)
			value*=i;
		return value;
	}


}
