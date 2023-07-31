package Lisi;
import java.util.Scanner;
public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.println("Enter a number:");
int a = kb.nextInt();

if(a < 0) {
	System.out.println(a + " is negative");
	
}else if(a > 0) {
	System.out.println(a + " is positive");
}else {
	System.out.println(a + " = 0");
	kb.close();
}
	}

}
