package pargol;
import java.util.Scanner;
public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i, sz;
		System.out.println("Please give me the size of array you want to create: ");
		sz = kb.nextInt();
		int[] myarr = new int[sz];
		for (i = 0; i < myarr.length; i++) {
			myarr[i] = i * 5;
		}
		System.out.println("===============");
		System.out.println("Printing array: ");
		for(i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + "  ");
		}
		System.out.println();
		System.out.println("================");
		System.out.println("Please tell me how many index you want to expand : ");
		int expandInt = kb.nextInt();
		if(expandInt > 0) {
			myarr = expandArray(myarr, expandInt);
		}
		System.out.println("=========================");
		System.out.println("Printing array again :");
		for(i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + "  ");
		}
		kb.close();
	}
	public static int[] expandArray(int[] myar, int exp) {
		int[] expandArray = new int[myar.length + exp];
		for(int i = 0; i <myar.length; i++) {
			expandArray[i] =myar[i];
		}
		return expandArray;
		
	}
}
