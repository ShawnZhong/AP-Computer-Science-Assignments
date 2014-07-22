package assignment17;

public class Assignment17 {
	public static void main(String[] args) {
		Person a = new Person(112312333, "Alice");
		Person b = new Person(112312333, "Alice");

		System.out.println("name of a : " + a.name);
		System.out.println("name of b : " + b.name);

		System.out.println();

		System.out.println("id of a : " + a.id);
		System.out.println("id of b : " + b.id);

		System.out.println();

		System.out.println("hashcode of a : " + a.hashCode());
		System.out.println("hashcode of b : " + b.hashCode());

		System.out.println();

		System.out.print("a == b\t \t : \t");
		System.out.println(a == b);
		System.out.println("(because they have different hashcode)");

		System.out.println();

		System.out.print("a.equals(b) \t : \t");
		System.out.println(a.equals(b));
		System.out.println("(because they have the same id)");
	}
}
