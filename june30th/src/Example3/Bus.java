package Example3;

public class Bus extends Vehicle {

	private int passengerCapacity;
	private static int numOfCreatedObject = 0;

	public Bus() {// default
		System.out.println("Creating Bus from default con");
		passengerCapacity = 10;
		numOfCreatedObject++;

	}

	public Bus(int pc) {// parameter cons
		System.out.println("Creating Bus from parameter con");
		passengerCapacity = pc;
		numOfCreatedObject++;
	}

	public Bus(Bus b) {// copy cons
		System.out.println("Creating Bus from copy con");
		setNumofdoor(b.getnumDoor());
		setPrice(b.getprice());
		passengerCapacity = b.passengerCapacity;
		numOfCreatedObject++;
	}

	public Bus(int nd, double pr, int pc) {
		//didnt add numOfCreatedObject why? beacuse of this
		this(pc);
		System.out.println("Creating Bus from using parameter cons for full setting");
		setPrice(pr);
		setNumofdoor(nd);
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengercapacity(int pc) {
		passengerCapacity = pc;
	}

	public double getprice() {
		String a = "Bus";
		System.out.println("getPrice executed from " + a + "Class the price is " + price + "$");
		return price;

	}

	public static void DisplayNumberOfObject() {
		System.out.println("the number of created BUS so far is " + numOfCreatedObject);
	}

	@Override
	public String toString() {
		return "this bus has " + getnumDoor() + " and with price of " + getprice() + " also this Bus has"
				+ passengerCapacity + " capacity";
	}

}
