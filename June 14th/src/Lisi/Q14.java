package Lisi;

/*
 * Write a program to read n numbers from keyboard and find their sum and average
 */
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("how many number do you want to enter:");
		int n = kb.nextInt();
		int sum = 0, avg = 0;
		System.out.println("enter n number:");
		for (int i = 0; i < n; i++) {
			sum = sum + kb.nextInt();
		}
		avg = sum / n;
		System.out.println("Sum is " + sum + " average is " + avg);

	}

}
