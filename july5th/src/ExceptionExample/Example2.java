package ExceptionExample;

import java.util.Scanner;

class DivException extends Exception{
	public DivException() {
		super("Error.. Cant div by zero");
	}
	
	public DivException(String s) {
		super(s);
	}
	
	public String getMessage;
}


public class Example2 {
	public static double div1(double x , double y) {
		double result =  x / y;
		System.out.println("this is div1");
		System.out.println("the result is " + result);
		return result;
	}
	
	public static double div2(double x, double y) {
		System.out.println("this is div2");
		double result;
		if(y != 0) {
			result  = x / y;
			System.out.println("the result is " + result);
			return result;
		}else {
			System.out.println("Will I cant divided");
			return -0;
		}	
	}
	public static double div3(double x, double y) {
		double result;
		System.out.println("this is div3");
		try {
			if(y == 0) {
				throw new DivException();
			}else {
				result = x / y;
				System.out.println("");
				return result;
			}
		}catch(DivException e) {
			String s = e.getMessage;
			System.out.println(s);
			return -0;
			
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.println("Please give me 2 number");
		double num1 =  kb.nextDouble();
		double num2 =  kb.nextDouble();
		try {
			div(num1,num2);
		}
		catch(Exception e) {
			String s = e.getMessage();
			System.out.println(s);
		}
	}

	private static void div(double num1, double num2) {
		// TODO Auto-generated method stub
		double result = num1 - num2;
		System.out.println("the result is " + result);
	}

}
