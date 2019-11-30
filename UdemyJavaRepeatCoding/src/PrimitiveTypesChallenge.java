
public class PrimitiveTypesChallenge {

	public static void main(String[] args) {
		
		byte  myByte = 10;
		short myshort = 20;
		int myInt = 50;
		
		long myLong = 500000L + 10L * (myByte + myshort + myInt);
		
		System.out.println(myLong);
		
		short shortTotal = (short) (1000 + 10 * (myByte + myshort + myInt));
		
		System.out.println(shortTotal);
		
		float myMinFloatValue = Float.MIN_NORMAL;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float min Value = " +myMinFloatValue);
		System.out.println("Float max value = " + myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_NORMAL;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double min value = " + myMinDoubleValue);
		System.out.println("Double max value = " + myMaxDoubleValue);
		
		int myIntValue  = 5 / 3;
		float myFloatValue = 5f / 3f;
		//double myDoubleValue = 5d /3d;
		double myDoubleValue = 5.00 / 3.00;
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue );
		System.out.println("MyDoubleValue = " + myDoubleValue);
		
		double numberOfPounds = 200d;
		
		double convertedKilograms = numberOfPounds * 0.45359237d;
		
		System.out.println("Converted kilograms = " + convertedKilograms);
		
		double pi = 3.1415927d;
		
		double anotherNumber = 3_000_000.4_567_890d;
		
		
		System.out.println(pi);
		System.out.println(anotherNumber);
	}

}
