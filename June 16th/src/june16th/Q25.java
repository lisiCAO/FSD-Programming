package june16th;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to check if an array of integers contains two specified elements 65 and 77.");
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			}
		boolean result = check_elemnt(array);
		System.out.println(result);
		 }
	public static boolean check_elemnt(int[] array) {
		boolean found65 = false;
		boolean found77 = false;
		for(int element: array) {
			if(element == 65) {
				found65 = true;
			}else if (element == 77) {
				found77 = true;
				}
			}
		if(found65 && found77) {
			return true;
			}
		return false;
		}
	}

