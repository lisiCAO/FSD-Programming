package Example3;

public class RaceCar extends SportCar {
	private int horsePower;
	private static int numOfCreatedObject = 0;

	public RaceCar() {// default
		System.out.println("Creating RaceCar from default con");
		horsePower = 400;
		numOfCreatedObject++;
	}

	public RaceCar(int nd, double pr, int ns, double gc, int hp) {// parameter cons
		super(nd, pr, ns, gc);
		System.out.println("Creating RaceCar from parameter con");
		horsePower = hp;
		numOfCreatedObject++;
	}

	public RaceCar(RaceCar rc) {// copy cons
		System.out.println("Creating RaceCar from copy con");
		setNumofdoor(rc.getnumDoor());
		setPrice(rc.getprice());
		setnumOFSeats(rc.getnumOFSeats());
		setGasConsumption(rc.getGasConsumption());
		horsePower = rc.horsePower;
		numOfCreatedObject++;
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

	public static void DisplayNumberOfObject() {
		System.out.println("the number of created RACECAR so far is " + numOfCreatedObject);
	}

	@Override
	public String toString() {
		return "RaceCar has" + horsePower + " horsepower, with " + getGasConsumption() + " gass consum, and "
				+ getnumOFSeats() + "number of seats, and " + getnumDoor() + " doors, with price of" + getprice() + "$";
	}

}
