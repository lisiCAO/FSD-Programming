package Example1;

public class Vehicle {
	protected int numOfDoors;
	protected double price;
	int phone;
	
	public Vehicle()	// default constructor 
	{
		System.out.println("Creating veh from default con");
		numOfDoors = 4;
		price = 10000;

	}
	
	public Vehicle(int nd, double pr)	
	{
		System.out.println("Creating veh from parameter con");
		numOfDoors = nd;
		price = pr;
	}
	
	
	public Vehicle(Vehicle v) {
		System.out.println("Creating veh from Copy con");
		numOfDoors = v.numOfDoors;
		price = v.price;
	}

	protected int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int nd) {
		numOfDoors = numOfDoors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	@Override
	public String toString() {
		return "Vehicle has" + numOfDoors + "number of doors,and price is " + price + "$";
	}
	
}
