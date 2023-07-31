package Lisi;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("This is a pentagon's area calculation! ");
		System.out.println("Enter the number of sides: ");
		int numSides = kb.nextInt();
		System.out.println("Enter the length of the side: ");
		double sides = kb.nextDouble();
		System.out.println("The area of the pentagon is " + area(numSides, sides));
		kb.close();
		System.exit(0);
	}

	public static double area(int numSides, double sides) {
		return numSides * sides * apothem(numSides, sides) / 2;

	}

	public static double apothem(double numSides, double sides) {
		return sides / (2 * Math.tan(Math.PI / numSides));
	}
}
