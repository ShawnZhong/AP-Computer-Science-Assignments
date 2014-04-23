package test;

public class PascalTriangle {
	public static void main(String[] args) {
		final int NUM = 25;

		int[][] a = new int[NUM][];
		for (int i = 0; i < NUM; i++) {
			a[i] = new int[i + 1];
			a[i][0] = 1;
			a[i][i] = 1;
		}

		for (int i = 2; i < NUM; i++)
			for (int j = 1; j < i; j++)
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

		for (int[] row : a) {
			for (int col : row)
				System.out.print(col + "\t");
			System.out.println();
		}

	}

}
