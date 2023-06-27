package june16th;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("7. Write a Java program to find the maximum and minimum value of an array.");
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		int max = 0, min = 0;
		for(int i = 0 ;  i < n; i++) {
			array[i] = kb.nextInt();
			if(i == 0) {
				max = array[i];
				min = array[i];
				continue;
			}
			max = Math.max(max, array[i]);
			min = Math.min(min, array[i]);
		}
		System.out.println("the maximum is " + max + " ;" );
		System.out.println("the minimum is " + min + " ;" );
		kb.close();
	}

}
