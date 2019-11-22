package section4StatementMethodsMore;

public class A6LeapYear56 {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1));

	}
	public static boolean isLeapYear(int year) {
		if(year < 1 || year > 9999)
			return false;
		else {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0)
						return true;
				}else {
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}

}