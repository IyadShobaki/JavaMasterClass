
public class MethodChallenge {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelComplete = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelComplete, bonus);
		System.out.println("Your final score was " + highScore);
		
		score = 10000;
		levelComplete = 8;
		bonus = 200;
		
		highScore = calculateScore(gameOver , score , levelComplete ,bonus);
		System.out.println("Your final score was " + highScore);
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition);
		
		
		

	}
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get int position " + highScorePosition +
				" on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		int position =4;
		if(playerScore >= 1000)
			position =1;
		else if (playerScore >=500)
			position = 2;
		else if (playerScore >= 100)
			position = 3;
		
		return position;
	}
	public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelComplete * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}

}
