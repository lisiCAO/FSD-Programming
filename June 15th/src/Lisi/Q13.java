package Lisi;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"13. Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false. ");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int number = kb.nextInt();
		boolean isEven = checkEven(number);
		if (isEven) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean checkEven(int number) {
		while (number != 0) {
			int x = Math.abs(number) % 10;

			if (x % 2 == 0) {
				number = number / 10;
			} else {
				return false;
			}

		}
		return true;
	}

}
