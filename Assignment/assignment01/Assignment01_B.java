package assignment01;

import java.util.Scanner;

public class Assignment01_B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Borah");
		System.out.println("Lions");
		System.out.println("Borah");
		System.out.println("Lions");

		System.out.println("****************");

		System.out.println(" 1\t2\t3\t");
		System.out.println(" \\      \"       \' ");

		System.out.println("****************");

		int test1 = 93;
		int test2 = 77;
		int test3 = 100;

		System.out.print("input your Test 4 score:");
		int test4 = s.nextInt();

		double average = (test1 + test2 + test3 + test4) / 4;
		System.out.println(average);
		s.close();
	}
}
