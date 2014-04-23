package assignment17;

public class Person {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// if they are the same object return true
		if (this == obj)
			return true;

		// if the object is null , return false
		if (obj == null)
			return false;

		// if they are not the same type (class) , return false
		if (getClass() != obj.getClass())
			return false;

		// if they don't have the same id ,return false
		if (id != ((Person) obj).id)
			return false;

		// finally ,return true
		return true;
	}
}
