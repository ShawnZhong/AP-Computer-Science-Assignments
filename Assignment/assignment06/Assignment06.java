package assignment06;

import java.util.Scanner;

public class Assignment06 {
	public static void main(String[] args) {
		// Scanner
		Scanner s = new Scanner(System.in);

		// ask for input
		System.out.print("Please type in your name:");
		String name = s.nextLine();
		System.out.print("Please type in your current balance:");
		double balance = s.nextDouble();

		// new Account called user
		Account user = new Account(name, balance);

		// change balance
		System.out.println("How much money did you spend last night?");
		user.change(-s.nextDouble());
		System.out.println("How much money you found at school yesterday?");
		user.change(s.nextDouble());

		// print Name & Total Balance
		user.print();

		// close scanner
		s.close();
	}
}