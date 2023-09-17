package VehicleSimulation;

public class Bus extends Vehicle implements Drivable {
	private int passengerCapacity;
	private int passengers;

	public Bus(String brand, int numOfDoor, int passengerCapacity) {
		super(brand, numOfDoor);
		this.setPassengerCapacity(passengerCapacity);
	}

	@Override
	public void accelerate() {
		System.out.println("Bus is accelerating");
	}

	@Override
	public void brake() {
		System.out.println("Bus is braking");
	}

	@Override
	public void start() {
		System.out.println("Bus is starting");
	}

	// Bus-specific method
	public void loadPassenger(int count) {
		this.passengers += count;
		System.out.println(count + " passengers loaded. Total passengers: " + this.passengers);
	}

	public void unloadPassenger(int count) {
		this.passengers -= count;
		System.out.println(count + " passengers unloaded. Total passengers: " + this.passengers);
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
}
