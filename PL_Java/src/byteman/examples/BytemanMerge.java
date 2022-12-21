package byteman.examples;

public class BytemanMerge {
	 public static Integer [] sort(Integer [] arr) {
		//Base case

		if(arr.length==1) {
		return arr;
		}
		int mid = arr.length/2;

		Integer [] left = sort(divide(arr,0,mid));
		Integer [] right = sort(divide(arr,mid,arr.length));
		Integer [] retval = new Integer[arr.length];

		int iL=0,iR=0,iRet=0;
		while(iL<left.length&&iR<right.length) {
		if(left[iL]>right[iR]) {
		retval[iRet]=right[iR];
		iR++;
		}else {
		retval[iRet]=left[iL];
		iL++;
		}
		iRet++;
		}
		while(iL<left.length) {
		retval[iRet]=left[iL];
		iL++;
		iRet++;
		}
		while(iR<right.length) {
		retval[iRet]=right[iR];
		iR++;
		iRet++;
		}

		return retval;
		}

		private static Integer [] divide(Integer [] arr, int i0, int i1) {
		if(i1==i0) {
		return new Integer[] {arr[i0]};
		}
		int len = i1-i0;
		Integer [] retval = new Integer[len];
		for(int i=0;i<len;i++) {
		retval[i]=arr[i0+i];
		}
		return retval;
		}


//		Bubble sort:

//		 public static Integer[] sort(Integer [] arr) {
//		Integer [] retval = arr.clone();
//		for(int i=0;i<retval.length;i++) {
//		for(int j=0;j<retval.length-1-i;j++) {
//		if(retval[j+1]<retval[j]) {
//		swap(retval,j+1,j);
//		}
//		}
//		}
//		return retval;
//		}
//
//		public static void swap(Integer [] arr, int i0, int i1) {
//		Integer temp = arr[i0];
//		arr[i0]=arr[i1];
//		arr[i1]=temp;
//		}

}
