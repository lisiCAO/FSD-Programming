package Example4;

public class Vehicle {
	
	protected int numOfDoor;
	protected double price;
	private long serialNum;
	private static long serialNumCtr = 1000;
	
	//default
	public Vehicle() {
		System.out.println("Crating vehicle from defult con");
		numOfDoor = 4;
		price = 10000;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}
	//parameter
	public Vehicle(int nd , double pr) {
		System.out.println("Crating vehicle from parameter con");
		numOfDoor = nd;
		price = pr;
	}
	
	
	//copy
	public Vehicle(Vehicle v) {
		System.out.println("Crating vehicle from Copy con");
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
	public void setPrice(double pr) {
		price = pr;
	}
	@Override
	public String toString() {
		return "Vehicle" + numOfDoor + "number of door, and " + price + " $, serialNum=" + serialNum ;
	}
	
	public Vehicle clone() {
		return new Vehicle(this);
	}

}
