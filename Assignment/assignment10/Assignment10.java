package assignment10;

public class Assignment10 {
	public static void main(String[] args) {
		Student student1 = new Student("Xiang", 1060119736, 15, "A");
		Teacher teacher1 = new Teacher("Healy", 123456, 42, "Math");
		Administrator admin1 = new Administrator("Hammer", 00000, 43);

		System.out.println("*************");
		teacher1.setJob("English");
		student1.setScore("F");
		teacher1.printJob();
		student1.printScore();

		System.out.println("*************");
		student1.greet();// no parameter
		student1.greet("Burton");// parameter type is string
		student1.greet(student1);// parameter type is BorStudent
		student1.greet(teacher1);// parameter type is BorTeacher
		student1.greet(admin1);// parameter type is BorAdministrator
	}

}
