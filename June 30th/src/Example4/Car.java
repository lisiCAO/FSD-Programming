package Example4;


public class Car extends Vehicle {
	private int numOFSeats;
	private long serialNum;
	private static long serialNumCtr = 3000;

	public Car() {// default
		System.out.println("Creating Car from default con");
		numOFSeats = 5;
		serialNum = serialNumCtr;
		serialNumCtr++;

	}

	public Car(int nd, double pr, int ns) {// parameter cons
		super(nd, pr);
		System.out.println("Creating Car from parameter con");
		numOFSeats = ns;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public Car(Car c) {// copy cons
		System.out.println("Creating Car from copy con");
		setNumOfDoor(c.getNumOfDoor());
		setPrice(c.getprice());
		numOFSeats = c.numOFSeats;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public int getnumOFSeats() {
		return numOFSeats;
	}

	public void setnumOFSeats(int ns) {
		numOFSeats = ns;
	}

	public double getprice() {
		String a = "Car";
		System.out.println("getPrice executed from " + a + "Class the price is " + price + "$");
		return price;

	}
	public Car clone() {
		return new Car(this);
	}

	@Override
	public String toString() {
		return "Car has" + numOFSeats + "number of seat, and " + getNumOfDoor() + " doors,with a price of " + getprice()
				+ "$";
	}

}
