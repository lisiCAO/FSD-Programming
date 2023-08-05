package Part2;

public class BankAccount {
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;

	private String clientName;
	private double balance; // current amount saved in the bank account

	/** constructor with name and balance */
	public BankAccount(String name, double balance) {
		this.clientName = name;
		this.balance = balance;
	}

	/** constructor with variable name only */
	public BankAccount(String name) {
		this(name, 0);
	}

	/** return balance & name */
	public double getbalance() {
		return balance;
	}

	public String getName() {
		return clientName;
	}

	/** print info */
	public String toString() {
		return "Client Name: " + clientName + "\n" + "balance: " + balance;
	}

	/** method - deposit money */
	public void deposit(double depositAmount) throws BankAccountException {

		/* invalid amount */
		if (depositAmount < 0) {
			throw new InvalidAmountException("The amount you are deposited is negative.");
		}
		/* Exceeding limit */
		else if (depositAmount > depositLimit) {
			throw new DepositLimitException("The deposit amount exceed the limit.");
		} else {
			balance += depositAmount;
		}
	}

	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) throws BankAccountException {

		/* Invalid amount */
		if (withdrawAmount < 0) {
			throw new InvalidAmountException("The withdraw amount is negative.");
		}
		/* Exceeding limit */
		else if (withdrawAmount > withdrawLimit) {
			throw new WithdrawLimitException("The amount exceed the limit");
		}
		/* Not enough balance */
		else if (balance < withdrawAmount) {
			throw new NotEnoughBalanceException("No enough amount for withdrawal.");
		} else {
			balance -= withdrawAmount;
		}
	}
}
