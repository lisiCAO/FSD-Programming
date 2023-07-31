package Lisi;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your grade:(E, V, G, A, F)");
		char a = kb.next().charAt(0);
		switch (a) {

		case 'E':
			System.out.println("You have chosen :Excellent");
			break;
		case 'e':
			System.out.println("You have chosen :Excellent");
			break;
		case 'V':
			System.out.println("You have chosen :Very Good");
			break;
		case 'v':
			System.out.println("You have chosen :Very Good");
			break;
		case 'G':
			System.out.println("You have chosen :Good");
			break;
		case 'g':
			System.out.println("You have chosen :Good");
			break;
		case 'A':
			System.out.println("You have chosen :Average");
			break;
		case 'a':
			System.out.println("You have chosen :Average");
			break;
		case 'F':
			System.out.println("You have chosen :Fail");
			break;
		case 'f':
			System.out.println("You have chosen :Fail");
			break;
		default:
			System.out.println("Error");

		}
	}

}
