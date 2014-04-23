package assignment05;

public class Assignment05_A {
	public static void main(String[] args) {
		// new Student
		Student s1 = new Student(1060119736, "Xiang", "M");

		s1.greet();// no parameter
		s1.greet("Burton"); // parameter is a string
		s1.greet(new Student(888888888, "Zhong", "F"));// parameter is an object

		System.out.println("***********************");// I'm a separator

		// print my name now
		s1.printName();
		// change name
		s1.changeName("NewName");
		// print the new name;
		s1.printName();

		System.out.println("***********************"); // I'm a separator

		// print my id
		s1.getId();
		// print gender
		s1.gender();
	}
}