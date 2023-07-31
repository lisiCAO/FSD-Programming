package pargol;
import java.util.Scanner;
public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
int[]ar1 = new int[10];
ar1 = new int[]{2, 5, 77, 22,99,18,10,7,12,81};
for(int i = 0; i < 10; i++) {
System.out.println(ar1[i]);
System.out.println("give me a number:");
int num = kb.nextInt();
if(ar1[i] == num) {
	System.out.println("Value found in the index: " + i );
	break;
}if(i == 10) {
	System.out.println("Sorry Nope");
}

}
}}
