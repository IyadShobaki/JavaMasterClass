
public class OperatorChallenge {

	public static void main(String[] args) {
		
		double dValue1 = 20.00d;
		double dValue2 = 80.00d;
		
		double result = (dValue1 + dValue2) * 133.00d;
		System.out.println(result);
		double theRemainder = result % 40.00d;
		System.out.println(theRemainder);
		
		boolean isNoRemainder = theRemainder == 0 ? true : false;
		System.out.println(isNoRemainder);
		
		if(!isNoRemainder) {
			System.out.println("Got some remainder");
		}
		
	}

}
