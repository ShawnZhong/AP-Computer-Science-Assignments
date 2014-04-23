package assignment03;

import java.util.Scanner;

public class Assignment03_B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please type in your Grade (A,B,C,D,F).");
		String score = s.nextLine();
		s.close();
		switch (score) {
		case "A":
			System.out.println("Good job.");
			break;
		case "B":
			System.out.println("Well!");
			break;
		case "C":
			System.out.println("OK.");
			break;
		case "D":
			System.out.println("Not bad.");
			break;
		case "F":
			System.out.println("Fail.");
			break;
		default:
			System.out.println("Sorry, I cannot understand it.");
			break;
		}
	}
}
