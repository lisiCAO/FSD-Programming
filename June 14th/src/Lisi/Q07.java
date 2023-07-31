package Lisi;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = kb.nextInt();
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println("the factorial number of the value is " + factorial);

	}

}
