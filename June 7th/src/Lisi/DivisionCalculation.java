package Lisi;

import java.util.Scanner;

public class DivisionCalculation {

	public static <T extends Number> double divideNumbers(T[] arr) {
		if (arr.length == 0)
			return 0;

		double result = arr[0].doubleValue();

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].doubleValue() == 0) {
				System.out.println("Warning: Division by zero!");
				return Double.NaN; // 返回 NaN，表示结果未定义
			}
			result /= arr[i].doubleValue();
		}

		return result;
	}

	public static <T extends Number> void printDivisionResult(T[] arr) {
		System.out.println("We are going to divide " + arr.length + " numbers sequentially.");
		int count = 1;
		for (T number : arr) {
			System.out.println("Number " + count + ": " + number);
			count++;
		}
		System.out.println("The result of the division: " + divideNumbers(arr));
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

		printDivisionResult(arrNum); // print the result
		kb.close();
		System.exit(0);
	}
}
