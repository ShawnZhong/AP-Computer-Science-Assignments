package assignment15;

public class Assignment15 {
	public static void main(String[] args) {
		Shape a = new Square("ABCD", 1.4);
		a.printName();
		a.printArea();
		a.printPerimeter();

		System.out.println("***********************");

		Shape b = new Rectangle("EFGH", 1.5, 3.2);
		b.printName();
		b.printArea();
		b.printPerimeter();

		System.out.println("***********************");

		Shape c = new Circle("O", 6.7);
		c.printName();
		c.printArea();
		c.printPerimeter();

	}
}
