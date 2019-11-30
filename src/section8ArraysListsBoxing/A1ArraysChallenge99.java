package section8ArraysListsBoxing;

import java.util.Arrays;
import java.util.Scanner;



public class A1ArraysChallenge99 {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
//		int[] myIntegers = getIntegers(5);
//		int[] sorted = sortIntegers(myIntegers);
//		printArray(sorted);
		
		//Iyad
		int[] arr = {12,4,7,9,1,0,2};
		//getIntegers(arr);
		printArrayIyad(arr);
		System.out.println();
		//int[] sortIyad = sortArray(arr);
		sortArray(arr);
		printArrayIyad(arr);

	}
	
	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " integer values:\r");
		for(int i=0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i =0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		//built in function to copy arrays
		//int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i =0; i < sortedArray.length -1; i ++) {
				if(sortedArray[i] < sortedArray [i +1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}
	
//	public static int[] getIntegers(int[] arr) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Please enter " + arr.length + " integers");
//		for(int i = 0; i< arr.length; i++) {
//			System.out.println("Enter integer #" + (i+1) + ": ");
//			arr[i] = scanner.nextInt();
//		}
//		return arr;
//	}
	public static void printArrayIyad(int[] arr) {
		System.out.print("[");
		for(int i =0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.print("]");
	}
	public static int[] sortArray(int[] arr) {
		int[] newArr = new int[arr.length] ;
		int i, value,index;
		for (i =1; i < arr.length; i++) {
			value = arr[i];
			index = i;
			while (index > 0 && arr[index-1] > value) {
				arr[index] = arr[index-1];
				index = index-1;
			}
			arr[index] = value;
		}
		int a =0;
		for(int x= arr.length-1; x >= 0; x--) {
			newArr[a] = arr[x];
			a++;
		}
		
//		int b= 0;
//		for(int x= arr.length-1; x >= 0; x--) {
//			arr[b] = newArr[b];
//			b++;
//		}
//		return arr;
		
		return newArr;
	}
}
