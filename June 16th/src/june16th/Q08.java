package june16th;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("8. Write a Java program to reverse an array of integer values.");
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
		}
		int[] reversedArray = reverseArray(array);
		for(int i = 0; i < n ; i++) {
			System.out.print(reversedArray[i] + " ");
		}
		kb.close();
	}
	public static int[] reverseArray(int[] array) {
		int[] reversedArray = new int[array.length];
		for(int i = 0 ; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}
		return reversedArray;
	}

}
