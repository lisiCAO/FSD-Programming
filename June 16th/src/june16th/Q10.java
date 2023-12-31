package june16th;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find duplicate values in an array of string values.");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of your array: ");
		int num = kb.nextInt();
		String[] array = new String[num];
		
		System.out.println("Enter your array: ");
		for(int i = 0 ; i < num; i++) {
			array[i] = kb.next();
		}
		Set<String> duplicates = findDuplicate(array,num);
		for(String s : duplicates) {
			System.out.println(s);
		}
	}
	public static Set<String> findDuplicate(String[] array, int num) {
		Set<String> set = new HashSet<>();
		Set<String> duplicate = new HashSet<>();
		for(String value: array) {
			if(!set.add(value)) {
				duplicate.add(value);
			}
		}return duplicate;
		
	}

}
