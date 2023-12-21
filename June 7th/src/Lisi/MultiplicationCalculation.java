package Lisi;

import java.util.Scanner;

public class MultiplicationCalculation {

	public static <T extends Number> double multiplyNumbers(T[] arr) {
		double product = 1; // 乘法的初始值
		for (T number : arr) {
			product *= number.doubleValue();
		}
		return product;
	}

	public static <T extends Number> void printMultiplicationResult(T[] arr) {
		System.out.println("We are going to multiply " + arr.length + " numbers.");
		int count = 1;
		for (T number : arr) {
			System.out.println("Number " + count + ": " + number);
			count++;
		}
		System.out.println("The product of the numbers: " + multiplyNumbers(arr));
	}

	/**
	 * This method is used to get the number from user
	 * 
	 * @param kb is a Scanner object
	 * @return the number from user
	 * @exception NumberFormatException if the input is not a number
	 */
	public static Number getNumberFromUser(Scanner kb) {
		while (true) {
			try {
				String input = kb.nextLine();
				if (input.contains(".")) {
					return Double.parseDouble(input);
				} else {
					return Integer.parseInt(input);
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter a valid number.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("How many number do you want to add?");
		int index = Integer.parseInt(getNumberFromUser(kb).toString());
		Number[] arrNum = new Number[index]; // create an array of numbers

		for (int i = 0; i < index; i++) {
			System.out.println("What is #" + (i + 1) + " number?");
			arrNum[i] = getNumberFromUser(kb); // get the number from user
		}

		printMultiplicationResult(arrNum); // print the result
		kb.close();
		System.exit(0);
	}
}
