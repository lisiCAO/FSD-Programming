package Lisi;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter five-digit number");
		int num = kb.nextInt();
		int original = num;
		int reverse = 0;

		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed Number: " + reverse);
		if (original == reverse) {
			System.out.println("The original and reversed number are equal.");
		} else {
			System.out.println("The original and reversed number are not equal.");
		}
		kb.close();

	}

}
