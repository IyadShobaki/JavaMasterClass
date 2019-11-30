
public class FirstAndLastDigit {

	public static void main(String[] args) {
		
		System.out.println( sumLirstAndLastDigit(746547));
		

	}
	
	public static int sumLirstAndLastDigit(int number) {
		if(number < 0)
			return -1;
		if(number < 10)
			return number + number;
		int sum = 0;
		int last = number % 10;
		while(number > 10) {
			number /= 10;
		}
		sum = last + number;
		return sum;
	}
}
