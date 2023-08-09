package assignment1;

import java.util.Scanner;

public class Password {
	//Password System

		private static final String PASSWORD = "password";
		private static final int MAX_ATTEMPTS = 3;
		private int remainingAttempts;
		private String password;
		private static Scanner kb = new Scanner(System.in);
		public Password() {
			this.remainingAttempts = MAX_ATTEMPTS;
			this.password = null;
		}

		// method to prompt user for password
		public void inputPassword() {
			System.out.println("Please enter your PASSWORD:");
			
			password = kb.nextLine();
		}

		// method to validate password
		public boolean validatePassword() {
			while (remainingAttempts > 0) {
				if (password.equals(PASSWORD)) {
					remainingAttempts = MAX_ATTEMPTS;
					return true;
				} else {
					remainingAttempts--;
					System.out.println("Incorrect password. You have " + remainingAttempts + " attempt(s) left.");
				}
				if(remainingAttempts > 0) {
					inputPassword();
				}
			} 
			System.out.println("You have reached maximum attempts, please contact administrator.");
			return false;
		}
	}

