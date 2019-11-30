package section8ArraysListsBoxing;

import java.util.Arrays;

public class A3ReversedArrayChallenge103 {

	public static void main(String[] args) {
		int[] myIntegers  = {1,5,3,7,11,9,15};
//		int[] reversed = reverse(myIntegers);
//		for(int i =0; i < reversed.length; i++) {
//			System.out.print(reversed[i]);
//		}
		
		System.out.println("Array = " + Arrays.toString(myIntegers));
		reverse(myIntegers);
		System.out.println("Reversed array = " + Arrays.toString(myIntegers));
	}

	public static void reverse(int[] array) {
		int maxIndex = array.length -1;
		int halfLength = array.length / 2;
		for(int i =0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
			
		}
		
	}
	
//	public static int[] reverse(int[] array) {
//		int[] newArray = new int[array.length];
//		int a = 0;
//		for (int i = array.length-1; i >= 0; i--) {
//			newArray[a] = array[i];
//			a++;
//		}
//		return newArray;
//	}
}
