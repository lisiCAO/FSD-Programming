package Lisi;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = kb.nextInt();
		System.out.println("Enter the second number : ");
		int b = kb.nextInt();
		System.out.println("Enter the third number : ");
		int c = kb.nextInt();
		if (a > b && b > c) {
			System.out.println("decreasing");
		} else if (a < b && b < c) {
			System.out.println("increasing");
		} else {
			System.out.println("irregular");
		}
		kb.close();

	}

}
