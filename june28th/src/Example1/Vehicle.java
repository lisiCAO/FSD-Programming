package Example1;

class MetrixConverter{
	public static double kmtoMile(double k) {
		return k * 0.6214;
	}
	public static double miletoKm(double m) {
		return m *1.6092;
	}
}

public class Vehicle {
	public int numOfDoor =4;
	private double price =10000;
	public int maxspeed = 260;
	
	public Vehicle() {
		System.out.println("My object created");
		this.numOfDoor = 4;
		this.price = 10000;
		this.maxspeed =260;
	}
	
	public void setNumOfDoor(int numOfDoor) {
		if(numOfDoor > 2 && numOfDoor < 6) {
			this.numOfDoor = numOfDoor;
		}else {
			System.out.println("it is not do able");
		}
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double pr) {
		if(pr > 800 && pr < 60000) {
			this.price = pr;
		}else {
			System.out.println("it is not reasonable price");
			}
		}
	
	public int getMaxSpeed() {
		return maxspeed;
		}
	
	public void setMaxSpeed(int ms) {
		if(ms >80 && ms <400) {
			this.maxspeed =ms;
			}else {
				System.out.println("it is not reasonable maximum speed");
				}
		}
	
	public void info() {
		System.out.println("my car has " + numOfDoor + " Doors and my car is " + price + "$ my car has " + maxspeed + "Maximum speed" );
		double Maxmile = MetrixConverter.kmtoMile(maxspeed);
		System.out.println("In mile the max speed is " + Maxmile);
		}
	
	public String toString() {
		return "Vehicle [numOfDoor=" +numOfDoor + ", price " + price + ", maxspeed" + maxspeed + "]";
		}
	
	public boolean equals(Vehicle v) {
		if(this.numOfDoor == v.numOfDoor && this.price == v.price && this.maxspeed == v.maxspeed) {
			return true;
			}else {
				return false;
				}
		}
}