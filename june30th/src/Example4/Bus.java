package Example4;

public class Bus extends Vehicle {

	private int passengerCapacity;
	private long serialNum;
	private static long serialNumCtr = 2000;

	public Bus() {// default
		System.out.println("Creating Bus from default con");
		passengerCapacity = 10;
		serialNum = serialNumCtr;
		serialNumCtr++;

	}

	public Bus(int pc) {// parameter cons
		System.out.println("Creating Bus from parameter con");
		passengerCapacity = pc;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public Bus(Bus b) {// copy cons
		System.out.println("Creating Bus from copy con");
		setNumOfDoor(b.getNumOfDoor());
		setPrice(b.getprice());
		passengerCapacity = b.passengerCapacity;
		serialNum = serialNumCtr;
		serialNumCtr++;
	}

	public Bus(int nd, double pr, int pc) {
		//didnt add numOfCreatedObject why? beacuse of this
		this(pc);
		System.out.println("Creating Bus from using parameter cons for full setting");
		setPrice(pr);
		setNumOfDoor(nd);
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


	@Override
	public String toString() {
		return "this bus has " + getNumOfDoor() + " and with price of " + getprice() + " also this Bus has"
				+ passengerCapacity + " capacity";
	}
	
	public Bus clone() {
		return new Bus(this);
	}

}
