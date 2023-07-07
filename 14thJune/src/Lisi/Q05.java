package Lisi;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// a * x * x + b * x + c = 0
		System.out.println("Please give three variables, a , b, c : ");
		Scanner kb = new Scanner(System.in);
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		double d = b * b - 4 * a * c;
		if (d > 0) {
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("The root is" + root1 + "/" + root2);
		} else if (d == 0) {
			double root = -b / (2 * a);
			System.out.println("The root of the quadratic equation is " + root);
		} else {
			System.out.println("The quadratic equation has no real roots.");
		}
	}
}
