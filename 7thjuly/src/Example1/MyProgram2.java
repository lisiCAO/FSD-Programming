package Example1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		String s;
		Scanner kb = new Scanner(System.in);

		try {
			pw = new PrintWriter(new FileOutputStream("info2.txt", true));
		} catch (FileNotFoundException e) {
			System.out.println("the file didnt found");
			System.out.println("terminate");
			System.exit(0);
		}
		System.out.println("Hello please give me your first name");
		s = kb.nextLine();
		pw.println("Name : " + s);

		System.out.println("Please give me your address");
		s = kb.nextLine();
		pw.println("Address is  : " + s);

		System.out.println("please give me your School name");
		s = kb.nextLine();
		pw.println("School : " + s);
		pw.println("========================");
		pw.close();
	}

}