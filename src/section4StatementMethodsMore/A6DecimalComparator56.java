package section4StatementMethodsMore;

public class A6DecimalComparator56 {

	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

	}
	public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
		
		if((int)(firstNumber * 1000) == (int)(secondNumber * 1000))
			return true;
		
		return false;
	}

}
