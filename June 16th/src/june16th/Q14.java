package june16th;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find the second largest element in an array.");
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			}
		int find2nLargest = findNumber(array, n);
		System.out.println("The second largest element :" + find2nLargest);
		kb.close();
		System.exit(0);
		}
	public static int findNumber(int[] array, int n) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0 ; i < n; i++) {
			if(array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
				}else if(array[i] < largest && array[i] > secondLargest) {
					secondLargest = array[i];
					}
			}
		if(secondLargest == Integer.MIN_VALUE) {
			throw new RuntimeException("no second largest number.");
			}else{
				return secondLargest;
				}
		}
	}