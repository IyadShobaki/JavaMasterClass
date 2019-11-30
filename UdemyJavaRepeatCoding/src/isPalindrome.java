
public class isPalindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(-1221));
		
		System.out.println(reverse(-123));
	}

	
	public static boolean isPalindrome(int number) {
		if(number < 0)
			number *= -1;
		int original = number;
		int reverse = 0;
		
		while(number > 0) {
			int digit = number % 10;
			reverse = (reverse * 10) + digit;
			
			
			number /= 10;
		}
		if(original == reverse)
			return true;
		
		return false;
	}
	
	
	public static int reverse(int number) {
		boolean isNegative = false;
		if(number < 0) {
			number *= -1;
			isNegative = true;
		}
		int rev = 0;
		while (number > 0) {
			int digit = number % 10;
			rev = (rev * 10) + digit;
			
			number /= 10;
			
		}
		if (isNegative) {
			return rev * -1;
		}
		return rev;
			
		
	}
	
	
	
//	public static int reverse(int number) {
//		boolean negative = false;
//		if(number < 0) {
//			number *= -1;
//			negative = true;
//		}
//		int reverseNumber= 0;
//			
//		while(number >0) {
//			int digit = number % 10;
//			reverseNumber = (reverseNumber * 10) + digit;
//			
//			number /= 10;
//		}
//		if(negative)
//			return reverseNumber * -1;
//		
//		return reverseNumber;
//	}
	
	
//	public static boolean isPalindrome(int number) {
//		if(number < 0)
//			number *= -1;
//		
//		int original = number;
//		int reverse  = 0;
//		
//		
//		while(number > 0) {
//			int digit = number % 10;
//			reverse = (reverse * 10) + digit;
//			
//			number /= 10;
//		}
//		if(original == reverse) {
//			return true;
//		}
//		return false;
//		
//	}

}
