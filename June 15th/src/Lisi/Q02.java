package Lisi;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("input the investment amount:");
		double amount_investment = kb.nextDouble();
		System.out.println("Input the rate of interest:");
		double interestRate = kb.nextDouble() / 100;
		System.out.println("Input number of years");
		int years = kb.nextInt();
		display_futureValue(amount_investment, interestRate, years);

	}

	public static void display_futureValue(double amount, double rate, int years) {
		System.out.println("years     FutureValue");
		double monthOfRate = rate / 12;

		for (int i = 1; i <= years; i++) {
			double[] futureValue = new double[years + 1];
			futureValue[i] = amount * Math.pow(1 + monthOfRate, i * 12);
			System.out.printf("%5d     %7.2f\n", i, futureValue[i]);
		}
	}

}
