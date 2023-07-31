package Lisi;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter quantity :");
		int a = kb.nextInt();
		System.out.println("Enter price :");
		int b = kb.nextInt();
		double c;
		if (a > 100) {
			c = a * b * 0.9;
			System.out.println("the total expenses is " + c);
		} else {
			c = a * b;
			System.out.println("the total expenses is " + c);
		}
kb.close();
	}
}
