/*
 * Purpose: create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers
 * Script date: August 14, 2023
 * Author: Lisi Cao
 */

package generic;

import java.util.List;

//Inner class to store result of calculation.
class Result {
	private final int sumEven;
	private final int sumOdd;

	public Result(int sumEven, int sumOdd) {
		this.sumEven = sumEven;
		this.sumOdd = sumOdd;
	}

	public int getSumOdd() {
		return sumOdd;
	}

	public int getSumEven() {
		return sumEven;
	}
}

public class SumCalculator {
	private SumCalculator() {
	}; // private constructor to prevent instantiation

	/**
	 * Only calculate integer in the list of number
	 */
	public static <T extends Number> Result CalSumOfEvenAndOdd(List<T> numbers) {
		int evenSum = 0;
		int oddSum = 0;

		for (T number : numbers) {
			if (number.doubleValue() == number.intValue()) { // Check if the number is essentially an integer
				if (number.intValue() % 2 == 0) {
					evenSum += number.intValue();
				} else {
					oddSum += number.intValue();
				}
			}
		}
		return new Result(evenSum, oddSum); // array with two results.
	}

	public static void main(String[] args) {

		// generate a list of number including both double and integer.
		List<Number> numbers = List.of(1, 2, 3.5, 4.0, 5, 6, 7.1, 8, 9.9, 10);
		System.out.println("The list of numbers generated: " + numbers);

		Result result = CalSumOfEvenAndOdd(numbers);

		System.out.println("The sum of even numver: " + result.getSumEven());
		System.out.println("The sum of odd numver: " + result.getSumOdd());
	}
}
