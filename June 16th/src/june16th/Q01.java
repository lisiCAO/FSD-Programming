package june16th;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to calculate the average value of array elements.");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of values:");
		int n = kb.nextInt();
		double [] array = new double[n];

		for(int i = 0; i < n; i++) {
			System.out.println("Enter values #" + i + " : ");
			array[i] = kb.nextDouble();
		}
		System.out.println(avg(n, array));
		kb.close();
		System.exit(0);
	}
	public static double avg(int n, double[] array) {
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + array[i];
		}return sum / n;
	}

}
