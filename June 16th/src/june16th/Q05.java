package june16th;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5. Write a Java program to copy an array by iterating the array.");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of your array");
		int n = kb.nextInt();
		System.out.println("Enter your array");
		int[] array = new int [n];
		for(int i = 0; i < n; i++) {
			array[i] = kb.nextInt();
			}
		
		int[] copiedArray = copyArray(array);
		System.out.println("the copied Array :");
		for(int num : copiedArray) {
			System.out.println(num + " ");
			}
		kb.close();
		System.exit(0);
		}
	public static int[] copyArray(int[] array) {
		int[] copyArray = new int[array.length];			
		for(int i= 0; i< array.length; i++) {
			copyArray[i] = array[i];
		}
		return copyArray;
		}
	}
