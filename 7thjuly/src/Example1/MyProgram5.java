package Example1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class MyProgram5 {
	public static void fileCopy(Scanner s, PrintWriter p) {
		String str;
		while(s.hasNextLine()) {
			str = s.nextLine();
			p.println(str);
		}
	}
	public static void main(String[] args) {
		String s1, s2;
		PrintWriter pw = null;
		Scanner sc = null;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Which file you need a copy?");
		s1 = kb.next();
		
		System.out.println("give me the name you want to creat or copy into");
		s2 = kb.next();
		
		try {
			sc  =new Scanner(new FileInputStream(s1));
			pw = new PrintWriter(new FileOutputStream(s2));
			
		}catch(FileNotFoundException e) {
			System.out.println("the file didnt found");
			System.out.println("terminate");
			System.exit(0);
			
		}
		fileCopy(sc,pw);
	}

}
