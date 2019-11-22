package section7OOPCompositionEncapsPoly;

public class A3EncapsChallTester93 {

	public static void main(String[] args) {
		A3Printer93 printer = new A3Printer93(50, false);
		System.out.println("initial page count = " + printer.getNumberOfPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was + " +pagesPrinted + " new total print count for printer = " + printer.getNumberOfPagesPrinted());
		
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was + " +pagesPrinted + " new total print count for printer = " + printer.getNumberOfPagesPrinted());
	}

}
