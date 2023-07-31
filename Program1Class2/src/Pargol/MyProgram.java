package Pargol;

import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int val1, val2;
		System.out.println("Please give me the first num?");
		val1 = kb.nextInt();
		System.out.println("Please give me the second num?");
		val2 = kb.nextInt();
		System.out.println("Your first value is " + val1);
		System.out.println("Your second value is " + val2);
		int add, sub, mult, div, mod;
		add = val1 + val2;
		sub = val1 - val2;
		mult = val1 * val2;
		div = val1 / val2;

		System.out.println("the addition in int is " + add);
		System.out.println("the substration in int is " + sub);
		System.out.println("the mult in int is " + mult);
		System.out.println("the divition in int is " + div);
		double dval1, dval2;
		System.out.println("Please give me the first double num?");
		dval1 = kb.nextInt();
		System.out.println("Please give me the second double num?");
		dval2 = kb.nextInt();
		System.out.println("Your first double value is " + dval1);
		System.out.println("Your second double value is " + dval2);
		System.out.println("===============");

		double dadd, dsub, dmult, ddiv, dmod;
		dadd = dval1 + dval2;
		dsub = dval1 - dval2;
		dmult = dval1 * dval2;
		ddiv = dval1 / dval2;
	}

}
