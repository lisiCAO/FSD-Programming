package project;

import java.util.Scanner;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------ This is a program for question 6 ------------");
		System.out.println(
				"Descprition: given an array containing a n distinct numbers in the range[0, n], return the only number missing in the range.");
		System.out.println();

		Scanner kb = new Scanner(System.in);
		System.out.println("To get an array, enter the number of elements in you array:");
		int n = kb.nextInt();
		System.out.println("Enter numbers in you array:");
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = kb.nextInt();
		}
		System.out.println();
		System.out.print("Input: nums = [");
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print(nums[0]);
				continue;
			}
			System.out.print("," + nums[i]);
		}
		System.out.print("]\n");
		int[] sort_nums = sort_array(nums, n);
		int missingNum = findMissingNum(sort_nums, n);
		System.out.println("Output: " + missingNum);
		System.out.printf(
				"Explanation: n = %2d since there are %2d numbers, so all numbers are in the range[0,%d].\n %d is the missing number in the range since it does not appear in nums.",
				n, n, n, missingNum);
		kb.close();
		System.exit(0);
	}

	public static int[] sort_array(int[] array, int n) {
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static int findMissingNum(int[] nums, int n) {
		int missingNum = n;
		for (int i = 0; i < n; i++) {
			if (nums[i] != i) {
				missingNum = i;
				return missingNum;
			}
		}
		return missingNum;
	}
}
