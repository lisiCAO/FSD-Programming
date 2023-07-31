package Lisi;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("length of the rectangle: ");
		double length = kb.nextDouble();
		System.out.println("breadth of the rectangle: ");
		double breadth = kb.nextDouble();
		if (length == breadth) {
			System.out.println("this is square");

		} else {
			System.out.println("this is not square");
		}
		kb.close();
	}

}
