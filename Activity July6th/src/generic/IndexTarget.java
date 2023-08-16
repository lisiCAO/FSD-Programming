/*
 * Purpose: Create a generic method that takes a list of any type and a target element. 
 * 			It returns the index of the first occurrence of the target element in the list. 
 * 			Return -1 if the target element cannot be found.
 * 			The search is case-insensitive for strings.
 * 
 * Script date: August 14, 2023
 * Author: Lisi Cao
 */

package generic;

import java.util.List;

public class IndexTarget {

	public static <T> int indexOfTarget(List<T> array, T target) {
		 // Case-insensitive search for Strings
		if (target instanceof String) {
			for (int i = 0; i < array.size(); i++) {
				if (array.get(i) instanceof String & ((String) array.get(i)).equalsIgnoreCase((String) target)) {
					return i;
				}
			}
			return -1; // NOT FOUND
		}
		 // Default search for other types
		int index = array.indexOf(target);
		return index;
	}

	public static void main(String[] args) {

		List<Integer> array = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("The index of the value '3':" + indexOfTarget(array, 3));
		
		List<String> strList = List.of("hello", "World", "Bonjour");
		System.out.println("The index of the value 'hello':" + indexOfTarget(strList, "Hello"));
	}

}
