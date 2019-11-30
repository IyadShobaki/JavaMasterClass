
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(greatestCommonDivisor(81,153));

	}
	
	public static int greatestCommonDivisor(int first, int second) {
		int gcd = 1;
		for(int i =1; i < first && i < second; i++) {
			if(first % i == 0 && second % i ==0)
				gcd = i;
		}
		return gcd;
	}

}
