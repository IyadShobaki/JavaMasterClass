package section6OOPClassConstrInher;

public class A4FishInheritFromAnimal81 extends A4AnimalClass80 {
	private int gills;
	private int eyes;
	private int fins;
	
	public A4FishInheritFromAnimal81(String name, int size, int weight
									, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills =gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	private void rest() {
		
	}
	private void moveMuscles() {
		
	}
	private void moveBackFin() {
		
	}
	private void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
	
	
}
