package Pargol;

import java.util.Scanner;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String mytxt = "Hi I am Lisi I am a student";
//
//System.out.println(mytxt);
//
//int x = 8;
//int y = 19;
// Math.max(x, y);
// double w,z;
// w = 93.4;
// z = 22.5832;
// System.out.println(Math.max(x,y));
// System.out.println(Math.max(w,z));

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double val1 = kb.nextDouble();

		System.out.println("Enter the second number:");
		double val2 = kb.nextDouble();
		System.out.println("Enter the third number:");
		double val3 = kb.nextDouble();
		double max1 = Math.max(val1, val2);
		double min1 = Math.min(val2, max1);
		double max2 = Math.max(max1, val3);
		double min2 = Math.min(min1, val3);

		System.out.println(Math.max(val1, val2));
		System.out.println(Math.min(val1, val2));

	}

}
