package pargol;
import java.util.Scanner;
public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar2 = new int[10];
Scanner kb = new Scanner(System.in);
System.out.println("enter 10 numbers");

for(int x : ar2) {
	ar2[x] = kb.nextInt(); 
	System.out.println(ar2[x]);
}
	}

}
