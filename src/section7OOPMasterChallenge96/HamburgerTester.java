package section7OOPMasterChallenge96;

public class HamburgerTester {

	public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("Basic", "white","Sausage", 3.56);
		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Burger price is "+ hamburger.itemizeHamburger());
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAddition1("Egg", 5.43);
		healthyBurger.addHealthAddition1("Lentils", 3.41);
		System.out.println("Total Burger price is "+ healthyBurger.itemizeHamburger());
		
		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Should not be able to do this", 50.53);
		System.out.println("Total Burger price is "+ db.itemizeHamburger());
	}

}
