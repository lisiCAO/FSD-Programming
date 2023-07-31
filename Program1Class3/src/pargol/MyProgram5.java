package pargol;
import java.util.Scanner;
public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double totalMark;
char grade;
Scanner kb = new Scanner(System.in);
System.out.print("Give me your total mark ?");
totalMark = kb.nextDouble();

if (totalMark >= 85) {
	grade = 'A';
} else if (totalMark >= 75) {
	grade = 'B';
} else if (totalMark >= 65) {
	grade = 'C';
} else if (totalMark >= 50) {
	grade = 'D';
} else {
	grade = 'F';
}
System.out.printf("Based on your mark of %.2f the grade is : %s ", totalMark, grade);
kb.close();
}

}
