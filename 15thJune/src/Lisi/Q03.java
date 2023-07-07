package Lisi;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a year to check whether it is leap year: ");
		int year = kb.nextInt();
		boolean isLeafyear = check_leafyear(year);
		if (isLeafyear) {
			System.out.println("This is a leaf year");
		} else {
			System.out.println("This is not a leaf year");
		}
	}

	public static boolean check_leafyear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}

			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}
