package Example3;

public class Vehicle {
	public int numOfDoor;
	public double price;
	public int maxSpeed;
	
	public Vehicle() {
		System.out.println("vehicle created by default constract");
		numOfDoor = 4;
		price = 10000;
		maxSpeed = 280;
	}
	public Vehicle(int nd, double pr, int ms) {
		System.out.println("vehicle created by parameter constract");
		numOfDoor = nd;
		price = pr;
		maxSpeed = ms;
	}

	public Vehicle(Vehicle v) {
		System.out.println("vehicle created by Copy constract");
		numOfDoor = v.numOfDoor;
		price = v.price;
		maxSpeed = v.maxSpeed;
		
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
		System.out.println(" and my car has " + maxSpeed + " maximum speed");
	}
	

}
