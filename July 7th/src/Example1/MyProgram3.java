
package Example1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		Scanner kb = new Scanner(System.in);
		Scanner sc = null;
		long id1,id2,id3;
		
		try {
			sc = new Scanner(new FileInputStream("StudentInfo.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("the file didnt found");
			System.out.println("terminate");
			System.exit(0);
		}
		
		
		System.out.println("here is the info in your file");
		
		System.out.println("First studnets id : ");
		id1 = sc.nextLong();
		System.out.println(id1);
		s = sc.nextLine();
		
		
		System.out.println("Second studnets  : ");
		id2 = sc.nextLong();
		System.out.println(id2);
		s = sc.nextLine();
		
		System.out.println("third studnets  : ");
		id3 = sc.nextLong();
		System.out.println(id3);
		s = sc.nextLine();
		
	}

}