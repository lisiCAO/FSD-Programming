package Lisi;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter three integers to check whether there is a midpoint: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		boolean is_midpoint = check_midpoint(a, b, c);
		if (is_midpoint) {
			System.out.print("Three numbers have midpoint");
		} else {
			System.out.print("Three numbers have not midpoint");

		}
		kb.close();
	}

	public static boolean check_midpoint(int a, int b, int c) {
		if (a == (b + c) / 2 || b == (a + c) / 2 || c == (a + b) / 2) {
			return true;
		}
		return false;
	}
}
