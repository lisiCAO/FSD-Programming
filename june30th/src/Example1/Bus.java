package Example1;

public class Bus extends Vehicle{
	private int passengerCapacity;
	
	public Bus()	// default constructor 
	{
		System.out.println("Creating Bus from default con");
		numOfDoors = 2;
		price = 55000;
		passengerCapacity =10;
		phone = 2;

	}
	
	public Bus(int pc,int nd, double pr)	
	{
		System.out.println("Creating Bus from parameter con");
		numOfDoors = nd;
		price = pr;
		passengerCapacity = pc;
	}
	
	
	public Bus(Bus b) {
		System.out.println("Creating veh from Copy con");
		numOfDoors = b.numOfDoors;
		price = b.price;
		passengerCapacity = b.passengerCapacity;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int pc) {
		passengerCapacity = pc;
	}

	@Override
	public String toString() {
		return "Bus has" + passengerCapacity + " capacity, and" + numOfDoors + "num of doors,with a price of"
				+ price + "$";
	}
	
	

}