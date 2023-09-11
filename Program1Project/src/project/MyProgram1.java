package project;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------ This is a program for question 1 ------------");
		System.out.println("Descprition: enter 3 2-digit numbers and generate a magic number");
		System.out.println();

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 3 2-digit numbers:");
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		System.out.println();

		int result = generateNum(n1, n2, n3);
		System.out.println("Your magic number is " + result);

		kb.close();
		System.exit(0);

	}

	public static int generateNum(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		int firstDigitN2 = n2 / 10;
		int lastDigitN2 = n2 % 10;
		int sumOfN1N3 = n1 + n3;
		int num = 0;
		int count = String.valueOf(sumOfN1N3).length();

		if (sum % 3 == 0 && sum % 5 != 0) {
			num = (int) (sumOfN1N3 + firstDigitN2 * Math.pow(10, count));
		} else if (sum % 3 != 0 && sum % 5 == 0) {
			num = sumOfN1N3 * 10 + lastDigitN2;
		} else if (sum % 3 == 0 && sum % 5 == 0) {
			num = 1 + n1 * 10 + n2 * 1000;
		} else {
			num = n3 + n2 * 100 + n1 * 10000;
		}
		return num;
	}
}
