package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.configuration.ConfigurationComparator;

public class ManipulateList {
	
	
	
	static void printSelectedCutoffs (TwoArgumentSelector<Integer, Integer> cutoffSelector, int[][] aTotalFinalCutoffs) {
		int anIndex = 0;
		while (anIndex < aTotalFinalCutoffs.length) {
			int[] aPair = aTotalFinalCutoffs[anIndex];
			if (cutoffSelector.select(aPair[0], aPair[1])) {
				System.out.println("Total = " + aPair[0] + " Final = " + aPair[1]);
			}
			anIndex = anIndex + 1;
		}
	}
	

	 enum Color {RED, GREEN, BLUE};
	 static int[][] totalFinalCutoffs = 
			{
			  {20, 100},
			  {30, 90},
			  {40, 80},
			  {50, 70} 
			};
	static void printTotalFinalCutoffs (int[][] aTotalFinalCutoffs) {
		int anIndex = 0;
		while (anIndex < aTotalFinalCutoffs.length) {
			printTotalFinalCutoffs(aTotalFinalCutoffs[anIndex]);
			anIndex = anIndex + 1;
		}
	}
	
	static void printTotalFinalCutoffs (int[] aPair) {
		System.out.println("Total = " + aPair[0] + " Final = " + aPair[1]);
	}

	
	static void printTotalFinalCutoffsHelper (int[][] aTotalFinalCutoffs, int currentIndex) {
		if (currentIndex == aTotalFinalCutoffs.length ) {
			return;
		}
		printTotalFinalCutoffs(aTotalFinalCutoffs[currentIndex]);		
		printTotalFinalCutoffsHelper(aTotalFinalCutoffs, currentIndex + 1  );		
	}
	static void printTotalFinalCutoffsRecursive (int[][] aTotalFinalCutoffs) {		
		printTotalFinalCutoffsHelper(aTotalFinalCutoffs, 0 );		
	}
	
	public static Object[] reverse (Object[] listToBeReversed) {
		Object[] reversedList = new Object[listToBeReversed.length];
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];
		}
		return reversedList;
	}
	public static Object[] reverse2 (Object[] listToBeReversed) {
		Object[] reversedList = new Object[listToBeReversed.length];
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = index;
		}
		return reversedList;
	}
//	public static <ElementType> ElementType[] reverse3 (ElementType[] listToBeReversed) {
//		ElementType[] reversedList =  new Object[listToBeReversed.length];
//		for (int index = 0; index < listToBeReversed.length; index++ ) {
//			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];;
//		}
//		return reversedList;
//	}
	public static <ElementType> void reverse3 (ElementType[] listToBeReversed, ElementType[] reversedList) {
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];;
		}
	}
//	public static <ElementType> void reverse4 (ElementType[] listToBeReversed, ElementType[] reversedList) {
//		for (int index = 0; index < listToBeReversed.length; index++ ) {
//			reversedList[listToBeReversed.length - 1 - index] = index;
//		}
//	}
	public static <ElementType> void reverse (Object[] listToBeReversed, Object[] reversedList) {
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];;
		}
	}
	public static <ElementType> void reverse2 (Object[] listToBeReversed, Object[] reversedList) {
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = index;
		}
	}
	
	public static void reverseInts (int[] listToBeReversed, int[] reversedList) {
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];
		}
	}
	public static void reverseBools (boolean[] listToBeReversed, boolean[] reversedList) {
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];
		}
	}
	
