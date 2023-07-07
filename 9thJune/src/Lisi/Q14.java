package Lisi;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter sales :");
		int a = kb.nextInt();
		System.out.println("Enter costs :");
		int b = kb.nextInt();
		int c = a - b;
		if (c >= 0) {
			System.out.println("Profits is " + c);

		} else {
			System.out.println("Loss is " + -c);
		}
		kb.close();
	}

}
