package section5ControlFlowStatements;

public class A4EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(2431567)); //2+4+6 = 12

	}
	public static int getEvenDigitSum(int number) {
		if(number < 0)
			return -1;
		int sum =0;
		
		
		while(number > 0) {
			
			int digit = number % 10;
			if(digit % 2 == 0)
				sum += digit;
			
			number /=10; 
		}
		
		return sum;
	}

}
