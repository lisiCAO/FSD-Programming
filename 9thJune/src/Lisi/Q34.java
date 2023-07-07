package Lisi;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double a = kb.nextDouble();
		System.out.println("Enter the second number : ");
		double b = kb.nextDouble();
		System.out.println("Enter an operator ");
		String operator = kb.next();
		kb.close();
		double output;
		switch (operator) {
		case "+":
			output = a + b;
			break;
		case "-":
			output = a - b;
			break;
		case "*":
			output = a * b;
			break;
		case "/":
			if (b != 0) {
				output = a / b;
			} else {
				System.out.println("Error");
				return;
			}

			break;
		default:
			System.out.println("You have entered wrong operator");
			return;
		}
		System.out.printf("%.1f %s %.1f = %.1f\n", a, operator, b, output);
		
	}

}
