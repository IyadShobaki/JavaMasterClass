package section4StatementMethodsMore;

public class A9MinutesToYearsAndDays {

	public static void main(String[] args) {
		printYearsAndDays(525600);
	}
	
	public static void printYearsAndDays(long minutes) {
		long years = minutes / 525600;
		long days;
		long remainingMinutes;
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}else {
			if(years > 0) {
				remainingMinutes = minutes % 525600;
				days = remainingMinutes / 1440;
			}else {
				days = minutes / 1440;
			}
			
			System.out.println(minutes + " min = " + years + " y and " + days +" d" );
		}
		
	}
}
