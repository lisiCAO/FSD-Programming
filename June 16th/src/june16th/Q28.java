package june16th;

import java.util.Map;
import java.util.HashMap;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find the sum of the two elements of a given array equal to a given integer.");
		System.out.println();
		int[] array = {1,2,4,5,6};
		int target = 6;
		int[] result = twoSum(array, target);
		if(result != null) {
			System.out.println("The two numbers are : " + array[result[0]] + " and " + array[result[1]]);	
		}else {
			System.out.println("No two numbers sum to the target.");
		}
	}
	public static int[] twoSum(int[] array, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for(int i =0 ; i < array.length; i++) {
			int complement = target - array[i];
			if(numMap.containsKey(complement)) {
				return new int[] {numMap.get(complement), i};
			}
			numMap.put(array[i], i);
		}
		return null;
	}
}
