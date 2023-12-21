package Lisi;
//Write a program to convert minutes into a number of years and days.

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the minutes you want to convert into years and days");
		Scanner kb = new Scanner(System.in);
		int minutes = kb.nextInt();
		int days, years;
		if (minutes >= 1440) {
			days = minutes / 1440;
			System.out.printf("you have %d days \n", days);
			if (days > 365) {
				years = days / 365;
				days = days % 365;
				System.out.printf("you have %d years and %d days \n", years, days);
			}
		} else {
			System.out.printf("you have %d minutes", minutes);
		}
	}

}
