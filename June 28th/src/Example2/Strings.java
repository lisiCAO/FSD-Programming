package Example2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me string");
		String str1 = kb.nextLine();
		String word;
		StringTokenizer stsli = new StringTokenizer(str1);
		int count = stsli.countTokens();
		for(int i = 1; i <= count; i++) {
			word = stsli.nextToken();
			System.out.println("My word is " + word);
		}
		Math.abs(-3);
	}

}
