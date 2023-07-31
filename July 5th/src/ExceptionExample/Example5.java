package ExceptionExample;

import java.util.Scanner;

class DivisionByZeroException2 extends Exception {
	public DivisionByZeroException2() {
		super("Error, Divition by zero detected can not do it");
	}
	public DivisionByZeroException2(String s) {
		super(s);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
	
}

class ResultAlwaysZero2 extends Exception{
	public ResultAlwaysZero2() {
		super("obvious , result is always zero");
	}
	public ResultAlwaysZero2(String s) {
		super(s);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}

public class Example5 {
	public static double divided(double x, double y) throws DivisionByZeroException2,ResultAlwaysZero2{
		double result;
		System.out.println("this is div");
		if(y==0) {
			throw new DivisionByZeroException2("Error, div by zero not accepted");
		}else if(x == 0) {
			throw new ResultAlwaysZero2();
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
		}catch(DivisionByZeroException2 e) {
			String s = e.getMessage();
			System.out.println(s);
			System.out.println("you have another try");
			try {
				System.out.println("Please give me 2 number");
				num1 = kb.nextDouble();
				num2 = kb.nextDouble();
				divided(num1,num2);
			}catch(DivisionByZeroException2 e2) {
				s = e.getMessage();
				System.out.println(s);
				
			}catch(ResultAlwaysZero2 e3) {
				s = e.getMessage();
				System.out.println(s);
			}
			
		}catch(ResultAlwaysZero2 e) {
			String s = e.getMessage();
			System.out.println(s);
		}
		finally {
			System.out.println("this is my finnaly block");
		}
		
		
		
	}

}
