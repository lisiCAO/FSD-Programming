package Lisi;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("give values of hardness: ");
		int a = kb.nextInt();
		System.out.println("give values of carbon content: ");
		double b = kb.nextDouble();
		System.out.println("give values of tensile strength: ");
		int c = kb.nextInt();
		if (a > 50 && b < 0.7 && c > 5600) {
			System.out.println("grade 10");
		} else if (a > 50 && b < 0.7) {
			System.out.println("grade 9");
		} else if (b < 0.7 && c > 5600) {
			System.out.println("grade 8");
		} else if (a > 50 && c > 5600) {
			System.out.println("grade 7");
		}else if(a > 50 || b < 0.7 || c > 5600) {
			System.out.println("grade 6");
		}else {
			System.out.println("grade 5");
		}kb.close();
		
	}

}
