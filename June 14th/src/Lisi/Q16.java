package Lisi;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(10);
	}

	public static void table(int size) {
		System.out.print("     ");
		for (int i = 1; i <= size; i++) {
			System.out.printf("%5d", i);
		}
		System.out.println();
		for (int i = 1; i <= size; i++) {
			System.out.printf("%5d", i);
			for (int j = 1; j <= size; j++) {
				System.out.printf("%5d", i * j);
			}
			System.out.println();
		}

	}
}
