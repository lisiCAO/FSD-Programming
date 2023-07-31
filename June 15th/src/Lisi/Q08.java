package Lisi;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("give me a number to check whether it is prime: ");
		int x = kb.nextInt();
		boolean isPrime = isPrime(x);
		if (isPrime) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
		kb.close();
	}

	public static boolean isPrime(int x) {
		if (x <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
