package account;

public class SavingsAccount {
	private String ownerName;
	private double balance;
	private double interestRate;
	private int perYear;
	
	public CheckingAccount(String ownerName, double balance, double interestRate, int perYear) {
		this.ownerName = ownerName;
		this.balance = balance;
		this.interestRate = interestRate;
		this.perYear = perYear;
	}
	
	public double applyInterest(int time) {
		double amount = math.pow(1 + (this.interestRate/((double)*this.perYear)), (this.interestRate * (double)time));
		amount = this.balance * amount;
		return amount;
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
