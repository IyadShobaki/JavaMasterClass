package section5ControlFlowStatements;

public class A4FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252324)); // 2 + 4 = 6
	}
	public static int sumFirstAndLastDigit(int number) {
		if(number < 0)
			return -1;
		if(number < 10)
			return number + number;
		
	
		 int firstDigit = number % 10;
		do {
			
			 number = number / 10;
			 if(number < 10) {
				 break;
			 }	 
			
			 
		}while((number / 10) != 0);
		
		
		return firstDigit + number;
		
	}

}
