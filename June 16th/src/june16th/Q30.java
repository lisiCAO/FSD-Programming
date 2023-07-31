package june16th;
import java.util.Arrays;
public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 21, 22, 100, 101, 200, 300};
		System.out.println("Total number of triangles is " + findNumberOfTriangles(array));
		}
	static int findNumberOfTriangles(int[] array) {
		int n = array.length;
		Arrays.sort(array);
		int count = 0;
		for (int i = 0; i < n - 2; ++i) {
			int k = i + 2;
			for (int j = i + 1; j < n; ++j) {
				while (k < n && array[i] + array[j] > array[k]) {
					++k;
					}
				if(k>j) {
					count += k - j - 1;
					}
				}
			}
		return count;
		}
	}