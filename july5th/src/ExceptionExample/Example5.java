package ExceptionExample;

import java.util.Scanner;

public class Example5 {
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me 2 numbers");
		double num1 = kb.nextDouble();
		double num2 = kb.nextDouble();
		
		try {
			divided(num1, num2);
		}catch(DivisionByZeroExcetion e) {
			String s = e.getMessage();
			System.out.println(s);
			System.out.println("Please give me 2 number");
			try {
				System.out.println("Please give me 2 number");
				double num1 = kb.nextDouble();
				double num2 = kb.nextDouble();
				divided(num1, num2);
			}catch(DvisionByZeroException e2) {
				String s = e.getMessage();
				System.out.println(s);
			}catch(ResultAlwaysZero e3) {
				String s = e.getMessage();
				System.out.println(s);
			}
		}catch(ResultAlwaysZero e) {
			String s = e.getMessage();
			System.out.println(s);
		}

	}

}
