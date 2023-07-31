package Lisi;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Side-1:");
		double a = kb.nextDouble();

		System.out.println("Enter Side-1:");
		double b = kb.nextDouble();

		System.out.println("Enter Side-1:");
		double c = kb.nextDouble();
		System.out.println("The area of the triangle is " + calculate_triangle(a, b, c));
		kb.close();
		System.exit(0);
	}

	public static double calculate_triangle(double a, double b, double c) {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return area;
	}
}
