package assignment11;

public class Assignment11 {
	public static void main(String[] args) {
		Person[] personArray = new Person[3];

		personArray[0] = new Student("Xiang", 1060119736, 15, "A");
		personArray[1] = new Teacher("Healy", 123456, 42, "Math");
		personArray[2] = new Administrator("Hammer", 00000, 43);

		// Enhanced For Loops
		for (Person person : personArray) {
			person.greetMyName();
		}

	}
}
