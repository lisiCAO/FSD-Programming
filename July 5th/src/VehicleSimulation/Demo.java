package VehicleSimulation;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car("Benz", 4);
		Bus bus = new Bus("Toyota", 2, 55);

		Vehicle[] vehicles = { car, bus };

		/**
		 * Validates type of Vehicle Array, then transforms to interface.
		 */
		for (Vehicle vehicle : vehicles) {
			vehicle.start();
			if (vehicle instanceof Drivable) {
				Drivable drivable = (Drivable) vehicle;
				drivable.accelerate();
				drivable.brake();
			}
			vehicle.stop();
			System.out.println("--------------------");
		}

		car.start();
		car.accelerate();
		car.toggleSunroof();
		car.brake();
		car.stop();

		bus.start();
		bus.accelerate();
		bus.loadPassenger(5);
		bus.brake();
		bus.stop();
	}
}
