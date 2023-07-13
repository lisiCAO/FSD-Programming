package Example4;


public class SportCar extends Car {
	private double gasConsumption;
	private long serialNum;
	private static long serialNumCtr = 4000;

	public SportCar() {// default
		System.out.println("Creating SportCar from default con");
		gasConsumption = 4;
		serialNum = serialNumCtr;
		serialNumCtr++;

	}

	public SportCar(int nd, double pr, int ns, double gc) {// parameter cons
		super(nd, pr, ns);
		System.out.println("Creating SportCar from parameter con");
		gasConsumption = gc;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public SportCar(SportCar sc) {// copy cons
		System.out.println("Creating SportCar from copy con");
		setNumOfDoor(sc.getNumOfDoor());
		setPrice(sc.getprice());
		setnumOFSeats(sc.getnumOFSeats());
		gasConsumption = sc.gasConsumption;
		serialNum = serialNumCtr;
		serialNumCtr++;
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

	public SportCar clone() {
		return new SportCar(this);
	}

	@Override
	public String toString() {
		return "SportCar has" + gasConsumption + "gasconsumption with" + getnumOFSeats() + " number of seat,and "
				+ getNumOfDoor() + " doors, with price of  " + getprice() + "$";
	}

}
