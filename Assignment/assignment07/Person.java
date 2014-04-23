package assignment07;

class Person {
	String name;
	int id;
	int age;

	// constructor
	public Person(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	// print name
	public void printName() {
		System.out.println("My name is " + name + " .");
	}

	// greet methods
	public void greet(String name) {
		System.out.println("Hello " + name);
	}

	public void greetMyName() {
		System.out.println("Hello, I'm a " + this.getClass().getName());
	}

	public void greet() {
		System.out.println("Hello. ");
	}

	public void greet(Person per) {
		System.out.println("Hello " + per.name);
	}

	// print id
	public void printId() {
		System.out.println("My id is " + id + " .");
	}

	// print age
	public void printAge() {
		System.out.println("I'm " + age + " years old.");
	}

	// set or change name
	public void setName(String name) {
		this.name = name;
	}

	// set or change id
	public void setId(int id) {
		this.id = id;
	}

	// set or change age
	public void setAge(int age) {
		this.age = age;
	}
}