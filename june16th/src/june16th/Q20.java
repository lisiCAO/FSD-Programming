package june16th;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find the number of even and odd integers in a given array of integers.");
		System.out.println();
		int[] array = {1,2,3,4,5,6,7};
		System.out.print("the number of even：");
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}System.out.println();
		System.out.print("the number of odd：");
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
