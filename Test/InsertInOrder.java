

public class InsertInOrder {
	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 7, 8, 9, 10, 0 };
		insertInOrder(array, 3);
	}

	public static void insertInOrder(int[] a, int newValue) {
		int i;
		for (i = a.length - 1; i > 0 && a[i - 1] > newValue;)
			a[i] = a[--i];
		a[i] = newValue;

		for (int item : a)
			System.out.println(item);
	}
}