public class Factorial {
	public static void main(String[] args) {
		final int LENGTH = 20;
		long[] factorial = new long[LENGTH + 1];
		factorial[0] = 1;

		for (int i = 1; i < LENGTH + 1; i++) {
			factorial[i] = factorial[i - 1] * i;
			System.out.println(i + "! = " + factorial[i]);
		}
	}
}
