package pargol;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me pos num ?");
		int num = kb.nextInt();

		while (num >= 0) {
			sum = sum + num;
			System.out.println("Please give me pos num?");
			num = kb.nextInt();

		}
		System.out.println("the sum of pos num is " + sum);
	}

}
