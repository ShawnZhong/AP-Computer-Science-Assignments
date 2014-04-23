package assignment07;

public class Assignment07 {
	public static void main(String[] args) {
		// make a new "BorStudent" called student1
		Student student1 = new Student("Xiang", 1060119736, 15, "A");
		// make a new "BorTeacher" called teacher1
		Teacher teacher1 = new Teacher("Healy", 123456, 42, "Math");

		// print id, name, age, score
		System.out.println("*************************************");
		student1.printId();
		student1.printAge();
		student1.printName();
		student1.printScore();

		// change id, name, age, score
		student1.setId(312343124);
		student1.setAge(99);
		student1.setName("Zhong");
		student1.setScore("F");

		// print id, name, age, score again
		System.out.println("*************************************");
		student1.printId();
		student1.printAge();
		student1.printName();
		student1.printScore();

		System.out.println("************************************");
		// printJob method for BorTeacher
		teacher1.printJob();
		// printScore method for BorStudent
		student1.printScore();
	}
}