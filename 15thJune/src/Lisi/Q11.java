package Lisi;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java method for extracting the first digit from a positive or negative integer. ");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = kb.nextInt();
		System.out.println("Extract the first digit from the said integer: " + extract_1(x));
		kb.close();
	}

	public static int extract_1(int x) {
		x = Math.abs(x);
		while (x >= 10) {
			x = x / 10;
		}
		return x;
	}
}
