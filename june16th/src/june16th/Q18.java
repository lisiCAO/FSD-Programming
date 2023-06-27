package june16th;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find a missing number in an array.");
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			}
		int element;
		System.out.println("Enter the element to check");
		element = kb.nextInt();
		boolean isMissing = check_element(array, n, element);
		if(isMissing) {
			System.out.println("The element is missing");
		}else {
			System.out.println("The element is not missing");
			}
		}
	public static boolean check_element(int[] array, int n, int element) {
		for(int i = 0 ;  i < n; i++) {
			if(array[i] == element) {
				return false;
				}
			}
		return true;
		}
	}
