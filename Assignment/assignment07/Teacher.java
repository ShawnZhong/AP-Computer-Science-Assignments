package assignment07;

class Teacher extends Person {
	String job;

	// constructor
	public Teacher(String name, int id, int age, String job) {
		super(name, id, age);
		this.job = job;
	}

	// print job
	public void printJob() {
		System.out.println("I'm a " + job + " teacher.");
	}

	// set or change job
	public void setJob(String job) {
		this.job = job;
	}

}