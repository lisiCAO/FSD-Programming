package Lisi;
//A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//print the corresponding grade base of variable, Which you get from users.
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your marks:");
		double mark = kb.nextDouble();
		if (mark < 25) {
			System.out.println("F");
		} else if (mark > 25 && mark < 45) {
			System.out.println("E");
		} else if (mark > 45 && mark < 50) {
			System.out.println("D");
		} else if (mark > 50 && mark < 60) {
			System.out.println("C");
		} else if (mark > 60 && mark < 80) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		kb.close();
	}

}
