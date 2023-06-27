package june16th;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to test if an array contains a specific value.");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of your array to check:");
		int n = kb.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++ ) {
			System.out.println("Enter your array to check, #" + i + " : ");
			array[i] = kb.nextInt();
		}
		System.out.println("Enter the value to search for: ");
		int target = kb.nextInt();
		if(check_Value(array, target)) {
			System.out.println("The array contains the value " + target );
		}else {
			System.out.println("The array does not contain the value " + target + ".");
		}
		kb.close();
	}
	public static boolean check_Value(int[] array, int target) {
		for(int x : array) {
			if(x == target) {
				return true;
			}
		}
		return false;
	}

}
