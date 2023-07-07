package pargol;

import java.util.Scanner;

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 15;
		int count;
		Scanner kb = new Scanner(System.in);

		System.out.println("Please give me a number between 1 and 12 :");
		count = kb.nextInt();

		while (count < 1 || count > 12) {
			System.out.println("Sorry invalid input");
			System.out.println("Please give me another num:");
			count = kb.nextInt();
		}
		while (count <= LIMIT) {
			System.out.println(count);
			count = count + 1;
		}
		System.out.println("Done");
	}

}
