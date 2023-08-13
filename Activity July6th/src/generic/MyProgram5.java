package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyProgram5 {
	public static <T> List<T> mergeList(List<T> list1, List<T> list2) {
		List<T> mergeList = new ArrayList<>();
		Iterator<T> it1 = list1.iterator();
		Iterator<T> it2 = list2.iterator();

		while(it1.hasNext()||it2.hasNext()) {
			mergeList.add(it1.next());
			mergeList.add(it2.next());
			}
		return mergeList;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = List.of(1,3,5,7,9);
		List<Integer> list2 = List.of(2,4,6,8,10);
		
			System.out.println(mergeList(list1, list2));

	}

}
