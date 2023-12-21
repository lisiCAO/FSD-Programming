/*
 * Purpose: Use '*' and '=' to print USA flag.
 * Author: Lisi Cao
 * @version: 2.0
 * @since: September 23, 2023;
 */

package Lisi;

public class AmericanFlag {

	public static void output(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		String x = "* * * * * * ==================================";
		String y = " * * * * *  ==================================";
		String z = "==============================================";

//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(x);
//		System.out.println(z);
//		System.out.println(z);
//		System.out.println(z);
//		System.out.println(z);
//		System.out.println(z);
//		System.out.println(z);

		// Prints star patterns
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				output(y);
			} else {
				output(x);
			}
		}
		// Prints strips patterns
		for (int i = 0; i < 6; i++) {
			output(z);
		}
	}

}
