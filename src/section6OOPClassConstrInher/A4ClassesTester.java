package section6OOPClassConstrInher;

public class A4ClassesTester {

	public static void main(String[] args) {
		
		A4AnimalClass80 animal = new A4AnimalClass80("Animal", 1, 1, 5, 5);
		A4DogInheritFromAnimal dog = new A4DogInheritFromAnimal("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
		
		dog.eat();
		dog.walk(); // will not execute Dog.move() because super word
		dog.run();

	}

}
