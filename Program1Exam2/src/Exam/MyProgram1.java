package Exam;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = kb.next(); // obtain a word from user;
		System.out.println();

		producePattern(word); // return the result

		kb.close();
		System.exit(0);
	}

	public static void producePattern(String word) {
		char array[] = word.toCharArray(); // transfer String word to Char array
		// the total rows is n * 2 - 1;
		for (int i = 0; i < array.length * 2; i++) {

			// the upper part
			if (i < array.length) {
				for (int j = 0; j < array.length - i; j++) {
					System.out.print(array[j] + "\t");
				}

				// the lower part
			} else {
				for (int j = 0; j <= i - array.length; j++) { // for lower part, it starts with 2 letter.
					System.out.print(array[j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
