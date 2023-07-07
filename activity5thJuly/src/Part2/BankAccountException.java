package Part2;

public class BankAccountException extends Exception{
	public BankAccountException(String message){
		super(message);
	}
}
class InvalidAmountException extends BankAccountException{
	public InvalidAmountException(String message){
		super(message);
	}
}

class NotEnoughBalanceException  extends BankAccountException{
	public NotEnoughBalanceException(String message){
		super(message);
	}
}

class WithdrawLimitException extends BankAccountException{
	public WithdrawLimitException(String message){
		super(message);
	}
}

class DepositLimitException extends BankAccountException{
	public DepositLimitException(String message){
		super(message);
	}
}
