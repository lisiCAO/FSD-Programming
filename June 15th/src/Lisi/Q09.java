package Lisi;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter three integers to check whether consecutive: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		boolean is_consecutive = check_consecutive(a, b, c);
		if (is_consecutive) {
			System.out.print("Three numbers are consecutive.");
		} else {
			System.out.print("Three numbers are not consecutive.");
			kb.close();
		}
	}

	public static boolean check_consecutive(int a, int b, int c) {
		if (b == a + 1 && c == b + 1) {
			return true;
		}
		return false;
	}

}
