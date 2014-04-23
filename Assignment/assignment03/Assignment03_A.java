package assignment03;

import java.util.Scanner;

public class Assignment03_A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out
				.println("Please type in your score in percentage (0 to 100).");
		float score = s.nextFloat();
		s.close();
		if (score >= 100) {
			System.out.println("Your grade is A+");
		} else if (score >= 90) {
			System.out.println("Your grade is A");
		} else if (score >= 80) {
			System.out.println("Your grade is B");
		} else if (score >= 70) {
			System.out.println("Your grade is C");
		} else if (score >= 60) {
			System.out.println("Your grade is D");
		} else if (score < 60) {
			System.out.println("Your grade is F");
		}
	}
}
