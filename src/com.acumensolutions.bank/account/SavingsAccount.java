package account;

public class SavingsAccount {
	private String ownerName;
	private double balance;
	private double interestRate;
	private int perYear;
	
	public SavingsAccount(String ownerName, double balance, double interestRate, int perYear) {
		this.ownerName = ownerName;
		this.balance = balance;
		this.interestRate = interestRate;
		this.perYear = perYear;
	}
	
	public void applyInterest(int time) {
		double amount = Math.pow(1.0 + (this.interestRate/((double)this.perYear)), (this.perYear * (double)time));
		amount = this.balance * amount;
		this.balance = amount;
	}
	
	public void transfer(CheckingAccount destinationAccount, double amount) {
		destinationAccount.deposit(amount);
		this.withdraw(amount);
	}
	
	public void transfer(SavingsAccount destinationAccount, double amount) {
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
