package Example2;

public class Vehicle {
	protected int numofDoor;
	protected double price;
	
	public Vehicle() {// default
		System.out.println("Creating Vehicle from default con");
		numofDoor = 4;
		price = 10000;
	}
	public Vehicle(int nd, double pr) {// parameter cons
		System.out.println("Creating Vehicle from parameter con");
		numofDoor = nd;
		price = pr;
	}
	
	public Vehicle(Vehicle v) {//copy cons
		System.out.println("Creating Vehicle from copy con");
		numofDoor = v.numofDoor;
		price = v.price;
	}
	
	public int getnumDoor() {
		return numofDoor;
	}
	
	public void setNumofdoor(int nd) {
		numofDoor = nd;
	}
	
	public double getprice() {
//		String a = this.getClass().toString();
//		a.substring(6);
		String a = "Vehicle class";
		System.out.println("getPrice executed from " + a + "Class the price is " + price + "$");
		return price;
	}
	
	public void setPrice(double pr) {
		price = pr;
	}

	@Override
	public String toString() {
		return "this vehicle has" + numofDoor + " number of door and the price is" + price + "$";
	}
	//v1.ischeaper(v2)
	public boolean isCheaper(Vehicle v) {
		String s1 = this.getClass().toString();
		String s2 = v.getClass().toString();
		s1 = s1.substring(6);
		s2 = s2.substring(6);
		if(getprice() < v.getprice()) {
			System.out.println("the price of this"  + s1 + "object is cheaper than the price of "
					+ s2 + "object");
			return true;
		}else {
			System.out.println("the price of this"  + s1 + "object is NOT cheaper than the price of "
					+ s2 + "object");
			return false;
		}
		
	}
	
}