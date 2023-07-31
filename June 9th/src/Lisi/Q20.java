package Lisi;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the basic salary:");
		double basicSalary = kb.nextDouble();

		double HRA, DA;

		if (basicSalary < 1500) {
			HRA = basicSalary * 0.10;
			DA = basicSalary * 0.90;
		} else {
			HRA = 500;
			DA = basicSalary * 0.98;
		}

		double grossSalary = basicSalary + HRA + DA;

		System.out.println("The gross salary of the employee is: " + grossSalary);
		kb.close();
	}

}
