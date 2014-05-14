public class Test2 {
	public static void main(String[] args) {
		// while (true) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 9 - i; j < 9; j++) {
				System.err.print("*");
			}
			System.out.println();
		}
	}
}
