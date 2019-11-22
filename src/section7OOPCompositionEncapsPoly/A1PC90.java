package section7OOPCompositionEncapsPoly;

public class A1PC90 {
	private A1Case90 theCase;
	private A1Monitor90 monitor;
	private A1Motherboard90 motherboard;
	public A1PC90(A1Case90 theCase, A1Monitor90 monitor, A1Motherboard90 motherboard) {
		
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		//getTheCase().pressPowerButton();
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		//Fancy graphics
		//getMonitor().drawPixelAt(1200, 50, "yellow");
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	
	
//	private A1Case90 getTheCase() {
//		return theCase;
//	}
//	private A1Monitor90 getMonitor() {
//		return monitor;
//	}
//	private A1Motherboard90 getMotherboard() {
//		return motherboard;
//	}
	
	
}
