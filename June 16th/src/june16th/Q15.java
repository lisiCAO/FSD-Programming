package june16th;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find the second smallest element in an array.");
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			}
		int find2nsmallest = findNumber(array, n);
		System.out.println("The second smallest element :" + find2nsmallest);
		kb.close();
		System.exit(0);
		}
	public static int findNumber(int[]array, int n) {
		int smallest = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i =0; i < n; i++) {
			if(array[i] < smallest) {
			 second = smallest ;
			 smallest = array[i];
			}else if(array[i] > smallest && array[i] < second) {
				second = array[i];
				}
			}
		if(second == Integer.MAX_VALUE)	{
			throw new RuntimeException("Error");
			}
		else {
			return second;}
		}
	}
