package Lisi;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("give me a Fahrenhei degree:");
		double f = kb.nextDouble();
		double c = (f - 32) * 5 / 9;
		System.out.printf("convert temperature from Fahrenheit to Celsius degree : %.2f", c);
	}

}
