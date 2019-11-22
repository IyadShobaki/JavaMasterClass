package section5ControlFlowStatements;

import java.util.Scanner;

public class A9InputCalculator74 {

	public static void main(String[] args) {
		
		inputThenPrintSumAndAverage();
	}
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		
		while(true) {
			System.out.println("Enter number:");
			boolean isAnInt = scanner.hasNextInt();
			
			
			if(isAnInt) {
				int number = scanner.nextInt();
				sum += number;
				count++;
			}else {
				break;
			}
			
			scanner.nextLine(); //handle input
		}
		double average = (double)sum / count;
		System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
	}
}