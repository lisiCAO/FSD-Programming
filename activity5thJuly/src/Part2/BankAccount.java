package Part2;

public class BankAccount {
	private String name; // your name
	private double balance; // current amount of money you save in the bank account
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;
	
	/** constructor */
	public BankAccount(String name, double balance) {
	this.name = name;
	this.balance = balance;
	}
	
	/** constructor */
	public BankAccount(String name) {
	this(name,0);
	}	
	
	/** return balance */
	public double getbalance() {
	return balance;
	}
	
	/** return name */
	public String getName() {
	return name;
	}
	
	public String toString() {
		return "Name: " + name + "\n" + "balance: " + balance ;
		}
	
	/** deposit money into the account */
	public void deposit(double depositAmount) throws BankAccountException {
	if(depositAmount < 0) {
		throw new InvalidAmountException("The amount cannot be negative");
	}else if(depositAmount >depositLimit) {
		throw new DepositLimitException("The amount exceed the limit");
	}else {
		balance += depositAmount;
	}

	}
	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) throws BankAccountException {
		if(withdrawAmount < 0) {
			throw new InvalidAmountException("The amount cannot be negative");
		}else if(withdrawAmount > withdrawLimit) {
			throw new DepositLimitException("The amount exceed the limit");
		}else if(balance < withdrawAmount ) {
			throw new NotEnoughBalanceException ("The balance is not enough");
		}
		else {
			balance -= withdrawAmount;
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
