package section5ControlFlowStatements;

public class A4GreatestCommonDivisor {

	public static void main(String[] args) {
		
		
		int first = 81;
		int second = 153;
		
		for(int i = 1; i <= first; i++) {
			if(first % i == 0)
				System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i <= second; i++) {
			if(second % i == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println(getGreatestCommonDivisor(81, 153));
	}
	public static int getGreatestCommonDivisor(int first, int second) {
		int gcd =1;
		if(first < 10 || second < 10)
			return -1;
		
		for(int i =1; i <= first && i <= second; i++)
			if(first % i == 0 && second % i == 0) 
				gcd =  i;
			
		return gcd;
				

	}
}
