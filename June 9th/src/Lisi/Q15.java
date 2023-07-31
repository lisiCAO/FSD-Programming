package Lisi;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		final int GRADE = 100;
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter marks for Physics :");
		int a = kb.nextInt();
		System.out.println("Enter marks for Chemistry :");
		int b = kb.nextInt();
		System.out.println("Enter marks for Biology :");
		int c = kb.nextInt();
		System.out.println("Enter marks for Mathematics :");
		int d = kb.nextInt();
		System.out.println("Enter marks for Computer :");
		int e = kb.nextInt();
		int total = a + b + c + d + e;
		float percentage = total / 500;
		if (percentage >= 90) {
			System.out.println("Grade: A");
		} else if (percentage >= 80) {
			System.out.println("Grade: B");
		} else if (percentage >= 70) {
			System.out.println("Grade: C");
		} else if (percentage >= 60) {
			System.out.println("Grade: D");
		} else if (percentage >= 40) {
			System.out.println("Grade: E");
		} else {
			System.out.println("Grade: F");
		}
		kb.close();
	}
}
