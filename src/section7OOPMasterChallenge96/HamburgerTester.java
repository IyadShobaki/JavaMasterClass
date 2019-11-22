package section7OOPMasterChallenge96;

public class HamburgerTester {

	public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("SteakAndShake", null, "Beef", 5.0);
		hamburger.addToppings(false, true, false, true);
		System.out.println(hamburger.getPrice());
		System.out.println(hamburger.getName());
		
	}

}
