package Lisi;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Basic Salary :");
		int a = kb.nextInt();
		double grossSalary, hra, da;
		if (a <= 10000) {
			hra = 0.2 * a;
			da = 0.8 * a;
			grossSalary = a + hra + da;
		} else if (a <= 20000) {
			hra = 0.25 * a;
			da = 0.9 * a;
		} else {
			hra = 0.3 * a;
			da = 0.95 * a;
		}
		grossSalary = a + hra + da;
		System.out.println("The gross salary of the employee is: " + grossSalary);
		kb.close();
	}

}
