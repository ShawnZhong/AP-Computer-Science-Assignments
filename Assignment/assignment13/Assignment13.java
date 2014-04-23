package assignment13;


public class Assignment13 {
	public static void main(String[] args) {
		Animal a = new Dog("Alice", "bones", 3);
		Animal b = new Cat("Bob", "fish", 5);

		a.printType();
		a.printAge();
		a.printName();
		a.printFood();
		a.run();

		System.out.println("****************************");

		b.printType();
		b.printAge();
		b.printName();
		b.printFood();
		b.run();

		System.out.println("****************************");

		((Dog) a).bark();
		((Cat) b).meow();

	}
}