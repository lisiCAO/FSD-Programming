package Example1;

public class Bus extends Vehicle {
	private int passengerCapacity;

	public Bus() {// default
		System.out.println("Creating Bus from default con");
		passengerCapacity = 10;

	}

	public Bus(int pc) {// parameter cons
		System.out.println("Creating Bus from parameter con");
		passengerCapacity = pc;
	}

	public Bus(Bus b) {// copy cons
		System.out.println("Creating Bus from copy con");
		passengerCapacity = b.passengerCapacity;
	}

	public Bus(int nd, double pr, int pc) {// parents parameter
		super(nd, pr);
		System.out.println("Creating Bus from parents parameter cons");
		passengerCapacity = pc;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengercapacity(int pc) {
		passengerCapacity = pc;
	}

//overridiing method
	public void setPrice(double pr) {
		if (pr < getprice() && pr > 0) {
			System.out.println("the price of bus reduced from " + getprice() + " to " + pr);
			super.setPrice(pr);
		} else if (pr > getprice() && pr > 0) {
			System.out.println("the price of bus increase  from " + getprice() + " to " + pr);
			super.setPrice(pr);
		} else if (pr < 0) {
			System.out.println("you cant do it ");
		}
	}

	@Override
	public String toString() {
		return "this bus has " + getnumDoor() + " and with price of " + getprice() + " also this Bus has"
				+ passengerCapacity + " capacity";
	}
}
