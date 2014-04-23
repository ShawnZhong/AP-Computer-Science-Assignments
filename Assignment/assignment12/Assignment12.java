package assignment12;

public class Assignment12 {
	public static void main(String[] args) {
		Person student1 = new Student("Xiang", 1060119736, 15, "A");
		Person teacher1 = new Teacher("Healy", 123456, 42, "Math");
		Person admin1 = new Administrator("Hammer", 00000, 43);

		student1.greet();// no parameter
		student1.greet("Burton");// parameter type is string
		student1.greet(student1);// parameter type is BorStudent
		student1.greet(teacher1);// parameter type is BorTeacher
		student1.greet(admin1);// parameter type is BorAdministrator

		// This is my greet method :

		// public void greet(Person per) {
		// System.out.println("Hello " + per.name);
		// }
	}

}
