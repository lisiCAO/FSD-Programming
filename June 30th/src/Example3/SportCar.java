package Example3;

public class SportCar extends Car {
	private double gasConsumption;
	private static int numOfCreatedObject = 0;

	public SportCar() {// default
		System.out.println("Creating SportCar from default con");
		gasConsumption = 4;
		numOfCreatedObject++;

	}

	public SportCar(int nd, double pr, int ns, double gc) {// parameter cons
		super(nd, pr, ns);
		System.out.println("Creating SportCar from parameter con");
		gasConsumption = gc;
		numOfCreatedObject++;
	}

	public SportCar(SportCar sc) {// copy cons
		System.out.println("Creating SportCar from copy con");
		setNumofdoor(sc.getnumDoor());
		setPrice(sc.getprice());
		setnumOFSeats(sc.getnumOFSeats());
		gasConsumption = sc.gasConsumption;
		numOfCreatedObject++;
	}

	public double getGasConsumption() {
		return gasConsumption;
	}

	public void setGasConsumption(double gc) {
		gasConsumption = gc;
	}

	public double getprice() {
		String a = "SportCar";
		System.out.println("getPrice executed from " + a + "Class the price is " + price + "$");
		return price;

	}

	public static void DisplayNumberOfObject() {
		System.out.println("the number of created SPORTCAR so far is " + numOfCreatedObject);
	}

	@Override
	public String toString() {
		return "SportCar has" + gasConsumption + "gasconsumption with" + getnumOFSeats() + " number of seat,and "
				+ getnumDoor() + " doors, with price of  " + getprice() + "$";
	}

}
