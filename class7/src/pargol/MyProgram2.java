package pargol;

import java.util.Scanner;

public class MyProgram2 {
	public static final int PASSWORD_LENGTH = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter your password");
		String pass = kb.next();
		boolean result = is_validPass(pass);
		if(result) {
			System.out.println("yes you got it ");
		}else {
			System.out.println("Nope");
		}
	}
	
public static boolean is_validPass(String password){
	if(password.length() < PASSWORD_LENGTH) {
		return false;
		}
	int charCount = 0, numCount = 0;
	for(int i = 0; i < password.length(); i++) {
		char c = password.charAt(i);
		if(is_Num(c)) {
			numCount++;
		}else if(is_letter(c)) {
			charCount++;
		}else {
			return false;
			}
		}
	return ( numCount >= 2 && charCount >= 2);
	}
public static boolean is_letter(char c) {
	c = Character.toUpperCase(c);
	if( c >= 'A' && c <= 'Z') {
		return true;
	}else {
		return false;
	}

		}
public static boolean is_Num(char c){
	if(c >='0' && c <= '9') {
		return true;
	}else {
		return false;
	}
}
}
