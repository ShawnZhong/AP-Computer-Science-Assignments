package assignment15;

abstract class Shape {
	double area;
	double perimeter;
	String name;

	void printName() {
		System.out.println(this.getClass().getSimpleName() + " " + name);
	}

	abstract void printArea();

	abstract void printPerimeter();
}
