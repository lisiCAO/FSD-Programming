package ExceptionExample;

import java.util.Scanner;

public class Example3 {

	public static double div(double x,double y) throws Exception {
		double result;
		System.out.println("this is div");
		if(y==0) {
			throw new Exception("Error , you cant div by zero");
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
			div(num1,num2);
		}catch(Exception e) {
			String s = e.getMessage();
			System.out.println(s);
		}
		
	}

}