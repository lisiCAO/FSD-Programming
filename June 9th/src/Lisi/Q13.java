package Lisi;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = kb.nextInt();
		System.out.println("Enter b :");
		int b = kb.nextInt();
		System.out.println("Enter c :");
		int c = kb.nextInt();
		double d = b * b - 4 * a * c;
		if (d >= 0) {
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("The roots are " + root1 + " and " + root2);
		} else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-d) / (2 * a);
			System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and " + realPart + " - "
					+ imaginaryPart + "i");
		}
		kb.close();
	}

}
