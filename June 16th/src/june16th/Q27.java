package june16th;
import java.util.Set;
import java.util.HashSet;
public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.");
		System.out.println();
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println(longestConsecutive(array));  // 输出 5
        }
	public static int longestConsecutive(int[] array) {
		Set<Integer> set = new HashSet<>();
		for(int element : array) {
			set.add(element);
			}
		int longestStreak = 0;
		for(int element: set) {
			if(!set.contains(element - 1 )) {
				int currentElement = element;
				int currentStreak = 1;
				while(set.contains(currentElement + 1)) {
					currentElement += 1;
					currentStreak +=1;
					}
				longestStreak = Math.max(longestStreak, currentStreak);
				}
			}	
		return longestStreak;
		}
	}