package section4StatementMethodsMore;

public class A2OperatorChallenge39 {

	public static void main(String[] args) {

		double dValue1 = 20.00d;

		double dValue2 = 80.00d;

		double result = (dValue1 + dValue2) * 100.00d;
		System.out.println(result);
		double theRemainder = result % 40.00d;
		System.out.println(theRemainder);

		boolean isNoRemainder = theRemainder == 0 ? true : false;

		System.out.println(isNoRemainder);

		if(!isNoRemainder) {
			System.out.println("Got some remainder");
		}

		double kilometers = (100 * 1.609344); // (kilometers = (100 * 1.609344)) -->  is the expression part

		int highScore = 50; //highScore = 50 --> the expression
		if(highScore == 50) {  // highScore == 50   --> the expression
			System.out.println("This is an expression");  //"This is an expression" --> the expression
		}
		
		

	}

}
