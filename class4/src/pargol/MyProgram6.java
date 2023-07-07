package pargol;

import java.util.Scanner;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 15;
		int count;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Give me number between 1 to 12 ?");
			count = kb.nextInt();
		} while (count < 1 || count > 12);
		do {
			System.out.println(count);
			count = count + 1;

		} while (count <= LIMIT);
		System.out.println("Done");

	}
}