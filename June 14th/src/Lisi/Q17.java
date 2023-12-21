package Lisi;
/*
 * Write a program to display the multiplication table of a given integer.
Test Data :
Input the number (Table to be calculated) : 15
Expected Output : 15 X 1 = 15
...
...
15 X 10 = 150
 */
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = kb.nextInt();
		for (int i = 1; i <= 10; i++) {
			int b = a * i;
			System.out.println(a + " * " + i + " = " + b);
		}
	}

}
