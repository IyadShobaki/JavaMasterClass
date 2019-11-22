package section7OOPCompositionEncapsPoly;

public class A1Monitor90 {
	private String model;
	private String manufacturer;
	private int size;
	private A1Resolution90 nativeResolution;  //a monitor has resolution 
	public A1Monitor90(String model, String manufacturer, int size, A1Resolution90 nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + "," + y  +" in color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public A1Resolution90 getNativeResolution() {
		return nativeResolution;
	}
	
	
}
