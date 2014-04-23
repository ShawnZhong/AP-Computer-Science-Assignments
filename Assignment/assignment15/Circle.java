package assignment15;

class Circle extends Shape {
	double r;

	public Circle(String name, double r) {
		this.name = name;
		this.r = r;
	}

	void printArea() {
		area = Math.PI * r * r;
		System.out.println("Area : " + area);
	}

	void printPerimeter() {
		perimeter = 2 * Math.PI * r;
		System.out.println("Perimeter : " + perimeter);
	}
}
