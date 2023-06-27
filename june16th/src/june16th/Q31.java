package june16th;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to cyclically rotate a given array clockwise by one.");
		int[] array = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        printArray(array);
        rotateArray(array);
        System.out.print("Rotated array: ");
        printArray(array);
        }

    static void rotateArray(int[] array) {
        int n = array.length;
        int temp = array[n-1];
        for (int i = n-1; i > 0; i--) {
            array[i] = array[i-1];
            }
        array[0] = temp;
        }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
            }
        System.out.println();
        }
    }
   