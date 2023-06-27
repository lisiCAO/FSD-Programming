package june16th;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to compute the average value of an array of integers except the largest and smallest values.");
		System.out.println();
		int[] array = {1,3,5,7,10};
		int max =array[1], min = array[1], avg, sum = 0 ;
		for(int i = 0 ; i < array.length; i++) {
			max = Math.max(max, array[i]);
			min = Math.min(min, array[i]);
			sum = sum +array[i];
		}
		avg = (sum - max -min) / (array.length - 2);
		System.out.println("the result is " +avg);
	}

}
