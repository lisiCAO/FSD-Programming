package june16th;

import java.util.Set;
import java.util.HashSet;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to remove duplicate elements from a given array and return the updated array length.");
		System.out.println("After removing the duplicate elements the program should return 4 as the new length of the array.");
		System.out.println();
		
		int[] array = {20, 20, 30, 40, 50, 50, 50};
		Set<Integer> set = new HashSet<>();
		for(int num : array) {
			set.add(num);
		}
		Integer[] updatedArray = set.toArray(new Integer[0]);
		System.out.println(updatedArray.length);
	}

}
