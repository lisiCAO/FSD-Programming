package Lisi;
/*
Print the following patterns using loop getting the number of line from user:
a.
     5
     45
     345
     2345
     12345
 Write a program to convert temperature from Fahrenheit to Celsius degree getting
 the values from users.
 Write a program that takes three numbers as input to calculate and print the
 average of the numbers.
2
b. 5 54
   543
   5432
   54321
c.
1
   12
   123
   1234
   12345
   123456
d.
 ***** **** ***
** *
 d.
 * ** ***
**** *****
 **** *** **
*
3

e.
***** **** ***
**
*
* ** ***
**** *****
f.
g. (it should be odd number)
1
23 456
7 8 9 10
11 12 13 14 15
1 212
 32123
4321234
32123 212
1
h. (it should be odd number)
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a.");
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j <= 5; j++) {
				System.out.print(j);

			}
			System.out.println();
		}
		System.out.println("b.");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				int num = 5 - j;
				System.out.print(num);

			}
			System.out.println();
		}
		System.out.println("c.");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("d.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("e.");
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("f.");
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
		System.out.println("g.");
		for (int i = 1; i <= 4; i++) {
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 3; i > 0; i--) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("h.");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 7; j >= (2 * i ) -1; j--){
				System.out.print("*");
			}System.out.println();
		}
	}
}
