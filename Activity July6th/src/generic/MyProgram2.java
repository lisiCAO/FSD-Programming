/*
 * Purpose: calculate the sum of even number and odd number separately 
 * in a specific array.
 * Author: Lisi Cao
 * Method: Using generic List<>() would be flexible but limit to integer
 * 	based on the purpose.
 */

package generic;

import java.util.List;

public class MyProgram2 {
	/**
	 * limit List() to Integer return sum of even and sum of odd in an array
	 */
	public static int[] CalSumOfEvenOrOdd(List<Integer> numbers) {
		int evenSum = 0;
		int oddSum = 0;
		for (Integer number : numbers) {
			// An even number divided by two leaves a remainder of zero.
			if (number.intValue() % 2 == 0) {
				evenSum += number;
			}
			// an integer is either even, or odd.
			else {
				oddSum += number;
			}
		}
		return new int[] { evenSum, oddSum }; // array with two results.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// generate a list of integer number.
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("The list of numbers generated: " + numbers);

		// call the method CalSumOfEevnOrOdd, and assign values to integer array sum
		int[] sum = CalSumOfEvenOrOdd(numbers);

		// print results clearly
		System.out.println("The sum of even numver: " + sum[0]);
		System.out.println("The sum of odd numver: " + sum[1]);

	}

}
