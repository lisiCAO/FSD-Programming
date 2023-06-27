package pargol;
import java.util.Scanner;
public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i, v = 0;
		int count = 0;
		int[] ar1 = new int[10], ar2 = new int[10];
		
		for (i = 0; i < ar1.length;i++ ) {
			ar1[i] = i * 5;
		}
		ar2 = ar1;
		System.out.println("Here are my values in array 1: ");
		for(i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + "  ");
		}
		System.out.println();
		for( i = 0; i < ar2.length; i++) {
			if(ar1[i] == v) {
				System.out.println("Value is found in index: " + i);
				count++;
			}
		}if(count == 0) {
			System.out.println("Value is not found ");
			}
		
		System.out.println("++++++++++++++++++");
		System.out.println("Here are my values in array 1 :");
		for(i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + "  ");
		}
	}

}
