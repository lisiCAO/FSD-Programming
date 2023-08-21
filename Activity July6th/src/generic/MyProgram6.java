/*
 * Purpose: takes a list of any type and a predicate. It returns an array list containing only elements that satisfy the predicate.
 * This method alternates the elements of each list.
 * Script Date: August 16, 2023
 * Developed by: Lisi Cao
 */
package generic;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class MyProgram6 {
	public static <T> List<T> findPredicate(List<T> array, Predicate<T> predicate){
		List<T> myArr = new ArrayList<>();
		for(T item : array) {
			if(predicate.test(item)) {
				myArr.add(item);
			}
		}return myArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> list = List.of('a','b','c','d','e','f','g');
		Predicate<Character> predicate = cr -> cr.equals('a')||cr.equals('e')||cr.equals('o')||cr.equals('u')||cr.equals('i');
		System.out.println(findPredicate(list,predicate));

	}

}
