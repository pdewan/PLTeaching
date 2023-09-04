package byteman.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class BytemanList extends BytemanCollection  implements IBytemanList {
	 int foo = 8;
	 static int staticFoo = 9;
	 int[] fooArray = {1, 2, 3, 4, 5 , 6};
	public int size() {
		int i = 0;
		int[] barArray = fooArray;
		foo = 3;
		foo = staticFoo;
		staticFoo = foo + 3;
//		System.out.println(Arrays.toString(fooArray));
//
//		System.out.println(fooArray[0]);
		for (int j = 0; j < 2; j++) {
			i = i+1;
		}
		fooArray[0] = 4;
//		fooArray = barArray;
		fooArray[i] = barArray[i];
		barArray[i] = fooArray[i+1];


		int bar = foo;
		return bar;
	}
	public void clear() {
		
	}

}
