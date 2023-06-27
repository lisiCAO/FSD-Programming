package june16th;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("9. Write a Java program to find duplicate values in an array of integer values.");
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			System.out.print(array[i] + " ");
		}
		System.out.println("Duplicate Values: ");
		findDuplicate(array, n);
		}
	public static void findDuplicate(int[] array, int n ) {
		
		for(int i = 0 ; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(array[i] == array[j]) {
					System.out.print(array[j] + " ");
					break;
				}
			}
		}
	}

}
