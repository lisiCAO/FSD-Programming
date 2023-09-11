package project;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------ This is a program for question 2 ------------");
		System.out.println(
				"Descprition: joker Boom Boom - give a joker and certain numbers, and then compare the numbers with joker");
		System.out.println();

		Scanner kb = new Scanner(System.in);
		System.out.println("Joker:");
		int joker = kb.nextInt();
		System.out.println("Number:");
		int n = kb.nextInt();
		System.out.println("Enter numbers:");
		int[] number = new int[n];
		for (int i = 0; i < n; i++) {
			number[i] = kb.nextInt();
		}
		System.out.println();
		int[] result = deductNumber(joker, number, n);
		for (int num : result) {
			System.out.print(num + " ");
		}
		kb.close();
		System.exit(0);
	}

	public static int[] deductNumber(int joker, int[] number, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			while (number[i] >= joker) {
				number[i] = number[i] - joker;
			}
			result[i] = number[i];
			}
		return result;
	}
}
