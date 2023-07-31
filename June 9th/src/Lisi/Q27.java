package Lisi;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5, breadth = 4;
		int area = length * breadth;
		int perimeter = 2 * (length + breadth);
		if (area > perimeter) {
			System.out
					.println("the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter");
		} else {
			System.out
					.println("the perimeter of the rectangle with length = 5 and breadth = 4 is greater than its area");
		}
		
	}

}
