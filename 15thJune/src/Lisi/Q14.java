package Lisi;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"14. Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false. ");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = kb.next();
		boolean isVowel = checkWord(word);
		if (isVowel) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		kb.close();
		System.exit(0);

	}

	public static boolean checkWord(String word) {

		word = word.toLowerCase();
		char[] w = word.toCharArray();
		for (char x : w) {

			if (x != 'a' && x != 'e' && x != 'o' && x != 'u' && x != 'i') {
				return false;

			}
		}
		return true;
	}

}
