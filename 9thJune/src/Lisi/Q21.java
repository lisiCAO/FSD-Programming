package Lisi;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("ENter marks for 5 subjects");
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += kb.nextInt();
		}
		double percentage = sum / 5;

		if (percentage >= 60) {
			System.out.println("First division");
		} else if (percentage >= 50) {
			System.out.println("Second division");
		} else if (percentage >= 40) {
			System.out.println("Third division");
		} else {
			System.out.println("Fail");
		}
		kb.close();
	}

}
