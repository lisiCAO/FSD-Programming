package pargol;

import java.util.Scanner;

public class MyProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Give me your num: ");
		int num = kb.nextInt();
		if (num % 2 == 0) {
			System.out.println("your num is even");
		} else {
			System.out.println("your num is odd");
		}
		
	}

}
