package Example;

public class Car extends Vehicle implements Drivable{
	
	public Car(String br, int nd) {
		super(br,nd);
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate from Car class");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Brake from Car class");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start from Car class");
	}
	
	public void testCar() {
		System.out.println("testing from Car class");
	}
	
}
