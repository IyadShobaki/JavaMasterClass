package section5ControlFlowStatements;

public class A4LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(22, 23, 42));

	}
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if (!isValid(num1) || !isValid(num2) || !isValid(num3))
			return false;
		int fLast = num1 % 10;
		int sLast = num2 % 10;
		int tLast = num3 % 10;
		
		if(fLast == sLast || fLast == tLast || sLast == tLast)
			return true;
		
		return false;
	}
	public static boolean isValid(int number) {
		if(number < 10 || number > 1000)
			return false;
		
		return true;
	}
}
