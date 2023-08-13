package generic;

import java.util.List;
import java.util.ArrayList;

public class MyProgram4 {
	public static <T> ArrayList<T> reverseElements(List<T> array){
		ArrayList<T> myArr = new ArrayList<>(array.size());
		for(int i = array.size(); i > 0; i--) {
			myArr.add(array.get(i - 1 ));
		}return myArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = List.of(1,2,3,4,5,6,7,8,9,10);
		ArrayList<Integer> newArr = reverseElements(array);
		for(Integer n : newArr) {
			System.out.print(n + " " );
		} 

	}

}
