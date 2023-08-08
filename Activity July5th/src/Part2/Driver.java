package Part2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("lisi", 6000);
		BankAccount account2 = new BankAccount("Alex", 30);
		try {
			account.deposit(6000);
			System.out.println("The amount to be deposit: " + 6000);
		}catch(BankAccountException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("**************************** \n");
		
		try {
			account.withdraw(5000);
			System.out.println("The amount to be withdraw: " + 5000);
		}catch(WithdrawLimitException e) {
			System.out.println("Withdraw Limit: " + e.getMessage());
		}catch(NotEnoughBalanceException e) {
			System.out.println("NotEnoughBalanceException:" + e.getMessage());
		}catch(InvalidAmountException e) {
			System.out.println("InvalidAmountException:" + e.getMessage());
		} catch (BankAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("**************************** \n");
		
		try {
			account.withdraw(-500);
		}catch(BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("**************************** \n");
		
		try {
			account.deposit(-500);
		}catch(BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("**************************** \n");
		
		try {
			account2.withdraw(50);
		}catch(BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("****************************\n");
		try {
			account2.withdraw(20);
		}catch(BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("**************************** \n");
		try {
			account2.deposit(200);
		}catch(BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
