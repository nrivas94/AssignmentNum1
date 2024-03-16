
public class BankAccount {
	private double deposit = 0;
	private double withdraw = 0;
	private String firstName;
	private String lastName;
	private String accountStatus = "Open";
	private double balance = 0;
	
	public BankAccount (String ownerFirstName, String ownerLastName, double initialDepositAmount) {
		firstName = ownerFirstName;
		lastName = ownerLastName;
		balance = initialDepositAmount;
	}
	
	public boolean deposit(double amount) {
		if (accountStatus == "Open") {
			balance += amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean withdraw(double amount) {
		if (accountStatus == "Open") {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOpen() {
		if (accountStatus == "Open") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void close() {
		if (accountStatus == "Open") {
			accountStatus = "Closed";
		}
		else {
			System.out.println("Account already closed.");
		}
	}
	
	public String getOwnerFullName() {
		return firstName + " " + lastName;
	}
}
