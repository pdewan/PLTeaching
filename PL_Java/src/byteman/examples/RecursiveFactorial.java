package byteman.examples;
import  byteman.examples.BytemanTags;
import util.annotations.Tags;
//@Tags({BytemanTags.FACTORIAL, BytemanTags.RECURSIVE})
@Tags({"Factorial"})
public class RecursiveFactorial {
//	public static Integer factorial(Integer amount) {
//		if(amount<=1) 
//			return amount;
//		return amount * factorial(amount-1);
//	}
	public RecursiveFactorial(long aTime) {
		System.out.println("factorial created at time:" + aTime);
	}

	public static int factorial(int amount) {
		System.out.println("amount:" + amount);

		if(amount<=1) 
			return amount;
		return amount * factorial(amount-1);
	}


}
