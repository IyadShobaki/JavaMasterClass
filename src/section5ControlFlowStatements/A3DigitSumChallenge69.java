package section5ControlFlowStatements;

public class A3DigitSumChallenge69 {

	public static void main(String[] args) {
		
		System.out.println(sumDigits(125));
		
		System.out.println(sumDigitsTeacherSolution(125));
	}
	public static int sumDigits(int number) {
		int count =0;
		int extract;
		if(number < 10)
			return -1;
		do {
			 extract = number % 10;
			 count += extract;
			 number = number / 10;
			 if(number < 10) {
				 count += number;
				 break;
			 }
				 
			 
		}while((number / 10) != 0);
		
		return count;
	}

	public static int sumDigitsTeacherSolution(int number) {
		if(number <10)
			return -1;
		
		int sum =0;
		//125 -> 125 /10 == 12 -> 12 * 10 = 120 -> 125 -120 = 5   least significant digit
		
		while(number > 0) {
			//extract the least-significant digit
			int digit = number % 10;
			sum += digit;
			
			//drop the least-significant digit
			number /=10;  //same as number = number /10;
		}
		
		return sum;
		
	}
}
