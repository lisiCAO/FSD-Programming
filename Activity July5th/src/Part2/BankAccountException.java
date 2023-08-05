package Part2;

public class BankAccountException extends Exception{
	private static final long serialVersionUID = -4448804263089658430L;

	public BankAccountException(String message){
		super(message);
	}
}
class InvalidAmountException extends BankAccountException{
	private static final long serialVersionUID = -2430005435250944040L;

	public InvalidAmountException(String message){
		super(message);
	}
}

class NotEnoughBalanceException  extends BankAccountException{
	private static final long serialVersionUID = -4214449169763109486L;

	public NotEnoughBalanceException(String message){
		super(message);
	}
}

class WithdrawLimitException extends BankAccountException{
	private static final long serialVersionUID = -5327168349560183387L;

	public WithdrawLimitException(String message){
		super(message);
	}
}

class DepositLimitException extends BankAccountException{
	private static final long serialVersionUID = 3656549092259334437L;

	public DepositLimitException(String message){
		super(message);
	}
}
/*
public class BankAccountException extends Exception {
    private final ErrorCode errorCode;

    public BankAccountException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public enum ErrorCode {
        INVALID_AMOUNT,
        NOT_ENOUGH_BALANCE,
        WITHDRAW_LIMIT_EXCEEDED,
        DEPOSIT_LIMIT_EXCEEDED
    }
  
*/
