/**
 * The `Bank` has a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money.
 * The "Account" maintain account details of a particular customer.
 * 
 * @author Lisi Cao
 * @version 2.0
 * @since September 10, 2023
 */

package JavaEntityModeling;

import java.util.Map;
import java.util.HashMap;

public class Bank {

	private Map<String, Account> accounts;
	
	/**
	 * Constructs an empty bank with no accounts.
	 */
	public Bank() {
		accounts = new HashMap<>();
	}
	
	/**
	 * Adds an account to the bank.
	 * @param account The account to be added.
	 */
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account);
	}
	
	/**
	 * Removes an account from the bank using its account number.
	 * @param accountNumber The account number of the account to be removed.
	 */
	public void removeAccount(String accountNumber) {
		accounts.remove(accountNumber);
	}
	
	/**
	 * Retrieves an account based on its account number.
	 * @param accountNumber The account number.
	 * @return The account associated with the account number.
	 */
	public Account getAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
	
	/**
	 * Deposits a specified amount into the specified account.
	 * @param accountNumber The account number.
	 * @param amount The amount to be deposited.
	 * @throws BankAccountException If there's an issue with the deposit operation.
	 */
	public void deposit(String accountNumber, double amount) throws BankAccountException {
		Account account = getAccount(accountNumber);
		account.deposit(amount);
	}

	/**
	 * Withdraws a specified amount from the specified account.
	 * @param accountNumber The account number.
	 * @param amount The amount to be withdrawn.
	 * @throws BankAccountException If there's an issue with the withdrawal operation.
	 */
	public void withdraw(String accountNumber, double amount) throws BankAccountException {
		Account account = getAccount(accountNumber);
		account.withdraw(amount);
	}

	public static void main(String[] args) {
		Bank bank = new Bank();

		// 创建账户
		Account alice = new Account.Builder().clientName("Alice").accountNumber("001").balance(1000).build();
		Account bob = new Account.Builder().clientName("Bob").accountNumber("002").balance(500).build();
		Account charlie = new Account.Builder().clientName("Charlie").accountNumber("003").balance(0).build();

		bank.addAccount(alice);
		bank.addAccount(bob);
		bank.addAccount(charlie);

		try {
			bank.deposit("001", 100);
		} catch (BankAccountException e) {
			System.out.println(e.getMessage());
		}


		try {
			bank.deposit("002", 600);
		} catch (BankAccountException e) {
			System.out.println(e.getMessage());
		}

		try {
			bank.deposit("003", -50);
		} catch (BankAccountException e) {
			System.out.println(e.getMessage());
		}

		try {
			bank.withdraw("001", 100);
		} catch (BankAccountException e) {
			System.out.println(e.getMessage());
		}

		try {
			bank.withdraw("002", 600);
		} catch (BankAccountException e) {
			System.out.println(e.getMessage());
		}

		try {
			bank.withdraw("003", 50);
		} catch (BankAccountException e) {
			System.out.println(e.getMessage());
		}
	}
}
/**
 * Generic exception for bank account-related issues.
 * from exception_inheritance
 */
class Account {
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;

	private String clientName;
	private String accountNumber;
	private double balance; // current amount saved in the bank account

	private Account() {
	};

	private Account(Builder builder) {
		this.clientName = builder.clientName;
		this.accountNumber = builder.accountNumber;
		this.balance = builder.balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getClientName() {
		return clientName;
	}

	@Override
	public String toString() {
		return "Client Name: " + clientName + "\n" + "Account Number: " + accountNumber + "\n" + "Balance: " + balance;
	}

	public static class Builder {
		private String clientName;
		private String accountNumber;
		private double balance;

		public Builder clientName(String clientName) {
			this.clientName = clientName;
			return this;
		}

		public Builder accountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public Builder balance(double balance) {
			this.balance = balance;
			return this;
		}

		public Account build() {
			return new Account(this);
		}
	}

	/** method - deposit money */
	public void deposit(double depositAmount) throws BankAccountException {
		System.out.println("Client: " + getClientName() + '\n' + "Balance:" + getBalance());
		/* invalid amount */
		if (depositAmount < 0) {
			throw new InvalidAmountException("The amount you are deposited is negative.");
		}
		/* Exceeding limit */
		else if (depositAmount > depositLimit) {
			throw new DepositLimitException("The deposit amount exceed the limit.");
		} else {
			balance += depositAmount;
			System.out.println("Successful deposit! " + "Current Balance:" + getBalance());
		}
	}

	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) throws BankAccountException {
		System.out.println("Client: " + getClientName() + '\n' + "Balance:" + getBalance());

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
			System.out.println("Successful withdrawal! " + "Current Balance:" + getBalance());
		}
	}
}

class BankAccountException extends Exception {
	private static final long serialVersionUID = -4448804263089658430L;

	public BankAccountException(String message) {
		super(message);
	}
}

class InvalidAmountException extends BankAccountException {
	private static final long serialVersionUID = -2430005435250944040L;

	public InvalidAmountException(String message) {
		super(message);
	}
}

class NotEnoughBalanceException extends BankAccountException {
	private static final long serialVersionUID = -4214449169763109486L;

	public NotEnoughBalanceException(String message) {
		super(message);
	}
}

class WithdrawLimitException extends BankAccountException {
	private static final long serialVersionUID = -5327168349560183387L;

	public WithdrawLimitException(String message) {
		super(message);
	}
}

class DepositLimitException extends BankAccountException {
	private static final long serialVersionUID = 3656549092259334437L;

	public DepositLimitException(String message) {
		super(message);
	}
}
