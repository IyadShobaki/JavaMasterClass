import java.util.Scanner;

public class MinimumNumber {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		System.out.println(findMin(readIntegers(count)));
	}
	
	public static int[] readIntegers(int count) {
		
		int[] array = new int[count];
		for(int i =0; i < array.length; i++ ) {
			System.out.println("Enter # " + (i+1) + " number: ");
			int number = scanner.nextInt();
			scanner.nextLine();
			array[i] = number;
		}
		
		return array;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i  <array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
		
//		int min = array[0];
//		for(int i =1; i < array.length; i++) {
//			if(array[i] < min) {
//				min = array[i];
//			}
//		}
//		return min;
	}
}
