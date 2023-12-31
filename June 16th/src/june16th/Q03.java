package june16th;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3. Write a Java program to find the index of an array element.");
		
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
		
		int index = findIndex(array, target);
		
		if(index != -1) {
			System.out.println("The value " + target + " is found at index " + index);
			}else {
				System.out.println("The array does not contain the value " + target + ".");
				}
		kb.close();
		System.exit(0);
		}
	
	public static int findIndex(int[] array, int target) {
		for(int i = 1; i <=array.length; i++) {
			if(array[i] == target) {
				return i;
				}
			}
		return -1;
		}
	}
