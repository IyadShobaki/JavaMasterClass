package section5ControlFlowStatements;

import java.util.Scanner;

public class A7ReadingUserInputChallenge73 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		while(counter < 10) {
		//while(true) {
			int order = counter +1;
			System.out.println("Enter number #" + order + ":");
			
			boolean isAnInt = scanner.hasNextInt();
			if(isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
//				if(counter == 10) {
//					break;
//				}
			}else {
				System.out.println("Invalid number");
			}
			scanner.nextLine(); //handle end of line (enter key)
		}
		
		System.out.println("sum = " + sum);
		
		
		//My solution -- Iyad
//		int counter =1;
//		int number = 10;
//		int sum=0;
//		
//		while(number > 0) {
//			System.out.println("Please enter " + counter + " number:");
//			if(scanner.hasNextInt()) {
//				int num  = scanner.nextInt();
//				sum += num;
//				counter++;
//				--number;
//			}else {
//				System.out.println("Invalid number");
//			}
//			scanner.nextLine();
//		}
//		
//		System.out.println("The sum of your " + (counter -1) +  " number is " + sum);
		scanner.close();
	}

}
