
public class FlourPackProblem {

	public static void main(String[] args) {
		System.out.println(canPack(4,0, 14));
		
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0)
			return false;
		bigCount *= 5;
		if(smallCount >= goal) {
			return true;
		}
		while(bigCount > goal) {
			bigCount -= 5;
		}
		if((goal - bigCount) <= smallCount)
			return true;
		return false;
		
		
	}
	
	
	

	
//	public static boolean canPack(int bigCount, int smallCount, int goal) {
//		if(bigCount < 0 || smallCount < 0 || goal < 0)
//			return false;
//		bigCount *= 5;
//		if(smallCount >= goal || (bigCount >0 && bigCount % goal == 0))
//			return true;
//		
//		while(bigCount > goal) {
//			bigCount -= 5;
//		}
//		if(smallCount >= (goal - bigCount))
//			return true;
//		
//		return false;			
//	}
}
