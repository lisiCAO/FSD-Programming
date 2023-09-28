package Lisi;

/*
 * Write a program to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111 + The Sum is : 12345
 */
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number of terms: ");

		int a = kb.nextInt();
		int num = 0;
		int sum = 0;
		for (int i = 0; i < a; i++) {
			num = num * 10 + 1;
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
