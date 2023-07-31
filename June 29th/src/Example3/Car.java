package Example3;

public class Car extends Vehicle{
	private int numOFSeats;
	
	public Car() {// default
		System.out.println("Creating Car from default con");
		numOFSeats = 5;
		
	}

	public Car(int nd, double pr , int ns) {// parameter cons
		super(nd,pr);
		System.out.println("Creating Car from parameter con");
		numOFSeats = ns;
	}
	
	public Car(Car c) {//copy cons
		System.out.println("Creating Car from copy con");
		setNumOfDoor(c.getNumOfDoor());
		setPrice(c.getPrice());
		numOFSeats = c.numOFSeats;	
	}
	
	public int getnumOFSeats() {
		return numOFSeats;
	}
	
	public void setnumOFSeats(int ns) {
		numOFSeats = ns;
	}

	@Override
	public String toString() {
		return "Car has" + numOFSeats + "number of seat, and " + getNumOfDoor() + " doors,with a price of " 
				+ getPrice() + "$";
	}
	
	
	
	
}
