package assignment15;

class Rectangle extends Shape {
	double a, b;

	public Rectangle(String name, double a, double b) {
		this.name = name;
		this.a = a;
		this.b = b;
	}

	void printArea() {
		area = a * b;
		System.out.println("Area : " + area);
	}

	void printPerimeter() {
		perimeter = 2 * (a + b);
		System.out.println("Perimeter : " + perimeter);
	}
}