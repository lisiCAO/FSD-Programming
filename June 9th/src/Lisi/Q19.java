package Lisi;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the current year:");
		int currentYear = kb.nextInt();

		System.out.println("Enter the year the employee joined:");
		int joinedYear = kb.nextInt();

		int yearsServed = currentYear - joinedYear;

		if (yearsServed > 3) {
			System.out.println("The employee is eligible for a bonus of Rs. 2500/-");
		} else {
			System.out.println("The employee is not eligible for a bonus.");
		}
		kb.close();
	}

}
