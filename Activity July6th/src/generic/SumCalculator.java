/*
 * Purpose: create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers
 * Script date: August 14, 2023
 * Author: Lisi Cao
 */

package generic;

import java.util.List;

//Inner class to store result of calculation.
class Result {
	private int sumEven;
	private int sumOdd;

	public Result(int sumEven, int sumOdd) {
		this.setSumEven(sumEven);
		this.setSumOdd(sumOdd);
	}

	public int getSumOdd() {
		return sumOdd;
	}

	public void setSumOdd(int sumOdd) {
		this.sumOdd = sumOdd;
	}

	public int getSumEven() {
		return sumEven;
	}

	public void setSumEven(int sumEven) {
		this.sumEven = sumEven;
	}
}

public class SumCalculator {
	/**
	 * limit List() to Integer return sum of even and sum of odd in an array
	 */
	public static <T extends Number> Result CalSumOfEvenOrOdd(List<T> numbers) {
		int evenSum = 0;
		int oddSum = 0;
		for (T number : numbers) {

			if (number.doubleValue() == number.intValue()) { // Check if the number is essentially an integer
				// An even number divided by two leaves a remainder of zero.
				if (number.intValue() % 2 == 0) {
					evenSum += number.intValue();
				}
				// an integer is either even, or odd.
				else {
					oddSum += number.intValue();
				}
			}
		}
		return new Result(evenSum, oddSum); // array with two results.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// generate a list of integer number.
		List<Number> numbers = List.of(1, 2, 3.5, 4.0, 5, 6, 7.1, 8, 9.9, 10);
		System.out.println("The list of numbers generated: " + numbers);

		// call the method CalSumOfEevnOrOdd, and assign values to object result
		Result result = CalSumOfEvenOrOdd(numbers);

		// print results clearly
		System.out.println("The sum of even numver: " + result.getSumEven());
		System.out.println("The sum of odd numver: " + result.getSumOdd());

	}

}
