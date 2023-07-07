package activity6thjuly;

import java.util.Arrays;

//class GenArray<T>{
//	private T[] x;
//	
//	@SuppressWarnings("unchecked")
//	public GenArray(T[] y){
//		this.x = (T[]) new Object[y.length];
//		System.arraycopy(y, 0, x, 0, y.length);
//	}
//	
//	public T[] get() {
//		return x;
//	}
//	
//	public T[] set(T[] y) {
//		this.x = y;
//		return x;
//	}
//	
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(this.getClass() != obj.getClass() || obj == null) {
//			return false;
//		}
//		GenArray<T> input = (GenArray<T>) obj;
//		return Arrays.equals(x, input.x);
//	}
//}
//
//
//public class MyProgram1 {
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Integer[] arr1 = new Integer[4];
//		Integer[] arr2 = new Integer[4];
//		Integer[] arr3 = new Integer[4];
//		arr2[0] = 0; 
//		arr2[1] = 1; 
//		arr2[2] = 2; 
//		arr2[3] = 3; 
//		int i = 0;
//		for(i = 0; i < arr1.length; i++) {
//			arr1[i] = i;
//			arr3[i] = i + 1;
//		}
//
//		GenArray<Integer> m = new GenArray<>(arr1);
//		GenArray<Integer> n = new GenArray<>(arr2);
//		GenArray<Integer> p = new GenArray<>(arr3);
//		
//		if(m.equals(n)) {
//			System.out.println("it is equal");
//		}else {
//			System.out.println("Nope");
//		}
//		
//		if(m.equals(p)) {
//			System.out.println("it is equal");
//		}else {
//			System.out.println("Nope");
//		}
//	}
//}
public class MyProgram1 {
public static <T> boolean checkArrayEquality(T[] array1, T[] array2) {
    if (array1.length != array2.length) {
        return false;
    }
    for (int i = 0; i < array1.length; i++) {
        if (!array1[i].equals(array2[i])) {
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    Integer[] array1 = {1, 2, 3, 4, 5};
    Integer[] array2 = {1, 2, 3, 4, 5};
    Integer[] array3 = {1, 2, 3, 4, 6};

    System.out.println("Array 1 and Array 2 are equal: " + checkArrayEquality(array1, array2));  // Output: true
    System.out.println("Array 1 and Array 3 are equal: " + checkArrayEquality(array1, array3));  // Output: false
}
}
