
public class DigitSum {

	public static void main(String[] args) {
		System.out.println(sumDigits(325465765));
		
		printFactors(0);
	}

	
	public static void printFactors(int number) {
		if(number < 1) {
			System.out.println("Invalid Value");
			return;
		}
			
		
		
		for(int i =1; i <= number; i++) {
			if(number % i ==0)
				System.out.print(i + " ");
		}
	}
//	public static void printFactors(int number) {
//		if(number < 1)
//			System.out.println("Invalid Value");
//		for(int i =1; i <= number; i++ ) {
//			if(number % i == 0)
//				System.out.print( i + " ");
//		}
//	}
	
	public static int sumDigits(int number) {
		if(number < 10)
			return -1;
		int sum =0;
		while(number > 0) {
			int digit = number % 10;
			sum += digit;
			
			
			number /= 10;
		}
		return sum;
	}
	
	
//	public static long sumDigits(long number) {
//		if(number < 10)
//			return -1;
//		long sum = 0;
//		
//		while(number > 0) {
//			long digit = number % 10;
//			sum += digit;
//			
//			number /= 10;
//		}
//		return sum;
//		
//	}
	
	
	
	
	
	
	
	
//	public static int sumDigits(int number) {
//		if(number < 10)
//			return -1;
//		int sum = 0;
//		
//		while (number > 0) {
//			int digit = number %10;
//			sum += digit;
//			
//			number /= 10;
//		}
//		
//		return sum;
//	
//	}
}
