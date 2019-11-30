
public class MegaBytesConverter {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
		
		System.out.println(shouldWakeup(true,2));
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
	}
	
	

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0)
			System.out.println("Invalid Value");
		else {
			int remainder =kiloBytes % 1024;
			int megaBytes = kiloBytes /1024;
			System.out.println(kiloBytes + " KB =  " + megaBytes + " MB and " + remainder + " KB");
		}
	}
	
	public static boolean shouldWakeup(boolean barking, int hourOfDay) {
		if(hourOfDay < 0 || hourOfDay > 23)
			return false;
		else if (barking && (hourOfDay < 8 || hourOfDay > 22))
			return true;
		
		return false;
	}
	
	
	public static boolean areEqualByThreeDecimalPlaces(double fNumber, double sNumber) {
		if((int) (fNumber *  1000) == (int) (sNumber * 1000))
			return true;
		return false;
		
	}
	
	
	
//	public static boolean areEqualByThreeDecimalPlaces(double fNumber, double sNumber) {
//		if((int) (fNumber * 1000) == (int) (sNumber * 1000))
//			return true;
//		return false;
//	}
	
	
	
//	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//		if(kiloBytes < 0)
//			System.out.println("Invalid Vlaue");
//		else {
//			int remainder= kiloBytes % 1024;
//			int megaBytes = kiloBytes / 1024;
//			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
//		}
//	}

}
