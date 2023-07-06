package ExceptionExample;

import java.util.Scanner;

class DivisionByZeroException extends Exception{
	public DivisionByZeroException() {
		super("Error");
	}
	public DivisionByZeroException(String s) {
		super(s);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}

class ResultAlwasZero extends Exception {
	public ResultAlwasZero() {
		super("obvious, result is always zero");
	}
	public ResultAlwasZero(String s) {
		super(s);
	}
	public String getMessage() {
		return super.getMessage();
	}
}
public class Example4 {
	public static double divided(double x, double y) throws DivisionByZeroException, ResultAlwasZero{
		double result;
		System.out.println("this is div");
		if(y == 0) {
			throw new DivisionByZeroException("Error, div by zero not accepted");
		}else if(x == 0) {
			throw new ResultAlwasZero("Rsult is always zero");
		}else {
			result  = x / y;
			System.out.println("the result is " + result);
		}return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me 2 numbers");
		double num1 = kb.nextDouble();
		double num2 = kb.nextDouble();
		
		try{
			divided(num1, num2);
		}catch(DivisionByZeroException e) {
			String s = e.getMessage();
			System.out.println(s);
		}catch(ResultAlwasZero e) {
			String s = e.getMessage();
			System.out.println(s);
		}
		
	}

}
