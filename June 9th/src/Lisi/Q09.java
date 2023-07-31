package Lisi;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int a = kb.nextInt();

		int[] notes = new int[] { 100, 50, 20, 10, 5 };
		int[] noteCount = new int[10];
		for (int i = 0; i < 5; i++) {
			if (a >= notes[i]) {
				noteCount[i] = a / notes[i];
				a = a - noteCount[i] * notes[i];
			}
		}
		for (int i = 0; i < 5; i++) {
			if (noteCount[i] != 0) {
				System.out.println(notes[i] + " : " + noteCount[i]);
			}
		}
		kb.close();
	}

}
