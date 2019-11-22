package section4StatementMethodsMore;


public class A7MethodOverloading57 {

	public static void main(String[] args) {
		int newScore = calculatorScore("Tim", 500);
		System.out.println("New score is " + newScore);
		
		calculatorScore(75);
		
		calculatorScore();
		
		double centimeters  = calcFeetAndInchesToCentimeters(6,13);
		if(centimeters < 0.0) {
			System.out.println("Invalid parameters");
		}
		
		calcFeetAndInchesToCentimeters(9);
		
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet < 0) || (inches < 0 || inches > 12)) {
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		
		return centimeters;
		//return ((feet * 12) + inches) * 2.54; 
		
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches < 0)
			return -1;
		
		double feet = (int) inches /12;
		double remainingInches = (int) inches % 12;
		
		System.out.println(inches + " inches is equal to "+ feet + " feet and  " + remainingInches + " inches");
		
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
		//return inches * 2.54; 
		
	}
	
	public static int calculatorScore(String playerName , int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculatorScore(int score) {
		System.out.println("Unnamed Player scored " + score + " points");
		return score * 1000;
	}
	public static int calculatorScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}
	
	
	

}
