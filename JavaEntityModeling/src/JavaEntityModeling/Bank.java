package JavaEntityModeling;
import java.util.ArrayList;  //import ArrayList to store accounts, avoiding limits of the size
public class Bank {
	
	private ArrayList<Account>accounts; //declare a variable. this is a Array List, the class is "Account", the name of array is "accounts"
	
	//create a constructor, assign array list to accounts. creating every new bank object will create an accounts Array List 
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	// the method to add account to list
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	// the method to remove account to list
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	// the method to deposit amount
	public void deposit(Account account, double amount) {
		account.deposit(amount);
	}
	// the method to withdraw amount
	public void withdraw(Account account, double amount) {
		account.withdraw(amount);
	}
	
}
class Account{
	// create attributes, number,name, balance
	private long accountNumber;
	private double balance;
	private String customerName;
	
	//create constructor
	public Account(long accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName =customerName;
		this.balance = balance;
	}
	
	//getters
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
		}
	}
}
