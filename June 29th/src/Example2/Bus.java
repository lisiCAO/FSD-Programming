package Example2;

public class Bus extends Vehicle{
private int passengerCapacity;
	
	public Bus() {// default
		System.out.println("Creating Bus from default con");
		passengerCapacity = 10;
		
	}

	public Bus(int pc) {// parameter cons
		System.out.println("Creating Bus from parameter con");
		passengerCapacity = pc;
	}
	
	public Bus(Bus b) {//copy cons
		System.out.println("Creating Bus from copy con");
		passengerCapacity = b.passengerCapacity;
	}
	
	public Bus(int nd, double pr,int pc) {
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
	
	@Override
	public String toString() {
		return "this bus has " + getnumDoor() + " and with price of " + getprice()
				+ " also this Bus has" + passengerCapacity + " capacity";
	}
	
}