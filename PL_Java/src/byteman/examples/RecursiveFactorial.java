package byteman.examples;

public class RecursiveFactorial {
	public static Integer factorial(Integer amount) {
		if(amount<=1) 
			return amount;
		return amount * factorial(amount-1);
	}



}