//	public static <ElementType> ElementType[] reverse4 (ElementType[] listToBeReversed) {
//		ElementType[] reversedList = (ElementType[]) new Object[listToBeReversed.length];
//		for (int index = 0; index < listToBeReversed.length; index++ ) {
//			reversedList[listToBeReversed.length - 1 - index] = index;;
//		}
//		return reversedList;
//	}
//	
	
	public static  int[] reverseInts (int[] listToBeReversed) {
		int[] reversedList = new int[listToBeReversed.length];
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];;
		}
		return reversedList;
	}
	public static  boolean[] reverseBools (boolean[] listToBeReversed) {
		boolean[] reversedList = new boolean[listToBeReversed.length];
		for (int index = 0; index < listToBeReversed.length; index++ ) {
			reversedList[listToBeReversed.length - 1 - index] = listToBeReversed[index];;
		}
		return reversedList;
	}

	
	public static void main (String[] args) {
		testSubclassArrays();
		
		Integer[] integers1 = {1, 2};
		Integer[] integers2 = {2, 3};
		List<Integer> result1 = append(integers1, integers2);
		int[] ints1 = {1, 2};
		int[] ints2 = {2, 3};
		
//		ArrayList<Integer> firstArrayList = new ArrayList();
//		firstArrayList.add(1);
//		List<Integer> secondList = new ArrayList();
//		secondList.add(2);
//		List<Integer> result = append(firstList, secondList);
//		List<Integer> result2 = append(ints1, ints2);

		printTotalFinalCutoffsRecursive(totalFinalCutoffs);

		printSelectedCutoffs(new FirstArgumentGreaterThanSecond(), totalFinalCutoffs);
		printSelectedCutoffs(new FirstArgumentLessThanSecond(), totalFinalCutoffs);
		printSelectedCutoffs((Integer argument1, Integer argument2) -> argument1 == argument2, totalFinalCutoffs); 
		var number = 5;
		number = 6;
	//	number = "6";
		var list = new ArrayList<>();
	//	list = new LinkedList();

		Integer[] listToBeReversed = {1, 2, 3};
		Integer[] reversedList = new Integer[listToBeReversed.length];
		reverse3(listToBeReversed, reversedList);		
//		int[] intList = {1, 2, 3};
//		int[] reversedIntList = reverse4(intList);
		System.out.println("Original:" + Arrays.toString(listToBeReversed));
		System.out.println("Reversed:" + Arrays.toString(reversedList));

		
		Set aSet = new HashSet();
		((List) aSet).get(0);
		
		System.out.println(Color.RED);
		System.out.println(Color.RED.ordinal());
		System.out.println(Color.GREEN.ordinal());
		System.out.println("RED" == "RED");
		Scanner aScanner =  new Scanner(System.in);
		System.out.println("Color?");
		String aColor = aScanner.nextLine();
		System.out.println("RED" == aColor);
		System.out.println("RED".equals(aColor));
		

		
//		printTotalFinalCutoffs(totalFinalCutoffs);
	} 
	int square (int x) {
		return x*x;
	}
//	
	String PI = "3.14";	
//	int doublePI = PI*2; 
	static <T> List<T> append(T[] original, T[] toBeAppended) {		
		List<T> result = new ArrayList<T>();
		result.addAll(Arrays.asList(original));
		result.addAll(Arrays.asList(toBeAppended));
		return result;
	}
	static List append(List original, List toBeAppended) {		
		List result = new ArrayList(original);		
		original.addAll(toBeAppended);
		return original;
	}
	static List append(ArrayList original, ArrayList toBeAppended) {		
		ArrayList result = new ArrayList(original);		
		original.addAll(toBeAppended);
		return original;
	}
	static List append(LinkedList original, LinkedList toBeAppended) {		
		LinkedList result = new LinkedList(original);		
		original.addAll(toBeAppended);
		return original;
	}
	static void testSubclassGenerics1() {	
		List<Integer> anIntegers = new ArrayList();		
//		List<Number> aNumbers = anIntegers;
//		aNumbers.add(5.0);
//		aNumbers.add(5);
//		Number aNumber = aNumbers.get(0);
	}
	
	static void testSubclassGenerics2() {	
		List<Integer> anIntegers = new ArrayList();		
		List<? extends Number> aNumbers = anIntegers;
//		aNumbers.add(5.0);
//		aNumbers.add(5);
		Number aNumber = aNumbers.get(0);
	}
	
	static void testSubclassArrays() {		
		Integer[] anIntegers = new Integer[2];
		Number[] aNumbers = anIntegers;
		aNumbers[0] = aNumbers[0];
		aNumbers[1] = 5.0;		
	}
	
	
	
//	public static void main (String[] args) {
//		List<Integer> firstList = new ArrayList();
//		firstList.add(1);
//		List<Integer> secondList = new ArrayList();
//		secondList.add(2);
//		List<Integer> result = append(firstList, secondList);
//
//	}
}
