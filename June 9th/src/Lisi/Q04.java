package Lisi;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = kb.nextInt();
		if (a % 5 == 0 && a % 11 == 0) {
			System.out.println("The number you entered is divisible.");
		} else {
			System.out.println("The number you entered is not divisible.");
		}
		kb.close();
	}
}
