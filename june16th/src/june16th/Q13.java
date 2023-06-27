package june16th;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to remove duplicate elements from an array.");
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of your array: ");
		int num = kb.nextInt();
		String[] array = new String[num];
		
		System.out.println("Enter your array: ");
		for(int i = 0 ; i < num; i++) {
			array[i] = kb.next();
		}
		Set<String> removeDuplicates = removeDuplicate(array,num);
		for(String s : removeDuplicates) {
			System.out.println(s);
		}
		kb.close();
		System.exit(0);
		
	}
	public static Set<String> removeDuplicate(String[] array, int num) {
		Set<String> set = new HashSet<>();
		for(String value: array) {
			set.add(value);
		}return set;
	}
}
