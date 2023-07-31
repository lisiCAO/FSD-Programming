package june16th;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find common elements between two arrays (string values).");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of your array: ");
		int num = kb.nextInt();
		String[] array_1 = new String[num];
		String[] array_2 = new String[num];
		System.out.println("Enter your array-1: ");
		for(int i = 0 ; i < num; i++) {
			array_1[i] = kb.next();
			}
		System.out.println("Enter your array-2: ");
		for(int i = 0 ; i < num; i++) {
			array_2[i] = kb.next();
			}
		Set<String> commomValues = findCommon(array_1, array_2, num);
		System.out.println("common value :");
		for(String s: commomValues) {
			System.out.println(s);
			}
		kb.close();
		System.exit(0);
		}

	public static Set<String> findCommon(String[] array_1, String[] array_2, int num){
		Set<String> set = new HashSet<>();
		Set<String> common = new HashSet<>();
		for(String value : array_1) {
			set.add(value);
			}
		for(String value: array_2) {
			if(!set.add(value)) {
				common.add(value);
				}
			}		
			return common;
			}

}
