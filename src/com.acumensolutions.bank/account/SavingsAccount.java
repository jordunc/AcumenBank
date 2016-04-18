package account;

public class SavingsAccount {
	private String ownerName;
	private double balance;
	
	public CheckingAccount(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public double compileInterest(int time, double rate, int timesPerYear) {
		return (this.balance * math.pow(1 + (rate/((double)*timesPerYear)), (rate * (double)time)));
	}
	
	public void transfer(CheckingAccount destinationAccount, double amount) {
		destinationAccount.deposit(amount);
		this.withdraw(amount);
	}
	
	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		this.balance += amount;
	}

	private void withdraw(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		this.balance -= amount;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public double getBalance() {
		return this.balance;
	}
}
