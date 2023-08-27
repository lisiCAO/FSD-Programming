/* 
 * Purpose: use Abstract class, inheritance to reduce redundant code. 
 * Script date: August 13, 2023
 * Author: Lisi Cao
 */

package animal_abstract;

public class Driver {

	public static void main(String[] args) {
		Animal dog = new Dog(true, true);
		Animal cow = new Cow(true, false);
		Animal duck = new Duck(false, false);

		System.out.println(dog.describe());
		System.out.println(cow.describe());
		System.out.println(duck.describe());
		System.exit(0);
	}

}
