package Example1;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id;
		String fileName, firstName, lastName, courseName;
		
		Scanner kb =  new Scanner (System.in);
		System.out.println("Which course you want to register");
		courseName =  kb.next();
		
		fileName = courseName + "_registration.dat";
		
		System.out.println("the information will store in " + fileName);
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeUTF("this file include all registration for " + courseName );
			System.out.println("please enter your id & please enter - 1 if you want to exit");
			
			id = kb.nextLong();
			String cl;
			while(id != -1) {
				cl = kb.nextLine();
				System.out.println("give me the firstname and lastname of students :");
				firstName = kb.next();
				lastName = kb.next();
				oos.writeLong(id);
				
				oos.writeChar('\t');
				oos.writeChar(' ');
				oos.writeUTF(lastName);
				System.out.println("added one student to list");
				System.out.println("Give me another id");
				
				id =  kb.nextLong();
			}
			System.out.println("registration complete");
			oos.close();
		}catch(IOException e) {
			
			System.out.println("something wrong ");
			System.out.println("terminate");
			System.exit(0);
			
		}

	}

}
