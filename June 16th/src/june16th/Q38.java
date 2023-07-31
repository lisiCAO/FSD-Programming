package june16th;

public class Q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.");
        int arr[] = {16, 17, 4, 3, 5, 2};
        nextGreatest(arr);
        System.out.println("The modified array:");
        printArray(arr);
        }
    static void nextGreatest(int arr[]) {
        int size = arr.length;
        int max_from_right =  arr[size-1];
        arr[size-1] = -1;
        for (int i = size-2; i >= 0; i--) {            
            int temp = arr[i];
            arr[i] = max_from_right;
            if(max_from_right < temp)
               max_from_right = temp;
            }
        }
    static void printArray(int arr[]) {
        for (int i=0; i < arr.length; i++)
        	System.out.print(arr[i]+" ");
        }
    }
