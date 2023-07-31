package Lisi;
import java.util.Scanner;
public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the number of days late: ");
        int a = kb.nextInt();
        
        double fine = 0;
        
        if (a <= 5) {
            fine = a * 0.50;
        } else if (a <= 10) {
            fine = 5 + (a - 5) * 1;
        } else if (a <= 30) {
            fine = 10 + (a - 10) * 5;
        } else {
            System.out.println("Your membership will be cancelled.");
        }
        
        System.out.println("The fine is: " + fine);
	}

}
