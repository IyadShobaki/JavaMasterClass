package section5ControlFlowStatements;

public class A5LargestPrime70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPrime(7));
		
	}
	public static int getLargestPrime(int number) {
		if(number <= 1)
			return -1;
		
		int large = 0;
		int large1 = 0;
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				large = i;
			}
				
		}
		System.out.println(large);
		for(int i =1; i < large; i++) {
			if(large % i == 0) {
				large1 = i;
			}
		}
		
		System.out.println(large1);
		if(large == 1) {
			if(large1 == 0) {
				return number;
			}
		}
		if(large1 == 1)
			return large;
		
		if(large1 % 2 ==0)
			return 2;
		return large1;
			
	}
	
}
