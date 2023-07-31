package Example;

public abstract class Vehicle {
	
	private String brand;
	private int numOfDoor;
	
	public abstract void start();
	
	public void stop() {
		System.out.println("Stopping from Vehicle class");
	}
	
	public Vehicle(String br,int nd) {
		brand = br;
		numOfDoor = nd;
	}

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