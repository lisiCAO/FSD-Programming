package Lisi;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12. Write a Java method to display the factors of 3 in a given integer. ");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a integer");
		int integer = kb.nextInt();
		display_factorOf3(integer);
		kb.close();
		System.exit(0);
	}

	public static void display_factorOf3(int integer) {
		StringBuilder factors = new StringBuilder();
		int number = integer;
		while (number % 3 == 0) {
			factors.append("3 * ");
			number = number / 3;
		}
		int rest = number % 3;
		factors.append(rest);
		System.out.println(integer + " = " + factors);
	}
}
