package Example1;

public class Bus extends Vehicle{
	private int passengerCapacity;
	
	public Bus() {//default
		System.out.println("Creating Bus from default");
		passengerCapacity = 10;
	}
	public Bus(int pc) {//parameter cons
		System.out.println("Creating Bus from parameter con");
		passengerCapacity = pc;
	}
	public Bus(Bus b) {//copy cons
		System.out.println("Creating Bus from copy con");
		passengerCapacity =b.passengerCapacity;
	}
	
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	
	public void setPassengerCapacity(int pc) {
		passengerCapacity = pc;
	}
	
	public void setPrice(double pr) {
		if(pr < getPrice()) {
			System.out.println("The price of bus reduced from " + getPrice() + " to " + pr);
			super.setprice(pr);
		
		}else if(pr > getPrice() && pr >0) {
			System.out.println("The price of bus increased from " + getPrice() + " to " + pr);
		}else if(pr < 0) {
			System.out.println("you cannot do it");
		}
		
	}
	
	public String toString() {
		return "This vehicle has " + numOfDoor + " number of door and the price is" + price + "]";
	}
	
	}

