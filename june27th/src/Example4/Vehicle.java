package Example4;

public class Vehicle {
	private int numOfDoor;
	private double price;
	private int maxSpeed;
	private long serialNum;
	private static long serialNumCounter =1000000;

	public Vehicle() {
		System.out.println("vehicle created by default constract");
		numOfDoor = 4;
		price = 10000;
		maxSpeed = 280;
		serialNum = serialNumCounter;
		serialNumCounter ++;
	}
	public Vehicle(int nd, double pr, int ms) {
		System.out.println("vehicle created by parameter constract");
		numOfDoor = nd;
		price = pr;
		maxSpeed = ms;
		serialNum = serialNumCounter;
		serialNumCounter ++;
	}

	public Vehicle(Vehicle v) {
		System.out.println("vehicle created by Copy constract");
		numOfDoor = v.numOfDoor;
		price = v.price;
		maxSpeed = v.maxSpeed;
		serialNum = serialNumCounter;
		serialNumCounter ++;
	}
	public int getNumOfDoor() {
		return numOfDoor;
	}
	public void setNumOfDoor(int nd) {
		numOfDoor =nd;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double pr) {
		price = pr;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int ms) {
		maxSpeed = ms;
	}

	public void info() {
		System.out.print("my car has " + numOfDoor + " Doors");
		System.out.print(" and my car is " + price + " $");
		System.out.println(" and my car has " + maxSpeed + " maximum speed" + " and has serial number " + serialNum);
	}
	

}
