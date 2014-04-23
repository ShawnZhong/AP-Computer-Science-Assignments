package assignment10;

class Student extends Person {
	String score;

	// constructor
	public Student(String name, int id, int age, String score) {
		super(name, id, age);
		this.score = score;
	}

	// print score
	public void printScore() {
		System.out.println("My score is " + score + " .");
	}

	// set or change score
	public void setScore(String score) {
		this.score = score;
	}

}