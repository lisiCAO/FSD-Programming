package Lisi;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = kb.nextInt();
		System.out.println("Enter the second number:");
		int num2 = kb.nextInt();
		System.out.println("Enter the third number:");
		int num3 = kb.nextInt();
		System.out.println("Enter the fouth number:");
		int num4 = kb.nextInt();
		int max1 = Math.max(num1, num2);
		int max2 = Math.max(num3, num4);
		int max3 = Math.max(max1, max2);
				
		System.out.println(max3);
		kb.close();
	}

}
