package Pargol;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float LEGAL_AGE = 18;

		boolean isPargolFun = true;

		System.out.println(isPargolFun);

		int x, y;
		x = -2;
		y = 2;
		boolean comp = x > y;

		System.out.println(x == 9);
//two equals means comparison;
		System.out.println(10 == 9);

		Scanner kb = new Scanner(System.in);
		System.out.println("Give me the first age");
		int age = kb.nextInt();
		System.out.println("if you are bigger than legal age");

	}

}
