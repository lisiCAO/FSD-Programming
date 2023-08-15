/*
 * Purpose:  create a generic method that takes a list of any type and a target element. 
 * It returns the index of the first occurrence of the target element in the list. 
 * Return -1 if the target element cannot be found.
 * Script date: August 14, 2023
 * Author: Lisi Cao
 */


package generic;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MyProgram3 {
	
	public static <T> int findIndexOfTarget(List<T> array, T target) {
		int index = array.indexOf(target);

			return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> array = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println("The index of the value '3':" + findIndexOfTarget(array, 3));
		ArrayList<String> strList = new ArrayList<>(Arrays.asList("hello", "World"," Bonjour"));
		System.out.println("The index of the value 'hello':" + findIndexOfTarget(strList, "Hello"));
		

	}

}
