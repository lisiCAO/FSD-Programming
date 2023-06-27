package june16th;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3. Write a Java program to find the index of an array element.");		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of your array to check:");
		int n = kb.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++ ) {
			System.out.println("Enter your array to check, #" + i + " : ");
			array[i] = kb.nextInt();
			}
		
		System.out.println("Enter the element to remove ");
		int target = kb.nextInt();
		
		int index = findIndex(array, target);
		if(index != -1) {
			System.out.println("The value " + target + " is found at index " + index);
			System.out.println("Original Arrya: " + Arrays.toString(array));
			array = removeElement(array, target);
			System.out.println("After removing " + target + " : " + Arrays.toString(array) );
			}else {
				System.out.println("The array does not contain the value " + target + ".");
				}
		kb.close();
		System.exit(0);
		}
	
	public static int findIndex(int[] array, int target) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				return i;
				}
			}
		return -1;
		}

	public static int[] removeElement(int[] original, int target) {
		int index = -1;
		for(int i = 0 ; i < original.length; i++) {
			if(original[i] == target) {
				index = i;
				break;
				}
			}if (index == -1) {
			return original;
			}
		int[] newArr = new int[original.length - 1];
		for(int i = 0, j = 0; i <original.length; i++) {
			if(i == index) {
				continue;
				}
			newArr[j++] = original[i];
			}
		return newArr;
		}
	}


