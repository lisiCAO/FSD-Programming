/*
 * Create a generic method to add numbers of different types. 
 * The method should accept an array of numbers and return the sum of all the numbers.
 * @author Lisi Cao
 * @version 2.0
 * @since 2023-09-23
 * 
 */
package Lisi;

import java.util.Scanner;

public class AddCalculation {
	
    /**
     * This method is used to calculate the sum of numbers
     * @param arr is an array of numbers
     * @return the sum of numbers
     * @exception NumberFormatException if the input is not a number
     */
	public static <T extends Number> double addCalculation(T[] arr) {
		double sum = 0;
		for(T number : arr) {
			sum += number.doubleValue();
		}
		return sum;
		
	}
	
    /**
     * This method is used to print the result
     * @param arr is an array of numbers
     * @exception NumberFormatException if the input is not a number
     */
	public static <T extends Number> void printResult(T[] arr) {
		System.out.println("We are going to calculate" + arr.length + " number");
		int count = 1;
		for(T number : arr) {
			System.out.println("Number "+ count + ": " + number);
			count++;
		}
		System.out.println("The sum of numbers: " + addCalculation(arr));
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

		printResult(arrNum); // print the result
		kb.close();
		System.exit(0);
	}
}
