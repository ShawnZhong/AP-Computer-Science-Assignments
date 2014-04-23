package assignment19;

public class Assignment19 {
	public static void main(String[] args) {
		System.out.println("*******1st Example******");
		int[] a = new int[5];// default initialization (all 0)

		for (int i : a)
			System.out.println(i);// print the array

		System.out.println("*******2nd Example******");

		int[] b = new int[5];// initialize array

		for (int i = 0; i < b.length; i++)
			// use for loop to set values
			b[i] = i * i;

		for (int i : b)
			System.out.println(i);// print the array

		System.out.println("*******3rd Example******");

		int[] c = new int[5];// initialize array
		c[0] = 0;
		c[1] = 1;
		c[2] = 2;
		c[3] = 3;
		c[4] = 4;

		for (int i : c)
			System.out.println(i);// print the array

		System.out.println("*******4th Example******");
		int[] d = { 0, 1, 2, 3, 4 };
		for (int i : d)
			System.out.println(i);// print the array

		System.out.println("*******5th Example******");
		for (int i = 0; i < d.length; i++)
			// use normal for loop to print the array d
			System.out.println(d[i]);

	}
}