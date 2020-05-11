package lambda;

public class LambdaTest {
	 String  memberI = "hello";
    public static void printString(String s, Print<String> print) {
        print.print(s);
    }
    public void callLambda() {

    	for (int i = 0; i < 2; i++) {
    		final int jFinal = i;

        printString("test", (x) -> System.out.println(memberI + jFinal ));
    	}
    }
    
    public static  void main(String[] args) {
    	new LambdaTest().callLambda();
////        printString("test", (x) -> System.out.println(x ));
////    	memberI ++;
//
//    	for (int i = 0; i < 2; i++) {
//    		final int jFinal = i;
//
//        printString("test", (x) -> System.out.println(x + memberI ));
//    	}
    }
}

//@FunctionalInterface
// interface Print<T> {
//    public void print(T x);
//}
