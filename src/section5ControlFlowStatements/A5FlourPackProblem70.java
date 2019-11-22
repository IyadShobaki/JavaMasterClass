package section5ControlFlowStatements;

public class A5FlourPackProblem70 {

	public static void main(String[] args) {
		
		System.out.println(canPack(0, 5, 6));

	}
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0)
			return false;
		bigCount *= 5;
		if(smallCount >= goal || (bigCount >0 && bigCount % goal == 0))
			return true;
		
		while(bigCount > goal) {
			bigCount -= 5;
		}
		if(smallCount >= (goal - bigCount))
			return true;
		
		return false;			
	}
}
