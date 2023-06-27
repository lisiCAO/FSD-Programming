package june16th;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to check if an array of integers is without 0 and -1.");
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			}
		boolean isRight = check_element(array, n);
		if(isRight) {
			System.out.println("the array of integers is without 0 and -1.");
		}else {
			System.out.println("the array of integers is with 0 or -1.");
		}
	}
	public static boolean check_element(int[]array, int n) {
		for(int x: array) {
			if(x == 0 || x == -1) {
				return false;
				}
			}return true;
		}
	}
