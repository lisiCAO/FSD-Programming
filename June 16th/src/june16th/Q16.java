package june16th;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to add two matrices of the same size.");
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		int[][] matrix2 = {
				{10,11,12},
				{13,14,15},
				{16,17,18}
				};
		int[][] result = new int[3][3];
		System.out.println("The addition of matrix and matrix_2 is : ");
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				result[i][j] = matrix[i][j] + matrix2[i][j];
				System.out.print( result[i][j] + " ");
				}System.out.println();
			}
		}
	}
