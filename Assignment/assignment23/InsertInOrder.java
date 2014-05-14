package assignment23;

import java.util.Scanner;

public class InsertInOrder {
	static int[] array = { 1, 5, 6, 7, 8, 9, 10 };

	public static void main(String[] args) {
		print();

		System.out.print("Insert a number:");
		insertInOrder(new Scanner(System.in).nextInt());
		print();
	}

	public static void insertInOrder(int newValue) {

		int[] temp = new int[array.length + 1];
		for (int j = 0; j < array.length; j++)
			temp[j] = array[j];

		int i;
		for (i = temp.length - 1; i > 0 && temp[i - 1] > newValue;)
			temp[i] = temp[--i];
		temp[i] = newValue;

		array = temp;
	}

	public static void print() {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}