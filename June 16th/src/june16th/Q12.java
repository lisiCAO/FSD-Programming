package june16th;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find common elements between two integer arrays.");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of your array: ");
		int num = kb.nextInt();
		int[] array_1 = new int[num];
		int[] array_2 = new int[num];
		System.out.println("Enter your array-1: ");
		for(int i = 0 ; i < num; i++) {
			array_1[i] = kb.nextInt();
			}
		System.out.println("Enter your array-2: ");
		for(int i = 0 ; i < num; i++) {
			array_2[i] = kb.nextInt();
			}
		Set<Integer> commomValues = findCommon(array_1, array_2, num);
		System.out.println("common value :");
		for(int s: commomValues) {
			System.out.println(s);
			}
		kb.close();
		System.exit(0);
		}

	public static Set<Integer> findCommon(int[] array_1, int[] array_2, int num){
		Set<Integer> set = new HashSet<>();
		Set<Integer> common = new HashSet<>();
		for(int value : array_1) {
			set.add(value);
			}
		for(int value: array_2) {
			if(!set.add(value)) {
				common.add(value);
				}
			}		
		return common;
		}
	}

