package Example1;

import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class MyProgram7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long id;
		String firstName, lastName, courseName, fileName;
		char ch1, ch2, ch3;

		Scanner kb = new Scanner(System.in);
		System.out.println("Which binary file you want to read");
		fileName = kb.next();

		try {
			ObjectInputStream ois = null;

			try {
				ois = new ObjectInputStream(new FileInputStream(fileName));

				try {
					Object s = ois.readUTF();
					System.out.println(s);

					while (true) {
						id = ois.readLong();
						ch1 = ois.readChar();
						ch2 = ois.readChar();
						firstName = kb.next();
						ch3 = ois.readChar();
						lastName = kb.next();
						System.out.println();

					}

				} catch (FileNotFoundException e) {
					System.out.println("something wrong");
					System.out.println("terminate");
					System.exit(0);

				}
				ois.close();

			} catch (FileNotFoundException e) {
				System.out.println("something wrong");
				System.out.println("terminate");
				System.exit(0);
			}
		} catch (FileNotFoundException e) {
			System.out.println("something wrong");
			System.out.println("terminate");
			System.exit(0);

		}
	}
}
