package Example1;
import java.util.ArrayList;

class Car {// Attributes
	private int numOfDoors;
	private double price;
	private int numOfSeats;

	// Constructors
	public Car() {
		numOfDoors = 4;
		price = 10000;
		numOfSeats = 5;
	}

	public Car(int nd, double pr, int ns) {
		numOfDoors = nd;
		price = pr;
		numOfSeats = ns;
	}

	public Car(Car c) {
		numOfDoors = c.numOfDoors;
		price = c.price;
		numOfSeats = c.numOfSeats;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int nd) {
		numOfDoors = nd;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int ns) {
		numOfSeats = ns;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "This Car has " + getNumOfDoors() + " doors and its price is: " + getPrice()
				+ "$. The number of seats of this car is " + numOfSeats + ".";
	}
} // end of Car class

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Car c1 = new Car(4, 12000, 5), c2 = new Car(2, 23000, 2), c3 = new Car(2, 28000, 4), c4 = new Car(),
				c5 = new Car(2, 8000, 5), c6 = new Car(4, 17000, 2), c7 = new Car(5, 26000, 6);

		Car c;

		ArrayList<Car> A1 = new ArrayList<Car>(5);
		System.out.println("The list has been created, and its current size is: " + A1.size());

		A1.add(c1);
		A1.add(c3);
		A1.add(c4);

		System.out.println("Objects added to the list. The list current size is: " + A1.size());

		for (i = 0; i < A1.size(); i++) {
			c = A1.get(i); // Get the element at index i
			System.out.println("\nInformation of Car at index " + i + " is as follows: ");
			System.out.println("============================================ ");
			System.out.println(c);
		}
		
		A1.set(1, c7);
		
		
		System.out.println("=========After changing for set ========== ");
		for (i = 0; i < A1.size(); i++) {
			c = A1.get(i); // Get the element at index i
			System.out.println("\nInformation of Car at index " + i + " is as follows: ");
			System.out.println("============================================ ");
			System.out.println(c);
		}
		
		
		A1.add(1,c6);
		A1.add(c2);
		A1.add(c5);
		System.out.println("=========After changing for Add ========== ");
		for (i = 0; i < A1.size(); i++) {
			c = A1.get(i); // Get the element at index i
			System.out.println("\nInformation of Car at index " + i + " is as follows: ");
			System.out.println("============================================ ");
			System.out.println(c);
		}
	}
}