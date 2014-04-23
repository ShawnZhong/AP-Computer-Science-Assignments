package assignment14;

class Dog extends Animal {
	public Dog(String name, String food, int age) {
		super(name, food, age);
		speed = 45.00;
		type = "dog";
	}

	public void bark() {
		System.out.println("woof, woof, woof.");
	}
}