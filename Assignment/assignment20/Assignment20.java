package assignment20;

public class Assignment20 {
	public static void main(String[] args) {
		System.out.println("*****array1******");
		int[] array1 = { 1, 2, 6, 4, 2, 2, 1, 5 };
		ArrayUtility.print(array1);

		System.out.println("*****array2******");

		int[] array2 = new int[20];
		ArrayUtility.randomize(array2, 100, 200);
		ArrayUtility.print(array2);

		System.out.println("*****array3******");
		int[] array3 = new int[7];
		ArrayUtility.randomize(array3, 7, 10);

		System.out.println("before:");
		ArrayUtility.print(array3);

		ArrayUtility.increase(array3, 10);

		System.out.println("after:");
		ArrayUtility.print(array3);

	}
}
