package section7OOPMasterChallenge96;

public class Hamburger {
	private String name;
	private String breadType = "Roll Type";
	private String meat;
	private double price = 10.0;
	public Hamburger(String name,String breadType, String meat, double price) {
		super();
		this.name = name;
		this.breadType = breadType;
		this.meat = meat;
		this.price = price;
	}
	
	public void addToppings(boolean lettuce, boolean tomato, boolean carrot, boolean olive) {
		double additionalPrice = 0;
		if(lettuce)
			additionalPrice += 1.0;
		if(tomato)
			additionalPrice += 1.0;
		if(carrot)
			additionalPrice += 1.0;
		if(olive)
			additionalPrice += 1.0;
		
		price += additionalPrice;
	}

	public String getName() {
		return name;
	}

	public String getBreadType() {
		return breadType;
	}

	public String getMeat() {
		return meat;
	}

	public double getPrice() {
		return price;
	}
	
	
}
