package Lisi;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first angle: ");
		int a = kb.nextInt();
		System.out.println("Enter the second angle: ");
		int b = kb.nextInt();
		System.out.println("Enter the third angle: ");
		int c = kb.nextInt();
		if (a + b + c == 180) {
			System.out.println("triangle is valid");
		} else {
			System.out.println("triangle is note valid");
		}kb.close();
	}

}
