package Example8;

public class Account {
	private String name;
	private int accountNum;
	private double balance;
	
	public Account(String n,int an,double b) {
		name = n;
		accountNum = an;
		balance = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int ac) {
		accountNum = ac;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double b) {
		balance = b;
	}
	
	public void deposit(double am) {
		balance = balance + am;
	}
	
	public void withdraw(double am) {
		balance = balance - am;
	}
	
}
