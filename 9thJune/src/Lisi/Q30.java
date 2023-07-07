package Lisi;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the time taken by the worker (in hours): ");
		int a = kb.nextInt();

		if (a >= 2 && a < 3) {
			System.out.println("The worker is highly efficient.");
		} else if (a >= 3 && a < 4) {
			System.out.println("The worker is ordered to improve speed.");
		} else if (a >= 4 && a <= 5) {
			System.out.println("The worker is given training to improve speed.");
		} else if (a > 5) {
			System.out.println("The worker has to leave the company.");
		} else {
			System.out.println("Invalid time input.");
		}
		kb.close();
	}

}
