package Lisi;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number of terms: ");

		int a = kb.nextInt();
		int num = 0;
		int sum = 0;
		for (int i = 0; i < a; i++) {
			num = num * 10 + 1;
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
