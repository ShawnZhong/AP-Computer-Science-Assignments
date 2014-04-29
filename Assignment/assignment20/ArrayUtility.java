package assignment20;

public class ArrayUtility {
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.println("#" + (i + 1) + "\t : \t" + a[i]);
	}

	public static void print(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++)
			System.out.println("#" + (i + 1) + "\t : \t" + a[i] + "\t" + b[i]);
	}

	public static int[] randomize(int[] a, int low, int high) {
		for (int i = 0; i < a.length; i++)
			a[i] = (int) (Math.random() * (high - low + 1) + low);
		return a;
	}

	public static int[] increase(int[] a, int num) {
		for (int i = 0; i < a.length; i++)
			a[i] += num;
		return a;
	}

	public static int[] increase(int[] a) {
		return increase(a, 1);
	}
}
