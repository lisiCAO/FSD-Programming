package june16th;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Write a Java program to find the rotation count in a given rotated sorted array of integers.");
		int[] array = {15, 18, 2, 3, 6, 12};
        System.out.println("Rotation count is " + findRotationCount(array));
        }

    static int findRotationCount(int[] array) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            if (array[low] <= array[high]) {
                return low;
                }
            int mid = (low + high) / 2;
            int next = (mid + 1) % array.length;
            int prev = (mid + array.length - 1) % array.length;
            if (array[mid] <= array[next] && array[mid] <= array[prev]) {
                return mid;
                }
            else if (array[mid] <= array[high]) {
                high = mid - 1;
                }
            else if (array[mid] >= array[low]) {
                low = mid + 1;
                }
            }
        return -1;
        }
    }
