package section7OOPCompositionEncapsPoly;

public class A2Tester91 {

	public static void main(String[] args) {
		
		A2Wall91 wall1 = new A2Wall91("West");
		A2Wall91 wall2 = new A2Wall91("East");
		A2Wall91 wall3 = new A2Wall91("South");
		A2Wall91 wall4 = new A2Wall91("North");
		
		A2Ceiling91 ceiling = new A2Ceiling91(12, 55);
		
		A2Bed91 bed = new A2Bed91("Modern", 4, 3, 2, 1);
		
		A2Lamp91 lamp = new A2Lamp91("Classic", false, 75);
		
		A2Bedroom91 bedroom = new A2Bedroom91("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		
		bedroom.makeBed();
		bedroom.getLamp().turnOn();

	}

}
