package Lisi;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the age of Ram");
		int a = kb.nextInt();
		System.out.println("enter the age of Shyam");
		int b = kb.nextInt();
		System.out.println("enter the age of Ajay");
		int c = kb.nextInt();
		int min;
		min = ( a < b) ? a : b;
		min = (min < c) ? min : c;
		System.out.println( "the yongest is :" + min);
		kb.close();
	}

}
