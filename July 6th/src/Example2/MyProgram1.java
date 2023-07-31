package Example2;

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
	
//	public boolean equals(Car c) {
//		return(this.price == c.price &&this.numOfDoors ==c.numOfDoors && this.numOfSeats == c.numOfSeats);
//	}
}

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Car c1 = new Car(4, 12000, 5), c2 = new Car(2, 23000, 2), c3 = new Car(2, 28000, 4), c4 = new Car(),
				c5 = new Car(2, 8000, 5), c6 = new Car(4, 17000, 2), c7 = new Car(5, 26000, 6);

		Car c;

		ArrayList<Car> A1 = new ArrayList<Car>(5);
		ArrayList<Car> A2 = new ArrayList<Car>(3);
		ArrayList<Car> A3 = new ArrayList<Car>(7);

		ArrayList<ArrayList<Car>> mytable = new ArrayList<ArrayList<Car>>(3);

		A1.add(c1);
		A1.add(c2);
		A1.add(c3);

		A2.add(c2);
		A2.add(c3);
		A2.add(c4);
		A2.add(c5);
		A2.add(c6);
		A2.add(c7);

		A3.add(c1);
		A3.add(c6);

		mytable.add(A1);
		mytable.add(A2);
		mytable.add(A3);

		for (i = 0; i < mytable.size(); i++) {
			System.out.println("information of colum " + i + "of my table");
			System.out.println("===========================");
			ArrayList<Car> x = mytable.get(i);
			for (j = 0; j < x.size(); j++) {
				c = x.get(j);
				System.out.println("information of car at index " + j + "of my table");
				System.out.println("===========================");
				System.out.println(c);
			}
		}
		
		ArrayList<Car> A4 = new ArrayList<Car>(2);
		ArrayList<Car> A5 = new ArrayList<Car>(2);
		A4.add(c1);
		A4.add(c2);
		
		A5.add(c2);
		A5.add(c1);
		
		if(A4.equals(A5)) {
			System.out.print("List are equals");
		}else {
			System.out.print("Nope");
		}

	}

}
