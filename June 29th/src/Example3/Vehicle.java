package Example3;

public class Vehicle {
	private int numofDoor;
	private double price;
	
	public Vehicle() {// default
		System.out.println("Creating Vehicle from default con");
		numofDoor = 4;
		price = 10000;
	}
	public Vehicle(int nd, double pr) {// parameter cons
		System.out.println("Creating Vehicle from parameter con");
		numofDoor = nd;
		price = pr;
	}
	
	public Vehicle(Vehicle v) {//copy cons
		System.out.println("Creating Vehicle from copy con");
		numofDoor = v.numofDoor;
		price = v.price;
	}
	
	public int getNumOfDoor() {
		return numofDoor;
	}
	
	public void setNumOfDoor(int nd) {
		numofDoor = nd;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double pr) {
		price = pr;
	}

	@Override
	public String toString() {
		return "this vehicle has" + numofDoor + " number of door and the price is" + price + "$";
	}
}
