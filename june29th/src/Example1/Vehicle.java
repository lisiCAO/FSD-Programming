package Example1;

public class Vehicle {
	
	protected int numOfDoor;
	protected double price;
	
	public Vehicle() {//default
		System.out.println("Creating Vehicle from default");
		numOfDoor = 4;
		price = 10000;
	}
	public Vehicle(int nd, double pr) {//parameter cos
		System.out.println("Creating Vehicle from parameter con");
		numOfDoor = nd;
		price = pr;
	}
	public Vehicle(Vehicle v) {//copy
		System.out.println("Creating Vehicle from copy con");
		numOfDoor = v.numOfDoor;
		price = v.price;
	}
	
	public int getNumOfDoor() {
		return numOfDoor;
	}
	
	public void setNumOfDoor(int nd) {
		numOfDoor = nd; 
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setprice(double pr) {
		price = pr; 
		}
	
	@Override
	public String toString() {
		return "This vehicle has " + numOfDoor + " number of door and the price is " + price + "$";
	}
	

}
	
