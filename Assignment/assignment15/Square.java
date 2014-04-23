package assignment15;

class Square extends Shape {
	double a;

	public Square(String name, double a) {
		this.name = name;
		this.a = a;
	}

	void printArea() {
		area = a * a;
		System.out.println("Area : " + area);
	}

	void printPerimeter() {
		perimeter = 4 * a;
		System.out.println("Perimeter : " + perimeter);
	}
}