
public class AnimalDogTester {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");
		
		dog.eat();
		dog.walk();
		dog.run();
		
		Fish fish = new Fish("Lolo", 1, 50, 2, 2, 3);
		
		fish.eat();
		fish.move(30);
	}

}
