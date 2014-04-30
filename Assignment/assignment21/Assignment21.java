package assignment21;

public class Assignment21 {
	public static void main(String[] args) {
		// number of rows
		final int NUM = 12;

		// initialize the array
		int[][] a = new int[NUM][];
		for (int i = 0; i < NUM; i++) {
			a[i] = new int[i + 1];
			a[i][0] = 1;
			a[i][i] = 1;
		}

		// fill in the number
		for (int i = 2; i < NUM; i++)
			for (int j = 1; j < i; j++)
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

		// print array
		for (int[] row : a) {
			for (int col : row)
				System.out.print(col + "\t\t");
			System.out.println();
		}

	}

}
