package assignment13;

class Animal extends Organism {
	String name;
	String food;
	String type;
	int age;
	double speed;

	public Animal(String name, String food, int age) {
		super();
		this.name = name;
		this.food = food;
		this.age = age;
	}

	public void printName() {
		System.out.println("My name is " + name + ".");
	}

	public void printAge() {
		System.out.println("I'm " + age + " years old.");
	}

	public void printFood() {
		System.out.println("My favourite food is " + food + ".");
	}

	public void printType() {
		System.out.println("I'm a " + type + ".");
	}

	public void run() {
		System.out.println("I can run at the speed of " + speed + " mph.");
	}

}