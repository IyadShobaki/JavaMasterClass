package section4StatementMethodsMore;

public class A5MegaBytesConverter55 {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);

	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
	     if(kiloBytes < 0){
	         System.out.println("Invalid Value");
	     }else{
	         int remainder = kiloBytes % 1024;
	         int megaBytes = kiloBytes / 1024;
	         System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB" );
	     }
	 }

}
