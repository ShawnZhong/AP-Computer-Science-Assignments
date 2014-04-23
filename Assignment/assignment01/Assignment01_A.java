package assignment01;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assignment01_A {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		String name;
		int age;
		// System.out.println("Please enter your name?");
		// userInput = scan.nextLine();
		name = JOptionPane.showInputDialog("Please enter your name.");
		System.out.println("Welcome " + name);
		age = Integer.parseInt(JOptionPane
				.showInputDialog("Please enter your age."));
		if (age < 18) {
			System.out.println("You are younger than 18 years old.");
		} else {
			System.out.println("You are older than 18 years old.");
		}

		// scan.close();
	}
}