/*
 * Purpose: declare special bank exceptions.
 * Script date: August, 2023
 * Author: Lisi Cao 
 */


package exception_inheritance;

public class Driver {

	public static void main(String[] args) {

		/** create two bank account objects */
		BankAccount account = new BankAccount("lisi", 6000);
		BankAccount account2 = new BankAccount("Alex", 30);

		/** test1: deposit 6000 to account 1 */
		try {
			account.deposit(6000);
		} catch (BankAccountException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("**************************** \n");

		/** test2: withdraw 5000 to account 1 */
		try {
			account.withdraw(5000);
		} catch (WithdrawLimitException e) {
			System.out.println("Withdraw Limit: " + e.getMessage());
		} catch (NotEnoughBalanceException e) {
			System.out.println("NotEnoughBalanceException:" + e.getMessage());
		} catch (InvalidAmountException e) {
			System.out.println("InvalidAmountException:" + e.getMessage());
		} catch (BankAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("**************************** \n");
		/** test3: withdraw -500 to account 1 */
		try {
			account.withdraw(-500);
		} catch (BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("**************************** \n");
		/** test4: withdraw 50 from account 2 */
		try {
			account2.withdraw(50);
		} catch (BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("****************************\n");

		/** test5: withdraw 20 from account 2 */
		try {
			account2.withdraw(20);
		} catch (BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("**************************** \n");

		/** test6: deposit 200 to account 2 */
		try {
			account2.deposit(200);
		} catch (BankAccountException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.exit(0);
	}

}
