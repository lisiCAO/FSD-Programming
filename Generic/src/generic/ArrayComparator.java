/*Purpose: create a generic method that takes two arrays of the same type 
 * and checks if they have the same elements in the same order.
 * Script date: August 13, 2023
 *Author: Lisi Cao
*/

package generic;

import java.util.Arrays;

/**
 * Check if two arrays of the same type have the same elements in the same
 * order.
 *
 * @param <T>  the type of elements in the array
 * @param arr1 the first array
 * @param arr2 the second array
 * @return true if the arrays have the same elements in the same order, false
 *         otherwise
 */

public class ArrayComparator {
	public static <T> boolean equals(T[] array1, T[] array2) {
		return Arrays.equals(array1, array2);

		/**
		 * if (array1 == null || array2 == null) { return array1 == array2; // both
		 * should be null for this to return true }
		 * 
		 * if (array1.length != array2.length) { return false; } for (int i = 0; i <
		 * array1.length; i++) { if (!array1[i].equals(array2[i])) { return false; } }
		 * return true;
		 */

	}

	public static void main(String[] args) {
		// Test with Integer arrays
		Integer[] arr1 = { 1, 2, 3 };
		Integer[] arr2 = { 1, 2, 3 };
		Integer[] arr3 = { 3, 2, 1 };
		System.out.println(ArrayComparator.equals(arr1, arr2)); // Expected: true
		System.out.println(ArrayComparator.equals(arr1, arr3)); // Expected: false

		// Test with String arrays
		String[] strArr1 = { "A", "B", "C" };
		String[] strArr2 = { "A", "B", "C" };
		String[] strArr3 = { "C", "B", "A" };
		System.out.println(ArrayComparator.equals(strArr1, strArr2)); // Expected: true
		System.out.println(ArrayComparator.equals(strArr1, strArr3)); // Expected: false

		// Test with null arrays
		Integer[] arr4 = null;
		Integer[] arr5 = null;
		System.out.println(ArrayComparator.equals(arr4, arr5)); // Expected: true
		System.out.println(ArrayComparator.equals(arr1, arr4)); // Expected: false
		System.out.println(ArrayComparator.equals(arr4, arr1)); // Expected: false

		// Test with arrays of different lengths
		Integer[] arr6 = { 1, 2 };
		System.out.println(ArrayComparator.equals(arr1, arr6)); // Expected: false
	}
}
