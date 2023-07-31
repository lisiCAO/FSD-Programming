package Example1;
import java.util.ArrayList;

class Car2 {// Attributes
	private int numOfDoors;
	private double price;
	private int numOfSeats;

	// Constructors
	public Car2() {
		numOfDoors = 4;
		price = 10000;
		numOfSeats = 5;
	}

	public Car2(int nd, double pr, int ns) {
		numOfDoors = nd;
		price = pr;
		numOfSeats = ns;
	}

	public Car2(Car2 c) {
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
}
public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Car2 c1 = new Car2(4, 12000, 5), c2 = new Car2(2, 23000, 2), c3 = new Car2(2, 28000, 4), c4 = new Car2(),
				c5 = new Car2(2, 8000, 5), c6 = new Car2(4, 17000, 2), c7 = new Car2(5, 26000, 6);

		Car2 c;
		ArrayList<Car2> A1 = new ArrayList<Car2>();
		
		A1.add(c1);
		A1.add(c2);
		A1.add(c3);//this
		A1.add(c4);
		A1.add(c5);//this removed
		A1.add(c3);
		A1.add(c6);
		
		if(A1.contains(c4)) {
			System.out.println("car c4 is  inside my list in the index of " + A1.indexOf(c4)); 
		}else {
			System.out.println("It is not exist ");
		}
		
		if(A1.contains(c7)) {
			System.out.println("car c7 is  inside my list in the index of " + A1.indexOf(c7)); 
		}else {
			System.out.println("It is not exist ");
		}
		
		A1.remove(2);
		A1.remove(4);
		System.out.println(A1.indexOf(c4));
		
//		for (i = 0; i < A1.size(); i++) {
//			c = A1.get(i); // Get the element at index i
//			System.out.println("\nInformation of Car at index " + i + " is as follows: ");
//			System.out.println("============================================ ");
//			System.out.println(c);
//		}
		
//		for(Car2 car : A1) {
//			System.out.println(car);
//		}
//		
		A1.clear();
		if(!A1.isEmpty()) {
			c = A1.get(A1.size()-1);
			System.out.println(c);
		}else {
			System.out.println("=============List is empty ================ ");
		}
	}

}