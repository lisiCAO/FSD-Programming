package project;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------ This is a program for question 4 ------------");
		System.out.println("Descprition: get an array and sort it without any library");
		System.out.println();

		Scanner kb = new Scanner(System.in);
		System.out.println("To get an array, enter the number of elements in you array:");
		int n = kb.nextInt();
		System.out.println("Enter numbers in you array:");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = kb.nextInt();
		}
		int[] sortArray = sort_array(array, n);
		for (int i = 0; i < n; i++) {
			System.out.print(sortArray[i] + " ");
		}
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

}
