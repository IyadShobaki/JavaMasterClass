package section7OOPMasterChallenge96;

public class HealthyBurger extends Hamburger{
	
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger(String meat, double price) {
		super("Healthy", "Brown Rye", meat, price);
		
	}
	public void addHealthAddition1(String name, double price) {
		this.healthyExtra1Name =name;
		this.healthyExtra1Price =price;
	}
	public void addHealthAddition2(String name, double price) {
		this.healthyExtra2Name =name;
		this.healthyExtra2Price =price;
	}
	@Override
	public double itemizeHamburger() {
		
		double hamburgerPrice =  super.itemizeHamburger();
		
		if(this.healthyExtra1Name != null) {
			hamburgerPrice += this.healthyExtra1Price;
			System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
		}
		if(this.healthyExtra2Name != null) {
			hamburgerPrice += this.healthyExtra1Price;
			System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
		}
		
		return hamburgerPrice;
	}
	
	
	
//	@Override
//	public void addToppings(boolean lettuce, boolean tomato, boolean carrot, boolean olive) {
//		// TODO Auto-generated method stub
//		super.addToppings(lettuce, tomato, carrot, olive);
//	}



//	public double addTwoMoreToopings(boolean onions, boolean argula) {
//		double additionalPrice= 0;
//		if(onions)
//			additionalPrice += 10;
//		if(argula)
//			additionalPrice += 10;
//		return additionalPrice;
//		
//	}
	
	
	
}
