package section4StatementMethodsMore;

public class A9PlayingCat {

	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 46));

	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(temperature >= 25 && temperature <=35) {
			return true;
		}
		else if(summer) {
			if(temperature >=25 && temperature <=45)
				return true;
		}
		
		return false;
	}
}
