package june16th;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to test two arrays' equality.");
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			}
		int[] array_2 = new int[n];
		System.out.println("enter your array_2: ");
		for(int i = 0; i < n ; i++) {
			array_2[i] = kb.nextInt();
			}
		boolean isEqual = check_equality(array, array_2, n);
		if(isEqual) {
			System.out.println("Two arrays are equal");
			}else {
				System.out.println("Two arrays are not equal");
				}
		kb.close();
		System.exit(0);
		}
		public static boolean check_equality(int[]array, int[] array_2, int n) {
			for(int i = 0;i < n ; i++) {
				for(int j = 0; j < n; j++) {
					if(array[i] == array_2[j]) {
						return true;
					}else {
						return false;
						}
					}
				}return true;
			}
		}
