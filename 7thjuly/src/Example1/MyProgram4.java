package Example1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		//Scanner kb = new Scanner(System.in);
		Scanner sc = null;
		long id;
		int i = 0;
		try {
			sc = new Scanner(new FileInputStream("StudentInfo.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("the file didnt found");
			System.out.println("terminate");
			System.exit(0);
		}
		
		
		System.out.println("here is the info inyour file");
		while(sc.hasNextLine() && i <7) {
			id = sc.nextLong();
			s = sc.nextLine();
			System.out.println(id);
			i++;
		}
		
		if(i<7) {
			System.out.println("the file only has  " + i + "Students ");
		}
		
		
	}

}