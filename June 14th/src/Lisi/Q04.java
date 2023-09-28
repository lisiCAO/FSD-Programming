package Lisi;


//Take 4th int values from the users and print greatest among them.
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("You can enter four times number");
		int max = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter a number#" + i + " : ");
			val = kb.nextInt();
			max = Math.max(max, val);
		}
		System.out.println("The greatest number is : " + max);
	}
}
