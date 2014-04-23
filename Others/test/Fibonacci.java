package test;

public class Fibonacci {
	public static void main(String[] args) {
		final int LENGTH = 20;
		long[] fibonacci = new long[LENGTH + 2];
		fibonacci[0] = 1;
		fibonacci[1] = 1;

		for (int i = 2; i < LENGTH + 2; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
			System.out.println("Fibonacci #" + (i - 1) + " = " + fibonacci[i - 2]);
		}

	}
}
