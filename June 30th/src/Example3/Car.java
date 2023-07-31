package Example3;

public class Car extends Vehicle {
	private int numOFSeats;
	private static int numOfCreatedObject = 0;

	public Car() {// default
		System.out.println("Creating Car from default con");
		numOFSeats = 5;
		numOfCreatedObject++;

	}

	public Car(int nd, double pr, int ns) {// parameter cons
		super(nd, pr);
		System.out.println("Creating Car from parameter con");
		numOFSeats = ns;
		numOfCreatedObject++;
	}

	public Car(Car c) {// copy cons
		System.out.println("Creating Car from copy con");
		setNumofdoor(c.getnumDoor());
		setPrice(c.getprice());
		numOFSeats = c.numOFSeats;
		numOfCreatedObject++;
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
	public static void DisplayNumberOfObject() {
		System.out.println("the number of created CAR so far is " + numOfCreatedObject);
	}

	@Override
	public String toString() {
		return "Car has" + numOFSeats + "number of seat, and " + getnumDoor() + " doors,with a price of " + getprice()
				+ "$";
	}

}
