package Lisi;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = kb.nextInt();
		if (a % 5 == 0) {
			System.out.println(a + " is a multiple of 5.");
		} else {
			System.out.println(a + " is not a multiple of 5.");
		}
		kb.close();
	}

}
