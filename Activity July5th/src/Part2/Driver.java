package Part2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("lisi", 6000);
		try {
			account.deposit(6000);
		}catch(BankAccountException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			account.withdraw(5000);
		}catch(WithdrawLimitException e) {
			System.out.println("WithdrawLimitException: " + e.getMessage());
		} catch (BankAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
