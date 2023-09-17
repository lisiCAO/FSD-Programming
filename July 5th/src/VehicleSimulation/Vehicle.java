package VehicleSimulation;

public abstract class Vehicle {
	private String brand;
	private int numOfDoor;

	public Vehicle(String brand, int numOfDoor) {
		this.brand = brand;
		this.numOfDoor = numOfDoor;
	}

	// Abstract Method, which must be implemented
	public abstract void start();

	public void stop() {
		System.out.println("Stopping from " + brand + " vehicle.");
	}

	// Others - getters, setters and toString
	public String getBrand() {
		return brand;
	}

	public void setBrand(String br) {
		brand = br;
	}

	public int getNumOfDoor() {
		return numOfDoor;
	}

	public void setNumOfDoor(int nd) {
		numOfDoor = nd;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", numOfDoor=" + numOfDoor + "]";
	}

}