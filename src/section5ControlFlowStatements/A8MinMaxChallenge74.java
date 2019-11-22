package section5ControlFlowStatements;

import java.util.Scanner;

public class A8MinMaxChallenge74 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	//	my solution ---> Iyad
//		int counter = 0;
//		int max = 0;
//		int min = 0;
//		
//		while(true) {
//			int order = counter +1;
//			System.out.println("Enter number #" + order + ":");
//			
//			boolean isAnInt = scanner.hasNextInt();
//			if(isAnInt) {
//				int number = scanner.nextInt();
//				if(order == 1) {
//					min = number;
//					max = number;
//				}else {
//					if(number < min)
//						min = number;
//					if(number > max)
//						max = number;
//				}
//				
//				counter++;
//			}else {
//				System.out.println("Invalid number");
//				break;
//			}
//			
//			scanner.nextLine();
//		}
//		
//		System.out.println("Max = " + max);
//		System.out.println("Min = " + min);
		
		//Udemy solution
		
	
		
//		int min = 0;
//		int max = 0;
	//	boolean first = true;
		
		int min = 2147483647;
		int max = -2147483648;
		
//		int max = Integer.MAX_VALUE;
//		int min = Integer.MIN_VALUE;
		
		while(true) {
			System.out.println("Enter number:");
			boolean isAnInt = scanner.hasNextInt();
			
			
			if(isAnInt) {
				int number = scanner.nextInt();
				
//				if(first) {
//					first =false;
//					min = number;
//					max = number;
//				}
				if(number > max) {
					max = number;
				}
				if(number < min) {
					min  = number;
				}
				
			}else {
				break;
			}
			scanner.nextLine(); //handle input
		}
		
		System.out.println("min= " + min + ",max= " + max );
		
		scanner.close();
		
		
	}

}
