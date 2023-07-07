package Lisi;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = kb.nextInt();
		if(a % 2 == 0) {
			System.out.println("This number is even.");
		}else {
			System.out.println("This number is odd.");
		}
		kb.close();
	}

}
