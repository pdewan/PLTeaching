package byteman.examples;

import util.annotations.Tags;

@Tags({BytemanTags.SORT, BytemanTags.BUBBLE})

public class BytemanBubble {


//		Bubble sort:

		 public static Integer[] sort(Integer [] arr) {
		Integer [] retval = arr.clone();
		for(int i=0;i<retval.length;i++) {
		for(int j=0;j<retval.length-1-i;j++) {
		if(retval[j+1]<retval[j]) {
		swap(retval,j+1,j);
		}
		}
		}
		return retval;
		}
//
		public static void swap(Integer [] arr, int i0, int i1) {
		Integer temp = arr[i0];
		arr[i0]=arr[i1];
		arr[i1]=temp;
		}

}
