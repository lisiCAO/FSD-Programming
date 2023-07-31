package Lisi;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a year:");
		int a = kb.nextInt();
		if (a % 4 == 0 || a % 400 == 0) {
			System.out.println("This year is leaf.");
		} else {
			System.out.println("This number is not leaf.");
		}
		kb.close();
	}

}
