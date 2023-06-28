package Example1;

public class Vehicle {
	public int numOfDoor = 4;
	private double price = 10000;
	private int maxSpeed = 280;

	
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
		System.out.println("my car has" + numOfDoor + "Doors");
		System.out.println("my car is " + price + " $");
		System.out.println("my car has " + maxSpeed + "Maximum speed");
	}
	

}
