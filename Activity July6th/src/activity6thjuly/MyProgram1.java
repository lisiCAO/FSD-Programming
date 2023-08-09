//Purpose: use generic to compare two arrays that may not be the same types.
//Author: Lisi Cao

package activity6thjuly;
import java.util.Arrays;

public class MyProgram1 {
	public static <T> boolean equals(T[] array1, T[] array2) {
		/*
		if(array1.length == array2.length) {
			for(int i = 0; i < array1.length;i++) {
				if(!array1[i].equals(array2[i])) {
					return false;
				}
			}
			return true;
		}return false;
		*/
		return Arrays.equals(array1, array2);
		
	}

	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 1, 2, 3, 4, 5 };
		Integer[] array3 = { 1, 2, 3, 4, 6 };

		System.out.println("Array 1 and Array 2 are equal: " + equals(array1, array2)); // Output: true
		System.out.println("Array 1 and Array 3 are equal: " + equals(array1, array3)); // Output: false
	}
}
