package activity6thjuly;

import java.util.List;

public class MyProgram2 {
	public static <T extends Number> int[] CalSumOfEvenOrOdd(List<T> numbers) {
		int evenNum = 0;
		int oddNum = 0;
		for(T number : numbers ) {
			if(number.intValue() % 2 == 0) {
				evenNum += number.intValue();
			}else {
				oddNum += number.intValue();
			}
		}
		return new int[] {evenNum,oddNum};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		int[] sum = CalSumOfEvenOrOdd(numbers);
		System.out.println("The sum of Even numver: " + sum[0]);
		System.out.println("The sum of Even numver: " + sum[1]);

	}

}
