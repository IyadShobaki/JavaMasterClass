package section7OOPCompositionEncapsPoly;

public class A2Lamp91 {
	private String style;
	private boolean battery;
	private int globRating;
	public A2Lamp91(String style, boolean battery, int globRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}
	public void turnOn() {
		System.out.println("Lamp -> Turning on");
	}
	public String getStyle() {
		return style;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getGlobRating() {
		return globRating;
	}
	
	
}
