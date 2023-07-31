package Lisi;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter electricity units :");
		int a = kb.nextInt();
		double total;
		if (a < 50) {
			total = a * 0.50;
			System.out.println("the total costs is " + total);
		} else if (a >= 50 && a < 200) {
			total = 50 * 0.5 + (a - 50) * 0.75;
			System.out.println("the total costs is " + total);
		} else if (a >= 200 && a < 450) {
			total = 50 * 0.5 + 150 * 0.75 + (a - 200) * 1.2;
			System.out.println("the total costs is " + total);
		} else if (a >= 450) {
			total = 50 * 0.5 + 150 * 0.75 + 200 * 1.2 + (a - 450) * 1.5;
			System.out.println("the total costs is " + total);
		}
		kb.close();
	}
}
