package Lisi;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 300;
		long a = 0, b = 1, c = 0;
		for (int i = 0; i < num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
		}
	}
}
