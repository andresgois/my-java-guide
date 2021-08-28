package entity;

public class Account {
	
	private String numberAccount;
	private String holder;
	private double balance;
	
	public Account(String numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.holder = name;
	}
	
	public Account(String numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holder = name;
		deposit(initialDeposit);
	}
	
	public void deposit(double amount) {
		this.balance += amount; 
	}
	
	public void withdraw(double amount) {
		this.balance -= (amount + 5.0); 
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}


	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account "+
				numberAccount
				+", Holder: "
				+holder
				+", Balance: $ "
				+String.format("%.2f", getBalance());
	}
	
	
}
