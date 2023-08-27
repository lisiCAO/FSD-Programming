/*
 * Purpose: takes a list of any type and returns it as a new list with the elements in reverse order.
 * Script Date: August 16, 2023
 * Developed by: Lisi Cao
 */

package generic;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public final class ReversedArray {
	private ReversedArray() {
	}

	// in-place reverse method
	public static <T> void reverseInPlace(List<T> targetArr) {

		int left = 0;
		int right = targetArr.size() - 1;
		while (left < right) {
			T temp = targetArr.get(left);
			targetArr.set(left, targetArr.get(right));
			targetArr.set(right, temp);
			left++;
			right--;
		}
	}

	// return a new reversed list
	public static <T> List<T> reverseWithNewList(List<T> targetArr) {
		List<T> copiedList = new ArrayList<T>(targetArr);
		Collections.reverse(copiedList);
		return copiedList;
	}

	public static void main(String[] args) {
		// Testing the first method (in-place reversal)
		List<Integer> targetArr = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		reverseInPlace(targetArr);
		System.out.println(targetArr);

		// reversedArr.forEach(n -> System.out.print(n + " "));

		// Testing the second method (returns a new reversed list)
		List<Integer> targetArr2 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		List<Integer> reversedArr = reverseWithNewList(targetArr2);
		System.out.println(reversedArr);
	}
}
