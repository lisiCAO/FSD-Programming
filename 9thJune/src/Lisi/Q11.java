package Lisi;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter side 1 of the triangle:");
		double a = kb.nextDouble();

		System.out.println("Enter side 2 of the triangle:");
		double b = kb.nextDouble();

		System.out.println("Enter side 3 of the triangle:");
		double c = kb.nextDouble();

		if (a + b > c && a + c > b && c + b > a) {
			System.out.println("The triangle is valid.");
		} else {
			System.out.println("The triangle is not valid.");
		}
		kb.close();
	}

}
