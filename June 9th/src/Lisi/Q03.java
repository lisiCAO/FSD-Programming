package Lisi;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the lbs of Carrots:");
		double num1 = kb.nextDouble();
		System.out.println("Enter the lbs of Onions:");
		double num2 = kb.nextDouble();
		System.out.println("Enter the lbs of Meat:");
		double num3 = kb.nextDouble();
		double total = num1 * 2 + num2 * 4 + num3 * 10;
		double totalTax = total * 1.13;

		System.out.println("Enter the number of the method of payment: 1. cash ; 2. card");
		int payment = kb.nextInt();
		if (payment == 1) {
			System.out.println("%\n--------invoice---------");
			System.out.printf("%8s %8s %8s\n", "Name", "price", "lbs");
			System.out.printf("%8s %8.2f %8.2f\n", "Carrots", 2.0, num1);
			System.out.printf("%8s %8.2f %8.2f\n", "Onions", 4.0, num2);
			System.out.printf("%8s %8.2f %8.2f\n", "Meat", 10.0, num3);
			System.out.printf("%8s %8.2f\n", "Total", total);

		} else {
			System.out.println("%\n--------invoice---------");
			System.out.printf("%8s %8s %8s\n", "name", "price", "lbs");
			System.out.printf("%8s %8.2f %8.2f\n", "Carrots", 2.0, num1);
			System.out.printf("%8s %8.2f %8.2f\n", "Onions", 4.0, num2);
			System.out.printf("%8s %8.2f %8.2f\n", "Meat", 10.0, num3);
			System.out.printf("%8s %8.2f\n", "Total", totalTax);
		}
		kb.close();
	}

}
