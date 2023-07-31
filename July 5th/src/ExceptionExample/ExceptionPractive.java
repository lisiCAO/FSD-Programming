package ExceptionExample;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivisionByZeroException3 extends Exception {
	public DivisionByZeroException3() {
		super("Error, Divition by zero detected can not do it");
	}
	public DivisionByZeroException3(String s) {
		super(s);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
	
}

class ResultAlwaysZero3 extends Exception{
	public ResultAlwaysZero3() {
		super("obvious , result is always zero");
	}
	public ResultAlwaysZero3(String s) {
		super(s);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}

public class ExceptionPractive {
	
	public static double divided(double x, double y) throws DivisionByZeroException3,ResultAlwaysZero3{
		double result;
		System.out.println("this is div");
		if(y==0) {
			throw new DivisionByZeroException3("Error, div by zero not accepted");
		}else if(x == 0) {
			throw new ResultAlwaysZero3();
		}else {
			result = x / y;
			System.out.println("the result is " + result);
			return result;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//you could try your method but keep asking as long as you faced with exception
		
		//while()
		Scanner kb = new Scanner(System.in);
		double d1 = 0, d2 = 0;	
		boolean done = false, valuesAreNumbers = false;
				
		while(!done)
		{
			// First make sure that the user enters two numbers
			while(!valuesAreNumbers)
			{
			 try
			 {
				 System.out.print("Please enter two values to perform a division: ");
				 d1 = kb.nextDouble();
				 d2 = kb.nextDouble();
				 valuesAreNumbers = true;
			 }
			 catch(InputMismatchException e)
			 {
				 kb.nextLine(); // Clear that input line
				 System.out.println("You did not even enter two numbers!enter again: ");
			 }
			}
			// If you reach this point, we do have two numbers
			try
			{
				divided(d1, d2);
				// If you reach this line, then all is okay (no exception was thrown)
				done = true;
			}
			catch(DivisionByZeroException3 e)
			{
				String s = e.getMessage();
				System.out.println(s);
				valuesAreNumbers = false; // Reset that variable, so user can re-enter two values 
			}
			catch(ResultAlwaysZero3 e)
			{
				String s = e.getMessage();
				System.out.println(s);
				done = true;			// Since this is not an error, take it as a valid input and stop
			}
		} 
		
			System.out.print("Program reached last statement.");	

	}

}