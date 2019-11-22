package section5ControlFlowStatements;

public class A4SharedDigit {

	public static void main(String[] args) {
		

	}
	public static boolean hasSharedDigit(int num1, int num2) {
		if(num1 < 10 || num1 > 99|| num2 < 10 || num2 >99)
			return false;
			
		int fFirstDigit = num1 % 10;
		int fLastDigit = num1 / 10;
		int sFirstDigit = num2 % 10;
		int sLastDigit = num2 / 10;
		
		if(fFirstDigit == sFirstDigit || fFirstDigit == sLastDigit ||
				fLastDigit == sFirstDigit || fLastDigit == sLastDigit)
			return true;
		
		return false;

		
		
	}
}
