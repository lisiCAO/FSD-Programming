package Pargol;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give me your name?");
		Scanner kb = new Scanner(System.in);

		String name = kb.next();
		System.out.println("your name is " + name);
		System.out.println("What is your family name ?");
		String fn = kb.next();
		System.out.println("your family name is "+ fn);
		System.out.println("What is your age?");
		int age=kb.nextInt();
		System.out.println("your age is " + age);
		
		
	}

}
