package Lisi;
//Write a program that takes three numbers as input to calculate and print the
//average of the numbers.
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three numbers");
		Scanner kb = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + kb.nextInt();
		}
		int avg = sum / 3;
		System.out.println("average of the numbers :" + avg);

	}

}
