package assignment04;
public class Assignment04 {
	public static void main(String[] args) {
		String str = "\n***********************************************************************";
		int i;

		// For loop1
		System.out.println("For loop1:");
		for (i = 0; i <= 10; i++) {
			System.out.print(i + "\t");
		}

		// While loop1
		System.out.println();
		System.out.println("While loop1:");
		i = 0;
		while (i <= 10) {
			System.out.print(i + "\t");
			i++;
		}

		// For loop2
		System.out.println(str);
		System.out.println("For loop2:");
		for (i = 10; i >= 0; i--) {
			System.out.print(i * 2 + "\t");
		}

		// While loop2
		System.out.println();
		System.out.println("While loop2:");
		i = 10;
		while (i >= 0) {
			System.out.print(i * 2 + "\t");
			i--;
		}

		// Nested loop1
		System.out.println(str);
		System.out.println("Nested loop1:");
		for (i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Nested loop2
		System.out.println(str);
		System.out.println("Nested loop2:");
		for (i = 10; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
