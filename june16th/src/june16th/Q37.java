package june16th;

public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        separateEvenOdd(array);
        printArray(array);
        }
    static void separateEvenOdd(int[] array) {
    	int left = 0, right = array.length - 1;
    	while (left < right) {
    		while (array[left] % 2 == 0 && left < right) {
                left++;
                }
            while (array[right] % 2 == 1 && left < right) {
                right--;
                }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
                }
            }
    	}
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
            }
        }
    }