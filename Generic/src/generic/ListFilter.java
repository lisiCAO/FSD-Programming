/*
 * Purpose: takes a list of any type and a predicate. It returns an array list containing only elements that satisfy the predicate.
 * This method alternates the elements of each list.
 * Script Date: August 24, 2023
 * Developed by: Lisi Cao
 */
package generic;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ListFilter {
    /**
     * Takes a list of any type and a predicate. Returns an ArrayList containing only elements that satisfy the predicate.
     *
     * @param <T> the type of elements in the list
     * @param list the input list to filter
     * @param predicate the predicate to test elements
     * @return an ArrayList of elements that satisfy the predicate
     */
	public static <T> List<T> filterList(List<T> list, Predicate<T> predicate){
		List<T> myArr = new ArrayList<>();
		
		for(T item : list) {
			if(predicate.test(item)) {
				myArr.add(item);
			}
		}return myArr;
	}

	public static void main(String[] args) {
		    
			// Test 1: Filtering strings containing 'S' or 's'
			List<String> strings = List.of("Hello", "Sun", "OpenAI", "Java");
			Predicate<String> containsS = str -> str.contains("s") || str.contains("S");
			List<String> expectedStrings = List.of("Sun");
			List<String> filteredStrings = filterList(strings, containsS);

			System.out.println("Test 1 result: " + (filteredStrings.equals(expectedStrings) ? "PASSED" : "FAILED"));


		    // Test 2: Filtering even numbers
		    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		    Predicate<Integer> isEven = num -> num % 2 == 0;
		    List<Integer> expectedNumbers = List.of(2, 4);
		    List<Integer> filteredNumbers = filterList(numbers, isEven);
		    
		    System.out.println("Test 2 result: " + (filteredNumbers.equals(expectedNumbers) ? "PASSED" : "FAILED"));

		    // Test 3: Testing with an empty list
		    List<String> emptyList = List.of();
		    List<String> expectedEmptyList = List.of();
		    List<String> filteredEmptyList = filterList(emptyList, containsS);
		    
		    System.out.println("Test 3 result: " + (filteredEmptyList.equals(expectedEmptyList) ? "PASSED" : "FAILED"));

		}
	}
