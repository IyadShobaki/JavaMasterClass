package section7OOPCompositionEncapsPoly;

public class A1CompositionTester90 {

	public static void main(String[] args) {
		A1Dimensions90 dimensions = new A1Dimensions90(20, 20, 5);
		A1Case90 theCase = new A1Case90("220B", "Dell", "240", dimensions);
		
		A1Monitor90 theMonitor = new A1Monitor90("27inch Beast", "Acer", 27, new A1Resolution90(2540, 1440));
		
		A1Motherboard90 theMotherboard = new A1Motherboard90("BJ-200", "Asus", 4, 6, "v2.44");
		
		A1PC90 thePC = new A1PC90(theCase, theMonitor,	 theMotherboard);
		
//		thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//		thePC.getMotherboard().loadProgram("Windows 1.0");
//		thePC.getTheCase().pressPowerButton();
		thePC.powerUp();
		
		
		
	}

}
