package project;

import java.util.Scanner;

public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------ This is a program for question 5 ------------");
		System.out.println("Descprition: return the majority element in an array, assuming it always exits.");
		System.out.println();

		Scanner kb = new Scanner(System.in);
		System.out.println("To get an array, enter the number of elements in you array:");
		int n = kb.nextInt();
		System.out.println("Enter numbers in you array:");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = kb.nextInt();
		}
		int majority = count_element(array, n);
		System.out.println("The majority element is " + majority);
		System.out.println();
		System.out.println("Attention: 0 may means error");
		kb.close();
		System.exit(0);
	}

	public static int count_element(int[] array, int n) {
		int[] count = new int[(n / 2) + 1];
		int majorityElement = 0;
		for (int i = 0; i < (n / 2) + 1; i++) {
			count[i] = 0;
			for (int j = 0; j < n; j++) {
				if (array[i] == array[j]) {
					count[i] = count[i] + 1;
					if (count[i] > n / 2) {
						majorityElement = array[i];
						break;
					}
				}
			}
		}
		return majorityElement;
	}
}
