package ExceptionExample;

import java.util.Scanner;

class DivisionByZeroException extends Exception {
	public DivisionByZeroException() {
		super("Error, Divition by zero detected can not do it");
	}
	public DivisionByZeroException(String s) {
		super(s);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
	
}

class ResultAlwaysZero extends Exception{
	public ResultAlwaysZero() {
		super("obvious , result is always zero");
	}
	public ResultAlwaysZero(String s) {
		super(s);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}


public class Example4 {
	
	public static double divided(double x, double y) throws DivisionByZeroException,ResultAlwaysZero{
		double result;
		System.out.println("this is div");
		if(y==0) {
			throw new DivisionByZeroException("Error, div by zero not accepted");
		}else if(x == 0) {
			throw new ResultAlwaysZero();
		}else {
			result = x / y;
			System.out.println("the result is " + result);
			return result;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me 2 number");
		double num1 = kb.nextDouble();
		double num2 = kb.nextDouble();
		
		
		try {
			divided(num1,num2);
			
		}catch(DivisionByZeroException e) {
			String s = e.getMessage();
			System.out.println(s);
			
		}catch(ResultAlwaysZero e) {
			String s = e.getMessage();
			System.out.println(s);
		}
	}

}
