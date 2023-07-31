package june16th;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6. Write a Java program to insert an element (specific position) into an array.");
		int[] array = {2,5,7,10,12};
		int element = 9;
		System.out.println("insert element to index 3");
		int[] newArray = new int[6];
		for(int i= 0, j = 0; i <5; i++) {
			newArray[j++] = array[i];
			if(i == 2) {
				newArray[j++] = element;
				continue;
			}
		}
		for(int i = 0; i < 6; i++) {
		System.out.println(newArray[i]);
		}
		}
	}


