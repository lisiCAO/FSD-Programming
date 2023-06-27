package june16th;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.");
		System.out.println();
		int[] array = {0, 1, 0, 3, 12};
		int x = 0;
		int[] array_2 = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			if(array[i] !=0) {
				array_2[x++] = array[i];
				}
			}
		for(int i = x; i < array.length; i ++) {
			array_2[i] = 0; 
			}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array_2[i] + " ");
		}
	}

}
