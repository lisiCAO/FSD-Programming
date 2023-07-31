package Exam;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please put your N value ?");
		int N = kb.nextInt(); // obtain the size of array from user.

		int[][] array = new int[N][N]; // the array is N * N.

		// obtain array values one by one
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = kb.nextInt();
			}
		}
		
		// create a new array to get reversed array
		int[][] reverseArray = reverse_array(array, N);

		// print reverse array
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(reverseArray[i][j] + " ");
			}
			System.out.println();
		}

		kb.close();
		System.exit(0);
	}

//create a method with parameters array and the size of row and column
	public static int[][] reverse_array(int[][] array, int N) {

		int temp = 0;// create a variable to store value.

		// reverse the rows, switch from top-end to middle
		// keep the position of column
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < N; j++) {
				temp = array[i][j];
				array[i][j] = array[N - i - 1][j];
				array[N - i - 1][j] = temp;
			}
		}
		// get reversed array.
		return array;
	}

}
