package Example3;

public class RaceCar extends SportCar{
	private int horsePower;
	
	public RaceCar() {// default
		System.out.println("Creating RaceCar from default con");
		horsePower = 400;
		
	}

	public RaceCar(int nd, double pr , int ns , double gc ,int hp) {// parameter cons
		super(nd,pr,ns,gc);
		System.out.println("Creating RaceCar from parameter con");
		horsePower = hp;
	}
	
	public RaceCar(RaceCar rc) {//copy cons
		System.out.println("Creating RaceCar from copy con");
		setNumOfDoor(rc.getNumOfDoor());
		setPrice(rc.getPrice());
		setnumOFSeats(rc.getnumOFSeats());
		setGasConsumption(rc.getGasConsumption());
		horsePower = rc.horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int hp) {
		horsePower = hp;
	}

	@Override
	public String toString() {
		return "RaceCar has" + horsePower + " horsepower, with " + getGasConsumption()
				+ " gass consum, and " + getnumOFSeats() + "number of seats, and " + getNumOfDoor() 
				+ " doors, with price of"
				+ getPrice() + "$";
	}
	
	
}
