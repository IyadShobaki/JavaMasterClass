package section4StatementMethodsMore;

public class A6TeenNumberChecker56 {

	public static void main(String[] args) {
		System.out.println(hasTeen(22, 13, 44));

	}
	public static boolean hasTeen(int f, int s, int t) {
		if(isTeen(f) || isTeen(s) || isTeen(t))
			return true;
		
		return false;
			
	}
	public static boolean isTeen(int n) {
		if(n >= 13 && n <= 19)
			return true;
		return false;
	}
}
