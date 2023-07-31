package Lisi;

import java.util.Scanner;

public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("what is the first number");
		Scanner kb = new Scanner(System.in);
		int num1 = kb.nextInt();
		System.out.println("number 1 = " + num1);

		System.out.println("what is the second number");
		int num2 = kb.nextInt();
		System.out.println("number 2 = " + num2);

		System.out.println("what is the first number");
		int num3 = kb.nextInt();
		System.out.println("number 3 = " + num3);

		int num4 = num1 + num2 + num3;
		System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + num4);
	}

}
