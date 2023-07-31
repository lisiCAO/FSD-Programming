package june16th;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.");
		int[] array = {1,3,5,7,10};
		int max =array[1], min = array[1], result;
		for(int i = 0 ; i < array.length; i++) {
			max = Math.max(max, array[i]);
		}
		for(int i = 0 ; i < array.length; i++) {
			min = Math.min(min, array[i]);
		}
		result = max - min;
		System.out.println("The result is " + result);
	}

}
