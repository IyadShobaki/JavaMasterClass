package section7OOPCompositionEncapsPoly;

public class A1Case90 {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private A1Dimensions90 dimensions;  //has dimensions
	public A1Case90(String model, String manufacturer, String powerSupply, A1Dimensions90 dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public A1Dimensions90 getDimensions() {
		return dimensions;
	}
	
}
