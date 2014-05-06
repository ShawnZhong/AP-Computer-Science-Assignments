package assignment22;

public class Assignment22 {
	public static void main(String[] args) {
		factorial1(20);// iteration
		factorial2(20);// recursion

		fibonacci1(75);// iteration
		for (int i = 0; i < 75; i++) {
			System.out.println("Fibonacci #" + (i + 1) + " = " + fibonacci2(i));// recursion
		}
	}

	public static void factorial1(int num) {
		long[] factorial = new long[num + 1];
		factorial[0] = 1;

		for (int i = 1; i < num + 1; i++) {
			factorial[i] = factorial[i - 1] * i;
			System.out.println(i + "! = " + factorial[i]);
		}
	}

	public static long factorial2(long num) {
		if (num == 0) {
			return 1;
		} else {
			long result = num * factorial2(num - 1);
			System.out.println(num + "!=" + result);
			return result;
		}
	}

	public static void fibonacci1(int num) {
		long[] fibonacci = new long[num + 2];
		fibonacci[0] = 1;
		fibonacci[1] = 1;

		for (int i = 2; i < num + 2; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
			System.out.println("Fibonacci #" + (i - 1) + " = " + fibonacci[i - 2]);
		}
	}

	public static long fibonacci2(int num) {
		if (num == 0 | num == 1) {
			return 1;
		} else {
			long result = fibonacci2(num - 1) + fibonacci2(num - 2);
			return result;
		}
	}
}
