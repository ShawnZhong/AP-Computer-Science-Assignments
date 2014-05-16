package assignment23;

public class Sort {
	static int[] array = { 1, 2, 4, 5, 6, 7, 3, 2, 3, 5, 7, 1 };

	public static void main(String[] args) {
		// selectionSort();
		// bubbleSort();
	}

	public static void selectionSort() {
		for (int i = 0; i < array.length; i++) {
			int j = findSmallestIndex(array, i);
			swap(i, j);
		}
	}

	public static void bubbleSort() {
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - 1 - i; j++)
				if (array[j] > array[j + 1])
					swap(j, j + 1);

	}

	private static int findSmallestIndex(int[] array, int start) {
		return findSmallestIndex(array, start, array.length);
	}

	private static int findSmallestIndex(int[] array, int start, int end) {
		int index = 0;
		for (int i = start, min = Integer.MAX_VALUE; i < end; i++)
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		return index;
	}

	private static int[] swap(int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		print(a);
		return array;
	}

	private static void print() {
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}

	private static void print(int a) {
		for (int i = 0; i < a; i++) {
			System.out.print(array[i] + " ");
		}
		System.err.print(array[a] + " ");
		for (int i = a + 1; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
