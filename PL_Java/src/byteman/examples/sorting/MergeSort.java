package byteman.examples.sorting;

public class MergeSort {
	
	public static int [] sort(int [] arr) {
		//Base case
		
		if(arr.length==1) {
			return arr;
		}
		int mid = arr.length/2;
		
		int [] left = sort(divide(arr,0,mid));
		int [] right = sort(divide(arr,mid,arr.length));
		int [] retval = new int[arr.length];
		
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
	
	private static int [] divide(int [] arr, int i0, int i1) {
		if(i1==i0) {
			return new int[] {arr[i0]};
		}
		int len = i1-i0;
		int [] retval = new int[len];
		for(int i=0;i<len;i++) {
			retval[i]=arr[i0+i];
		}
		return retval;
	}

}
