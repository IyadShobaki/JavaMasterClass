package section7OOPCompositionEncapsPoly;

public class A2Bed91 {
	private String Style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;
	public A2Bed91(String style, int pillows, int height, int sheets, int quilt) {
		super();
		Style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	
	public void make() {
		System.out.println("Bed -> Making");
	}
	public String getStyle() {
		return Style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeight() {
		return height;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilt() {
		return quilt;
	}
	
	
}
