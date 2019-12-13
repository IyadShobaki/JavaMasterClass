import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] array = getIntegers(5);
		printArray(array);
		//int[] sorted = sortArray(array);
		
		sortArray(array);
		System.out.println();
		printArray(array);
		
	}
	public static int[]  getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " integer values:\r" );
		for(int i =0; i < array.length; i++) {
			System.out.println("Enter #" + (i +1) + " number:");
			array[i] = scanner.nextInt();
		}
		return array;
	}
	public static void printArray(int[] ar) {
		for(int i =0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
	
	
	
	public static int[] sortArray(int[] array) {
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i =0; i < array.length-1; i++) {
				if(array[i] < array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					flag = true;
				}
			}
		}
		return array;
		
	}
//	public static int[] sortArray(int[] array) {
////		int[] sortedArray = new int[array.length];
////		for(int i =0; i < array.length; i++) {
////			sortedArray[i] = array[i];
////		}
//		
//		//int[] sortedArray = Arrays.copyOf(array, array.length);
//		boolean flag = true;
//		int temp;
//		while (flag) {
//			flag =false;
//			for(int i =0; i < array.length-1; i++) {
//				if(array[i] < array[i+1]) {
//					temp =array[i];
//					array[i] = array[i+1];
//					array[i+1] = temp;
//					flag = true;
//				}
//			}
//		}
//		return array;
//	}
	
	
//	public static int[] sortArray(int[] ar) {
//		int  j, key, temp;
//		for(int i = 1; i< ar.length; i++) {
//			key = ar[i];
//			j = i-1;
//			while(j >= 0 && key < ar[j]) {
//				temp = ar[j];
//				ar[j] = ar[j+1];
//				ar[j+1] = temp;
//				j--;
//			}
//		}
//		return ar;
//		
//	}
	
//	public static int[] sortArray(int[] ar) {
//		int i, j, key, temp;
//		for(i =1; i< ar.length; i++) {
//			key = ar[i];
//			j = i -1;
//			while(j >=0 && key < ar[j]) {
//				temp = ar[j];
//				ar[j] = ar[j+1];
//				ar[j+1] = temp;
//				j--;
//			}
//		}
//		int[] newArr = new int[ar.length];
//		int l =0;
//		for(int x = ar.length -1;x >= 0; x--) {
//			newArr[l] = ar[x];
//			l++;
//		}
//		
//		for(int x = 0; x < ar.length; x++) {
//			ar[x] = newArr[x];
//		}
//		
//		return ar;
//	}
	
//	public static int[] sortArray(int[] ar) {
//		int i, j, key,temp;
//		for(i =1; i <ar.length; i++) {
//			key = ar[i];
//			j = i-1;
//			while(j>=0 && key < ar[j]) {
//				temp  = ar[j];
//				ar[j] = ar[j+1];
//				ar[j+1] = temp;
//				j--;
//			}
//		}
//		return ar;
//	}
//	public static int[] sortArray(int[] ar) {
//		int i,j,key,temp;
//		for(i =1; i < ar.length; i++) {
//			key = ar[i];
//			j = i-1;
//			while(j >= 0 && key < ar[j]) {
//				temp = ar[j];
//				ar[j] = ar[j+1];
//				ar[j+1] = temp;
//				j--;
//			}
//		}
//		
//		return ar;		
//	}
}
