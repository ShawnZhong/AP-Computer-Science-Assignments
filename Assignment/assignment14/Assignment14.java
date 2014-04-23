package assignment14;

public class Assignment14 {
	public static void main(String[] args) {
		// declare variables
		Dog dog1, dog2;
		Animal animal1, animal2;
		Organism organism1, organism2;
		Object object1;

		// assign dog Alice to a variable called dog1
		dog1 = new Dog("Alice", "bones", 3);

		// upcasting
		animal1 = dog1;
		organism1 = animal1;
		object1 = organism1;

		// downcasting
		organism2 = (Organism) object1;
		animal2 = (Animal) organism2;
		dog2 = (Dog) animal2;

		// test method
		dog2.bark();
	}
}
