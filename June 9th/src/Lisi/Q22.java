package Lisi;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter marital status (married / unmarried) : ");
		String a = kb.next();
		System.out.println("Enter gender (male / female) : ");
		String b = kb.next();
		System.out.println("Enter age: ");
		int c = kb.nextInt();

		boolean isInsured = false;
		if ("married".equalsIgnoreCase(a)) {
			isInsured = true;
		} else if ("male".equalsIgnoreCase(b) && c > 30) {
			isInsured = true;
		} else if ("female".equalsIgnoreCase(b) && c > 25) {
			isInsured = true;
		}
		kb.close();
	}
}
