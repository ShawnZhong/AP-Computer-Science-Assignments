package assignment05;

class Student {
	private String name;
	private int id;// student id number
	private String gender;

	// constructor
	public Student(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	// say hello
	public void greet(String name) {
		System.out.println("Hello " + name);
	}

	// say hello
	public void greet() {
		System.out.println("Hello");
	}

	// say hello
	public void greet(Student stu) {
		System.out.println("Hello " + stu.name);
	}

	// print gender
	public void gender() {
		if (gender == "M") {
			System.out.println("I'm a boy");
		} else {
			System.out.println("I'm a girl");
		}
	}

	// print my name
	public void printName() {
		System.out.println("My name is " + name);
	}

	// change name
	public void changeName(String name) {
		this.name = name;
	}

	// get id
	public void getId() {
		System.out.println("ID:" + id);
	}

}