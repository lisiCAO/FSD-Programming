package pargol;

import java.util.Scanner;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalMark;
		char grade;
		Scanner kb = new Scanner(System.in);
		System.out.print("Give me your total mark ?");
		totalMark = kb.nextDouble();

		if (totalMark < 50) {
			grade = 'F';
		} else if (totalMark >= 50 && totalMark < 65) {
			grade = 'D';
		} else if (totalMark >= 65 && totalMark < 75) {
			grade = 'C';
		} else if (totalMark >= 75 && totalMark < 85) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		System.out.printf("Based on your mark of %.2f the grade is : %s ", totalMark, grade);
		}

	}


