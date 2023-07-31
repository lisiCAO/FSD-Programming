package Example4;


public class RaceCar extends SportCar {
	private int horsePower;
	private long serialNum;
	private static long serialNumCtr = 4000;


	public RaceCar() {// default
		System.out.println("Creating RaceCar from default con");
		horsePower = 400;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public RaceCar(int nd, double pr, int ns, double gc, int hp) {// parameter cons
		super(nd, pr, ns, gc);
		System.out.println("Creating RaceCar from parameter con");
		horsePower = hp;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public RaceCar(RaceCar rc) {// copy cons
		System.out.println("Creating RaceCar from copy con");
		setNumOfDoor(rc.getNumOfDoor());
		setPrice(rc.getprice());
		setnumOFSeats(rc.getnumOFSeats());
		setGasConsumption(rc.getGasConsumption());
		horsePower = rc.horsePower;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int hp) {
		horsePower = hp;
	}

	public double getprice() {
		String a = "RaceCar";
		System.out.println("getPrice executed from " + a + "Class the price is " + price + "$");
		return price;

	}

	public RaceCar clone() {
		return new RaceCar(this);
	}

	@Override
	public String toString() {
		return "RaceCar has" + horsePower + " horsepower, with " + getGasConsumption() + " gass consum, and "
				+ getnumOFSeats() + "number of seats, and " + getNumOfDoor() + " doors, with price of" + getprice() + "$";
	}

}
