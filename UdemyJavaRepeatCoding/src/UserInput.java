import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int counter= 0;
		int sum =0;
		boolean isTrue = false;
		while(counter < 10) {
			int order = counter+1;
			if(isTrue) {
				isTrue = false;
				System.out.println("Invalid number, Try to enter number #" + order + " again:");
			}else {
				System.out.println("Enter number #" + order + ":");
			}
			
			boolean isAnInt = scanner.hasNextInt();
			if(!isAnInt) {
				isTrue = true;
			}
			while(isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				break;
				
			}
			scanner.nextLine();
//			if(isAnInt) {
//				int number = scanner.nextInt();
//				counter++;
//				sum += number;
//			}else {
//				System.out.println("Invalid number");
//				break;
//			}
//			scanner.hasNextLine();
		}
		
		
		System.out.println("Sum = " + sum);
		
		
		scanner.close();

	}

}
