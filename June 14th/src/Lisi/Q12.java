package Lisi;
/*
Write a program to display the cube of the number up to given an integer. Test Data :
Input number of terms : 5
Expected Output :
Number is : 1 and cube of the 1 is :1 Number is : 2 and cube of the 2 is :8 Number is : 3 and cube of the 3 is :27 Number is : 4 and cube of the 4 is :64 Number is : 5 and cube of the 5 is :125
*/
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number");
		int a = kb.nextInt();
		int b = a * a * a;
		System.out.println("Number is " + a + "and cube of the " + a + " is: " + b);
	}

}
