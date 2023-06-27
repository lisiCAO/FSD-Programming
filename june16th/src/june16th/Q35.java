package june16th;
import java.util.Arrays;
public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be the second minimum and so on.");
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        sortArray(array);
        printArray(array);
    }

    static void sortArray(int[] array) {
        Arrays.sort(array);
        int[] result = new int[array.length];
        int i = 0;
        int j = array.length - 1;
        int k = 0;
        while (i <= j) {
            if (k % 2 == 0) {
                result[k] = array[j--];
            } else {
                result[k] = array[i++];
            }
            k++;
        }
        System.arraycopy(result, 0, array, 0, array.length);
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
 
        }
        }
    }

