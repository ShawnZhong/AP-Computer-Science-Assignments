package assignment02;
public class Assignment02 {
	public static void main(String[] args) {
		double a;
		double b;

		System.out.println("**********************************");
		System.out.println("a = 3;");
		a = 3;
		a++;
		System.out.println("input:a++\t\t" + "output:" + a);

		a = 3;
		a--;
		System.out.println("input:a--\t\t" + "output:" + a);

		System.out.println("**********************************");

		System.out.println("a = 3;\tb = 1.5;");
		a = 1.5;
		b = 3;
		a += b;
		System.out.println("input:a += b\t\t" + "output:" + a);

		a = 1.5;
		b = 3;
		a -= b;
		System.out.println("input:a -= b\t\t" + "output:" + a);

		a = 1.5;
		b = 3;
		a *= b;
		System.out.println("input:a *= b\t\t" + "output:" + a);

		a = 1.5;
		b = 3;
		a /= b;
		System.out.println("input:a /= b\t\t" + "output:" + a);

		System.out.println("**********************************");
	}
}
