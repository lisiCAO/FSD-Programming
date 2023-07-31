package Lisi;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your marks:");
		double mark = kb.nextDouble();
		if (mark < 25) {
			System.out.println("F");
		} else if (mark > 25 && mark < 45) {
			System.out.println("E");
		} else if (mark > 45 && mark < 50) {
			System.out.println("D");
		} else if (mark > 50 && mark < 60) {
			System.out.println("C");
		} else if (mark > 60 && mark < 80) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		kb.close();
	}

}
