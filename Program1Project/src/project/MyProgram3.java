package project;

import java.util.Scanner;
import java.util.Random;

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------ This is a program for question 3 ------------");
		System.out.println("Descprition: create random matrix, add search and update feature");
		System.out.println();

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of row and column:");
		int row = kb.nextInt();
		int col = kb.nextInt();
		System.out.println();
		Random rand = new Random();
		int[][] number = new int[row][col];
		System.out.println("The matrix is as follow:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				number[i][j] = rand.nextInt(100);
				System.out.printf("%5d", number[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Enter the number to disappear (to 0):");
		int numDisappear = kb.nextInt();
		System.out.println("The new array:");
		removeNum(number, numDisappear, row, col);
		kb.close();
		System.exit(0);
	}

	public static void removeNum(int[][] number, int numDisappear, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (numDisappear == number[i][j]) {
					number[i][j] = 0;
				}
				System.out.printf("%5d", number[i][j]);
			}
			System.out.println();
		}
		return;
	}
}
