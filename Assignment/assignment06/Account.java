package assignment06;

class Account {
	private String name;
	private double balance;

	// constructor
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public void change(double money) {
		balance += money;
	}

	public void print() {
		System.out.println("\nWelcome " + name + ". Your total balance is $" + balance);
	}
}