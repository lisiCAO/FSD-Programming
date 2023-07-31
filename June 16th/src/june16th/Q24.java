package june16th;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.");
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number of your array: ");
		int n = kb.nextInt();
		System.out.println("enter your array: ");
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = kb.nextInt();
			}
        boolean result = checkSumOfTens(array);
        System.out.println(result);  
        }

    public static boolean checkSumOfTens(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (num == 10) {
            	sum += num;
            	}
            }
        return sum == 30;
        }
    }
