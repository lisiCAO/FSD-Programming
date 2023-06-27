package june16th;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find all combinations of four elements of an array whose sum is equal to a given value.");
        
		int[] array = {10, 20, 30, 40, 50, 60, 70};
        int target = 180;
        findFourElements(array, target);
    }

    public static void findFourElements(int[] array, int target) {
        // Sort the array
        Arrays.sort(array);

        // Check every combination of four elements
        for (int i = 0; i <= array.length - 4; i++) {
            for (int j = i + 1; j <= array.length - 3; j++) {
                for (int k = j + 1; k <= array.length - 2; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        if (array[i] + array[j] + array[k] + array[l] == target) {
                            System.out.println(array[i] + ", " + array[j] + ", " + array[k] + ", " + array[l]);
                        }
                    }
                }
            }
        }
    }
}

