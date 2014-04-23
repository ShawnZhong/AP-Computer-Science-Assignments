package assignment05;

import java.util.Scanner;

public class Assignment05_B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// input name
		System.out.print("Name:");
		String name = s.nextLine();

		// input gender
		System.out.print("Gender(M or F):");
		String gender = s.nextLine();

		// input id
		System.out.print("ID:");
		int id = s.nextInt();

		// new Student s1
		Student s1 = new Student(id, name, gender);

		// say hello
		s1.greet("Burton");

		// print my name
		s1.printName();

		// print my id
		s1.getId();

		// print gender
		s1.gender();

		s.close();
	}
}