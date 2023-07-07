package Part2;

class BankAccountException extends Exception {
	public BankAccountException(String message) {
		super(message);
	}
}

class InvalidAmountException extends BankAccountException {
	public InvalidAmountException(String message) {
		super(message);
	}
}

class NotEnoughBalanceException extends BankAccountException {
	public NotEnoughBalanceException(String message) {
		super(message);
	}
}

class WithdrawLimitException extends BankAccountException {
	public WithdrawLimitException(String message) {
		super(message);
	}
}

class DepositLimitException extends BankAccountException {
	public DepositLimitException(String message) {
		super(message);
	}
}

class BankAccount {

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
		this(name, 0);
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
		return "Name: " + name + "\n" + "balance: " + balance;
	}

	public void deposit(double depositAmount) throws DepositLimitException, InvalidAmountException{
		if(depositAmount > depositLimit) {
			throw new DepositLimitException ("The Deposit amount should be less than 500$");
		}
		if(depositAmount < 0) {
			throw new InvalidAmountException ("The Deposit amount should be larger than 0$");
		}
		this.balance += depositAmount;
		
	}

	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) throws BankAccountException {
		if (withdrawAmount <= 0) {
			throw new InvalidAmountException("Withdrawal amount must be positive.");
		}
		if (withdrawAmount > withdrawLimit) {
			throw new WithdrawLimitException("Withdrawal amount exceeds the withdrawal limit.");
		}
		if (withdrawAmount > this.balance) {
			throw new NotEnoughBalanceException("Insufficient balance for the requested withdrawal.");
		}
		this.balance -= withdrawAmount;
	}
}
