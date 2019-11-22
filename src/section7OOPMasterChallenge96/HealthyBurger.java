package section7OOPMasterChallenge96;

public class HealthyBurger extends Hamburger{

	public HealthyBurger(String name, String breadType, String meat, double price) {
		super(name, "Brown rye", meat, price);
		
	}


	@Override
	public void addToppings(boolean lettuce, boolean tomato, boolean carrot, boolean olive) {
		// TODO Auto-generated method stub
		super.addToppings(lettuce, tomato, carrot, olive);
	}



	public double addTwoMoreToopings(boolean onions, boolean argula) {
		double additionalPrice= 0;
		if(onions)
			additionalPrice += 10;
		if(argula)
			additionalPrice += 10;
		return additionalPrice;
		
	}
	
	
	
}
