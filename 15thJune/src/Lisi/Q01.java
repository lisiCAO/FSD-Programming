package Lisi;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display_pentagonal(50);
	}

	public static void display_pentagonal(int n) {
		for (int i = 1; i <= n; i++) {
			int number = get_pentagonal(i);
			System.out.printf("%5d", number);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	public static int get_pentagonal(int num) {
		return num * (3 * num - 1) / 2;
	}
}
