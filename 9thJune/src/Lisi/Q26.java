package Lisi;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number :");
		double a = kb.nextDouble();
		if (a >= 0) {
			System.out.println("the absolute value is " + a);
		} else {
			System.out.println("the absolute value is " + -a);
		}
		kb.close();

	}

}
