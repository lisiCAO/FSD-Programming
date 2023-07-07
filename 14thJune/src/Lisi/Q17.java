package Lisi;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = kb.nextInt();
		for (int i = 1; i <= 10; i++) {
			int b = a * i;
			System.out.println(a + " * " + i + " = " + b);
		}
	}

}
