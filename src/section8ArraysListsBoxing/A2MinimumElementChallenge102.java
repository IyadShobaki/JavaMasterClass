package section8ArraysListsBoxing;

import java.util.Scanner;

public class A2MinimumElementChallenge102 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter count:");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		int[] myIntegers = getIntegers(count);
		System.out.println("Minum = " + findMin(myIntegers));
		
		
	}
	public static int[] getIntegers(int count) {
		
		int[] array = new int[count];
		System.out.println("Enter " + count + " integer values:");
		for(int i=0; i < array.length; i++) {
			System.out.println("Enter a number:");
			int number= scanner.nextInt();
			scanner.nextLine();
			array[i] = number;
		}
		return array;
	}
	
	public static int findMin(int[] array) {
		
//		int min = array[0];
//		for(int i =0; i < array.length; i++) {
//			if(array[i] < min) {
//				min = array[i];
//			}
//			
//		}
//		return min;
		
		int min = Integer.MAX_VALUE;
		for(int i =0; i < array.length; i++) {
			int value = array[i];
			if(value < min)
				min = value;
		}
		return min;
	}

}
