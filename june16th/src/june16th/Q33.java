package june16th;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.");
        int[] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        arrangeNegativePositive(array);
        printArray(array);
        }
    static void arrangeNegativePositive(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
        	if (array[i] < 0) {
                if (i != j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    }
                j++;
                }
        	}
        }
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
            }
        }
    }
