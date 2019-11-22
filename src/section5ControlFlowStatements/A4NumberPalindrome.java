package section5ControlFlowStatements;

public class A4NumberPalindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(-1221));

	}
	public static boolean isPalindrome(int number) {
		if(number < 0)
			number = number * -1;
		int originalNumber = number;
		int reverse = 0;
		
		while(number > 0) {
			//extract the least-significant digit
			int digit = number % 10;
			reverse = (reverse * 10) + digit;
			
			//drop the least-significant digit
			number /=10;  //same as number = number /10;
		}

		if(originalNumber == reverse)
			return true;
		
		return false;
	}
}
