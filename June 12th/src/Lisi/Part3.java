package Lisi;

import java.util.Random;
import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter your first name: ");
		String firstName = kb.next();
		System.out.println("Please Enter your last name: ");
		String lastName = kb.next();
		System.out.println("Please Enter your age: ");
		int age = kb.nextInt();
		System.out.printf("Hello: %3s, you have %2d year's old; nice to meet you!\n", lastName, age);
		Random a = new Random();
		int num = a.nextInt(50) + 1;
		System.out.println("Please guess a number between 1 and 50");
		int guessNum = kb.nextInt();
		while (guessNum > num) {
			System.out.println("Choose a smaller one, you were unlucky");
			guessNum = kb.nextInt();
		}
		while (guessNum < num) {
			System.out.println("Choose a bigger one, you were unlucky");
			guessNum = kb.nextInt();
		}
		if (guessNum == num) {
			System.out.println("you are lucky");
			System.exit(0);
		}

	}

}
