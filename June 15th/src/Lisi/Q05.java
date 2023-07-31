package Lisi;

import java.util.Scanner;
import java.util.Random;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to make a n-by-n matrix:");
		int n = kb.nextInt();
		display_matrix(n);
		kb.close();
	}

	public static void display_matrix(int n) {
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rand.nextInt(2) + " ");
			}
			System.out.println();
		}
	}

}
