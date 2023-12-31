package june16th;

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 0, 1, 0, 1, 0, 0, 1};
        separateZerosAndOnes(array);
        printArray(array);
        }
    static void separateZerosAndOnes(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (array[left] == 0 && left < right) {
                left++;
                }
            while (array[right] == 1 && left < right) {
                right--;
                }
            if (left < right) {
                array[left] = 0;
                array[right] = 1;
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
