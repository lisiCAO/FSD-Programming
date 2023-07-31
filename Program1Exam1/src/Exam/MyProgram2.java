package Exam;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Could you please enter a SINGLE letter from the alphabet (between a and z or A and Z)?");
		String letter = kb.next();

		while (letter.length() > 1) {
			System.out.println("Error, please enter ONE letter.");
			letter = kb.next();
		}
		while (!Character.isLetter(letter.charAt(0))) {
			System.out.println("Error, Please enter a letter from the alphabet (between a and z or A and Z)");
			letter = kb.next();
		}

		if (Character.isLetter(letter.charAt(0)) && letter.length() == 1) {
			if ("a".equalsIgnoreCase(letter)) {
				System.out.println("Input letter is Vowel");
			} else if ("e".equalsIgnoreCase(letter)) {
				System.out.println("Input letter is Vowel");
			} else if ("i".equalsIgnoreCase(letter)) {
				System.out.println("Input letter is Vowel");
			} else if ("u".equalsIgnoreCase(letter)) {
				System.out.println("Input letter is Vowel");
			} else if ("o".equalsIgnoreCase(letter)) {
				System.out.println("Input letter is Vowel");
			} else {
				System.out.println("Input letter is Consonant");
			}
		} else {
			System.out.println("Error");
		}
		kb.close();
		System.exit(0);
	}

}
