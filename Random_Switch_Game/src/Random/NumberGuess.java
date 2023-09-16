package Random;

import java.util.Scanner;

public class NumberGuess {

	// Function to give feedback to the user based on their guess.
	public static void checkGuessNumber(int guessNum, int targetNum) {
		if (guessNum > targetNum) {
			System.out.println("Choose a smaller one, you were unlucky");
			return;
		}
		if (guessNum < targetNum) {
			System.out.println("Choose a bigger one, you were unlucky");
			return;
		}
		System.out.println("you are lucky");
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		// Collects user's last name
		System.out.println("Please Enter your last name: ");
		String lastName = kb.next();
		
        // Collects user's age
		System.out.println("Please Enter your age: ");
		int age = kb.nextInt();
		
        // Displays formatted greeting using user's input
		System.out.printf("Hello: %3s, you have %2d year's old; nice to meet you!\n", lastName, age);

		/*
		 * "Hello: %3s, you have %2d year's old; nice to meet you!\n" 是格式化字符串。 %3s:
		 * 这是一个格式说明符，用于格式化字符串（s 表示 string）。 3 表示最小字段宽度。这意味着如果 lastName 的长度少于 3
		 * 个字符，它将用空格填充，以确保总宽度至少为 3 个字符。如果 lastName 的长度超过 3，它将完全显示，不会被截断 %2d:
		 * 这是一个格式说明符，用于格式化整数（d 表示 decimal）。 2 表示最小字段宽度。这意味着如果 age 是一位数（例如
		 * 9），那么它前面会有一个空格。如果 age 是两位数或更多，那么它将按原样显示。 , lastName, age:
		 * 这些是要传入格式字符串的参数。lastName 替换 %3s，age 替换 %2d。 \n：这是一个换行符，用于在打印完成后换行。
		 */

        // Generates a random number between 1 and 50 inclusive
		int targetNum = (int) (Math.random()) * 50 + 1;
		
        // Starts the guessing game
		System.out.println("Please guess a number between 1 and 50");
		int guessNum;
		do {
			guessNum = kb.nextInt(); // Gets user's guess
			checkGuessNumber(guessNum, targetNum); // Check the guess against the target number
		} while (guessNum != targetNum); // Continues as long as the guess is incorrect

		kb.close(); // Closes the scanner
		System.exit(0); // Exits the program
	}
}
