package assignment14;

class Cat extends Animal {
	public Cat(String name, String food, int age) {
		super(name, food, age);
		speed = 30.00;
		type = "cat";
	}

	public void meow() {
		System.out.println("meow, meow, meow.");
	}
}