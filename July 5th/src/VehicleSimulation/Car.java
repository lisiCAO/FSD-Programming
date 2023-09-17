package VehicleSimulation;

public class Car extends Vehicle implements Drivable {

	private boolean sunroofOpen;

	public Car(String brand, int numOfDoor) {
		super(brand, numOfDoor);
	}

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating");
	}

	@Override
	public void brake() {
		System.out.println("Car is braking");
	}

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	// Car-specific method
	public void toggleSunroof() {
		sunroofOpen = !sunroofOpen;
		if (sunroofOpen) {
			System.out.println("Sunroof is now open");
		} else {
			System.out.println("Sunroof is now closed");
		}
	}

}
