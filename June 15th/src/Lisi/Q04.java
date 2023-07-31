package Lisi;

import java.util.Scanner;

public class Q04 {
	final static int PASSWORD_LENGTH = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = kb.next();
		boolean isValid = check_password(password);
		if (isValid) {
			System.out.println("The password is valid.");
		} else {
			System.out.println("The password is invalid.");
		}
	}

	public static boolean check_password(String pass) {
		if (check_length(pass) && check_character(pass)) {
			return true;
		}
		return false;
	}

	public static boolean check_length(String pass) {

		if (pass.length() >= PASSWORD_LENGTH) {
			return true;
		}
		return false;
	}

	public static boolean check_character(String pass) {

		char[] password = pass.toCharArray();
		int numLetter = 0, numDigit = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isLetter(password[i]) || Character.isDigit(password[i])) {

				return true;
			}
			if (Character.isDigit(password[i])) {
				numDigit++;
			}
			if (numLetter >= 1 && numDigit >= 2) {
				return true;
			}
		}
		return false;
	}
}
